/**
 * 创建请求
 * @returns {XMLHttpRequest|any}
 */
function createXMLHttpRequest() {
    //检查浏览器是否支持 XMLHttpRequest 对象。如果支持，则创建 XMLHttpRequest 对象。如果不支持，则创建 ActiveXObject对象
    if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
        return new XMLHttpRequest();
    } else {// code for IE6, IE5
        return new ActiveXObject("Microsoft.XMLHTTP");
    }
}

/**
 *
 * @param url 向服务器请求的数据
 * @param cFunction 不同功能的函数名
 * @constructor
 */
function AJAX(url, cFunction) {
    let xmlHttp = createXMLHttpRequest();
    //每当 readyState 改变时，就会触发 onreadystatechange 事件。
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
            return cFunction(this);
        }
    };
    xmlHttp.open("POST", "LGS", true);
    xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xmlHttp.send(url);
    console.log(url);
}

/**
 * 登录功能的实现
 * @param xmlHttp xmlHttp XMLHttpRequest 或者 ActiveXObject对象
 */
function registerFunction(xmlHttp) {
    let returnStr = xmlHttp.responseText;
    console.log(returnStr);
    if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
        if (returnStr === 0) {
            document.getElementById("insert").innerText = "账户或密码错误!";
        } else {
            window.location.href = returnStr;

            //document.getElementById("insert").innerText = "登录成功!";
        }
    } else {
        document.getElementById("insert").innerText = "连接失败!";
    }
}


// /**
//  * 设置cookie
//  * @param c_name    [变量名,必选]
//  * @param value     [变量值,必选]
//  * @param exDays    [过期日期,可选]
//  */
// function setCookie(c_name,value,exDays) {
//     let cookie = c_name + "=" + value +";";
//     if(exDays){
//         let exDate =  new Date();
//         exDate.setTime(exDate.getTime() + (exDays * 24 * 60 * 60 * 1000));
//         let expires = "expires=" + exDate.toUTCString();
//         cookie = cookie + '' + expires + ";path=/";
//     }
//     document.cookie = cookie;
// }
//
// /**
//  * 获取cookie
//  * @param c_name     [变量名，必选]
//  * @returns {string} [返回值：变量值(字符串)]
//  */
// function getCookie(c_name) {
//     let name = c_name + "=";
//     let cookie = document.cookie.split(';');
//     for (let i = 0,len = cookie.length;i<len;i++){
//         let c = cookie[i].trim();
//         if (c.indexOf(name) == 0){
//             return c.substring(name.length,c.length);
//         }
//     }
//     return "";
// }
//
// /**
//  *检测cookie
//  */
// function checkCookie(){
//     let username = getCookie("username");
//     if (username!="")
//     {
//         alert("Welcome again " + username);
//     }
//     else
//     {
//         username = prompt("Please enter your name:","");
//         if (username!="" && username!=null)
//         {
//             setCookie("username",username,365);
//         }
//     }
// }

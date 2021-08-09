<%--
  Created by IntelliJ IDEA.
  User: 86138
  Date: 2021/1/15
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<!--这是页面最上方的标题-->
<head>
    <title>大学生创新创业项目申报审核管理系统</title>
    <!--导入外部js脚本代码-->
    <script type="text/javascript" src="../../static/js/GraduationDome.js"></script>
    <!--导入外部样式表-->


    <link rel="stylesheet" type="text/css" href="../../static/css/Login.css">
</head>
<body>
<!--标题-->
<div id="backdrop">
    <h1 draggable="false">
        大学生创新创业项目申报审核管理系统
    </h1>
    <div id="record">
        <div class="cities">
            <form>
                <!--登录信息-->
                <hr/>
                <label>
                    用户：<input type="text" id="user"/>
                </label>
                <hr/>
                <label>
                    密码：<input type="password" id="password"/>
                </label>
                <hr/>
                <p>
                    请选择你的身份:
                </p>
                <hr/>
                <input type="radio" name="identity" value="student" id="student" checked="checked"/>
                <label for="student"> 学生</label>
                <input type="radio" name="identity" value="teacher" id="teacher"/>
                <label for="teacher"> 导师</label>
                <input type="radio" name="identity" value="administrators" id="administrators"/>
                <label for="administrators">管理员</label>
                <hr/>
                <input class="Button_style" type="button" value="确定" onclick="return register()">
                <input class="Button_style" type="reset" value="取消">
                <hr/>
                <!--隐藏的提示框-->
                <div id="insert" style="color:red;padding:10px;font-size:12px"></div>
            </form>
        </div>
    </div>

    <div id="footer">
        欢迎访问管理系统！
    </div>
</div>


</body>
<script>
    let xmlHttp;
    function register() {
        //获取user的值
        let user = document.getElementById("user").value;
        if (user === "") {
            alert("用户名不能为空!");
            return;
        }
        //获取password的值
        let password = document.getElementById("password").value;
        if (password === "") {
            alert("密码不能为空！");
            return;
        }
        //通过循环遍历获取identity的值
        let identity = document.getElementsByName("identity");
        let item;
        for (let i = 0; i < identity.length; i++) {
            if (identity[i].checked) {
                item = identity[i].value;
            }
        }
        let url = "user=" + user + "&password=" + password + "&identity=" + item;
        AJAX(url, registerFunction);
    }

</script>
</html>
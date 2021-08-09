<%--
  Created by IntelliJ IDEA.
  User: 逐光的影子
  Date: 2020/11/20
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>大学生创新创业项目申报审核管理系统</title>
  <link rel="stylesheet" href="./WEB-INF/static/layui/css/layui.css">
</head>
<body>
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">管理员界面</div>
    <!-- 头部区域（可配合layui 已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <%--            <li class="layui-nav-item"><a href="">首页管理</a></li>--%>
      <%--            <li class="layui-nav-item"><a href="html/project_declaration.html">项目申报</a></li>--%>
      <%--            <li class="layui-nav-item"><a href="">我的项目</a></li>--%>
      <%--            <li class="layui-nav-item">--%>
      <%--                <a href="javascript:">用户设置</a>--%>
      <%--                <dl class="layui-nav-child">--%>
      <%--                    <dd><a href="">个人信息</a></dd>--%>
      <%--                    <dd><a href="">menu 22</a></dd>--%>
      <%--                    <dd><a href="">menu 33</a></dd>--%>
      <%--                </dl>--%>
      <%--            </li>--%>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:">
          <img src="./WEB-INF/static/images/AUFELogo.jpg"
               class="layui-nav-img" alt="校徽">
          20172109
        </a>
        <dl class="layui-nav-child">
          <dd><a href="./WEB-INF/views/html/editAdm.html">修改信息</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退出</a></li>
    </ul>
  </div>

  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree" lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:">主要功能</a>
          <dl class="layui-nav-child">
            <dd><a href="./WEB-INF/views/html/teacher_list.html">教师列表</a></dd>
            <dd><a href="./WEB-INF/views/html/student_list.html">学生列表</a></dd>
            <dd><a href="./WEB-INF/views/html/adm_list.html">管理员列表</a></dd>
            <dd><a href="./WEB-INF/views/html/addTeacher.html">添加教师</a></dd>
            <dd><a href="./WEB-INF/views/html/addStudent.html">添加学生</a></dd>
            <dd><a href="./WEB-INF/views/html/addAdm.html">添加管理员</a></dd>

          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:">项目管理</a>
          <dl class="layui-nav-child">
            <dd><a href="./WEB-INF/views/html/project_list.html">项目列表</a></dd>
            <dd><a href="./WEB-INF/views/html/projectExamine.html">管理员审核</a></dd>
            <dd><a href="./WEB-INF/views/html/auditFindings.html">查看审核</a></dd>
            <%--                        <dd><a href="javascript:">list 2-2</a></dd>--%>
            <%--                        <dd><a href="">超链接</a></dd>--%>
          </dl>
        </li>
        <%--                <li class="layui-nav-item"><a href="javascript:">menu item 123</a></li>--%>
        <%--                <li class="layui-nav-item"><a href="">the links</a></li>--%>
      </ul>
    </div>
  </div>

  <div class="layui-body">
    <!-- 内容主体区域 -->
    <%--<div style="padding: 15px;" >内容主体区域</div>--%>
    <iframe src="" id="main" height="100%" width="100%"></iframe>
  </div>

  <div class="layui-footer">
    <!-- 底部固定区域 -->
    欢迎使用大学生项目申报审核管理系统
  </div>
</div>

<script src="./WEB-INF/static/layui/layui.js"></script>
<script>
  //JavaScript代码区域
  layui.use('element', function () {
    let element = layui.element;
    let $ = layui.jquery;
    $(document).ready(function () {
      $("dd>a").click(function (e) {
        e.preventDefault();
        $('#main').attr("src", $(this).attr("href"));
      })
    })

  });
</script>
</body>
</html>

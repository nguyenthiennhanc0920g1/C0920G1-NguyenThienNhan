<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords"
          content="Glassy Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive
           web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700" rel="stylesheet">
<%--    <link rel="stylesheet" href="login/css/font-awesome.css" type="text/css">--%>
<%--    <link rel="stylesheet" href="login/css/style.css" type="text/css" media="all"/>--%>
    <style><%@include file="login/css/style.css"%></style>
    <style><%@include file="login/css/font-awesome.css"%></style>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/WEB-INF/views/login/css/font-awesome.css" />--%>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/WEB-INF/views/login/css/style.css" />--%>
</head>
<body>
<div class="header-w3l">
    <h1>Login</h1>
</div>
<div class="main-w3layouts-agileinfo">
    <div class="wthree-form">
        <h2>Fill out the form below to login</h2>
        <form action="/loginTest" method="post">
            <div class="form-sub-w3">
                <input type="text" name="txtusername" placeholder="Username " required=""/>
                <div class="icon-w3">
                    <i class="fa fa-user" aria-hidden="true"></i>
                </div>
            </div>
            <div class="form-sub-w3">
                <input type="password" name="txtpassword" placeholder="Password" required=""/>
                <div class="icon-w3">
                    <i class="fa fa-unlock-alt" aria-hidden="true"></i>
                </div>
            </div>
            <label class="anim">
                <input type="checkbox" class="checkbox">
                <span>Remember Me</span>
                <a href="#">Forgot Password</a>
            </label>
            <div class="clear"></div>
            <div class="submit-agileits">
                <input type="submit" value="Login">
            </div>
        </form>
    </div>
</div>
<div class="footer">
    <p>&copy; 2020 Login Form. | Design by Nhan Nguyen C0920G1</p>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Shen
  Date: 2018/3/16
  Time: 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<head lang="en">
    <meta charset="UTF-8">
    <title>登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <script type="text/javascript" src="${ctx}/js/jquery.js"></script>
    <link rel="stylesheet" href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css" />
    <link href="${ctx}/css/dlstyle.css" rel="stylesheet" type="text/css">
</head>

<body>

<div class="login-boxtitle">
    <a href="javascript:;"><img alt="logo" src="${ctx}/images/logobig.png" /></a>
</div>

<div class="login-banner">
    <div class="login-main">
        <div class="login-banner-bg"><span></span><img src="${ctx}/images/big.jpg" /></div>
        <div class="login-box">

            <h3 class="title">登录书城</h3>

            <div class="clear"></div>

            <div class="login-form">
                <form method="post" action="${ctx}/person/login">
                    <div class="user-name">
                        <label for="user"><i class="am-icon-user"></i></label>
                        <input type="text" name="username" id="user" placeholder="用户名">
                    </div>
                    <div class="user-pass">
                        <label for="password"><i class="am-icon-lock"></i></label>
                        <input type="password" name="password" id="password" placeholder="请输入密码">
                    </div>
                    <div class="am-cf">
                        <button type="submit" onclick="return check()" id="loginButton" class="am-btn am-btn-primary am-btn-sm">
                            登录
                        </button>
                    </div>
                </form>
            </div>

            <div class="login-links">
                <%--<label for="remember-me"><input id="remember-me" type="checkbox">记住密码</label>--%>
                <%--<a href="#" class="am-fr">忘记密码</a>--%>
                <a href="${ctx}/register" class="zcnext am-fr am-btn-default">注册</a>
                <br />
            </div>


        </div>
    </div>
</div>

<jsp:include page="/common/home-footer.jsp"></jsp:include>
</body>
</html>

<script>
    function check() {
        var $user = $('input[name=username]').val();
        var $password = $('input[name=password]').val();
        console.log($user);
        if($user == "" || $user == null){
            alert("用户名不能为空");
            return false;
        }
        if($password == "" || $password == null){
            alert("密码不能为空");
            return false;
        }else {
            $('#loginButton').submit();
            return true;
        }
    }

</script>

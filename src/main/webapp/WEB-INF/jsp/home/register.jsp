<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="stylesheet" href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.min.css" />
    <link href="${ctx}/css/dlstyle.css" rel="stylesheet" type="text/css">
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

</head>

<body>

<div class="login-boxtitle">
    <a href="#"><img alt="" src="${ctx}/images/logobig.png" /></a>
</div>

<div class="res-banner">
    <div class="res-main">
        <div class="login-banner-bg"><span></span><img src="${ctx}/images/big.jpg" /></div>
        <div class="login-box">

            <div class="am-tabs" id="doc-my-tabs">
                <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
                    <li class="am-active">用户注册</li>
                </ul>

                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-active">
                        <form method="post" action="${ctx}/person/register">
                            <div class="user-email">
                                <label for="username"><i class="am-icon-envelope-o"></i></label>
                                <input type="text" name="username" id="username" placeholder="请输入账号">
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="password" id="password" placeholder="设置密码">
                            </div>
                            <div class="user-pass">
                                <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="passwordRepeat" placeholder="确认密码">
                            </div>
                            <div class="am-cf">
                                <input type="submit" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>
    </div>

    <jsp:include page="/common/home-footer.jsp"></jsp:include>
</body>

</html>

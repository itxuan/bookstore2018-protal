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
                        <label id="registerMessage"></label>
                        <form>
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
                                <input type="password" name="rePassword" id="passwordRepeat" placeholder="确认密码">
                            </div>
                            <div class="am-cf">
                                <button type="button" id="loginButton" class="am-btn am-btn-primary am-btn-sm">
                                    注册
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="login-links">
                    <%--<label for="remember-me"><input id="remember-me" type="checkbox">记住密码</label>--%>
                    <%--<a href="#" class="am-fr">忘记密码</a>--%>
                    <a href="${ctx}/home/login" class="zcnext am-fr am-btn-default">登录</a>
                    <br />
                </div>
            </div>

        </div>
    </div>

    <jsp:include page="/common/home-footer.jsp"></jsp:include>
</body>
</html>
<script>
    $('input[name=username]').focus(function () {
        $('#registerMessage').html("");
    });

    $('input[name=password]').focus(function () {
        $('#registerMessage').html("");
    });
    $('input[name=rePassword]').focus(function () {
        $('#registerMessage').html("");
    });

    $('#loginButton').click(function () {
        var $user = $('input[name=username]').val();
        var $password = $('input[name=password]').val();
        var $rePassword = $('input[name=rePassword]').val();
        console.log($user);
        if($user == "" || $user == null){
            $('#registerMessage').html("用户名不能为空").css('color','red');
            return ;

        }
        if($password == "" || $password == null || $password.length < 6){
            $('#registerMessage').html("密码不能为空，且长度不少于6位").css('color','red');
            return ;
        }

        if($rePassword == "" || $rePassword == null){
            $('#registerMessage').html("确认密码不能为空").css('color','red');
            return ;
        }
        if(!($password === $rePassword)){
            $('#registerMessage').html("两次密码输入不一致").css('color','red');
            return ;
        }

        $.ajax({
            type:'post',
            url:'${ctx}/home/register/ajax',
            data:{
                nickName:$user,
                password:$password,
                rePassword:$rePassword
            },
            success:function (data) {
                console.log(data);
                if(data.success){
                    $.ajax({
                        type:'post',
                        url:'${ctx}/home/register',
                        data:{
                            nickName:$user,
                            password:$password,
                        },
                        success:function (data) {
                            if(data.code == 1){
                                location.href="${ctx}/home/registerSuccess";
                            }
                        }
                    })
                }else {
                    $('#registerMessage').html("用户名已经被注册").css('color','red');
                }
            }
        })
    });

</script>

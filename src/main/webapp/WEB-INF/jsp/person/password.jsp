<%--
  Created by IntelliJ IDEA.
  User: Shen
  Date: 2018/3/18
  Time: 7:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>修改密码</title>

    <link href="${ctx}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${ctx}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/css/stepstyle.css" rel="stylesheet" type="text/css">

    <script type="text/javascript" src="${ctx}/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/amazeui.js"></script>

</head>

<body>
<!--头 -->
<header>
    <article>
        <div class="mt-logo">
            <!--顶部导航条 -->
            <jsp:include page="/common/home-head.jsp"/>
            <!--悬浮搜索框-->
            <jsp:include page="/common/home-search.jsp"/>

        </div>
    </article>
</header>
<jsp:include page="/common/home-headLine.jsp"/>

<div class="center">
    <div class="col-main">
        <div class="main-wrap">

            <div class="am-cf am-padding">
                <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">修改密码</strong> /
                    <small>Password</small>
                </div>
            </div>
            <hr/>
            <!--进度条-->
            <div class="m-progress">
                <div class="m-progress-list">
							<span class="step-1 step">
                                <em class="u-progress-stage-bg"></em>
                                <i class="u-stage-icon-inner">1<em class="bg"></em></i>
                                <p class="stage-name">修改密码</p>
                            </span>
                    <span class="step-2 step">
                                <em class="u-progress-stage-bg"></em>
                                <i class="u-stage-icon-inner">2<em class="bg"></em></i>
                                <p class="stage-name">完成</p>
                            </span>
                    <span class="u-progress-placeholder"></span>
                </div>
                <div class="u-progress-bar total-steps-2">
                    <div class="u-progress-bar-inner"></div>
                </div>
            </div>
            <form class="am-form am-form-horizontal">
                <div class="am-form-group">
                    <label for="user-old-password" class="am-form-label">原密码</label>
                    <div class="am-form-content">
                        <input type="password" id="user-old-password" placeholder="请输入原登录密码">
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="user-new-password" class="am-form-label">新密码</label>
                    <div class="am-form-content">
                        <input type="password" id="user-new-password" placeholder="密码长度不少于6位">
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="user-confirm-password" class="am-form-label">确认密码</label>
                    <div class="am-form-content">
                        <input type="password" id="user-confirm-password" placeholder="请再次输入新密码">
                    </div>
                </div>
                <div class="info-btn">
                    <a id="saveBtn" class="am-btn am-btn-danger">保存修改</a>
                </div>

            </form>

        </div>
        <!--底部-->
        <jsp:include page="/common/home-footer.jsp"/>
    </div>

    <!--左侧导航-->
    <jsp:include page="/common/home-person-aside.jsp"/>
</div>

</body>

</html>

<script>
    $("#saveBtn").click(function () {
        var oldPassword = $('#user-old-password').val();
        var newPassword1 = $('#user-new-password').val();
        var newPassword2 = $('#user-confirm-password').val();
        console.log(oldPassword);
        console.log(newPassword1);
        console.log(newPassword2);
        if (oldPassword == null || oldPassword == "") {
            alert("旧密码不能为空");
            return
        }
        if (newPassword1 == null || newPassword1 == "" || newPassword1.length < 6) {
            alert("新密码不能为空，且长度不少于6位");
            return false;
        }
        if (!(newPassword1 === newPassword2)) {
            alert("两次密码输入不一致");
            return false;
        }

        $.ajax({
            type: "post",
            url: "${ctx}/person/password/update",
            data: {
                'oldPassword': oldPassword,
                'newPassword': newPassword1,
            },
            dataType: "json",
            success: function (result) {                    //result为返回值
                if (result.success) {
                    alert("密码修改成功");
                    window.location.reload();
                } else {
                    alert(result.message);
                }
            }
        });
    });
</script>

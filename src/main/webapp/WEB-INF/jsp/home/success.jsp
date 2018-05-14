
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>注册成功页面</title>
    <link rel="stylesheet"  type="text/css" href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css"/>
    <link href="${ctx}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="${ctx}/css/sustyle.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${ctx}/basic/js/jquery-1.7.min.js"></script>

</head>
<body>
<!--顶部导航条 -->
<jsp:include page="/common/home-head.jsp"></jsp:include>

<!--悬浮搜索框-->
<jsp:include page="/common/home-search.jsp"></jsp:include>

<div class="take-delivery">
    <div class="status">
        <h2>您已成功注册成功</h2>
        <div class="successInfo">
            <div class="option">
                <span class="info">您可以</span>
                暂不登录<a href="${ctx}/home/index" class="J_MakePoint"><span>去书城看看</span></a>
                <a href="${ctx}/home/login" class="J_MakePoint">去<span>登录</span></a>
            </div>
        </div>
    </div>
</div>
<!--底部版权-->
<jsp:include page="/common/home-footer.jsp"></jsp:include>
</body>
</html>


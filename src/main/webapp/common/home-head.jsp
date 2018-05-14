<%--
  Created by IntelliJ IDEA.
  User: Wee Kim Wee
  Date: 2018/3/15
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!--顶部导航条 -->
<div class="am-container header">
    <ul class="message-l">
        <div class="topMessage">
            <div class="menu-hd">
                <c:if test="${session_user == null}">
                    <a href="${ctx}/home/login" target="_top" class="h">亲，请登录</a>
                    <a href="${ctx}/home/register" target="_top">免费注册</a>
                </c:if>
                <c:if test="${session_user != null}">
                    <a class="h" disabled="disabled">欢迎您，<span>${session_user.nickname}</span></a>
                    &nbsp;&nbsp;&nbsp;&nbsp;<a href="${ctx}/person/logout" target="_top">注销</a>
                </c:if>
            </div></div>
    </ul>
    <ul class="message-r">
        <div class="topMessage home">
            <div class="menu-hd">
                <a href="${ctx}/home/index" target="_top" class="h">商城首页</a>
            </div>
        </div>
        <div class="topMessage my-shangcheng">
            <div class="menu-hd MyShangcheng">
                <a href="${ctx}/person/information/list" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a>
            </div>
        </div>
        <div class="topMessage mini-cart">
            <div class="menu-hd"><a id="mc-menu-hd" href="${ctx}/person/cart/list" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i>
                <span>购物车</span><strong id="J_MiniCartNum" class="h"></strong></a>
            </div>
        </div>

    </ul>
</div>


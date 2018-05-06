<%--
  Created by IntelliJ IDEA.
  User: Wee Kim Wee
  Date: 2018/3/15
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<div class="marqueen">
    <span class="marqueen-title">商城头条</span>
    <div class="demo">

        <ul>
            <li class="title-first"><a target="_blank" href="#">
                <img src="../images/TJ2.jpg"></img>
                <span>[特惠]</span>商城爆品1分秒
            </a></li>
            <li class="title-first"><a target="_blank" href="#">
                <span>[公告]</span>商城与广州市签署战略合作协议
                <img src="../images/TJ.jpg"></img>
                <p>XXXXXXXXXXXXXXXXXX</p>
            </a></li>

            <div class="mod-vip">
                <div class="m-baseinfo">
                    <a href="../person/index.html">
                        <img src="../images/getAvatar.do.jpg">
                    </a>
                    <em>
                        Hi,<span class="s-name">小叮当</span>
                        <a href="#"><p>点击更多优惠活动</p></a>
                    </em>
                </div>
                <div class="member-logout">
                    <a class="am-btn-warning btn" href="login.html">登录</a>
                    <a class="am-btn-warning btn" href="register.html">注册</a>
                </div>
                <div class="member-login">
                    <a href="#"><strong>0</strong>待收货</a>
                    <a href="#"><strong>0</strong>待发货</a>
                    <a href="#"><strong>0</strong>待付款</a>
                    <a href="#"><strong>0</strong>待评价</a>
                </div>
                <div class="clear"></div>
            </div>

            <li><a target="_blank" href="#"><span>[特惠]</span>洋河年末大促，低至两件五折</a></li>
            <li><a target="_blank" href="#"><span>[公告]</span>华北、华中部分地区配送延迟</a></li>
            <li><a target="_blank" href="#"><span>[特惠]</span>家电狂欢千亿礼券 买1送1！</a></li>

        </ul>
        <div class="advTip"><img src="../images/advTip.jpg"/></div>
    </div>
</div>
<div class="clear"></div>

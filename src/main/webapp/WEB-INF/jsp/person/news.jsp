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
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>我的消息</title>

    <link href="${ctx}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${ctx}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/css/newstyle.css" rel="stylesheet" type="text/css">

    <script src="${ctx}/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
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

            <div class="user-news">

                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">我的消息</strong> / <small>News</small></div>
                </div>
                <hr/>

                <div class="am-tabs am-tabs-d2" data-am-tabs>
                    <ul class="am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs">
                        <li class="am-active"><a href="#tab1">商城活动</a></li>
                        <li><a href="#tab2">物流助手</a></li>
                        <li><a href="#tab3">交易信息</a></li>

                    </ul>

                    <div class="am-tabs-bd">
                        <div class="am-tab-panel am-fade am-in am-active" id="tab1">

                            <div class="news-day">
                                <div class="goods-date" data-date="2015-12-21">
                                    <span><i class="month-lite">12</i>.<i class="day-lite">21</i>	<i class="date-desc">今天</i></span>
                                </div>

                                <!--消息 -->
                                <div class="s-msg-item s-msg-temp i-msg-downup">
                                    <h6 class="s-msg-bar"><span class="s-name">每日新鲜事</span></h6>
                                    <div class="s-msg-content i-msg-downup-wrap">
                                        <div class="i-msg-downup-con">
                                            <a class="i-markRead" target="_blank" href="blog.html">
                                                <img src="${ctx}/images/TB102.jpg">
                                                <p class="s-main-content">
                                                    最特色的湖北年货都在这儿 ~快来囤年货啦！
                                                </p>
                                                <p class="s-row s-main-content">
                                                    <a href="blog.html">
                                                        阅读全文 <i class="am-icon-angle-right"></i>
                                                    </a>
                                                </p>
                                            </a>
                                        </div>
                                    </div>
                                    <a class="i-btn-forkout" href="#"><i class="am-icon-close am-icon-fw"></i></a>
                                </div>
                            </div>
                        </div>

                        <div class="am-tab-panel am-fade" id="tab2">
                            <!--消息 -->
                            <div class="s-msg-item s-msg-temp i-msg-downup">
                                <h6 class="s-msg-bar"><span class="s-name">订单已签收</span></h6>
                                <div class="s-msg-content i-msg-downup-wrap">
                                    <div class="i-msg-downup-con">
                                        <a class="i-markRead" target="_blank" href="logistics.html">
                                            <div class="m-item">
                                                <div class="item-pic">
                                                    <img src="${ctx}/images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg">
                                                </div>
                                                <div class="item-info">
                                                    您购买的美康粉黛醉美唇膏已签收，
                                                    快递单号:373269427868
                                                </div>

                                            </div>

                                            <p class="s-row s-main-content">
                                                查看详情 <i class="am-icon-angle-right"></i>
                                            </p>
                                        </a>
                                    </div>
                                </div>
                                <a class="i-btn-forkout" href="#"><i class="am-icon-close am-icon-fw"></i></a>
                            </div>
                        </div>

                        <div class="am-tab-panel am-fade" id="tab3">
                            <!--消息 -->
                            <div class="s-msg-item s-msg-temp i-msg-downup">
                                <h6 class="s-msg-bar"><span class="s-name">卖家已退款&nbsp;¥12.90元</span></h6>
                                <div class="s-msg-content i-msg-downup-wrap">
                                    <div class="i-msg-downup-con">
                                        <a class="i-markRead" target="_blank" href="record.html">
                                            <div class="m-item">
                                                <div class="item-pic">
                                                    <img src="${ctx}/images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg">
                                                </div>
                                                <div class="item-info">
                                                    <p class="item-comment">您购买的美康粉黛醉美唇膏卖家已退款</p>
                                                    <p class="item-time">2015-12-21&nbsp;17:38:29</p>
                                                </div>

                                            </div>

                                            <p class="s-row s-main-content">
                                                <a href="record.html">钱款去向</a> <i class="am-icon-angle-right"></i>
                                            </p>
                                        </a>
                                    </div>
                                </div>
                                <a class="i-btn-forkout" href="#"><i class="am-icon-close am-icon-fw"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <!--底部-->
        <jsp:include page="/common/home-footer.jsp"/>
    </div>

    <!--左侧导航-->
    <jsp:include page="/common/home-person-aside.jsp"/>
</div>

</body>

</html>

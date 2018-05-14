<%--
  Created by IntelliJ IDEA.
  User: Shen
  Date: 2018/3/18
  Time: 8:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<aside class="menu">
    <ul>
        <li class="person">
            <span>个人中心</span>
        </li>
        <li class="person">
            <span>个人资料</span>
            <ul>
                <li> <a href="${ctx}/person/information/list">个人信息</a></li>
                <li> <a href="${ctx}/person/information/password">修改密码</a></li>
                <li> <a href="${ctx}/person/address/list">收货地址</a></li>
            </ul>
        </li>
        <li class="person">
            <span>我的交易</span>
            <ul>
                <li><a href="${ctx}/person/order/list">订单管理</a></li>
                <li> <a href="${ctx}/person/comment/list">评价管理</a></li>
                <%--<li> <a href="change.html">退款售后</a></li>--%>
            </ul>
        </li>
        <%--<li class="person">--%>
            <%--<span>我的资产</span>--%>
            <%--<ul>--%>
                <%--<li> <a href="coupon.html">优惠券 </a></li>--%>
                <%--<li> <a href="bonus.html">红包</a></li>--%>
                <%--<li> <a href="bill.html">账单明细</a></li>--%>
            <%--</ul>--%>
        <%--</li>--%>

        <%--<li class="person">--%>
            <%--<span>我的小窝</span>--%>
            <%--<ul>--%>
                <%--<li> <a href="collection.html">收藏</a></li>--%>
                <%--<li> <a href="foot.html">足迹</a></li>--%>
                <%--<li> <a href="comment.html">评价</a></li>--%>
                <%--<li> <a href="news.html">消息</a></li>--%>
            <%--</ul>--%>
        <%--</li>--%>
    </ul>
</aside>
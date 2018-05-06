
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>购物车</title>

    <link href="${ctx}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${ctx}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/css/infstyle.css" rel="stylesheet" type="text/css">
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/amazeui.js" type="text/javascript"></script>
    <link rel="stylesheet" href="${ctx}/css/reset.css">
    <link rel="stylesheet" href="${ctx}/css/carts.css">
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

<br><br><br>
<section class="cartMain">
    <div class="cartMain_hd">
        <ul class="order_lists cartTop">
            <li class="list_chk">
                <!--所有商品全选-->
                <input type="checkbox" id="all" class="whole_check">
                <label style="border-color: black" for="all"></label>
                全选
            </li>
            <li class="list_con">商品信息</li>
            <li class="list_info">商品参数</li>
            <li class="list_price">单价</li>
            <li class="list_amount">数量</li>
            <li class="list_sum">金额</li>
            <li class="list_op">操作</li>
        </ul>
    </div>

    <div class="cartBox">
        <div class="order_content">
            <ul class="order_lists">
                <li class="list_chk">
                    <input type="checkbox" id="checkbox_2" class="son_check">
                    <label for="checkbox_2"></label>
                </li>
                <li class="list_con">
                    <div class="list_img"><a href="javascript:;">
                        <img src="${ctx}/images/jueduixiaohai.jpg" alt=""></a>
                    </div>
                    <div class="list_text"><a href="javascript:;">绝对小孩.3 梦拐弯</a></div>
                </li>
                <li class="list_info">
                    <p>规格：默认</p>
                    <p>尺寸：16*16*3(cm)</p>
                </li>
                <li class="list_price">
                    <p class="price">￥33</p>
                </li>
                <li class="list_amount">
                    <div class="amount_box">
                        <a href="javascript:;" class="reduce reSty">-</a>
                        <input type="text" value="2" class="sum">
                        <a href="javascript:;" class="plus">+</a>
                    </div>
                </li>
                <li class="list_sum">
                    <p class="sum_price">￥66</p>
                </li>
                <li class="list_op">
                    <p class="del">
                        <a href="javascript:removeBook(123);" class="goods-delete">移除商品</a>
                    </p>
                </li>
            </ul>
            <ul class="order_lists">
                <li class="list_chk">
                    <input type="checkbox" id="checkbox_3" class="son_check">
                    <label for="checkbox_3"></label>
                </li>
                <li class="list_con">
                    <div class="list_img"><a href="javascript:;"><img src="${ctx}/images/wulongyuan.jpg" alt=""></a></div>
                    <div class="list_text"><a href="javascript:;">乌龙院大长篇之活宝传奇（1-10)</a></div>
                </li>
                <li class="list_info">
                    <p>规格：默认</p>
                    <p>尺寸：16*16*3(cm)</p>
                </li>
                <li class="list_price">
                    <p class="price">￥99</p>
                </li>
                <li class="list_amount">
                    <div class="amount_box">
                        <a href="javascript:;" class="reduce reSty">-</a>
                        <input type="text" value="1" class="sum">
                        <a href="javascript:;" class="plus">+</a>
                    </div>
                </li>
                <li class="list_sum">
                    <p class="sum_price">￥99</p>
                </li>
                <li class="list_op">
                    <p class="del">
                        <a href="javascript:removeBook(123);" class="goods-delete">移除商品</a>
                    </p>
                </li>
            </ul>
            <ul class="order_lists">
                <li class="list_chk">
                    <input type="checkbox" id="checkbox_6" class="son_check">
                    <label for="checkbox_6"></label>
                </li>
                <li class="list_con">
                    <div class="list_img"><a href="javascript:;"><img src="${ctx}/images/fouxi.jpg" style="height: 80%" alt=""></a></div>
                    <div class="list_text"><a href="javascript:;">佛系</a></div>
                </li>
                <li class="list_info">
                    <p>规格：默认</p>
                    <p>尺寸：16*16*3(cm)</p>
                </li>
                <li class="list_price">
                    <p class="price">￥29</p>
                </li>
                <li class="list_amount">
                    <div class="amount_box">
                        <a href="javascript:;" class="reduce reSty">-</a>
                        <input type="text" value="1" class="sum">
                        <a href="javascript:;" class="plus">+</a>
                    </div>
                </li>
                <li class="list_sum">
                    <p class="sum_price">￥29</p>
                </li>
                <li class="list_op">
                    <p class="del">
                        <a href="javascript:removeBook(123);" class="goods-delete">移除商品</a>
                    </p>
                </li>
            </ul>
        </div>
    </div>

    <!--底部-->
    <div class="bar-wrapper">
        <div class="bar-right">
            <div class="piece">已选商品<strong class="piece_num">0</strong>件</div>
            <div class="totalMoney">共计: <strong class="total_text">0.00</strong></div>
            <div class="calBtn"><a href="javascript:;">结算</a></div>
        </div>
    </div>
</section>
<section class="model_bg"></section>
<%--<section class="my_model">--%>
    <%--<p class="title">删除宝贝<span class="closeModel">X</span></p>--%>
    <%--<p>您确认要删除该宝贝吗？</p>--%>
    <%--<div class="opBtn"><a href="javascript:delete();" class="dialog-sure">确定</a>--%>
        <%--<a href="javascript:;" class="dialog-close">关闭</a></div>--%>
<%--</section>--%>

<script src="${ctx}/js/jquery-1.7.2.min.js"></script>
<script src="${ctx}/js/carts.js"></script>

</body>
</html>

<script>

    function removeBook(bookId){
        console.log(bookId);
        var $delete = window.confirm("确定将该书移出购物车吗?");
        if($delete){
            $.ajax({
                type:'post',
                url:'${ctx}/person/cart/delete?id='+bookId,
                dataType:'json',
                success:function (data) {
                    alert("操作成功");
                    location.reload();
                },error:function (data) {
                    alert("服务器异常");
                }
            });
        }
    }
</script>



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
            <li class="list_price">单价(元)</li>
            <li class="list_amount">数量</li>
            <li class="list_sum">金额(元)</li>
            <li class="list_op">操作</li>
        </ul>
    </div>

    <div class="cartBox">
        <div class="order_content">
            <c:forEach var="cart" items="${cartList}" varStatus="state">
                <ul class="order_lists">
                <li class="list_chk">
                    <input type="checkbox" id="checkbox_${state.index}" class="son_check">
                    <label for="checkbox_${state.index}"></label>
                </li>
                <li class="list_con">
                    <div class="list_img">
                        <a href="javascript:bookDetail_cart('${cart.bookId}')">
                            <img src="${cart.bookIcon}" alt="">
                        </a>
                    </div>
                    <div class="list_text">
                        ${cart.bookname}
                    </div>
                </li>
                <li class="list_info">
                    <p>规格：默认</p>
                    <p>尺寸：16*16*3(cm)</p>
                </li>
                <li class="list_price">
                    <p class="price">${cart.currentPrice/100.00}</p>
                </li>
                <li class="list_amount">
                    <div class="amount_box">
                        <a href="javascript:reduceBookAmount('${cart.id}');" class="reduce reSty">-</a>
                        <input type="text" class ="sum cartAmount${cart.id}" value="${cart.amount}">
                        <a href="javascript:addBookAmount('${cart.id}');" class="plus">+</a>
                    </div>
                </li>
                    <input type="hidden" class="bookId" value="${cart.bookId}">
                <li class="list_sum">
                    <p class="sum_price" aria-placeholder="价格计算中">
                            ${cart.currentPrice * cart.amount/100.00}
                    </p>
                </li>
                <li class="list_op">
                    <p class="del deleteBtnForAjax">
                        <a href="javascript:removeBook('${cart.id}');">移除商品</a>
                    </p>
                </li>
            </ul>
            </c:forEach>
        </div>
    </div>
    <c:if test="${empty cartList}">
        <h1>您的购物车中还未添加书籍</h1>
        <span>
            <a style="color: red" href="${ctx}/home/index">去商城</a>看看
        </span>
    </c:if>
    <!--底部-->
    <div class="bar-wrapper">
        <div class="bar-right">
            <div class="piece">已选商品
                <strong class="piece_num">0</strong>件
            </div>
            <div class="piece">总价
                <strong class="total_text">0</strong>元
            </div>
            <div class="calBtn"><a href="javascript:balance();">结算</a></div>
        </div>
    </div>
</section>
<section class="model_bg"></section>
<script src="${ctx}/js/jquery-1.7.2.min.js"></script>
<script src="${ctx}/js/carts.js"></script>

</body>
</html>

<script>
    function removeBook(cartId){
        console.log(cartId);
        var $delete = window.confirm("确定将该书移出购物车吗?");
        if($delete){
            $.ajax({
                type:'post',
                url:'${ctx}/person/cart/delete?id='+cartId,
                dataType:'json',
                success:function (data) {
                    if(data.code == 1) {
                        alert("操作成功");
                        location.reload();
                    }else {
                        alert("服务器繁忙，休息一下吧")
                    }
                },error:function (data) {
                    alert("服务器异常");
                }
            });
        }
    }
    
    function addBookAmount(cartId) {
        console.log("add")
        $.ajax({
            type:'post',
            url:'${ctx}/person/cart/addAmount?cartId='+cartId,
            dataType:'json',
            success:function (data) {
                location.reload();
            },error:function (data) {
                alert("服务器异常");
            }
        });
    }

    function reduceBookAmount(cartId) {

        var cartAmount10086 = "cartAmount"+cartId;
        console.log(cartAmount10086);
        var cartAmount = $("."+ cartAmount10086).val();
        console.log("reduce" +cartAmount);
        if(cartAmount == 0){
            alert("不能再少了");
            return;
        }
        console.log("reduce")
        $.ajax({
            type:'post',
            url:'${ctx}/person/cart/reduceAmount?cartId='+cartId,
            dataType:'json',
            success:function (data) {
                location.reload();
            },error:function (data) {
                alert("服务器异常");
            }
        });
    }
</script>
<script>
    function balance(){
        var count = $('.piece_num').html();
        console.log("结算方法" + count);
        if(count == 0){
            alert('请选择要购买的书籍');
            return;
        }else {
            var $sonCheckBox = $('.son_check');
            var calBtn = $('.calBtn a');
            var ids = [];//书籍id
            var amounts = []; //书 数量
            $sonCheckBox.each(function () {
                if ($(this).is(':checked')) {
                    var bookId = parseInt($(this).parents('.order_lists').find('.bookId').val());
                    var goods = parseInt($(this).parents('.order_lists').find('.sum_price').html().substring(1));
                    var num =  parseInt($(this).parents('.order_lists').find('.sum').val());
                    console.log("bookId" + bookId  +'num' + num + 'goods'+goods);
                    ids.push(bookId);
                    amounts.push(num);
                }
            });
            $.ajax({
                url:'${ctx}/person/cartBalance',
                type:'post',
                traditional: true,
                data:{
                    'ids':ids,
                    'amounts':amounts
                },
                dataType:'json',
                success:function (data) {
                    console.log("success" + data);
                    window.location.href='${ctx}/person/pay?order='+data.orderId;
                }
            });
        }
    }
</script>
<script>
    function bookDetail_cart(bookId) {

        location.href='${ctx}/home/detail?id='+bookId;
    }
</script>

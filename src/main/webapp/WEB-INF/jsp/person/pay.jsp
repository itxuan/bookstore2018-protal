<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0 ,minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>结算页面</title>

    <link href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/basic/css/demo.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/cartstyle.css" rel="stylesheet" type="text/css"/>

    <link href="${ctx}/css/jsstyle.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${ctx}/js/address.js"></script>

</head>

<body>

<!--顶部导航条 -->
<jsp:include page="/common/home-head.jsp"></jsp:include>

<!--悬浮搜索框-->
<jsp:include page="/common/home-search.jsp"></jsp:include>

<div class="clear"></div>
<div class="concent">
    <!--地址 -->
    <div class="paycont">
        <div class="address">
            <h3>确认收货地址 </h3>
            <div class="control">
                <div class="tc-btn createAddr theme-login am-btn am-btn-danger">使用新地址</div>
            </div>
            <div class="clear"></div>
            <div class="am-form-group">
                <label for="" class="am-form-label">收货地址</label>
                <div class="am-form-content address">
                    <select data-am-selected name="addressId" style="height: 30px" onchange="changeAddress(this.value)">
                        <c:forEach var="address" items="${addressList}">
                            <option value="${address.id}">
                                    ${address.receiveName} &nbsp;&nbsp;
                                    ${address.receiveTelephone} &nbsp;&nbsp;
                                    ${address.completeAddress} &nbsp;&nbsp;
                            </option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="clear"></div>
        </div>

        <!--订单 -->
        <div class="concent">
            <div id="payTable">
                <h3>确认订单信息</h3>
                <div class="cart-table-th">
                    <div class="wp">
                        <div class="th th-item">
                            <div class="td-inner">商品信息</div>
                        </div>
                        <div class="th th-price">
                            <div class="td-inner">单价</div>
                        </div>
                        <div class="th th-amount">
                            <div class="td-inner">数量</div>
                        </div>
                        <div class="th th-sum">
                            <div class="td-inner">金额</div>
                        </div>
                    </div>
                </div>
                <div class="clear"></div>
                <c:forEach var="orderItem" items="${orderItemVOList}">
                    <tr class="item-list">
                        <div class="bundle  bundle-last">
                            <div class="bundle-main">
                                <ul class="item-content clearfix">
                                    <div class="pay-phone">
                                        <li class="td td-item">
                                            <div class="item-pic">
                                                <a href="javascript:payBookDetail('${orderItem.bookId}')"
                                                   class="J_MakePoint">
                                                    <img src="${orderItem.bookIcon}" style="width: 100%"
                                                         class="itempic J_ItemImg">
                                                </a>
                                            </div>
                                            <div class="item-info">
                                                <div class="item-basic-info">
                                                    <a class="item-title J_MakePoint" data-point="tbcart.8.11">
                                                            ${orderItem.bookname}
                                                    </a>
                                                </div>
                                            </div>
                                        </li>
                                        <li class="td td-info">
                                            <div class="item-props">
                                                <span class="sku-line">页数 ${orderItem.bookPage}</span>
                                                &nbsp;&nbsp;
                                                <span class="sku-line">包装 ${orderItem.bookPack}</span>
                                            </div>
                                        </li>
                                        <li class="td td-price">
                                            <div class="item-price price-promo-promo">
                                                <div class="price-content">
                                                    <em class="J_Price price-now">${orderItem.orderItemPrice}</em>
                                                </div>
                                            </div>
                                        </li>
                                    </div>
                                    <li class="td td-amount">
                                        <div class="amount-wrapper ">
                                            <div class="item-amount ">
                                                <span class="phone-title">购买数量</span>
                                                <div class="sl">

                                                    <input class="text_box" name="" type="text"
                                                           value="${orderItem.amount}"
                                                           style="width:35px; height: 30px"/>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="td td-sum">
                                        <div class="td-inner">
                                            <em tabindex="0"
                                                class="J_ItemSum number">${orderItem.orderItemPrice*orderItem.amount}</em>
                                        </div>
                                    </li>

                                </ul>
                                <div class="clear"></div>
                            </div>
                        </div>
                    </tr>
                </c:forEach>
                <div class="clear"></div>
            </div>
        </div>
        <div class="clear"></div>
        <div class="pay-total">
            <!--留言-->
            <div class="order-extra">
                <div class="order-user-info">
                    <div id="holyshit257" class="memo">
                        <label>买家留言：</label>
                        <input type="text" name="userMessage" style="height: 30px"
                               title="选填,对本次交易的说明（建议填写已经和卖家达成一致的说明）"
                               placeholder="选填,建议填写和卖家达成一致的说明"
                               class="memo-input J_MakePoint c2c-text-default memo-close">
                    </div>
                </div>

            </div>
        </div>
        <!--信息 -->
        <div class="order-go clearfix">
            <div class="pay-confirm clearfix">
                <div class="box">
                    <div tabindex="0" id="holyshit267" class="realPay"><em class="t">实付款：</em>
                        <span class="price g_price ">
                                    <span>¥</span> <em class="style-large-bold-red " id="J_ActualFee">244.00</em>
											</span>
                    </div>

                    <div id="holyshit268" class="pay-address">
                        <p class="buy-footer-address">
                            <span class="buy-line-title buy-line-title-type">寄送至：</span>
                            <span class="buy--address-detail">
                                <span class="my-buy-street">
                                    ${defaultAddress.completeAddress}
                                </span>
                            </span>
                        </p>
                        <p class="buy-footer-address">
                            <span class="buy-line-title">收货人：</span>
                            <span class="buy-address-detail">
                                <span class="my-buy-user">${defaultAddress.receiveName} </span>
                                <span class="my-buy-phone">${defaultAddress.receiveTelephone}</span>
                            </span>
                        </p>
                    </div>
                </div>
                <input type="hidden" name="orderId" value="${order.id}"/>

                <div id="holyshit269" class="submitOrder">
                    <div class="go-btn-wrap">
                        <a id="J_Go" href="javascript:order()" class="btn-go" tabindex="0"
                           title="点击此按钮，提交订单">提交订单</a>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>

    <div class="clear"></div>
</div>
</div>

<!--版权-->
<jsp:include page="/common/home-footer.jsp"></jsp:include>

</div>
<div class="theme-popover-mask"></div>
<div class="theme-popover">

    <!--标题 -->
    <div class="am-cf am-padding">
        <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">新增地址</strong> /
            <small>Add address</small>
        </div>
    </div>
    <hr/>

    <div class="am-u-md-12">
        <form class="am-form am-form-horizontal">
            <div class="am-form-group">
                <label for="user-receive-name" class="am-form-label">收货人</label>
                <div class="am-form-content">
                    <input type="text" id="user-receive-name" placeholder="收货人">
                </div>
            </div>
            <div class="am-form-group">
                <label for="user-receive-phone" class="am-form-label">手机号码</label>
                <div class="am-form-content">
                    <input id="user-receive-phone" placeholder="手机号必填" type="text" onkeyup="value=value.replace(/[^\d]/g,'')">
                </div>
            </div>

            <div class="am-form-group">
                <label for="user-address" class="am-form-label">详细地址</label>
                <div class="am-form-content">
                    <textarea class="" rows="3" id="user-address" placeholder="输入详细地址">

                    </textarea>
                    <small>100字以内写出你的详细地址...</small>
                </div>
            </div>

            <div class="am-form-group theme-poptit">
                <div class="am-u-sm-9 am-u-sm-push-3">
                    <%--<div class="am-btn am-btn-danger">保存</div>--%>
                    <button type="button" class="am-btn am-btn-danger" id="saveBtn">保存</button>
                    <div class="am-btn am-btn-danger close">取消</div>
                </div>
            </div>
        </form>
    </div>

</div>

<div class="clear"></div>
</body>
</html>
<script>
    $('#saveBtn').click(function () {
        var receiveName = $('#user-receive-name').val();
        var receiveTelephone = $('#user-receive-phone').val();
        var userAddress = $('#user-address').val();
        if(receiveName == "" || receiveName == null){
            alert("收件人不能为空");
            return ;
        }
        if(receiveTelephone == "" || receiveTelephone == null || receiveTelephone.length != 11){
            alert("联系方式不正确，");
            return ;
        }

        $.ajax({
            type:'post',
            url:'${ctx}/person/address/add',
            data:{
                receiveName:receiveName,
                receiveTelephone:receiveTelephone,
                completeAddress:userAddress
            },
            success:function (data) {
                console.log(data);
                alert(data.message);
                location.reload()
            }
        })
    });
</script>
<script>
    function order() {
        //todo  更新数据库的地址信息等信息
        var userMessage = $('input[name=userMessage]').val();
        console.log("order");
        $.ajax({
            url: '${ctx}/person/paySuccess',
            type: 'post',
            data: {

            },
            dataType: 'json',
            success: function (data) {
                debugger
                console.log("order");
                window.location.href = '${ctx}/person/paySuccess';
            }
        });
    }
</script>
<script>
    function payBookDetail(bookId) {

        location.href = "${ctx}/home/detail?id=" + bookId;
    }

    function changeAddress(val) {
        console.log(val);
        $.ajax({
            type: 'post',
            url: '${ctx}/person/address/ajaxUpdate',
            data: {
                id: val,
            },
            success: function (data) {
                console.log(data);
                $('.my-buy-street').html(data.completeAddress);
                $('.my-buy-user').html(data.receviceName);
                $('.my-buy-phone').html(data.receiveTelePhone);
            }
        })
    }
</script>

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

    <title>地址管理</title>

    <link href="${ctx}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${ctx}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/css/addstyle.css" rel="stylesheet" type="text/css">
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
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

            <div class="user-address">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">地址管理</strong> /
                        <small>Address&nbsp;list</small>
                    </div>
                </div>
                <hr/>
                <ul class="am-avg-sm-1 am-avg-md-3 am-thumbnails">

                    <%--<c:forEach items="${addressList }" var="address">--%>
                        <%--<li class="user-addresslist defaultAddr">--%>
                            <%--<span class="new-option-r"><i class="am-icon-check-circle"></i>默认地址</span>--%>
                            <%--<p class="new-tit new-p-re">--%>
                                <%--<span class="new-txt">${address.receiveName}</span>--%>
                                <%--<span class="new-txt-rd2">${address.t}</span>--%>
                            <%--</p>--%>
                            <%--<div class="new-mu_l2a new-p-re">--%>
                                <%--<p class="new-mu_l2cw">--%>
                                    <%--<span class="title">地址：</span>--%>

                                    <%--<span class="street">${address}</span></p>--%>
                            <%--</div>--%>
                            <%--<div class="new-addr-btn">--%>
                                <%--<a onclick="update(${address.id});"><i class="am-icon-edit"></i>编辑</a>--%>
                                <%--<span class="new-addr-bar">|</span>--%>
                                <%--<a href="javascript:void(0);" onclick="delClick(${address.id});"><i class="am-icon-trash"></i>删除</a>--%>
                            <%--</div>--%>
                        <%--</li>--%>

                    <%--</c:forEach>--%>
                </ul>
                <div class="clear"></div>
                <%--<a class="new-abtn-type" data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0}">添加新地址</a>--%>
                <!--例子-->
                <div class="am-modal am-modal-no-btn" id="doc-modal-1">

                    <div class="add-dress">
                        <!--标题 -->
                        <div class="am-cf am-padding">
                            <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">修改地址</strong> /
                                <small>Add&nbsp;address</small>
                            </div>
                        </div>
                        <hr/>

                        <div class="am-u-md-12 am-u-lg-8" style="margin-top: 20px;">
                            <form class="am-form am-form-horizontal">
                                <input type="hidden" id="id" value="${address.id}">
                                <div class="am-form-group">
                                    <label for="user-name" class="am-form-label">收货人</label>
                                    <div class="am-form-content">
                                        <input type="text" id="user-name" placeholder="收货人" value="${address.receiveName}">
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label for="user-phone" class="am-form-label">手机号码</label>
                                    <div class="am-form-content">
                                        <input id="user-phone" placeholder="手机号必填" type="tel" value="${address.receiveTelephone}">
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label for="user-intro" class="am-form-label">详细地址</label>
                                    <div class="am-form-content">
                                        <textarea class="" rows="3" id="user-intro" placeholder="输入详细地址">${address.completeAddress}</textarea>

                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <div class="am-u-sm-9 am-u-sm-push-3">
                                        <a id="saveBtn" class="am-btn am-btn-danger">保存</a>
                                        <a href="javascript: void(0)" class="am-close am-btn am-btn-danger"
                                           data-am-modal-close>取消</a>
                                    </div>
                                </div>
                            </form>
                        </div>

                    </div>

                </div>

            </div>

            <script type="text/javascript">
                $(document).ready(function () {
                    $(".new-option-r").click(function () {
                        $(this).parent('.user-addresslist').addClass("defaultAddr").siblings().removeClass("defaultAddr");
                    });

                    var $ww = $(window).width();
                    if ($ww > 640) {
                        $("#doc-modal-1").removeClass("am-modal am-modal-no-btn")
                    }

                })
            </script>
            <div class="clear"></div>
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
        var receiveName = $('#user-name').val();
        var phone = $('#user-phone').val();
        var detail = $('#user-intro').val();
        console.log(receiveName);
        console.log(phone);
        console.log(detail);
        // console.log(area);
        // console.log(city);
        // console.log(province);
        $.ajax({
            type: "post",
            url: "${ctx}/person/address/update",
            data: {
                'id':${address.id},
                'receiveName':receiveName,
                'receiveTelephone':phone,
                // 'province':province,
                // 'city':city,
                // 'area':area,
                'completeAddress':detail
            },
            dataType: "json",
            success: function(result) {                    //result为返回值
                if(result.success) {
                    alert("修改成功")
                    window.location.href="${ctx}/person/address/list";
                } else {
                    alert(result.message);
                }
            }
        });
    });
</script>

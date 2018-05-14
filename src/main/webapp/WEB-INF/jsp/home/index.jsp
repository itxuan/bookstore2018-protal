<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>首页</title>
    <link href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="${ctx}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />
    <link href="${ctx}/basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="${ctx}/css/hmstyle.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/skin.css" rel="stylesheet" type="text/css" />
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
    <style type="text/css">
        .overHiddenClass{
            width: 100px;
            display: block;
            overflow: hidden;
            white-space: nowrap;
            text-overflow: ellipsis;
        }
    </style>
</head>
<body>
<div class="hmtop">
    <!--顶部导航条 -->

    <jsp:include page="/common/home-head.jsp"></jsp:include>
    <!--悬浮搜索框-->
    <jsp:include page="/common/home-search.jsp"></jsp:include>
</div>
<div class="banner">
    <!--轮播 -->
    <div class="am-slider am-slider-default scoll" data-am-flexslider id="demo-slider-0">
        <ul class="am-slides">
            <c:forEach items="${advertList}" var="advert" varStatus="state">
                <li class="banner${state.index+1}">
                    <a href="${ctx}/home${advert.url}"><img src="${advert.image}" /></a>
                </li>
            </c:forEach>
        </ul>
    </div>
    <div class="clear"></div>
</div>
<div class="shopNav">
    <div class="slideall">
        <div class="long-title"><span class="all-goods">全部分类</span></div>
        <div class="nav-cont">
            <ul>

            </ul>
        </div>
        <!--分类导航-->
        <jsp:include page="/common/home-nav-sort.jsp"></jsp:include>
        <!--轮播实现代码-->
        <script type="text/javascript">
            (function() {
                $('.am-slider').flexslider();
            });
            $(document).ready(function() {
                $("li").hover(function() {
                    $(".category-content .category-list li.first .menu-in").css("display", "none");
                    $(".category-content .category-list li.first").removeClass("hover");
                    $(this).addClass("hover");
                    $(this).children("div.menu-in").css("display", "block")
                }, function() {
                    $(this).removeClass("hover")
                    $(this).children("div.menu-in").css("display", "none")
                });
            })
        </script>
        <!--小导航 -->
        <div class="am-g am-g-fixed smallnav">
            <div class="am-u-sm-3">
                <a href="sort.html"><img src="../images/navsmall.jpg" />
                    <div class="title">商品分类</div>
                </a>
            </div>
            <div class="am-u-sm-3">
                <a href="#"><img src="../images/huismall.jpg" />
                    <div class="title">大聚惠</div>
                </a>
            </div>
            <div class="am-u-sm-3">
                <a href="#"><img src="../images/mansmall.jpg" />
                    <div class="title">个人中心</div>
                </a>
            </div>
            <div class="am-u-sm-3">
                <a href="#"><img src="../images/moneysmall.jpg" />
                    <div class="title">投资理财</div>
                </a>
            </div>
        </div>
        <!--公告 -->
        <jsp:include page="/common/home-nav.jsp"></jsp:include>
    </div>
    <script type="text/javascript">
        if ($(window).width() < 640) {
            function autoScroll(obj) {
                $(obj).find("ul").animate({
                    marginTop: "-39px"
                }, 500, function() {
                    $(this).css({
                        marginTop: "0px"
                    }).find("li:first").appendTo(this);
                })
            }
            $(function() {
                setInterval('autoScroll(".demo")', 3000);
            })
        }
    </script>
</div>
<div class="shopMainbg">


    <div id="f1">
        <!--少儿-->
        <div class="am-container ">
            <div class="shopTitle ">
                <h4>少儿</h4>
                <h3>用心关注孩子的成长</h3>
                <div class="today-brands ">
                    <a href="# ">1-2岁</a>
                    <a href="# ">3-4岁</a>
                    <a href="# ">5-7岁 </a>
                    <a href="# ">7-10岁</a>
                </div>
                <span class="more ">
                    <a href="# ">更多相关<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                </span>
            </div>
        </div>

        <div class="am-g am-g-fixed floodFour">
            <div class="am-u-sm-5 am-u-md-4 text-two list ">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>

                <div class="triangle-topright"></div>
            </div>
            <c:forEach items="${childPageInfo.list}" var="childBook">
            <!-- start -->
                <div class="am-u-sm-7 am-u-md-4 text-two">
                <div class="outer-con ">
                    <div class="title overHiddenClass">
                        ${childBook.bookname}
                    </div>
                    <div class="sub-title ">
                        <label style="color: red">价格：</label> ${childBook.currentPrice}
                    </div>
                    <a href="javascript:indexAddToCart('${childBook.id}')">
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </a>
                </div>
                    <a href="javascript:bookDetail('${childBook.id}')">
                        <img src="${childBook.bookIcon}" />
                    </a>
            </div>
            </c:forEach>
            <!-- end -->
        </div>

        <div class="clear "></div>
        <br>

    </div>
    <div class="clear "></div>

    <!--生活-->

    <div id="f2">
        <!--少儿-->
        <div class="am-container ">
            <div class="shopTitle ">
                <h4>文学</h4>
                <h3>生活需要文学气息</h3>
                <div class="today-brands ">
                    <a href="# ">1-2岁</a>
                    <a href="# ">3-4岁</a>
                    <a href="# ">5-7岁 </a>
                </div>
                <span class="more ">
                    <a href="# ">更多相关<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                </span>
            </div>
        </div>

        <div class="am-g am-g-fixed floodFour">
            <div class="am-u-sm-5 am-u-md-4 text-two list ">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>

                <div class="triangle-topright"></div>
            </div>
            <c:forEach items="${wenXuePageInfo.list}" var="wenXuePageBook">
                <!-- start -->
                <div class="am-u-sm-7 am-u-md-4 text-two">
                    <div class="outer-con ">
                        <div class="title overHiddenClass">
                                ${wenXuePageBook.bookname}
                        </div>
                        <div class="sub-title ">
                            <label style="color: red">价格：</label> ${wenXuePageBook.currentPrice}
                        </div>
                        <a href="javascript:indexAddToCart('${wenXuePageBook.id}')">
                            <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                        </a>
                    </div>
                    <a href="${ctx}/home/detail?id="+${childBook.id}>
                        <img src="${childBook.bookIcon}" />
                    </a>
                </div>
            </c:forEach>
            <!-- end -->
        </div>
        <div class="clear "></div>
        <br>

    </div>
    <div class="clear "></div>

    <div id="f3">
        <!--生活-->
        <div class="am-container ">
            <div class="shopTitle ">
                <h4>生活</h4>
                <h3>教你生活小窍门</h3>
                <div class="today-brands ">
                    <a href="# ">1-2岁</a>
                    <a href="# ">3-4岁</a>
                    <a href="# ">5-7岁 </a>
                    <a href="# ">7-10岁</a>
                </div>
                <span class="more ">
                    <a href="# ">更多相关<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                </span>
            </div>
        </div>

        <div class="am-g am-g-fixed floodFour">
            <div class="am-u-sm-5 am-u-md-4 text-two list ">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>

                <div class="triangle-topright"></div>
            </div>
            <c:forEach items="${childPageInfo.list}" var="childBook">
                <!-- start -->
                <div class="am-u-sm-7 am-u-md-4 text-two">
                    <div class="outer-con ">
                        <div class="title overHiddenClass">
                                ${childBook.bookname}
                        </div>
                        <div class="sub-title ">
                            <label style="color: red">价格：</label> ${childBook.currentPrice}
                        </div>
                        <a href="javascript:indexAddToCart('${childBook.id}')">
                            <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                        </a>
                    </div>
                    <a href="# ">
                        <c:if test="${childBook.bookIcon != null}">
                            <img src="${childBook.bookIcon}" />
                        </c:if>
                    </a>
                </div>
            </c:forEach>
            <!-- end -->
        </div>

        <div class="clear "></div>
        <br>

    </div>
    <div class="clear "></div>

</div>
    <!--底部版权-->
    <jsp:include page="/common/home-footer.jsp"></jsp:include>
</div>
</div>
<%--<!--引导 -->--%>
<%--<div class="navCir">--%>
    <%--<li class="active"><a href="home.html"><i class="am-icon-home "></i>首页</a></li>--%>
    <%--<li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>--%>
    <%--<li><a href="shopcart.html"><i class="am-icon-shopping-basket"></i>购物车</a></li>--%>
    <%--<li><a href="../person/index.html"><i class="am-icon-user"></i>我的</a></li>--%>
<%--</div>--%>


<!--菜单 -->
<%--<jsp:include page="/common/home-tip.jsp"></jsp:include>--%>

<script>
    window.jQuery || document.write('<script src="${ctx}/basic/js/jquery.min.js "><\/script>');
</script>
<script type="text/javascript " src="${ctx}/basic/js/quick_links.js "></script>
</body>

</html>
<script>
    function indexAddToCart(bookId) {
        console.log("index add book to cart");

        $.ajax({
            type:'post',
            url:'${ctx}/person/cart/add',
            data:{
                'bookId':bookId
            },
            success:function (data) {
                console.log(data);
                if(data.code == 1){
                    alert(data.message);
                }
            }
        })
    }
</script>
<script>
    function bookDetail(bookId){
        location.href='${ctx}/home/detail?id='+bookId;
    }
</script>
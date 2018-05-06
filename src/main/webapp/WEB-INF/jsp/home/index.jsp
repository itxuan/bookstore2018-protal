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
            <li class="banner1"><a href=""><img src="${ctx}/images/ad1.jpg" /></a></li>
            <li class="banner2"><a href=""><img src="${ctx}/images/ad2.jpg" /></a></li>
            <li class="banner3"><a href=""><img src="${ctx}/images/ad3.jpg" /></a></li>
            <li class="banner4"><a href=""><img src="${ctx}/images/ad4.jpg" /></a></li>
        </ul>
    </div>
    <div class="clear"></div>
</div>
<div class="shopNav">
    <div class="slideall">
        <div class="long-title"><span class="all-goods">全部分类</span></div>
        <div class="nav-cont">
            <ul>
                <%--<li class="index"><a href="#">首页</a></li>--%>
                <%--<li class="qc"><a href="#">闪购</a></li>--%>
                <%--<li class="qc"><a href="#">限时抢</a></li>--%>
                <%--<li class="qc"><a href="#">团购</a></li>--%>
                <%--<li class="qc last"><a href="#">大包装</a></li>--%>
            </ul>

        </div>

        <!--分类导航-->
        <jsp:include page="/common/home-nav-sort.jsp"></jsp:include>
        <!--轮播-->

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

        <!--走马灯 -->
        <%--<jsp:include page="/common/home-nav.jsp"></jsp:include>--%>

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
    <div class="shopMain" id="shopmain">

        <!--今日推荐 -->
        <div class="am-g am-g-fixed recommendation">
            <div class="clock am-u-sm-3">
            <img src="../images/2016.png "></img>
            <p>今日<br>推荐</p>
        </div>
        <div class="am-u-sm-4 am-u-lg-3 ">
            <div class="info ">
                <h3>真的有鱼</h3>
                <h4>开年福利篇</h4>
            </div>
            <div class="recommendationMain one">
                <a href="introduction.html"><img src="${ctx}/images/tj.png "/> </a>
            </div>
        </div>
        <div class="am-u-sm-4 am-u-lg-3 ">
            <div class="info ">
                <h3>囤货过冬</h3>
                <h4>让爱早回家</h4>
            </div>
            <div class="recommendationMain two">
                <img src="../images/tj1.png "/>
            </div>
        </div>
        <div class="am-u-sm-4 am-u-lg-3 ">
            <div class="info ">
                <h3>浪漫情人节</h3>
                <h4>甜甜蜜蜜</h4>
            </div>
            <div class="recommendationMain three">
                <img src="../images/tj2.png "/>
            </div>
        </div>

    </div>
    <div class="clear "></div>

    <!--热门活动 -->

    <%--<div class="am-container activity ">--%>
        <%--<div class="shopTitle ">--%>
            <%--<h4>活动</h4>--%>
            <%--<h3>每期活动 优惠享不停 </h3>--%>
            <%--<span class="more ">--%>
                              <%--<a href="# ">全部活动<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>--%>
                        <%--</span>--%>
        <%--</div>--%>
        <%--<div class="am-g am-g-fixed ">--%>
            <%--<div class="am-u-sm-3 ">--%>
                <%--<div class="icon-sale one "></div>--%>
                <%--<h4>秒杀</h4>--%>
                <%--<div class="activityMain ">--%>
                    <%--<img src="../images/activity1.jpg "></img>--%>
                <%--</div>--%>
                <%--<div class="info ">--%>
                    <%--<h3>春节送礼优选</h3>--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="am-u-sm-3 ">--%>
                <%--<div class="icon-sale two "></div>--%>
                <%--<h4>特惠</h4>--%>
                <%--<div class="activityMain ">--%>
                    <%--<img src="../images/activity2.jpg "></img>--%>
                <%--</div>--%>
                <%--<div class="info ">--%>
                    <%--<h3>春节送礼优选</h3>--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="am-u-sm-3 ">--%>
                <%--<div class="icon-sale three "></div>--%>
                <%--<h4>团购</h4>--%>
                <%--<div class="activityMain ">--%>
                    <%--<img src="../images/activity3.jpg "></img>--%>
                <%--</div>--%>
                <%--<div class="info ">--%>
                    <%--<h3>春节送礼优选</h3>--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="am-u-sm-3 last ">--%>
                <%--<div class="icon-sale "></div>--%>
                <%--<h4>超值</h4>--%>
                <%--<div class="activityMain ">--%>
                    <%--<img src="../images/activity.jpg "></img>--%>
                <%--</div>--%>
                <%--<div class="info ">--%>
                    <%--<h3>春节送礼优选</h3>--%>
                <%--</div>--%>
            <%--</div>--%>

        <%--</div>--%>
    <%--</div>--%>
    <%--<div class="clear "></div>--%>


    <div id="f1">
        <!--甜点-->

        <div class="am-container ">
            <div class="shopTitle ">
                <h4>甜品</h4>
                <h3>每一道甜品都有一个故事</h3>
                <div class="today-brands ">
                    <a href="# ">桂花糕</a>
                    <a href="# ">奶皮酥</a>
                    <a href="# ">栗子糕 </a>
                    <a href="# ">马卡龙</a>
                    <a href="# ">铜锣烧</a>
                    <a href="# ">豌豆黄</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>

        <div class="am-g am-g-fixed floodFour">
            <div class="am-u-sm-5 am-u-md-4 text-one list ">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <div class="outer-con ">
                        <div class="title ">
                            开抢啦！
                        </div>
                        <div class="sub-title ">
                            零食大礼包
                        </div>
                    </div>
                    <img src="../images/act1.png " />
                </a>
                <div class="triangle-topright"></div>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two sug">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="../images/2.jpg" /></a>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="../images/1.jpg" /></a>
            </div>


            <div class="am-u-sm-3 am-u-md-2 text-three big">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="../images/5.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three sug">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="../images/3.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="../images/4.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three last big ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="../images/5.jpg" /></a>
            </div>

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

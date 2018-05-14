<%--
  Created by IntelliJ IDEA.
  User: Shen
  Date: 2018/3/16
  Time: 1:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>搜索页面</title>

    <link href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="${ctx}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

    <link href="${ctx}/basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="${ctx}/css/seastyle.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="${ctx}/basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="${ctx}/js/script.js"></script>
</head>

<body>

<!--顶部导航条 -->
<jsp:include page="/common/home-head.jsp"></jsp:include>
<!--悬浮搜索框-->
<jsp:include page="/common/home-search.jsp"></jsp:include>
<b class="line"></b>
<div class="search">
    <div class="search-list">
        <jsp:include page="/common/home-headLine.jsp"></jsp:include>
        <div class="am-g am-g-fixed">
            <div class="am-u-sm-12 am-u-md-12">
                <div class="theme-popover">
                    <div class="searchAbout">
                        <span class="font-pale">&nbsp;</span>
                    </div>
                    <ul class="select">
                        <p class="title font-normal">
                            <span class="fl">松子</span>
                            <span class="total fl">搜索到<strong class="num">997</strong>件相关商品</span>
                        </p>
                        <div class="clear"></div>
                        <li class="select-result">
                            <dl>
                                <dt>已选</dt>
                                <dd class="select-no"></dd>
                                <p class="eliminateCriteria">清除</p>
                            </dl>
                        </li>
                        <div class="clear"></div>
                        <li class="select-list">
                            <dl id="select1">
                                <dt class="am-badge am-round">分类</dt>
                                <div class="dd-conent">
                                    <dd class="select-all selected"><a href="#">全部</a></dd>
                                    <dd><a href="javascript:search('','','','分类')">分类1</a></dd>
                                    <dd><a href="#">分类2</a></dd>
                                    <dd><a href="#">分类3</a></dd>
                                    <dd><a href="#">分类4</a></dd>
                                    <dd><a href="#">分类5</a></dd>
                                    <dd><a href="#">分类6</a></dd>
                                    <dd><a href="#">分类7</a></dd>
                                </div>
                            </dl>
                        </li>
                        <li class="select-list">
                            <dl id="select2">
                                <dt class="am-badge am-round">价格</dt>
                                <div class="dd-conent">
                                    <dd class="select-all selected">
                                        <a href="#">0-19</a></dd>
                                    <dd><a href="#">20-39</a></dd>
                                    <dd><a href="#">40-99</a></dd>
                                    <dd><a href="#">100-149</a></dd>
                                    <dd><a href="#">150以上</a></dd>
                                </div>
                            </dl>
                        </li>
                        <li class="select-list">
                            <dl id="select3">
                                <dt class="am-badge am-round">折扣</dt>
                                <div class="dd-conent">
                                    <dd class="select-all selected"><a href="#">全部</a></dd>
                                    <dd><a href="#">3折以下</a></dd>
                                    <dd><a href="#">3-5折</a></dd>
                                    <dd><a href="#">5-7折</a></dd>
                                    <dd><a href="#">7折以上</a></dd>
                                </div>
                            </dl>
                        </li>

                    </ul>
                    <div class="clear"></div>
                </div>
                <div class="search-content">
                    <div class="sort">
                        <li class="first"><a title="综合">综合排序</a></li>
                        <li><a title="销量" href="#">销量排序</a></li>
                        <li><a title="价格" href="#">价格优先</a></li>

                    </div>
                    <div class="clear"></div>

                    <ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes">

                        <li>
                            <div class="i-pic limit">
                                <img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>

                        <li>
                            <div class="i-pic limit">

                                <img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />
                                <p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>

                        <li>
                            <div class="i-pic limit">

                                <img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>

                        <li>
                            <div class="i-pic limit">

                                <img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />
                                <p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>

                        <li>
                            <div class="i-pic limit">

                                <img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>

                        <li>
                            <div class="i-pic limit">

                                <img src="../images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>

                        <li>
                            <div class="i-pic limit">

                                <img src="../images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>

                        <li>
                            <div class="i-pic limit">

                                <img src="../images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>

                    </ul>
                </div>
                <div class="search-side">

                    <div class="side-title">
                        电子书推荐
                    </div>

                    <li>
                        <div class="i-pic check">
                            <%--<img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />--%>
                            <p class="check-title">电子书名字</p>
                            <p class="price fl">
                                <span><a>下载地址</a></span>
                            </p>
                            <p class="number fl">
                                下载量<span>1110</span>次
                            </p>
                        </div>
                    </li>

                    <li>
                        <div class="i-pic check">
                            <%--<img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />--%>
                            <p class="check-title">电子书名字</p>
                            <p class="price fl">
                                <span><a>下载地址</a></span>
                            </p>
                            <p class="number fl">
                                下载量<span>1110</span>次
                            </p>
                        </div>
                    </li>

                    <li>
                        <div class="i-pic check">
                            <%--<img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />--%>
                            <p class="check-title">电子书名字</p>
                            <p class="price fl">
                                <span><a>下载地址</a></span>
                            </p>
                            <p class="number fl">
                                下载量<span>1110</span>次
                            </p>
                        </div>
                    </li>

                    <li>
                        <div class="i-pic check">
                            <%--<img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />--%>
                            <p class="check-title">电子书名字</p>
                            <p class="price fl">
                                <span><a>下载地址</a></span>
                            </p>
                            <p class="number fl">
                                下载量<span>1110</span>次
                            </p>
                        </div>
                    </li>

                    <li>
                        <div class="i-pic check">
                            <%--<img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />--%>
                            <p class="check-title">电子书名字</p>
                            <p class="price fl">
                                <span><a>下载地址</a></span>
                            </p>
                            <p class="number fl">
                                下载量<span>1110</span>次
                            </p>
                        </div>
                    </li>

                    <li>
                        <div class="i-pic check">
                            <%--<img src="http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/1805091511357992.jpg" />--%>
                            <p class="check-title">电子书名字</p>
                            <p class="price fl">
                                <span><a>下载地址</a></span>
                            </p>
                            <p class="number fl">
                                下载量<span>1110</span>次
                            </p>
                        </div>
                    </li>

                </div>
                <div class="clear"></div>
                <!--分页 -->
                <ul class="am-pagination am-pagination-right">
                    <li class="am-disabled"><a href="#">&laquo;</a></li>
                    <li class="am-active"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">&raquo;</a></li>
                </ul>

            </div>
        </div>
        <!--底部版权-->
        <jsp:include page="/common/home-footer.jsp"></jsp:include>
    </div>
</div>
<!--tip菜单 -->
<script>
    window.jQuery || document.write('<script src="${ctx}/basic/js/jquery-1.9.min.js"><\/script>');
</script>
<script type="text/javascript" src="${ctx}/basic/js/quick_links.js"></script>
<div class="theme-popover-mask"></div>
</body>
</html>


<script>
    function search(item) {
        console.log("search content"+ item);

        $.ajax({
            url:'',
            type:'post',
            data:{
                '':item
            },
            dataType:'json',
            success:function (data) {

            }
        });
    }
</script>

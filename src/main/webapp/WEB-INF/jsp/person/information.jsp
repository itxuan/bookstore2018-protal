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

    <title>个人资料</title>

    <link href="${ctx}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${ctx}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/css/infstyle.css" rel="stylesheet" type="text/css">
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="${ctx}/AmazeUI-2.4.2/assets/js/amazeui.js" type="text/javascript"></script>
    <!--引入时间插件-->
    <script src="${ctx}/My97DatePicker/WdatePicker.js"></script>
    <script src="${ctx}/js/ajaxfileupload.js"></script>
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

            <div class="user-info">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small></div>
                </div>
                <hr/>
                <!--头像 -->
                <div class="user-infoPic">

                    <div class="filePic">
                        <input type="file" id="user_icon" name="user_icon" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
                        <c:if test="${user.icon == null}">
                            <img class="am-circle am-img-thumbnail" src="${ctx}/images/getAvatar.do.jpg" alt="头像" />
                        </c:if>
                        <c:if test="${user.icon != null}">
                            <img class="am-circle am-img-thumbnail" src="${user.icon}" alt="头像" />
                        </c:if>
                    </div>

                    <p class="am-form-help">头像</p>

                    <div class="info-m">
                        <div><b>用户名：<i>${user.nickname}</i></b></div>
                        <div class="u-safety">
                            <%--<a href="#">--%>
                                <%--账户安全--%>
                                <%--<span class="u-profile"><i class="bc_ee0000" style="width: 60px;" width="0">60分</i></span>--%>
                            <%--</a>--%>
                        </div>
                    </div>
                </div>
                <!--个人信息 -->
                <div class="info-main">
                    <form class="am-form am-form-horizontal">

                        <div class="am-form-group">
                            <label for="nickName" class="am-form-label">昵称</label>
                            <div class="am-form-content">
                                <input type="text" id="nickName"readonly="readonly" value="${user.nickname}">

                            </div>
                        </div>

                        <div class="am-form-group">
                            <label class="am-form-label">性别</label>
                            <c:if test="${user.gender == 1}">
                                <div class="am-form-content sex">
                                    <label class="am-radio-inline">
                                        <input type="radio" name="gender" value="1" checked data-am-ucheck>男
                                    </label>
                                    <label class="am-radio-inline">
                                        <input type="radio" name="gender" value="2" data-am-ucheck> 女
                                    </label>
                                    <label class="am-radio-inline">
                                        <input type="radio" name="gender" value="0" data-am-ucheck> 保密
                                    </label>
                                </div>
                            </c:if>

                            <c:if test="${user.gender == 2}">
                                <div class="am-form-content sex">
                                    <label class="am-radio-inline">
                                        <input type="radio" name="gender" value="1"  data-am-ucheck>男
                                    </label>
                                    <label class="am-radio-inline">
                                        <input type="radio" name="gender" value="2" checked data-am-ucheck> 女
                                    </label>
                                    <label class="am-radio-inline">
                                        <input type="radio" name="gender" value="0" data-am-ucheck> 保密
                                    </label>
                                </div>
                            </c:if>
                            <c:if test="${user.gender == 0}">
                                <div class="am-form-content sex">
                                    <label class="am-radio-inline">
                                        <input type="radio" name="gender" value="1"  data-am-ucheck>男
                                    </label>
                                    <label class="am-radio-inline">
                                        <input type="radio" name="gender" value="2" data-am-ucheck> 女
                                    </label>
                                    <label class="am-radio-inline">
                                        <input type="radio" name="gender" value="0" checked data-am-ucheck> 保密
                                    </label>
                                </div>
                            </c:if>

                        </div>

                        <div class="am-form-group">
                            <label for="user-birth" class="am-form-label">生日</label>
                            <div class="am-form-content birth">
                                <input id="user-birth" type="text" name="publishTime" class="Wdate"
                                       style="height: 30px;width: 200px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'});" value="${birthday}"/>
                            </div>
                        </div>

                        <div class="am-form-group">
                            <label for="user-phone" class="am-form-label">电话</label>
                            <div class="am-form-content">
                                <input id="user-phone" placeholder="请填写电话号码" type="tel" value="${user.telephone}">

                            </div>
                        </div>
                        <div class="am-form-group">
                            <label for="user-email" class="am-form-label">电子邮件</label>
                            <div class="am-form-content">
                                <input id="user-email" placeholder="Email" type="email" value="${user.email}">
                            </div>
                        </div>

                        <div class="info-btn">
                            <a id="updateBtn" class="am-btn am-btn-danger">保存修改</a>
                        </div>
                    </form>
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
<script>


    $("#updateBtn").click(function () {
        var gender = $('input[name="gender"]:checked').val();
        var birthday = $('#user-birth').val();
        var telephone = $('#user-phone').val();
        var email = $('#user-email').val();
        console.log(gender);
        console.log(birthday);
        console.log(telephone);
        console.log(email);


        $.ajaxFileUpload({
            type: "post",
            url: "${ctx}/person/information/update",
            secureuri: false,
            fileElementId: 'user_icon', // 上传文件的id、name属性名
            data: {
                'id':${user.id},
                'gender':gender,
                'birthday':birthday,
                'telephone':telephone,
                'email':email
            },
            dataType: "json",
            success: function(result) {                    //result为返回值
                if(result.success) {
                    alert("修改成功")
                    window.location.reload();
                } else {
                    alert(result.message);
                }
            }
        });
    });
</script>


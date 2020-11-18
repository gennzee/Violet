<%--
  Created by IntelliJ IDEA.
  User: anhnx
  Date: 07/05/2020
  Time: 06:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<footer class="bg3 p-t-75 p-b-32">
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-lg-3 p-b-50">
                <h4 class="stext-301 cl0 p-b-30">
                    Danh mục
                </h4>

                <ul>
                    <c:forEach var="c" items="${listCategories}">
                    <li class="p-b-10">
                        <a href="/category/${c.id}/1" class="stext-107 cl7 hov-cl1 trans-04">
                            ${c.name}
                        </a>
                    </li>
                    </c:forEach>
                </ul>
            </div>

            <div class="col-sm-6 col-lg-3 p-b-50">
                <h4 class="stext-301 cl0 p-b-30">
                    Dịch vụ
                </h4>

                <ul>

                    <li class="p-b-10">
                        <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                            Trả hàng
                        </a>
                    </li>

                    <li class="p-b-10">
                        <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                            Vận chuyển
                        </a>
                    </li>

                    <li class="p-b-10">
                        <a href="#" class="stext-107 cl7 hov-cl1 trans-04">
                            FAQs
                        </a>
                    </li>
                </ul>
            </div>

            <div class="col-sm-6 col-lg-3 p-b-50">
                <h4 class="stext-301 cl0 p-b-30">
                    Liên hệ
                </h4>

                <p class="stext-107 cl7 size-201">
                    Bạn cần giúp đỡ? Cho chúng tôi biết thông qua địa chỉ <a href="/contact">liên hệ</a>.
                </p>

                <div class="p-t-27">
                    <a href="#" class="fs-18 cl7 hov-cl1 trans-04 m-r-16">
                        <i class="fa fa-facebook"></i>
                    </a>

                    <a href="#" class="fs-18 cl7 hov-cl1 trans-04 m-r-16">
                        <i class="fa fa-instagram"></i>
                    </a>

                    <a href="#" class="fs-18 cl7 hov-cl1 trans-04 m-r-16">
                        <i class="fa fa-pinterest-p"></i>
                    </a>
                </div>
            </div>

            <div class="col-sm-6 col-lg-3 p-b-50">
                <h4 class="stext-301 cl0 p-b-30">
                    Nhận thông báo mới
                </h4>

                <form>
                    <div class="wrap-input1 w-full p-b-4">
                        <input class="input1 bg-none plh1 stext-107 cl7" type="text" name="email" placeholder="email@example.com">
                        <div class="focus-input1 trans-04"></div>
                    </div>

                    <div class="p-t-18">
                        <button class="flex-c-m stext-101 cl0 size-103 bg1 bor1 hov-btn2 p-lr-15 trans-04">
                            Đăng ký nhận
                        </button>
                    </div>
                </form>
            </div>
        </div>

        <div class="p-t-40">
            <div class="flex-c-m flex-w p-b-18">
                Website is developed by&nbsp;
                <a href="#" class="m-all-1">
                    Genn's Team.
                </a>
            </div>

            <p class="stext-107 cl6 txt-center">
                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->

            </p>
        </div>
    </div>
</footer>


<!-- Back to top -->
<div class="btn-back-to-top" id="myBtn">
		<span class="symbol-btn-back-to-top">
			<i class="zmdi zmdi-chevron-up"></i>
		</span>
</div>

<!-- Modal1 -->
<c:forEach var="p" items="${listProducts}">
<div class="wrap-modal1 js-modal${p.id} p-t-60 p-b-20">
    <div class="overlay-modal1 js-hide-modal1" data-id="${p.id}"></div>

    <div class="container">
        <div class="bg0 p-t-60 p-b-30 p-lr-15-lg how-pos3-parent">
            <button class="how-pos3 hov3 trans-04 js-hide-modal1">
                <img src="/coza/images/icons/icon-close.png" alt="CLOSE" data-id="${p.id}">
            </button>

            <div class="row">
                <div class="col-md-6 col-lg-7 p-b-30">
                    <div class="p-l-25 p-r-30 p-lr-0-lg">
                        <div class="wrap-slick3 flex-sb flex-w">
                            <div class="wrap-slick3-dots"></div>
                            <div class="wrap-slick3-arrows flex-sb-m flex-w"></div>

                            <div class="slick3 gallery-lb">
                                <c:choose>
                                    <c:when test="${not empty p.productImageList}">
                                        <c:forEach var="image" items="${p.productImageList}">
                                            <div class="item-slick3" style="" data-thumb="/images/${image.name}">
                                                <div class="wrap-pic-w pos-relative">
                                                    <img src="/images/${image.name}" style="object-fit: cover;width: 600px;height: 742px;" alt="IMG-PRODUCT">

                                                    <a class="flex-c-m size-108 how-pos1 bor0 fs-16 cl10 bg0 hov-btn3 trans-04" href="/images/${image.name}">
                                                        <i class="fa fa-expand"></i>
                                                    </a>
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </c:when>
                                    <c:otherwise>
                                        <div class="item-slick3" data-thumb="/coza/images/product-detail-01.jpg">
                                            <div class="wrap-pic-w pos-relative">
                                                <img src="/coza/images/product-detail-01.jpg" alt="IMG-PRODUCT">

                                                <a class="flex-c-m size-108 how-pos1 bor0 fs-16 cl10 bg0 hov-btn3 trans-04" href="/coza/images/product-detail-01.jpg">
                                                    <i class="fa fa-expand"></i>
                                                </a>
                                            </div>
                                        </div>
                                    </c:otherwise>
                                </c:choose>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-6 col-lg-5 p-b-30">
                    <div class="p-r-50 p-t-5 p-lr-0-lg">
                        <h4 id="productModalName" class="mtext-105 cl2 js-name-detail p-b-14">
                                ${p.name}
                        </h4>

                        <span id="productModalPrice" class="mtext-106 cl2">
                            <fmt:formatNumber type = "number" value = "${p.productStorageList[0].price}" /> VNĐ
                        </span>

                        <p id="productModalDescription" class="stext-102 cl3 p-t-23">
                            ${p.description}
                        </p>

                        <form class="addProductToCart" action="#" method="get" id="${p.id}">
                        <div class="p-t-33">
                            <%--chiều cao--%>
                            <c:if test="${currentCategory != 2}">
                                <div class="flex-w flex-r-m p-b-10">
                                    <div class="size-203 flex-c-m respon6">
                                        Chiều cao
                                    </div>

                                    <div class="size-204 respon6-next">
                                        <div class="rs1-select2 bor8 bg0">
                                            <select class="js-select2" name="height">
                                                <option value="0">Chọn chiều cao</option>
                                                <c:forEach var="height" items="${productHeightList}">
                                                    <c:if test="${height.key == p.id}">
                                                        <c:forEach var="heightValue" items="${height.value}">
                                                            <option value="${heightValue.key}">${heightValue.value}</option>
                                                        </c:forEach>
                                                    </c:if>
                                                </c:forEach>
                                            </select>
                                            <div class="dropDownSelect2"></div>
                                        </div>
                                    </div>
                                </div>
                            </c:if>

                            <%--kích cỡ--%>
                            <div class="flex-w flex-r-m p-b-10">
                                <div class="size-203 flex-c-m respon6">
                                    Kích cỡ
                                </div>

                                <div class="size-204 respon6-next">
                                    <div class="rs1-select2 bor8 bg0">
                                        <select class="js-select2" name="size">
                                            <option value="0">Chọn cỡ</option>
                                            <c:forEach var="size" items="${productSizeList}">
                                                <c:if test="${size.key == p.id}">
                                                    <c:forEach var="sizeValue" items="${size.value}">
                                                        <option value="${sizeValue.key}">${sizeValue.value}</option>
                                                    </c:forEach>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                        <div class="dropDownSelect2"></div>
                                    </div>
                                </div>
                            </div>

                            <%--màu--%>
                            <c:if test="${currentCategory != 2}">
                                <div class="flex-w flex-r-m p-b-10">
                                    <div class="size-203 flex-c-m respon6">
                                        Màu
                                    </div>

                                    <div class="size-204 respon6-next">
                                        <div class="rs1-select2 bor8 bg0">
                                            <select class="js-select2" name="color">
                                                <option value="0">Chọn màu</option>
                                                <c:forEach var="color" items="${productColorList}">
                                                    <c:if test="${color.key == p.id}">
                                                        <c:forEach var="colorValue" items="${color.value}">
                                                            <option value="${colorValue.key}">${colorValue.value}</option>
                                                        </c:forEach>
                                                    </c:if>
                                                </c:forEach>
                                            </select>
                                            <div class="dropDownSelect2"></div>
                                        </div>
                                    </div>
                                </div>
                            </c:if>

                            <div class="flex-w flex-r-m p-b-10">
                                <div class="size-204 flex-w flex-m respon6-next">
                                    <input type="hidden" name="id" value="${p.id}"/>
                                    <div class="wrap-num-product flex-w m-r-20 m-tb-10">
                                        <div class="btn-num-product-down cl8 hov-btn3 trans-04 flex-c-m">
                                            <i class="fs-16 zmdi zmdi-minus"></i>
                                        </div>

                                        <input class="mtext-104 cl3 txt-center num-product" type="number" name="num-product" value="1">

                                        <div class="btn-num-product-up cl8 hov-btn3 trans-04 flex-c-m">
                                            <i class="fs-16 zmdi zmdi-plus"></i>
                                        </div>
                                    </div>

                                    <button type="submit" class="flex-c-m stext-101 cl0 size-101 bg1 bor1 hov-btn1 p-lr-15 trans-04 js-addcart-detail">
                                        Thêm vào giỏ
                                    </button>
                                </div>
                            </div>
                        </div>
                        </form>
                        <!--  -->
                        <div class="flex-w flex-m p-l-100 p-t-40 respon7">
                            <div class="flex-m bor9 p-r-10 m-r-11">
                                <a href="#" class="fs-14 cl3 hov-cl1 trans-04 lh-10 p-lr-5 p-tb-2 js-addwish-detail tooltip100" data-tooltip="Add to Wishlist">
                                    <i class="zmdi zmdi-favorite"></i>
                                </a>
                            </div>

                            <a href="#" class="fs-14 cl3 hov-cl1 trans-04 lh-10 p-lr-5 p-tb-2 m-r-8 tooltip100" data-tooltip="Facebook">
                                <i class="fa fa-facebook"></i>
                            </a>

                            <a href="#" class="fs-14 cl3 hov-cl1 trans-04 lh-10 p-lr-5 p-tb-2 m-r-8 tooltip100" data-tooltip="Twitter">
                                <i class="fa fa-twitter"></i>
                            </a>

                            <a href="#" class="fs-14 cl3 hov-cl1 trans-04 lh-10 p-lr-5 p-tb-2 m-r-8 tooltip100" data-tooltip="Google Plus">
                                <i class="fa fa-google-plus"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</c:forEach>
<!-- Login Modal -->
<div class="js-modal0 wrap-modal1 p-t-60 p-b-20">
    <div class="js-hide-modal0 overlay-modal1"></div>

    <div class="container" style="max-width: 600px;">
        <div class="bg0 p-t-60 p-b-30 p-lr-15-lg how-pos3-parent" style="padding-top: 0px;">
            <button class="js-hide-modal0 how-pos3 hov3 trans-04">
                <img src="/coza/images/icons/icon-close.png" alt="CLOSE">
            </button>

            <div role="tabpanel">
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" style="width: 50%">
                        <a class="nav-link active" style="text-align: center;" href="#loginTab" aria-controls="loginTab" role="tab" data-toggle="tab">Đăng nhập</a>
                    </li>

                    <li role="presentation" style="width: 50%">
                        <a class="nav-link" style="text-align: center;" href="#registerTab" aria-controls="registerTab" role="tab" data-toggle="tab">Đăng ký</a>
                    </li>
                </ul>
                <!-- Tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="loginTab">
                        <form id="loginForm" action="#">
                            <div class="row justify-content-md-center">
                                <div class="col-sm-8">
                                    <h2 style="text-align: center;margin: 30px;">Đăng nhập</h2>
                                </div>
                                <div class="col-sm-8">
                                    <div class="bor8 m-b-20 how-pos4-parent">
                                        <input class="stext-111 cl2 plh3 size-116 p-l-62 p-r-30" type="text" autocomplete="username" name="uname" id="uname" placeholder="Địa chỉ email của bạn">
                                        <img class="how-pos4 pointer-none" src="/coza/images/icons/icon-account.png" alt="ICON">
                                    </div>
                                </div>
                                <div class="col-sm-8">
                                    <div class="bor8 m-b-20 how-pos4-parent">
                                        <input class="stext-111 cl2 plh3 size-116 p-l-62 p-r-30" type="password" autocomplete="current-password" name="pwd" id="pwd" placeholder="Mật khẩu của bạn">
                                        <img class="how-pos4 pointer-none" src="/coza/images/icons/icon-password.png" alt="ICON">
                                    </div>
                                </div>
                            </div>

                            <div class="row justify-content-md-center">
                                <div class="col-sm-4">
                                    <button class="flex-c-m stext-101 cl0 size-121 bg3 hov-btn3 p-lr-15 trans-04 pointer" type="submit">
                                        Đăng nhập
                                    </button>
                                </div>
                                <div class="col-sm-4">
                                    <button class="js-hide-modal0 flex-c-m stext-101 cl0 size-121 bg3 hov-btn3 p-lr-15 trans-04 pointer" type="button">
                                        Đóng
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="registerTab">
                        <form id="registerForm" action="#" method="post">
                        <div class="p-l-45 p-r-45 p-t-45 p-b-45 m-r--38 m-lr-0-xl border" style="margin: 0;padding: 20px 40px 0 40px;">
                            <div class="form-group row">
                                <div class="col-md-6">
                                    <label for="first_name" class="text-black">Họ <span class="text-danger">*</span></label>
                                    <p class="firstName" style="color:red;font-size: 12px;"></p>
                                    <div id="first_name" class="bor8 bg0 m-b-12">
                                        <input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="firstName" placeholder="">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <label for="last_name" class="text-black">Tên <span class="text-danger">*</span></label>
                                    <p class="lastName" style="color:red;font-size: 12px;"></p>
                                    <div id="last_name" class="bor8 bg0 m-b-12">
                                        <input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="lastName" placeholder="">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="username" class="text-black">Tài khoản <span class="text-danger">*</span></label>
                                <p class="username" style="color:red;font-size: 12px;"></p>
                                <div id="username" class="bor8 bg0 m-b-12">
                                    <input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="username" placeholder="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-black">Mật khẩu <span class="text-danger">*</span></label>
                                <p class="password" style="color:red;font-size: 12px;"></p>
                                <div id="password" class="bor8 bg0 m-b-12">
                                    <input class="stext-111 cl8 plh3 size-111 p-lr-15" type="password" name="password" placeholder="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="gender" class="text-black">Giới tính </label>
                                <div id="gender" class="rs1-select2 rs2-select2 bor8 bg0 m-b-12 m-t-9">
                                    <select class="js-select2" name="gender">
                                        <option value="">Chọn giới tính...</option>
                                        <option value="false">Nam</option>
                                        <option value="true">Nữ</option>
                                    </select>
                                    <div class="dropDownSelect2"></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="address" class="text-black">Địa chỉ</label>
                                <div id="address" class="bor8 bg0 m-b-12">
                                    <input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="address" placeholder="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="email" class="text-black">Email </label>
                                <p class="email" style="color:red;font-size: 12px;"></p>
                                <div id="email" class="bor8 bg0 m-b-12">
                                    <input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="email" placeholder="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="phone" class="text-black">Số điện thoại <span class="text-danger">*</span></label>
                                <p class="phonee" style="color:red;font-size: 12px;"></p>
                                <div id="phone" class="bor8 bg0 m-b-12">
                                    <input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="phone" placeholder="">
                                </div>
                            </div>
                            <div class="row justify-content-md-center">
                                <div class="col-sm-4">
                                    <button class="flex-c-m stext-101 cl0 size-121 bg3 hov-btn3 p-lr-15 trans-04 pointer" type="submit">
                                        Đăng ký
                                    </button>
                                </div>
                                <div class="col-sm-4">
                                    <button class="js-hide-modal0 flex-c-m stext-101 cl0 size-121 bg3 hov-btn3 p-lr-15 trans-04 pointer" type="button">
                                        Đóng
                                    </button>
                                </div>
                            </div>
                        </div>
                        </form>
                    </div>
                </div>
            </div>



        </div>
    </div>
</div>

<%--
  Created by IntelliJ IDEA.
  User: anhnx
  Date: 07/05/2020
  Time: 06:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!-- Header Mobile -->
<div class="wrap-header-mobile">
    <!-- Logo moblie -->
    <div class="logo-mobile">
        <a href="/"><img src="/coza/images/icons/logo-01.png" alt="IMG-LOGO"></a>
    </div>

    <!-- Icon header -->
    <div id="iconHeaderMobile" class="wrap-icon-header flex-w flex-r-m m-r-15">
        <div class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 js-show-modal-search">
            <i class="zmdi zmdi-search"></i>
        </div>

        <div class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti js-show-cart" data-notify="${fn:length(shoppingCarts)}">
            <i class="zmdi zmdi-shopping-cart"></i>
        </div>

        <a href="javascript:void(0)" class="dis-block icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti js-show-favorite" data-notify="${fn:length(favoriteCarts)}">
            <i class="zmdi zmdi-favorite-outline"></i>
        </a>

        <c:choose>
            <c:when test="${sessionScope.user == null}">
                <a href="#" class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 js-show-modal0">
                    <i class="zmdi zmdi-account"></i>
                </a>
            </c:when>
            <c:otherwise>
                <a href="#" class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11" id="dropdownMenuButton" data-toggle="dropdown">
                    <i class="zmdi zmdi-account"></i>
                </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="/customerManagement">Quản lý tài khoản</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" id="logoutBtn" href="javascript:void(0)">Đăng xuất</a>
                </div>
            </c:otherwise>
        </c:choose>
    </div>

    <!-- Button show menu -->
    <div class="btn-show-menu-mobile hamburger hamburger--squeeze">
				<span class="hamburger-box">
					<span class="hamburger-inner"></span>
				</span>
    </div>
</div>

<!-- Menu Mobile -->
<div class="menu-mobile">
    <ul class="topbar-mobile">
        <li>
            <div class="left-top-bar">
                Free shipping for standard order over $100
            </div>
        </li>

        <li>
            <div class="right-top-bar flex-w h-full">
                <a href="#" class="flex-c-m p-lr-10 trans-04">
                    Help & FAQs
                </a>

                <a href="#" class="flex-c-m p-lr-10 trans-04">
                    My Account
                </a>

                <a href="#" class="flex-c-m p-lr-10 trans-04">
                    EN
                </a>

                <a href="#" class="flex-c-m p-lr-10 trans-04">
                    USD
                </a>
            </div>
        </li>
    </ul>

    <ul class="main-menu-m">
        <li>
            <a href="/">Trang chủ</a>
        </li>

        <li>
            <a href="#">Danh mục</a>
            <ul class="sub-menu-m">
                <c:forEach var="c" items="${listCategories}">
                    <li><a href="/category/${c.id}/1">${c.name}</a></li>
                </c:forEach>
            </ul>
            <span class="arrow-main-menu-m" style="width: 100%;padding-left: 100%;">
						<i class="fa fa-angle-right" aria-hidden="true"></i>
					</span>
        </li>

        <%--<li class="label1" data-label1="hot">
            <a href="shoping-cart.html">Features</a>
        </li>--%>

        <li>
            <a href="/blog">Blog</a>
        </li>

        <li>
            <a href="/about">Về chúng tôi</a>
        </li>

        <li>
            <a href="/contact">Liên hệ</a>
        </li>
    </ul>
</div>
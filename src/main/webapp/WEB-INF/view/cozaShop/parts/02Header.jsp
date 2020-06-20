<%--
  Created by IntelliJ IDEA.
  User: anhnx
  Date: 07/05/2020
  Time: 06:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!-- Menu desktop -->
<div class="menu-desktop sidebar-nav">
    <ul class="main-menu" id="sidebarnav">
        <li>
            <a href="/">Trang chủ</a>
        </li>

        <li>
            <a href="#">Danh mục</a>
            <ul class="sub-menu">
                <c:forEach var="c" items="${listCategories}">
                <li><a href="/category/${c.id}/1">${c.name}</a></li>
                </c:forEach>
            </ul>
        </li>

        <%--<li class="label1" data-label1="hot">
            <a href="shoping-cart.html">Features</a>
        </li>--%>

        <li>
            <a href="/blog/1">Blog</a>
        </li>

        <li>
            <a href="/about">Về chúng tôi</a>
        </li>

        <li>
            <a href="/contact">Liên hệ</a>
        </li>
    </ul>
</div>

<!-- Icon header -->
<div id="iconHeaderDesktop" class="wrap-icon-header flex-w flex-r-m" style="padding-right: 15px;">
    <div class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 js-show-modal-search">
        <i class="zmdi zmdi-search"></i>
    </div>

    <div class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti js-show-cart" data-notify="${fn:length(shoppingCarts)}">
        <i class="zmdi zmdi-shopping-cart"></i>
    </div>

    <a href="javascript:void(0)" class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti js-show-favorite" data-notify="${fn:length(favoriteCarts)}">
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
                <a class="dropdown-item" href="/order_history">Lịch sử đặt hàng</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Tra cứu đơn hàng</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="/customerManagement">Quản lý tài khoản</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" id="logoutBtn" href="javascript:void(0)">Đăng xuất</a>
            </div>
        </c:otherwise>
    </c:choose>

</div>
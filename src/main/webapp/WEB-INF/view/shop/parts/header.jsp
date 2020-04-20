<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Yoga Studio Template">
    <meta name="keywords" content="Yoga, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Thời trang truyền thống Việt Nam</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900&display=swap"
          rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="shop/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="shop/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="shop/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="shop/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="shop/css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="shop/css/slicknav.min.css" type="text/css">
    <%--Custom sidebar--%>
    <link rel="stylesheet" href="shop/css/sidebar.css" type="text/css">
    <%--Custom style--%>
    <link rel="stylesheet" href="shop/css/style.css" type="text/css">
</head>

<body>
<!-- Page Preloder -->
<div id="preloder">
    <div class="loader"></div>
</div>

<!-- Search model -->
<div class="search-model">
    <div class="h-100 d-flex align-items-center justify-content-center">
        <div class="search-close-switch">+</div>
        <form class="search-model-form">
            <input type="text" id="search-input" placeholder="Search here.....">
        </form>
    </div>
</div>
<!-- Search model end -->

<!-- Header Section Begin -->
<header class="header-section">
    <div class="container-fluid">
        <div class="inner-header">
            <div class="logo">
                <a href="/"><img src="shop/img/logo.png" alt=""></a>
            </div>
            <div class="header-right">
                <img src="shop/img/icons/search.png" alt="" class="search-trigger">
                <c:if test="${sessionScope.user != null}">
                    <a href="customerManagement" style="margin-right: 20px;">
                        <img src="shop/img/icons/man.png" alt="">
                    </a>
                </c:if>
                <a href="cart">
                    <img src="shop/img/icons/bag.png" alt="">
                    <span>2</span>
                </a>
            </div>
            <div class="user-access">
                <a href="register">Đăng ký</a>
                <a href="login" class="in">Đăng nhập</a>
                <a href="logout" class="in">Đăng xuất</a>
            </div>

            <nav class="main-menu mobile-menu">
                <ul>
                    <li><a class="active" href="/">Trang chủ</a></li>
                    <li><a href="categories">Sản phẩm</a>
                        <ul class="sub-menu">
                            <li><a href="product">Product Page</a></li>
                            <li><a href="cart">Shopping Card</a></li>
                            <li><a href="checkout">Check out</a></li>
                        </ul>
                    </li>
                    <li><a href="product">Về chúng tôi</a></li>
                    <li><a href="checkout">Blog</a></li>
                    <li><a href="contact">Liên lạc</a></li>
                </ul>
            </nav>
        </div>
    </div>
</header>

<!-- Header Info Begin -->
<br>
<div class="header-info">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4">
                <div class="header-item">
                    <img src="shop/img/icons/delivery.png" alt="">
                    <p>Freeship đơn hàng 1 triệu tại Hà nội</p>
                </div>
            </div>
            <div class="col-md-4 text-left text-lg-center">
                <div class="header-item">
                    <img src="shop/img/icons/voucher.png" alt="">
                    <p>Giảm giá 20% cho học sinh, sinh viên</p>
                </div>
            </div>
            <div class="col-md-4 text-left text-xl-right">
                <div class="header-item">
                    <img src="shop/img/icons/sales.png" alt="">
                    <p>Giảm giá 30% cho tất cả đơn hàng. Mã code: 30OFF</p>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Header Info End -->
<!-- Header End -->
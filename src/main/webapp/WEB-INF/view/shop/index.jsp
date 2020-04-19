<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="parts/header.jsp"/>

    <!-- Hero Slider Begin -->
    <section class="hero-slider">
        <div class="hero-items owl-carousel">
            <div class="single-slider-item set-bg" data-setbg="shop/img/slider-1.jpg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>2019</h1>
                            <h2>Lookbook.</h2>
                            <a href="#" class="primary-btn">See More</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="single-slider-item set-bg" data-setbg="shop/img/slider-2.jpg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>2019</h1>
                            <h2>Lookbook.</h2>
                            <a href="#" class="primary-btn">See More</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="single-slider-item set-bg" data-setbg="shop/img/slider-3.jpg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>2019</h1>
                            <h2>Lookbook.</h2>
                            <a href="#" class="primary-btn">See More</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Hero Slider End -->

    <!-- Features Section Begin -->
    <section class="features-section spad">
        <div class="features-ads">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <div class="single-features-ads first">
                            <img src="shop/img/icons/f-delivery.png" alt="">
                            <h4>Miễn phí vận chuyển</h4>
                            <p>Miễn phí vận chuyển. </p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="single-features-ads second">
                            <img src="shop/img/icons/coin.png" alt="">
                            <h4>Hoàn tiền 100% </h4>
                            <p>Hoàn tiền 100% nếu sản phẩm không đúng như hình. </p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="single-features-ads">
                            <img src="shop/img/icons/chat.png" alt="">
                            <h4>Hỗ trợ 24/7</h4>
                            <p>Hỗ trợ online 24/7. </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Features Box -->
        <div class="features-box">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="single-box-item first-box">
                                    <img src="shop/img/f-box-1.jpg" alt="">
                                    <div class="box-text">
                                        <span class="trend-year">Lễ hội 2019</span>
                                        <h2>Jewelry</h2>
                                        <span class="trend-alert">Xu hướng </span>
                                        <a href="#" class="primary-btn">Xem tiếp</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-12">
                                <div class="single-box-item second-box">
                                    <img src="shop/img/f-box-2.jpg" alt="">
                                    <div class="box-text">
                                        <span class="trend-year">Thời trang 2019</span>
                                        <h2>Thời trang</h2>
                                        <span class="trend-alert">Thanh Lừng</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="single-box-item large-box">
                            <img src="shop/img/f-box-3.jpg" alt="">
                            <div class="box-text">
                                <span class="trend-year">Lễ hội 2019</span>
                                <h2>Bộ sưu tập</h2>
                                <div class="trend-alert">Xu hướng</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Features Section End -->

    <!-- Latest Product Begin -->
    <section class="latest-products spad">
        <div class="container">
            <div class="product-filter">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <div class="section-title">
                            <h2>Sản phẩm mới</h2>
                        </div>
                        <ul class="product-controls">
                            <li data-filter="*">Tất cả</li>
                            <li data-filter=".dresses">Váy</li>
                            <li data-filter=".bags">Túi</li>
                            <li data-filter=".shoes">Giày</li>
                            <li data-filter=".accesories">Trang sức</li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="row" id="product-list">
                <div class="col-lg-3 col-sm-6 mix all dresses bags">
                    <div class="single-product-item">
                        <figure>
                            <a href="#"><img src="shop/img/products/img-1.jpg" alt=""></a>
                            <div class="p-status">new</div>
                        </figure>
                        <div class="product-text">
                            <h6>Green Dress with details</h6>
                            <p>$22.90</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 mix all dresses bags">
                    <div class="single-product-item">
                        <figure>
                            <a href="#"><img src="shop/img/products/img-2.jpg" alt=""></a>
                            <div class="p-status sale">sale</div>
                        </figure>
                        <div class="product-text">
                            <h6>Yellow Maxi Dress</h6>
                            <p>$25.90</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 mix all shoes accesories">
                    <div class="single-product-item">
                        <figure>
                            <a href="#"><img src="shop/img/products/img-3.jpg" alt=""></a>
                            <div class="p-status">new</div>
                        </figure>
                        <div class="product-text">
                            <h6>One piece bodysuit</h6>
                            <p>$19.90</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 mix all shoes accesories">
                    <div class="single-product-item">
                        <figure>
                            <a href="#"><img src="shop/img/products/img-4.jpg" alt=""></a>
                            <div class="p-status popular">popular</div>
                        </figure>
                        <div class="product-text">
                            <h6>Blue Dress with details</h6>
                            <p>$35.50</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 mix all dresses shoes">
                    <div class="single-product-item">
                        <figure>
                            <a href="#"><img src="shop/img/products/img-5.jpg" alt=""></a>
                            <div class="p-status">new</div>
                        </figure>
                        <div class="product-text">
                            <h6>Green Dress with details</h6>
                            <p>$22.90</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 mix all accesories bags">
                    <div class="single-product-item">
                        <figure>
                            <a href="#"><img src="shop/img/products/img-6.jpg" alt=""></a>
                            <div class="p-status sale">sale</div>
                        </figure>
                        <div class="product-text">
                            <h6>Yellow Maxi Dress</h6>
                            <p>$25.90</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 mix all dresses bags">
                    <div class="single-product-item">
                        <figure>
                            <a href="#"><img src="shop/img/products/img-7.jpg" alt=""></a>
                        </figure>
                        <div class="product-text">
                            <h6>One piece bodysuit</h6>
                            <p>$19.90</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 mix all accesories bags">
                    <div class="single-product-item">
                        <figure>
                            <a href="#"><img src="shop/img/products/img-8.jpg" alt=""></a>
                            <div class="p-status popular">popular</div>
                        </figure>
                        <div class="product-text">
                            <h6>Blue Dress with details</h6>
                            <p>$35.50</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Latest Product End -->

    <!-- Lookbok Section Begin -->
    <%--<section class="lookbok-section">--%>
        <%--<div class="container-fluid">--%>
            <%--<div class="row">--%>
                <%--<div class="col-lg-4 offset-lg-1">--%>
                    <%--<div class="lookbok-left">--%>
                        <%--<div class="section-title">--%>
                            <%--<h2>2019 <br />#lookbook</h2>--%>
                        <%--</div>--%>
                        <%--<p>Fusce urna quam, euismod sit amet mollis quis, vestibulum quis velit. Vestibulum malesuada--%>
                            <%--aliquet libero viverra cursus. Aliquam erat volutpat. Morbi id dictum quam, ut commodo--%>
                            <%--lorem. In at nisi nec arcu porttitor aliquet vitae at dui. Sed sollicitudin nulla non leo--%>
                            <%--viverra scelerisque. Phasellus facilisis lobortis metus, sit amet viverra lectus finibus ac.--%>
                            <%--Aenean non felis dapibus, placerat libero auctor, ornare ante. Morbi quis ex eleifend,--%>
                            <%--sodales nulla vitae, scelerisque ante. Nunc id vulputate dui. Suspendisse consectetur rutrum--%>
                            <%--metus nec scelerisque. s</p>--%>
                        <%--<a href="#" class="primary-btn look-btn">See More</a>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="col-lg-5 offset-lg-1">--%>
                    <%--<div class="lookbok-pic">--%>
                        <%--<img src="shop/img/lookbok.jpg" alt="">--%>
                        <%--<div class="pic-text">fashion</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</section>--%>
    <!-- Lookbok Section End -->

    <!-- Logo Section Begin -->
    <div class="logo-section spad">
        <div class="logo-items owl-carousel">
            <div class="logo-item">
                <img src="shop/img/logos/logo-1.png" alt="">
            </div>
            <div class="logo-item">
                <img src="shop/img/logos/logo-2.png" alt="">
            </div>
            <div class="logo-item">
                <img src="shop/img/logos/logo-3.png" alt="">
            </div>
            <div class="logo-item">
                <img src="shop/img/logos/logo-4.png" alt="">
            </div>
            <div class="logo-item">
                <img src="shop/img/logos/logo-5.png" alt="">
            </div>
        </div>
    </div>
    <!-- Logo Section End -->

    <!-- Footer Section Begin -->
    <jsp:include page="parts/footer.jsp"/>
    <!-- Footer Section End -->

    <!-- Js Plugins -->
    <jsp:include page="parts/jsPlugin.jsp"/>
</body>

</html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="parts/header.jsp"/>


<div class="wrapper">
    <!-- Sidebar  -->
    <nav id="sidebar">
        <div class="sidebar-header">
            <h3>Bootstrap Sidebar</h3>
        </div>

        <ul class="list-unstyled components">
            <p>Dummy Heading</p>
            <li class="active">
                <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Home</a>
                <ul class="collapse list-unstyled" id="homeSubmenu">
                    <li>
                        <a href="#">Home 1</a>
                    </li>
                    <li>
                        <a href="#">Home 2</a>
                    </li>
                    <li>
                        <a href="#">Home 3</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="#">About</a>
            </li>
            <li>
                <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Pages</a>
                <ul class="collapse list-unstyled" id="pageSubmenu">
                    <li>
                        <a href="#">Page 1</a>
                    </li>
                    <li>
                        <a href="#">Page 2</a>
                    </li>
                    <li>
                        <a href="#">Page 3</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="#">Portfolio</a>
            </li>
            <li>
                <a href="#">Contact</a>
            </li>
        </ul>

        <ul class="list-unstyled CTAs">
            <li>
                <a href="https://bootstrapious.com/tutorial/files/sidebar.zip" class="download">Download source</a>
            </li>
            <li>
                <a href="https://bootstrapious.com/p/bootstrap-sidebar" class="article">Back to article</a>
            </li>
        </ul>
    </nav>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content  -->
    <div id="content">
        <!-- Cart Total Page Begin -->
        <section class="cart-total-page spad">
            <div class="container" style="margin-left: 5%;">
                <form action="#" class="checkout-form">
                    <div class="row">
                        <div class="col-lg-12">
                            <button type="button" id="sidebarCollapse" class="btn btn-info">
                                <span>Toggle Sidebar</span>
                            </button>
                            <h3>Your Information</h3>
                        </div>
                        <div class="col-lg-9">
                            <div class="row">
                                <div class="col-lg-2">
                                    <p class="in-name">Name*</p>
                                </div>
                                <div class="col-lg-5">
                                    <input type="text" placeholder="First Name">
                                </div>
                                <div class="col-lg-5">
                                    <input type="text" placeholder="Last Name">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-2">
                                    <p class="in-name">Street Address*</p>
                                </div>
                                <div class="col-lg-10">
                                    <input type="text">
                                    <input type="text">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-2">
                                    <p class="in-name">Country*</p>
                                </div>
                                <div class="col-lg-10">
                                    <select class="cart-select country-usa">
                                        <option>USA</option>
                                    </select>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-2">
                                    <p class="in-name">City*</p>
                                </div>
                                <div class="col-lg-10">
                                    <input type="text">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-2">
                                    <p class="in-name">Country</p>
                                </div>
                                <div class="col-lg-10">
                                    <input type="text">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-2">
                                    <p class="in-name">Post Code/ZIP*</p>
                                </div>
                                <div class="col-lg-10">
                                    <input type="text">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-2">
                                    <p class="in-name">Phone*</p>
                                </div>
                                <div class="col-lg-10">
                                    <input type="text">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-12 text-right">
                                    <div class="diff-addr">
                                        <input type="radio" id="one">
                                        <label for="one">Ship to different address</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="order-table">
                                <div class="cart-item">
                                    <span>Product</span>
                                    <p class="product-name">Blue Dotted Shirt</p>
                                </div>
                                <div class="cart-item">
                                    <span>Price</span>
                                    <p>$29</p>
                                </div>
                                <div class="cart-item">
                                    <span>Quantity</span>
                                    <p>1</p>
                                </div>
                                <div class="cart-item">
                                    <span>Shipping</span>
                                    <p>$10</p>
                                </div>

                                <div class="cart-total">
                                    <span>Total</span>
                                    <p>$39</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="payment-method">
                                <h3>Payment</h3>
                                <ul>
                                    <li>Paypal <img src="shop/img/paypal.jpg" alt=""></li>
                                    <li>Credit / Debit card <img src="shop/img/mastercard.jpg" alt=""></li>
                                    <li>
                                        <label for="two">Pay when you get the package</label>
                                        <input type="radio" id="two">
                                    </li>
                                </ul>
                                <button type="submit">Place your order</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </section>
        <!-- Cart Total Page End -->
    </div>

</div>


<!-- Footer Section Begin -->
<jsp:include page="parts/footer.jsp"/>
<!-- Footer Section End -->

<!-- Js Plugins -->
<jsp:include page="parts/jsPlugin.jsp"/>
</body>

</html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
    <jsp:include page="parts/header.jsp"/>

    <!-- Page Add Section Begin -->
    <section class="page-add">
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <div class="page-breadcrumb">
                        <h2>Dresses<span>.</span></h2>
                        <a href="#">Home</a>
                        <a href="#">Dresses</a>
                        <a class="active" href="#">Night Dresses</a>
                    </div>
                </div>
                <div class="col-lg-8">
                    <img src="shop/img/add.jpg" alt="">
                </div>
            </div>
        </div>
    </section>
    <!-- Page Add Section End -->

    <!-- Categories Page Section Begin -->
    <section class="categories-page spad">
        <div class="container">
            <div class="categories-controls">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="categories-filter">
                            <div class="cf-left">
                                <form action="#">
                                    <select class="sort">
                                        <option value="">Sort by</option>
                                        <option value="">Orders</option>
                                        <option value="">Newest</option>
                                        <option value="">Price</option>
                                    </select>
                                </form>
                            </div>
                            <div class="cf-right">
                                <span>20 Products</span>
                                <a href="#">2</a>
                                <a href="#" class="active">4</a>
                                <a href="#">6</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <c:forEach var="p" items="${listProducts}">
                <div class="col-lg-3 col-md-6">
                    <div class="single-product-item">
                        <figure>
                            <img src="images/${p.image}" width="260" height="360" alt="">
                            <div class="p-status">new</div>
                            <div class="hover-icon">
                                <a href="images/${p.image}" class="pop-up"><img src="shop/img/icons/zoom-plus.png"
                                                                                          alt=""></a>
                            </div>
                        </figure>
                        <div class="product-text">
                            <a href="#">
                                <h6>${p.name}</h6>
                            </a>
                            <p><fmt:formatNumber value = "${p.price}" type = "number"/> VNĐ</p>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>
            <div class="more-product">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <a href="#" class="primary-btn">Load More</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Categories Page Section End -->

    <!-- Footer Section Begin -->
    <jsp:include page="parts/footer.jsp"/>
    <!-- Footer Section End -->

    <!-- Js Plugins -->
    <jsp:include page="parts/jsPlugin.jsp"/>
</body>

</html>
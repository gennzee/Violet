<%--
  Created by IntelliJ IDEA.
  User: anhnx
  Date: 07/05/2020
  Time: 06:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Cart -->
<div id="productCart" class="wrap-header-cart js-panel-cart">
    <div class="s-full js-hide-cart"></div>

    <div id="productCartDetail" class="header-cart flex-col-l p-l-65 p-r-25">
        <div class="header-cart-title flex-w flex-sb-m p-b-8">
				<span class="mtext-103 cl2">
					Giỏ hàng
				</span>

            <div class="fs-35 lh-10 cl2 p-lr-5 pointer hov-cl1 trans-04 js-hide-cart">
                <i class="zmdi zmdi-close"></i>
            </div>
        </div>

        <div class="header-cart-content flex-w js-pscroll">
            <ul class="header-cart-wrapitem w-full">
                <c:choose>
                    <c:when test="${not empty shoppingCarts}">
                        <c:forEach var="cart" items="${shoppingCarts}">
                            <li class="header-cart-item flex-w flex-t m-b-12">
                                <div class="header-cart-item-img" id="${cart.value.productStorage.id}">
                                    <img src="/images/${cart.value.productImage}" width="60" height="80" style="object-fit: cover;" alt="IMG">
                                </div>

                                <div class="header-cart-item-txt">
                                    <strong><a href="/product/${cart.value.productStorage.productId}" class="header-cart-item-name hov-cl1 trans-04">
                                        ${cart.value.productName}
                                    </a></strong>

                                    <p>Màu: ${cart.value.productStorage.productColor.name}</p>

                                    <p>Kích cỡ: ${cart.value.productStorage.productSize.name}</p>

                                    <span class="header-cart-item-info">
								        ${cart.value.quantity} x <fmt:formatNumber type = "number" value = "${cart.value.productStorage.price}" /> VNĐ
							        </span>

                                </div>
                            </li>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <h2>Không có sản phẩm</h2>
                    </c:otherwise>
                </c:choose>

            </ul>

            <c:if test="${not empty shoppingCarts}">
            <div class="w-full">
                <div class="header-cart-total w-full p-tb-40">
                    Tổng: <fmt:formatNumber type = "number" value = "${cartTotalPrice}" /> VNĐ
                </div>

                <div class="header-cart-buttons flex-w w-full">
                    <a href="/shoping-cart" class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-r-8 m-b-10">
                        Chi tiết
                    </a>

                    <a href="/checkout" class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-b-10">
                        Thanh toán
                    </a>
                </div>
            </div>
            </c:if>
        </div>
    </div>
</div>

<%--Favorite--%>
<div id="productFavorite" class="wrap-header-cart js-panel-favorite">
    <div class="s-full js-hide-cart"></div>

    <div id="productFavoriteDetail" class="header-cart flex-col-l p-l-65 p-r-25">
        <div class="header-cart-title flex-w flex-sb-m p-b-8">
				<span class="mtext-103 cl2">
					Yêu thích
				</span>

            <div class="fs-35 lh-10 cl2 p-lr-5 pointer hov-cl1 trans-04 js-hide-cart">
                <i class="zmdi zmdi-close"></i>
            </div>
        </div>

        <div class="header-cart-content flex-w js-pscroll">
            <ul class="header-cart-wrapitem w-full">
                <c:choose>
                    <c:when test="${not empty favoriteCarts}">
                        <c:forEach var="cart" items="${favoriteCarts}">
                            <li class="header-cart-item flex-w flex-t m-b-12">
                                <div class="header-cart-item-img" id="${cart.value.products.id}">
                                    <img src="/images/${cart.key}" width="60" height="80" style="object-fit: cover;" alt="IMG">
                                </div>

                                <div class="header-cart-item-txt">
                                    <strong><a href="/product/${cart.value.products.id}" class="header-cart-item-name hov-cl1 trans-04">
                                            ${cart.value.products.name}
                                    </a></strong>

                                </div>
                            </li>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <h2>Không có sản phẩm</h2>
                    </c:otherwise>
                </c:choose>

            </ul>

            <c:if test="${not empty favoriteCarts}">
                <div class="w-full">
                    <div class="header-cart-total w-full p-tb-40">
                        Tổng: <fmt:formatNumber type = "number" value = "${cartTotalPrice}" /> VNĐ
                    </div>

                    <div class="header-cart-buttons flex-w w-full">
                        <a href="/shoping-cart" class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-r-8 m-b-10" style="width: 100%">
                            Chi tiết
                        </a>

                    </div>
                </div>
            </c:if>
        </div>
    </div>
</div>
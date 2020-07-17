<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Product</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="/coza/images/icons/favicon.png"/>
	<jsp:include page="parts/head.jsp"/>
<!--===============================================================================================-->
</head>
<body class="animsition">
	
	<!-- Header -->
	<jsp:include page="parts/01Header.jsp"/>

	<!-- Cart -->
	<jsp:include page="parts/cart.jsp"/>

	
	<!-- Product -->
	<div class="bg0 m-t-23 p-b-140">
		<div class="container">
			<div class="flex-w flex-sb-m p-b-52">
				<div class="flex-w flex-l-m filter-tope-group m-tb-10">
					<button class="stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5 how-active1" data-filter="*">
						Tất cả
					</button>

					<button class="stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5" data-filter=".women">
						Nữ
					</button>

					<button class="stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5" data-filter=".men">
						Nam
					</button>
				</div>

				<div class="flex-w flex-c-m m-tb-10">
					<div class="flex-c-m stext-106 cl6 size-104 bor4 pointer hov-btn3 trans-04 m-r-8 m-tb-4 js-show-filter">
						<i class="icon-filter cl2 m-r-6 fs-15 trans-04 zmdi zmdi-filter-list"></i>
						<i class="icon-close-filter cl2 m-r-6 fs-15 trans-04 zmdi zmdi-close dis-none"></i>
						 Lọc
					</div>

					<div class="flex-c-m stext-106 cl6 size-105 bor4 pointer hov-btn3 trans-04 m-tb-4 js-show-search">
						<i class="icon-search cl2 m-r-6 fs-15 trans-04 zmdi zmdi-search"></i>
						<i class="icon-close-search cl2 m-r-6 fs-15 trans-04 zmdi zmdi-close dis-none"></i>
						Tìm kiếm
					</div>
				</div>
				
				<!-- Search product -->
				<div class="dis-none panel-search w-full p-t-10 p-b-15">
					<div class="bor8 dis-flex p-l-15">
						<button class="size-113 flex-c-m fs-16 cl2 hov-cl1 trans-04">
							<i class="zmdi zmdi-search"></i>
						</button>

						<input id="searchProducts" class="mtext-107 cl2 size-114 plh2 p-r-15" type="text" name="search-product" placeholder="Tìm kiếm">
					</div>	
				</div>

				<!-- Filter -->
				<div class="dis-none panel-filter w-full p-t-10">
					<div class="wrap-filter flex-w bg6 w-full p-lr-40 p-t-27 p-lr-15-sm">
						<div class="filter-col1 p-r-15 p-b-27">
							<div class="mtext-102 cl2 p-b-15">
								Sắp xếp theo
							</div>

							<ul>
								<li class="p-b-6">
									<a href="/category/${currentCategory}/${currentPage}?price=${price}&color=${color}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${empty sortBy}">filter-link-active</c:if>">
										Tất cả
									</a>
								</li>

								<li class="p-b-6">
									<a href="/category/${currentCategory}/${currentPage}?sortBy=newest&price=${price}&color=${color}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${sortBy eq 'newest'}">filter-link-active</c:if>">
										Mới ra
									</a>
								</li>


							</ul>
						</div>

						<div class="filter-col2 p-r-15 p-b-27">
							<div class="mtext-102 cl2 p-b-15">
								Giá
							</div>

							<ul>
								<li class="p-b-6">
									<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&color=${color}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${price eq '0-9999999'}">filter-link-active</c:if>">
										Tất cả
									</a>
								</li>

								<li class="p-b-6">
									<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=0-250000&color=${color}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${price eq '0-250000'}">filter-link-active</c:if>">
										0 ~ 250,000 VNĐ
									</a>
								</li>

								<li class="p-b-6">
									<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=250000-400000&color=${color}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${price eq '250000-400000'}">filter-link-active</c:if>">
										250,000 ~ 400,000 VNĐ
									</a>
								</li>

								<li class="p-b-6">
									<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=400000-550000&color=${color}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${price eq '400000-550000'}">filter-link-active</c:if>">
										400,000 ~ 550,000 VNĐ
									</a>
								</li>

								<li class="p-b-6">
									<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=550000-9999999&color=${color}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${price eq '550000-9999999'}">filter-link-active</c:if>">
										550,000 VNĐ trở đi
									</a>
								</li>
							</ul>
						</div>

						<div class="filter-col3 p-r-15 p-b-27">
							<div class="mtext-102 cl2 p-b-15">
								Chiều cao
							</div>

							<ul>
								<li class="p-b-6">
									<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=${price}&color=${color}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${empty height}">filter-link-active</c:if>">
										Tất cả
									</a>
								</li>


								<c:forEach var="h" items="${heightList}">
									<li class="p-b-6">
										<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=${price}&height=${h.id}&color=${color}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${height eq h.id}">filter-link-active</c:if>">
												${h.name}
										</a>
									</li>
								</c:forEach>
							</ul>
						</div>

						<div class="filter-col4 p-r-15 p-b-27">
							<div class="mtext-102 cl2 p-b-15">
								Màu sắc
							</div>

							<ul>
								<li class="p-b-6">
									<span class="fs-15 lh-12 m-r-6" style="color: transparent;">
										<i class="zmdi zmdi-circle"></i>
									</span>

									<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=${price}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${empty color}">filter-link-active</c:if>">
										Tất cả
									</a>
								</li>


								<c:forEach var="c" items="${colorList}">
								<li class="p-b-6">
									<span class="fs-15 lh-12 m-r-6" style="color: ${c.hex};">
										<i class="zmdi zmdi-circle"></i>
									</span>

									<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=${price}&color=${c.id}&size=${size}" class="filter-link stext-106 trans-04 <c:if test="${color eq c.id}">filter-link-active</c:if>">
										${c.name}
									</a>
								</li>
								</c:forEach>
							</ul>
						</div>

						<div class="filter-col5 p-b-27">
							<div class="mtext-102 cl2 p-b-15">
								Kích cỡ
							</div>

							<ul>
								<li class="p-b-6">
									<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=${price}&color=${color}" class="filter-link stext-106 trans-04 <c:if test="${empty size}">filter-link-active</c:if>">
										Tất cả
									</a>
								</li>

								<c:forEach var="s" items="${sizeList}">
									<li class="p-b-6">
										<a href="/category/${currentCategory}/${currentPage}?sortBy=${sortBy}&price=${price}&color=${color}&size=${s.id}" class="filter-link stext-106 trans-04 <c:if test="${size eq s.id}">filter-link-active</c:if>">
											${s.name}
										</a>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
			</div>

			<div class="productSection row isotope-grid">
				<c:forEach var="p" items="${listProducts}">
				<div class="product col-sm-6 col-md-4 col-lg-3 p-b-35 isotope-item women">
					<!-- Block2 -->
					<div class="block2">
						<div class="block2-pic hov-img0">
							<div style="position: absolute;top: 25px;right: 25px;z-index: 1;">
								<span style="background-color: #888; border-radius: 30px; padding: 3px 16px; color: white;">NEW</span>
							</div>
							<a href="/product/${p.id}">
								<img src="/images/${p.productImageList[0].name}" width="270" height="330" alt="IMG-PRODUCT" style="object-fit: cover;">
							</a>

							<a id="${p.id}" href="#" class="productId block2-btn flex-c-m stext-103 cl2 size-102 bg0 bor2 hov-btn1 p-lr-15 trans-04 js-show-modal1">
								Xem trước
							</a>
						</div>

						<div class="block2-txt flex-w flex-t p-t-14">
							<div class="block2-txt-child1 flex-col-l ">
								<a href="/product/${p.id}" class="stext-104 cl4 hov-cl1 trans-04 js-name-b2 p-b-6">
									${p.name}
								</a>

								<span class="stext-105 cl3">
									<c:choose>
										<c:when test="${p.productStorageList[0].discount eq 0}">
											<fmt:formatNumber type = "number" value = "${p.productStorageList[0].price}" /> VNĐ
										</c:when>
										<c:otherwise>
											<del><fmt:formatNumber type = "number" value = "${p.productStorageList[0].price}" /> VNĐ</del>
											<fmt:formatNumber type = "number" value = "${p.productStorageList[0].price - p.productStorageList[0].discount}" /> VNĐ
										</c:otherwise>
									</c:choose>

								</span>
							</div>

							<div class="block2-txt-child2 flex-r p-t-3">
								<c:set var="contains" value="false" />
								<c:forEach var="item" items="${favoriteCarts}">
									<c:if test="${item.value.productId eq p.id}">
										<c:set var="contains" value="true" />
									</c:if>
								</c:forEach>
								<c:choose>
									<c:when test="${contains}">
										<a id="${p.id}" href="javascript:void(0)" class="addProductToFavorite btn-addwish-b2 dis-block pos-relative js-addwish-b2 js-addedwish-b2">
											<img class="icon-heart1 dis-block trans-04" src="/coza/images/icons/icon-heart-01.png" alt="ICON">
											<img class="icon-heart2 dis-block trans-04 ab-t-l" src="/coza/images/icons/icon-heart-02.png" alt="ICON">
										</a>
									</c:when>
									<c:otherwise>
										<a id="${p.id}" href="javascript:void(0)" class="addProductToFavorite btn-addwish-b2 dis-block pos-relative js-addwish-b2">
											<img class="icon-heart1 dis-block trans-04" src="/coza/images/icons/icon-heart-01.png" alt="ICON">
											<img class="icon-heart2 dis-block trans-04 ab-t-l" src="/coza/images/icons/icon-heart-02.png" alt="ICON">
										</a>
									</c:otherwise>
								</c:choose>

							</div>
						</div>
					</div>
				</div>
				</c:forEach>
			</div>

			<!-- Pagination -->
			<div class="flex-c-m flex-w w-full p-t-38">
				<c:forEach var="page" items="${pageList}">
					<c:choose>
						<c:when test="${page == currentPage}">
							<a href="javascript:void(0)" class="flex-c-m how-pagination1 trans-04 m-all-7 active-pagination1" style="cursor: context-menu;">
									${page}
							</a>
						</c:when>
						<c:otherwise>
							<a href="/category/${currentCategory}/${page}" class="flex-c-m how-pagination1 trans-04 m-all-7">
									${page}
							</a>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>
		</div>
	</div>
		

	<!-- Footer -->
	<jsp:include page="parts/footer.jsp"/>

	<jsp:include page="parts/JsPlugins.jsp"/>

	<%--Search ProductSection--%>
	<script>
        $(document).ready(function(){
            $("#searchProducts").on("keyup", function() {
                var value = $(this).val().toLowerCase();
                $(".productSection .product").filter(function() {
                    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                });
            });
        });
	</script>
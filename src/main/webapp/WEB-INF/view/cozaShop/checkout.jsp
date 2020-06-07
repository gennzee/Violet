<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Coza Shop</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="/coza/images/icons/favicon.png"/>
	<jsp:include page="parts/head.jsp"/>
	<!--===============================================================================================-->
	<style>
		.border{
			border: 1px solid #dee2e6!important;
		}

	</style>
</head>
<body class="animsition">

	<!-- Header -->
	<jsp:include page="parts/01Header.jsp"/>

	<!-- Cart -->
	<jsp:include page="parts/cart.jsp"/>


	<!-- breadcrumb -->
	<div class="container">
		<div class="bread-crumb flex-w p-l-25 p-r-15 p-t-30 p-lr-0-lg">
			<a href="/" class="stext-109 cl8 hov-cl1 trans-04">
				Trang chủ
				<i class="fa fa-angle-right m-l-9 m-r-10" aria-hidden="true"></i>
			</a>

			<span class="stext-109 cl4">
				Thanh toán
			</span>
		</div>
	</div>
		

	<!-- Shoping Cart -->
	<form action="/checkout" method="post" class="bg0 p-t-75 p-b-85">
		<div class="container">
			<div class="row">
				<div class="col-lg-10 col-xl-7 m-lr-auto m-b-50">
					<h2 class="p-b-10">Thanh toán</h2>
					<div class="p-l-45 p-r-45 p-t-45 p-b-45 m-r--38 m-lr-0-xl border">
						<div class="form-group">
							<label for="c_country" class="text-black">Thành phố <span class="text-danger">*</span></label>
							<div id="c_country" class="rs1-select2 rs2-select2 bor8 bg0 m-b-12 m-t-9">
								<select class="js-select2" name="time">
									<option>Select a country...</option>
									<option>Ha Noi</option>
									<option>Ho Chi Minh</option>
								</select>
								<div class="dropDownSelect2"></div>
							</div>
						</div>
						<div class="form-group row">
							<div class="col-md-6">
								<label for="first_name" class="text-black">Họ <span class="text-danger">*</span></label>
								<div id="first_name" class="bor8 bg0 m-b-12">
									<input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="state" placeholder="">
								</div>
							</div>
							<div class="col-md-6">
								<label for="last_name" class="text-black">Tên <span class="text-danger">*</span></label>
								<div id="last_name" class="bor8 bg0 m-b-12">
									<input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="state" placeholder="">
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="address" class="text-black">Địa chỉ <span class="text-danger">*</span></label>
							<div id="address" class="bor8 bg0 m-b-12">
								<input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="state" placeholder="">
							</div>
						</div>
						<div class="form-group">
							<label for="email" class="text-black">Email <span class="text-danger">*</span></label>
							<div id="email" class="bor8 bg0 m-b-12">
								<input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="state" placeholder="">
							</div>
						</div>
						<div class="form-group">
							<label for="phone" class="text-black">Số điện thoại <span class="text-danger">*</span></label>
							<div id="phone" class="bor8 bg0 m-b-12">
								<input class="stext-111 cl8 plh3 size-111 p-lr-15" type="text" name="state" placeholder="">
							</div>
						</div>
						<div class="form-group">
							<label for="c_order_notes" class="text-black">Ghi chú</label>
							<div id="c_order_notes" class="bor8 m-b-30">
								<textarea class="stext-111 cl2 plh3 size-120 p-lr-28 p-tb-25" name="msg" placeholder="Nội dung"></textarea>
							</div>
						</div>
					</div>
				</div>

				<div id="priceDetail" class="col-sm-10 col-lg-7 col-xl-5 m-lr-auto m-b-50">
					<h2 class="p-b-10">&nbsp;</h2>
					<div class="bor10 p-lr-40 p-t-30 p-b-40 m-l-63 m-r-40 m-lr-0-xl p-lr-15-sm">
						<h4 class="mtext-109 cl2 p-b-30">
							Đơn hàng
						</h4>

						<div class="flex-w flex-t bor12 p-b-13">
							<div class="size-209">
								<span class="stext-110 cl2">
									<b>Sản phẩm</b>
								</span>
							</div>

							<div class="size-208">
								<span class="mtext-110 cl2">
									<b>Giá</b>
								</span>
							</div>
						</div>
						<c:forEach var="cart" items="${shoppingCarts}">
						<div class="flex-w flex-t bor12 p-t-15 p-b-30">
							<div class="size-209">
								<span class="stext-110 cl2">
									${cart.value.productName} x ${cart.value.quantity}
								</span>
							</div>

							<div class="size-208 p-r-18 p-r-0-sm">
								<p class="stext-111 cl6 p-t-2">
									<fmt:formatNumber type = "number" value = "${cart.value.productStorage.price * cart.value.quantity}" /> VNĐ
								</p>
							</div>

						</div>
						</c:forEach>
						<div class="flex-w flex-t p-t-27 p-b-33">
							<div class="size-209">
								<span class="mtext-101 cl2">
									Tổng:
								</span>
							</div>

							<div class="size-208 p-t-1">
								<span id ="totalPrice" class="mtext-110 cl2">
									<fmt:formatNumber type = "number" value = "${cartTotalPrice}" /> VNĐ
								</span>
							</div>
						</div>

						<button type="submit" class="flex-c-m stext-101 cl0 size-116 bg3 bor14 hov-btn3 p-lr-15 trans-04 pointer">
							Thanh toán
						</button>
					</div>
				</div>
			</div>
		</div>
	</form>




	<!-- Footer -->
	<jsp:include page="parts/footer.jsp"/>

	<jsp:include page="parts/JsPlugins.jsp"/>

</body>
</html>
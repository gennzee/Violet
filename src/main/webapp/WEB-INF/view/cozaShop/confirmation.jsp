<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Shoping Cart</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="/coza/images/icons/favicon.png"/>
	<style>
		.single_confirmation_details{
			background-color: #ecfdff;
			padding: 35px 40px;
		}

		.confirmation_tittle{
			text-align: center;
			color: red;
		}

		.order_details_iner{
			margin-top: 50px;
			background-color: #ecfdff;
			padding: 30px 30px 15px;
			text-transform: capitalize;
		}
	</style>
	<jsp:include page="parts/head.jsp"/>
	<!--===============================================================================================-->
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
				Xác nhận hóa đơn
			</span>
		</div>
	</div>
		

	<!-- Shoping Cart -->
	<div class="bg0 p-t-75 p-b-85">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="confirmation_tittle p-b-40">
						<span>Cám ơn bạn, đơn đặt hàng đã được đặt thành công.</span>
					</div>
				</div>
				<div class="col-lg-6 col-lx-4">
					<div class="single_confirmation_details">
						<h4 class="p-b-20">Thông tin đơn hàng</h4>
						<table style="width: 100%;">
							<tr>
								<td style="width:50%;">Mã đơn hàng</td><td>: ${orderInfo["orderId"]}</td>
							</tr>
							<tr>
								<td>Ngày</td><td>: ${orderInfo["orderDate"]}</td>
							</tr>
							<tr>
								<td>Tổng</td><td>: <fmt:formatNumber type = "number" value = "${orderTotalPrice}" /> VNĐ</td>
							</tr>
							<tr>
								<td>Phương thức thanh toán</td><td>: COD</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="col-lg-6 col-lx-4">
					<div class="single_confirmation_details">
						<h4 class="p-b-20">Địa chỉ thanh toán</h4>
						<table style="width: 100%;">
							<tr>
								<td style="width:50%;">Đường</td><td>: ${orderInfo["orderAddress"]}</td>
							</tr>
							<tr>
								<td>Thành phố</td><td>: ${orderInfo["orderCity"]}</td>
							</tr>
							<tr>
								<td>Quốc gia</td><td>: Việt Nam</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="col-lg-6 col-lx-4">
					<div class="single_confirmation_details">
						<h4 class="p-b-20">Địa chỉ giao hàng</h4>
						<table style="width: 100%;">
							<tr>
								<td style="width:50%;">Đường</td><td>: ${orderInfo["orderAddress"]}</td>
							</tr>
							<tr>
								<td>Thành phố</td><td>: ${orderInfo["orderCity"]}</td>
							</tr>
							<tr>
								<td>Quốc gia</td><td>: Việt Nam</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="order_details_iner">
						<h3 class="m-b-20">Chi tiết đơn hàng</h3>
						<table class="table table-borderless" style="border: 0;">
							<thead>
							<tr>
								<th scope="col" colspan="2">Sản phẩm</th>
								<th scope="col">Kích cỡ</th>
								<th scope="col">Màu</th>
								<th scope="col">Số lượng</th>
								<th scope="col">Thành tiền</th>
							</tr>
							</thead>
							<tbody>
							<c:forEach var="o" items="${orderProducts}">
							<tr>
								<th colspan="2"><span>${o.productStorage.products.name}</span></th>
								<th>${o.productStorage.productSize.name}</th>
								<th>${o.productStorage.productColor.name}</th>
								<th>x${o.quantity}</th>
								<th> <span><fmt:formatNumber type = "number" value = "${o.productStorage.price * o.quantity}" /> VNĐ</span></th>
							</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>





	<!-- Footer -->
	<jsp:include page="parts/footer.jsp"/>

	<jsp:include page="parts/JsPlugins.jsp"/>

</body>
</html>
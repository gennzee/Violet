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
				Lịch sử đặt hàng
			</span>
		</div>
	</div>


	<!-- Shoping Cart -->
	<form action="#" method="post" class="bg0 p-t-75 p-b-85">
		<div class="container">
			<div class="row">
				<div class="col-lg-10 col-xl-12 m-lr-auto m-b-50">
					<div class="m-l-25 m-r--38 m-lr-0-xl">
						<div class="wrap-table-shopping-cart">
							<table class="table-shopping-cart">
								<tr class="table_head" style="text-align: center;">
									<th class="column-1">Mã đơn hàng</th>
									<th class="column-2">Ngày đặt hàng</th>
									<th class="column-3">Giá tiền</th>
								</tr>
								<c:forEach var="o" items="${orderList}">
								<tr class="table_row" style="text-align: center;height: auto;">
									<td class="column-1" style="padding: 0;"><a href="/order_history/${o.id}">${ESD}${o.id}</a></td>
									<td class="column-2" style="padding: 0;">${o.orderDate}</td>
									<td class="column-3" style="padding: 0;"><fmt:formatNumber type = "number" value = "${o.total}" /> VNĐ</td>
								</tr>
								</c:forEach>
							</table>
						</div>
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
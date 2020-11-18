<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Blog</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="/coza/images/icons/favicon.png"/>
	<jsp:include page="parts/head.jsp"/>
<!--===============================================================================================-->
	<style>
		@media only screen and (min-width: 1025px) {
			.indexImageFormat {
				height: 436px;
				object-fit: cover;
			}
		}
		@media only screen and (min-width: 576px) and (max-width: 1025px) {
			.indexImageFormat {
				height: 248px;
				object-fit: cover;
			}
		}
	</style>
</head>
<body class="animsition">

	<!-- Header -->
	<jsp:include page="parts/01Header.jsp"/>

	<!-- Cart -->
	<jsp:include page="parts/cart.jsp"/>


	<!-- Title page -->
	<section class="bg-img1 txt-center p-lr-15 p-tb-92 container" style="background-image: url('/coza/images/bg-02.jpg');">
		<h2 class="ltext-105 cl0 txt-center">
			Blog
		</h2>
	</section>	


	<!-- Content page -->
	<section class="bg0 p-t-62 p-b-60">
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-lg-9 p-b-80">
					<div class="p-r-45 p-r-0-lg">
						<c:forEach var="n" items="${newsList}">
						<!-- item blog -->
						<div class="p-b-63">
							<a href="/blog-detail/${n.id}" class="hov-img0 how-pos5-parent">
								<img class="indexImageFormat" src="/images/${n.thumbImage}" alt="IMG-BLOG">

								<div class="flex-col-c-m size-123 bg9 how-pos5">
									<span class="ltext-107 cl2 txt-center">
										<fmt:formatDate value="${n.updatedDate}" pattern="dd"/>
									</span>

									<span class="stext-109 cl3 txt-center">
										<fmt:formatDate value="${n.updatedDate}" pattern="MM-yyyy"/>
									</span>
								</div>
							</a>

							<div class="p-t-32">
								<h4 class="p-b-15">
									<a href="/blog-detail/${n.id}" class="ltext-108 cl2 hov-cl1 trans-04">
										${n.name}
									</a>
								</h4>

								<div class="blogContent stext-117 cl6">
									${n.content}
								</div>

								<div class="flex-w flex-sb-m p-t-18">
									<span class="flex-w flex-m stext-111 cl2 p-r-30 m-tb-10">
										<span>
											<span class="cl4">đăng bởi</span> ${n.users.firstName} ${n.users.lastName}
											<span class="cl12 m-l-4 m-r-6">|</span>
										</span>

										<span>
											<fmt:formatDate value="${n.updatedDate}" pattern="dd-MM-yyyy"/>
											<span class="cl12 m-l-4 m-r-6">|</span>
										</span>

										<span>
											${n.commentsList.size()} bình luận
										</span>
									</span>

									<a href="/blog-detail/${n.id}" class="stext-101 cl2 hov-cl1 trans-04 m-tb-10">
										Xem tiếp

										<i class="fa fa-long-arrow-right m-l-9"></i>
									</a>
								</div>
							</div>
						</div>
						</c:forEach>

						<!-- Pagination -->
						<div class="flex-l-m flex-w w-full p-t-10 m-lr--7">
							<c:forEach begin="1" end="${totalPage}" varStatus="loop" var="index">
								<c:choose>
									<c:when test="${currentPage eq index}">
										<a href="javascript:void(0)" class="flex-c-m how-pagination1 trans-04 m-all-7 active-pagination1" style="cursor: context-menu;">
												${index}
										</a>
									</c:when>
									<c:otherwise>
										<a href="/blog/${index}" class="flex-c-m how-pagination1 trans-04 m-all-7">
												${index}
										</a>
									</c:otherwise>
								</c:choose>

							</c:forEach>
						</div>
					</div>
				</div>

				<div class="col-md-4 col-lg-3 p-b-80">
					<div class="side-menu">

						<div class="p-t-55">
							<h4 class="mtext-112 cl2 p-b-33">
								Danh mục
							</h4>

							<ul>
								<c:forEach var="c" items="${listCategories}">
									<li class="bor18">
										<a href="/category/${c.id}/1" class="dis-block stext-115 cl6 hov-cl1 trans-04 p-tb-8 p-lr-4">
												${c.name}
										</a>
									</li>
								</c:forEach>
							</ul>
						</div>

					</div>
				</div>
			</div>
		</div>
	</section>



	<!-- Footer -->
	<jsp:include page="parts/footer.jsp"/>

	<jsp:include page="parts/JsPlugins.jsp"/>
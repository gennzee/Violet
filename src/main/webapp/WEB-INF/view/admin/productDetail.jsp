<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html>
<html dir="ltr" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="/admin/assets/images/favicon.png">
    <title>Adminmart Template - The Ultimate Multipurpose admin template</title>
    <!-- This page plugin CSS -->
    <link href="/admin/assets/extra-libs/datatables.net-bs4/css/dataTables.bootstrap4.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="/admin/dist/css/style.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    <%--jquery --%>
    <script src="/admin/assets/libs/jquery/dist/jquery.min.js"></script>
</head>

<body>
    <!-- ============================================================== -->
    <!-- Preloader - style you can find in spinners.css -->
    <!-- ============================================================== -->
    <div class="preloader">
        <div class="lds-ripple">
            <div class="lds-pos"></div>
            <div class="lds-pos"></div>
        </div>
    </div>
    <!-- ============================================================== -->
    <!-- Main wrapper - style you can find in pages.scss -->
    <!-- ============================================================== -->
    <div id="main-wrapper" data-theme="light" data-layout="vertical" data-navbarbg="skin6" data-sidebartype="full" data-sidebar-position="fixed" data-header-position="fixed" data-boxed-layout="full">

        <jsp:include page="parts/header.jsp"/>

        <!-- ============================================================== -->
        <!-- Page wrapper  -->
        <!-- ============================================================== -->
        <div class="page-wrapper">
            <!-- ============================================================== -->
            <!-- Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <div class="page-breadcrumb">
                <div class="row">
                    <div class="col-7 align-self-center">
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">Danh sách sản phẩm</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="dashboard" class="text-muted">Trang chủ</a></li>
                                    <li class="breadcrumb-item text-muted active" aria-current="page">Danh sách sản phẩm trong mẫu <b>ESD${productId}</b></li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- End Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- Container fluid  -->
            <!-- ============================================================== -->
            <div class="container-fluid">
                <!-- ============================================================== -->
                <!-- Start Page Content -->
                <!-- ============================================================== -->
                <!-- basic table -->
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="btn-list" style="margin-bottom: 5px;">
                                    <button type="button" class="btn waves-effect waves-light btn-primary" data-toggle="modal" data-target="#addProductDetailModal">Thêm</button>
                                </div>
                                <div class="table-responsive">
                                    <table id="zero_config" class="table table-striped table-bordered no-wrap">
                                        <thead>
                                            <tr>
                                                <th>Mã sản phẩm</th>
                                                <th>Giá</th>
                                                <th>Giảm giá</th>
                                                <th>Màu</th>
                                                <th>Chiều cao</th>
                                                <th>Kích cỡ</th>
                                                <th>Số lượng</th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="p" items="${productStorageList}">
                                            <tr>
                                                <td>ESD${p.products.id}_${p.id}</td>
                                                <td><fmt:formatNumber type = "number" value = "${p.price}" /> VNĐ</td>
                                                <td><fmt:formatNumber type = "number" value = "${p.discount}" /> VNĐ</td>
                                                <td>${p.productColor.name}</td>
                                                <td>${p.productHeight.name}</td>
                                                <td>${p.productSize.name}</td>
                                                <td>${p.quantity}</td>
                                                <td><a href="/productManagement/productDetail/delete/${p.id}"><i class="fas fa-trash-alt"></i></a></td>
                                                <td><a href="#"><i class="fas fa-pencil-alt" data-toggle="modal" data-target="#editProductDetailModal${p.id}"></i></a></td>
                                                    <%--modal--%>
                                                <div id="editProductDetailModal${p.id}" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="editMyModalLabel" aria-hidden="true" style="display: none;">
                                                    <div class="modal-dialog">
                                                        <div class="modal-content">
                                                            <form id="editProductDetailForm${p.id}" class="mt-4" action="/productManagement/editProductDetail" method="post">
                                                                <div class="modal-header">
                                                                    <h4 class="modal-title" id="editMyModalLabel">Sửa sản phẩm mới trong mẫu <b>ESD${p.products.id}</b></h4>
                                                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                                                </div>
                                                                <div class="modal-body">
                                                                    <input type="hidden" value="${p.products.id}" name="productId"/>
                                                                    <input type="hidden" value="${p.id}" name="id"/>
                                                                    <div class="form-group">
                                                                        <label>Giá</label>
                                                                        <input type="search" class="form-control" value="${p.price}" name="price">
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label>Giảm giá</label>
                                                                        <input type="search" class="form-control" value="${p.discount}" name="discount">
                                                                    </div>
                                                                    <c:if test="${p.products.categoryId != 2}">
                                                                        <div class="form-group">
                                                                            <label class="mr-sm-2" for="colorSelectEditModal">Màu</label>
                                                                            <select disabled class="custom-select mr-sm-2" id="colorSelectEditModal" name="color">
                                                                                <c:forEach var="c" items="${productColorList}">
                                                                                    <c:choose>
                                                                                        <c:when test="${c.id eq p.productColor.id}">
                                                                                            <option selected value="${c.id}">${c.name}</option>
                                                                                        </c:when>
                                                                                        <c:otherwise>
                                                                                            <option value="${c.id}">${c.name}</option>
                                                                                        </c:otherwise>
                                                                                    </c:choose>
                                                                                </c:forEach>
                                                                            </select>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="mr-sm-2" for="heightSelectEditModal">Chiều cao</label>
                                                                            <select disabled class="custom-select mr-sm-2" id="heightSelectEditModal" name="height">
                                                                                <c:forEach var="h" items="${productHeightList}">
                                                                                    <c:choose>
                                                                                        <c:when test="${h.id eq p.productHeight.id}">
                                                                                            <option selected value="${h.id}">${h.name}</option>
                                                                                        </c:when>
                                                                                        <c:otherwise>
                                                                                            <option value="${h.id}">${h.name}</option>
                                                                                        </c:otherwise>
                                                                                    </c:choose>
                                                                                </c:forEach>
                                                                            </select>
                                                                        </div>
                                                                    </c:if>
                                                                    <div class="form-group">
                                                                        <label class="mr-sm-2" for="sizeSelectEditModal">Kích cỡ</label>
                                                                        <select disabled class="custom-select mr-sm-2" id="sizeSelectEditModal" name="size">
                                                                            <option selected value="">Chọn...</option>
                                                                            <c:forEach var="s" items="${productSizeList}">
                                                                                <c:choose>
                                                                                    <c:when test="${s.id eq p.productSize.id}">
                                                                                        <option selected value="${s.id}">${s.name}</option>
                                                                                    </c:when>
                                                                                    <c:otherwise>
                                                                                        <option value="${s.id}">${s.name}</option>
                                                                                    </c:otherwise>
                                                                                </c:choose>
                                                                            </c:forEach>
                                                                        </select>
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label>Số lượng</label>
                                                                        <input type="search" class="form-control" value="${p.quantity}" name="quantity">
                                                                    </div>

                                                                </div>
                                                                <div class="modal-footer">
                                                                    <button type="submit" class="btn btn-primary">Sửa</button>
                                                                    <button type="button" class="btn btn-light" data-dismiss="modal">Đóng</button>
                                                                </div>
                                                            </form>
                                                            <script>
                                                                $(function () {
                                                                    var productId = '<c:out value="${p.id}"/>';
                                                                    $("#editProductDetailForm"+productId).on("submit", function (event) {
                                                                        $(this).submitForm();
                                                                    });
                                                                });
                                                            </script>
                                                        </div><!-- /.modal-content -->
                                                    </div><!-- /.modal-dialog -->
                                                </div>
                                                    <%--end modal--%>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                <th>Mã sản phẩm</th>
                                                <th>Giá</th>
                                                <th>Giảm giá</th>
                                                <th>Màu</th>
                                                <th>Kích cỡ</th>
                                                <th>Số lượng</th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <%--modal--%>
                <div id="addProductDetailModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <form id="addProductDetailForm" class="mt-4" action="/productManagement/addProductDetail" method="post">
                            <div class="modal-header">
                                <h4 class="modal-title" id="myModalLabel">Thêm sản phẩm mới trong mẫu <b>ESD${productId}</b></h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            </div>
                            <div class="modal-body">
                                    <input type="hidden" value="${productId}" name="productId"/>
                                    <div class="form-group">
                                        <label>Giá</label>
                                        <input type="search" class="form-control" value="" name="price" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Giảm giá</label>
                                        <input type="search" class="form-control" value="" name="discount" required>
                                    </div>
                                    <c:if test="${categoryId != 2}">
                                        <div class="form-group">
                                            <label class="mr-sm-2" for="colorSelect">Màu</label>
                                            <select class="custom-select mr-sm-2" id="colorSelect" name="color" required>
                                                <option selected value="">Chọn...</option>
                                                <c:forEach var="c" items="${productColorList}">
                                                    <option value="${c.id}">${c.name}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label class="mr-sm-2" for="heightSelect">Chiều cao</label>
                                            <select class="custom-select mr-sm-2" id="heightSelect" name="height" required>
                                                <option selected value="">Chọn...</option>
                                                <c:forEach var="h" items="${productHeightList}">
                                                    <option value="${h.id}">${h.name}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </c:if>
                                    <div class="form-group">
                                        <label class="mr-sm-2" for="sizeSelect">Kích cỡ</label>
                                        <select class="custom-select mr-sm-2" id="sizeSelect" name="size" required>
                                            <option selected value="">Chọn...</option>
                                            <c:forEach var="s" items="${productSizeList}">
                                                <option value="${s.id}">${s.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Số lượng</label>
                                        <input type="search" class="form-control" value="" name="quantity" required>
                                    </div>
                            </div>
                            <div class="modal-footer">
                                <button type="submit" class="btn btn-primary">Tạo</button>
                                <button type="button" class="btn btn-light" data-dismiss="modal">Đóng</button>
                            </div>
                            </form>
                        </div><!-- /.modal-content -->
                    </div><!-- /.modal-dialog -->
                </div>
                <%--end modal--%>
                <!-- ============================================================== -->
                <!-- End PAge Content -->
                <!-- ============================================================== -->
            </div>
            <!-- ============================================================== -->
            <!-- End Container fluid  -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- footer -->
            <!-- ============================================================== -->
            <footer class="footer text-center text-muted">
                All Rights Reserved by Adminmart. Designed and Developed by <a
                    href="https://wrappixel.com">WrapPixel</a>.
            </footer>
            <!-- ============================================================== -->
            <!-- End footer -->
            <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- End Page wrapper  -->
        <!-- ============================================================== -->
    </div>
    <!-- ============================================================== -->
    <!-- End Wrapper -->
    <!-- ============================================================== -->
    <!-- End Wrapper -->
    <!-- ============================================================== -->
    <!-- All Jquery -->
    <!-- ============================================================== -->
    <!-- Bootstrap tether Core JavaScript -->
    <script src="/admin/assets/libs/popper.js/dist/umd/popper.min.js"></script>
    <script src="/admin/assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- apps -->
    <!-- apps -->
    <script src="/admin/dist/js/app-style-switcher.js"></script>
    <script src="/admin/dist/js/feather.min.js"></script>
    <!-- slimscrollbar scrollbar JavaScript -->
    <script src="/admin/assets/libs/perfect-scrollbar/dist/perfect-scrollbar.jquery.min.js"></script>
    <script src="/admin/assets/extra-libs/sparkline/sparkline.js"></script>
    <!--Wave Effects -->
    <!-- themejs -->
    <!--Menu sidebar -->
    <script src="/admin/dist/js/sidebarmenu.js"></script>
    <!--Custom JavaScript -->
    <script src="/admin/dist/js/custom.min.js"></script>
    <!--This page plugins -->
    <script src="/admin/assets/extra-libs/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="/admin/dist/js/pages/datatable/datatable-basic.init.js"></script>
    <script src="/coza/vendor/sweetalert/sweetalert.min.js"></script>
    <script>
        $(function () {
            $("#addProductDetailForm").on("submit", function (event) {
                $(this).submitForm();
            });

            $.fn.submitForm = function() {
                event.preventDefault();
                var form = this;
                $(":disabled").each(function(e) {
                    $(this).removeAttr('disabled');
                });//remove all disabled fields to pass data to backend
                var formData = $(form).serializeArray();
                $.post('/productManagement/isProductDetailNotExisting',formData,function (data, status, jqXHR) {
                    if((data !== "" && data != 0 && status === "success") && "addProductDetailForm" === $(form).attr("id")){
                        swal("Sản phẩm đã tồn tại.", "Vui lòng sửa thay vì thêm mới !", "error");
                    }else{
                        if("addProductDetailForm" === $(form).attr("id")){
                            $.post('/productManagement/addProductDetail',formData,function (data, status, jqXHR) {
                                location.reload();
                            });
                        }else{
                            $.post('/productManagement/editProductDetail',formData,function (data, status, jqXHR) {
                                location.reload();
                            });
                        }
                    }
                });
            };
        });
    </script>
</body>

</html>
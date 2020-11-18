<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link rel="icon" type="image/png" sizes="16x16" href="admin/assets/images/favicon.png">
    <title>Adminmart Template - The Ultimate Multipurpose admin template</title>
    <!-- This page plugin CSS -->
    <link href="admin/assets/extra-libs/datatables.net-bs4/css/dataTables.bootstrap4.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="admin/dist/css/style.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    <%--jquery --%>
    <script src="admin/assets/libs/jquery/dist/jquery.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-colorpicker/2.5.3/css/bootstrap-colorpicker.css" rel="stylesheet">
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
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">Danh sách màu</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="dashboard" class="text-muted">Trang chủ</a></li>
                                    <li class="breadcrumb-item text-muted active" aria-current="page">Danh sách màu</li>
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
                                    <button type="button" class="btn waves-effect waves-light btn-primary" data-toggle="modal" data-target="#addColorModal">Thêm</button>
                                </div>
                                <div class="table-responsive">
                                    <table id="zero_config" class="table table-striped table-bordered no-wrap">
                                        <thead>
                                            <tr>
                                                <th></th>
                                                <th>Tên</th>
                                                <th>Danh mục</th>
                                                <th>Màu</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="c" items="${productColors}">
                                            <tr>
                                                <td><a href="javascript:void(0)" data-toggle="modal" data-target="#editColorModal${c.id}"><i class="fas fa-pencil-alt"></i></a></td>
                                                <td>${c.name}</td>
                                                <td>${c.categories.name}</td>
                                                <td style="background-color: ${c.hex};">${c.hex}</td>
                                            </tr>
                                            <!-- add suplier modal -->
                                            <div id="editColorModal${c.id}" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel${c.id}" aria-hidden="true" style="display: none;">
                                                <div class="modal-dialog">
                                                    <form class="mt-4" action="/editColor" method="post">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h4 class="modal-title" id="myModalLabel${c.id}">Chỉnh sửa màu</h4>
                                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <div class="form-group">
                                                                <input type="hidden" value="${c.id}" name="id"/>
                                                                <label>Tên màu</label>
                                                                <input type="search" class="form-control" value="${c.name}" name="name">
                                                            </div>
                                                            <div>
                                                                <label>Màu</label>
                                                                <div class="input-group cp-component">
                                                                    <input disabled type="text" value="${c.hex}" class="form-control colorpickerr" name="hex" style="max-width: 100%;"/>
                                                                    <span class="input-group-addon"><i style="border: 1px solid #e9ecef;height: 90%;width: 100px;"></i></span>
                                                                </div>
                                                            </div>
                                                            <div class="form-group">
                                                                <label class="mr-sm-2">Danh mục</label>
                                                                <select disabled class="custom-select mr-sm-2" name="categoryId">
                                                                    <c:forEach var="cate" items="${categories}">
                                                                        <c:choose>
                                                                            <c:when test="${c.categories.id == cate.id}">
                                                                                <option selected value="${cate.id}">${cate.name}</option>
                                                                            </c:when>
                                                                            <c:otherwise>
                                                                                <option value="${cate.id}">${cate.name}</option>
                                                                            </c:otherwise>
                                                                        </c:choose>
                                                                    </c:forEach>
                                                                </select>
                                                            </div>
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="submit" class="btn btn-primary" onclick="$('.colorpickerr').prop('disabled', false);">Cập nhật</button>
                                                            <button type="button" class="btn btn-light" data-dismiss="modal">Đóng</button>
                                                        </div>
                                                    </div><!-- /.modal-content -->
                                                    </form>
                                                </div><!-- /.modal-dialog -->
                                            </div>
                                        </c:forEach>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                <th></th>
                                                <th>Tên</th>
                                                <th>Danh mục</th>
                                                <th>Màu</th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- add color modal -->
                <div id="addColorModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title" id="myModalLabel">Thêm màu mới</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            </div>
                            <div class="modal-body">
                                <form id="addColorForm" class="mt-4" action="/addNewColor" method="post">
                                    <div class="form-group">
                                        <label>Tên màu</label>
                                        <input type="search" class="form-control" value="" name="name">
                                    </div>
                                    <div>
                                        <label>Màu</label>
                                        <div class="input-group cp-component">
                                            <input disabled type="text" value="#000000" class="form-control cp-component-input" name="hex" style="max-width: 100%;"/>
                                            <span class="input-group-addon"><i style="border: 1px solid #e9ecef;height: 90%;width: 100px;"></i></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="mr-sm-2" for="categorySelect">Danh mục</label>
                                        <select class="custom-select mr-sm-2" id="categorySelect" name="categoryId">
                                            <option selected value="">Chọn...</option>
                                            <c:forEach var="c" items="${categories}">
                                                <option value="${c.id}">${c.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="submit" id="submitAddColorModal" class="btn btn-primary">Tạo</button>
                                <button type="button" class="btn btn-light" data-dismiss="modal">Đóng</button>
                            </div>
                        </div><!-- /.modal-content -->
                    </div><!-- /.modal-dialog -->
                </div>
                <script>
                    $( "#submitAddColorModal" ).click(function() {
                        $(".cp-component-input").prop("disabled", false);
                        $( "#addColorForm" ).submit();
                    })
                </script>
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
    <script src="admin/assets/libs/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap tether Core JavaScript -->
    <script src="admin/assets/libs/popper.js/dist/umd/popper.min.js"></script>
    <script src="admin/assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- apps -->
    <!-- apps -->
    <script src="admin/dist/js/app-style-switcher.js"></script>
    <script src="admin/dist/js/feather.min.js"></script>
    <!-- slimscrollbar scrollbar JavaScript -->
    <script src="admin/assets/libs/perfect-scrollbar/dist/perfect-scrollbar.jquery.min.js"></script>
    <script src="admin/assets/extra-libs/sparkline/sparkline.js"></script>
    <!--Wave Effects -->
    <!-- themejs -->
    <!--Menu sidebar -->
    <script src="admin/dist/js/sidebarmenu.js"></script>
    <!--Custom JavaScript -->
    <script src="admin/dist/js/custom.min.js"></script>
    <!--This page plugins -->
    <script src="admin/assets/extra-libs/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="admin/dist/js/pages/datatable/datatable-basic.init.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-colorpicker/2.5.3/js/bootstrap-colorpicker.js"></script>
    <script type="text/javascript">
        $(function () {
            $('.cp-component').colorpicker();
        });
    </script>
</body>

</html>
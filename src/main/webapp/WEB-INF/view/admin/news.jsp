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
    <!--=============================    CKEDITOR    ============================================-->
    <script src="/libs/ckeditor/ckeditor.js"></script>
    <!--=============================    END    ============================================-->
    <style>
        .ellipsis-text {
            white-space: nowrap;
            width: 100%;
            overflow: hidden;
            text-overflow: ellipsis;
        }
    </style>
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
                                    <li class="breadcrumb-item text-muted active" aria-current="page">Danh sách sản phẩm</li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                    <div class="col-5 align-self-center">
                        <div class="customize-input float-right">
                            <select class="custom-select custom-select-set form-control bg-white border-0 custom-shadow custom-radius">
                                <option selected>Aug 19</option>
                                <option value="1">July 19</option>
                                <option value="2">Jun 19</option>
                            </select>
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
                        <div class="btn-list" style="margin-bottom: 5px;">
                            <button type="button" class="btn waves-effect waves-light btn-primary" data-toggle="modal" data-target="#addNewsModal">Thêm</button>
                        </div>
                        <!-- Row -->
                        <div class="row">
                            <c:forEach var="n" items="${newsList}">
                            <!-- column -->
                            <div class="col-lg-3 col-md-6 img-fluid">
                                <!-- Card -->
                                <div class="card">
                                    <img class="card-img-top img-fluid" src="/images/${n.thumbImage}"
                                         alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title ellipsis-text">${n.name}</h4>
                                        <a href="javascript:void(0)" class="btn btn-primary">Xem chi tiết</a>
                                    </div>
                                </div>
                                <!-- Card -->
                            </div>
                            <!-- column -->
                            </c:forEach>
                        </div>
                        <!-- Row -->
                    </div>
                </div>
                <%--modal--%>
                <div id="addNewsModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
                    <div class="modal-dialog modal-xl">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title" id="myModalLabel">Thêm tin tức mới</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            </div>
                            <div class="modal-body">
                                <form class="mt-4" id="addNewsForm" action="/addNews" method="post" enctype="multipart/form-data">
                                    <div class="form-group">
                                        <label class="mr-sm-2" for="inlineFormCustomSelect">Danh mục</label>
                                        <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="category">
                                            <option value="" selected="">Chọn...</option>
                                            <c:forEach var="c" items="${listCategories}">
                                            <option value="${c.id}">${c.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Tiêu đề</label>
                                        <input type="text" class="form-control" value="" name="title">
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group mb-3">
                                            <div class="input-group-prepend">
                                                <span class="input-group-text">Hình ảnh trước</span>
                                            </div>
                                            <div class="custom-file">
                                                <input type="file" class="custom-file-input" id="inputGroupFile01" name="thumb_image">
                                                <label class="custom-file-label" for="inputGroupFile01">Chọn hình ảnh</label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group mb-3">
                                            <div class="input-group-prepend">
                                                <span class="input-group-text">Hình ảnh nội dung</span>
                                            </div>
                                            <div class="custom-file">
                                                <input type="file" class="custom-file-input" id="inputGroupFile02" name="content_image">
                                                <label class="custom-file-label" for="inputGroupFile02">Chọn hình ảnh</label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label>Nội dung</label>
                                        <textarea id="textarea" class="form-control" name="content"></textarea>
                                        <script>
                                            CKEDITOR.replace("textarea", {
                                                height: 400,
                                                extraAllowedContent: 'section(*)'
                                            });
                                            CKEDITOR.config.contentsCss = [
                                                "/coza/vendor/bootstrap/css/bootstrap.min.css",
                                                "/coza/fonts/font-awesome-4.7.0/css/font-awesome.min.css",
                                                "/coza/fonts/iconic/css/material-design-iconic-font.min.css",
                                                "/coza/fonts/linearicons-v1.0.0/icon-font.min.css",
                                                "/coza/vendor/animate/animate.css",
                                                "/coza/vendor/css-hamburgers/hamburgers.min.css",
                                                "/coza/vendor/animsition/css/animsition.min.css",
                                                "/coza/vendor/select2/select2.min.css",
                                                "/coza/vendor/daterangepicker/daterangepicker.css",
                                                "/coza/vendor/slick/slick.css",
                                                "/coza/vendor/MagnificPopup/magnific-popup.css",
                                                "/coza/vendor/perfect-scrollbar/perfect-scrollbar.css",
                                                "https://fonts.googleapis.com/css2?family=Noto+Sans&display=swap",
                                                "/coza/css/util.css",
                                                "/coza/css/main.css"
                                            ];
                                        </script>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="submit" id="submitAddNewsForm" class="btn btn-primary">Tạo</button>
                                <button type="button" class="btn btn-light" data-dismiss="modal">Đóng</button>
                            </div>
                        </div><!-- /.modal-content -->
                    </div><!-- /.modal-dialog -->
                </div>
                <script>
                    $( "#submitAddNewsForm" ).click(function() {
                        $( "#addNewsForm" ).submit();
                    });
                </script>
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
</body>

</html>
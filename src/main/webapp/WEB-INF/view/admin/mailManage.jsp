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
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">Quản lý hòm thư</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="dashboard" class="text-muted">Trang chủ</a></li>
                                    <li class="breadcrumb-item text-muted active" aria-current="page">Quản lý hòm thư</li>
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
                <div class="form-body">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="table-responsive">
                                        <table id="zero_config" class="table table-striped table-bordered no-wrap">
                                            <thead>
                                            <tr>
                                                <th>Chủ đề</th>
                                                <th>Từ</th>
                                                <th>Thời gian nhận</th>
                                                <th>Trạng thái</th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="m" items="${mailList}">
                                                <tr>
                                                    <td>${m.subject}</td>
                                                    <td>${m.from}</td>
                                                    <td><fmt:formatDate value="${m.receivedDate}" pattern="dd/MM/yyyy hh:mm"/></td>
                                                    <td>${m.flags}</td>
                                                    <td>
                                                        <a href="javascript:void(0)">Đọc</a>
                                                    </td>
                                                    <td>
                                                        <a href="/deleteMail/${m.id}">Xóa</a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                            <tfoot>
                                            <tr>
                                                <th>Chủ đề</th>
                                                <th>Từ</th>
                                                <th>Thời gian nhận</th>
                                                <th>Trạng thái</th>
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
                </div>
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
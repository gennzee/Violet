<%--
  Created by IntelliJ IDEA.
  User: anhnx
  Date: 07/05/2020
  Time: 05:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--===============================================================================================-->
<script src="/coza/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="/coza/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="/coza/vendor/bootstrap/js/popper.js"></script>
<script src="/coza/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="/coza/vendor/select2/select2.min.js"></script>
<script>
    $(".js-select2").each(function(){
        $(this).select2({
            minimumResultsForSearch: 20,
            dropdownParent: $(this).next('.dropDownSelect2')
        });
    })
</script>
<!--===============================================================================================-->
<script src="/coza/vendor/daterangepicker/moment.min.js"></script>
<script src="/coza/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="/coza/vendor/slick/slick.min.js"></script>
<script src="/coza/js/slick-custom.js"></script>
<!--===============================================================================================-->
<script src="/coza/vendor/parallax100/parallax100.js"></script>
<script>
    $('.parallax100').parallax100();
</script>
<!--===============================================================================================-->
<script src="/coza/vendor/MagnificPopup/jquery.magnific-popup.min.js"></script>
<script>
    $('.gallery-lb').each(function() { // the containers for all your galleries
        $(this).magnificPopup({
            delegate: 'a', // the selector for gallery item
            type: 'image',
            gallery: {
                enabled:true
            },
            mainClass: 'mfp-fade'
        });
    });
</script>
<!--===============================================================================================-->
<script src="/coza/vendor/isotope/isotope.pkgd.min.js"></script>
<!--===============================================================================================-->
<script src="/coza/vendor/sweetalert/sweetalert.min.js"></script>
<script>
    $('.js-addwish-b2').on('click', function(e){
        e.preventDefault();
    });

    $('.js-addwish-b2').each(function(){
        var nameProduct = $(this).parent().parent().find('.js-name-b2').html();
        $(this).on('click', function(){
            swal(nameProduct, "is added to wishlist !", "success");

            $(this).addClass('js-addedwish-b2');
            $(this).off('click');
        });
    });

    $('.js-addwish-detail').each(function(){
        var nameProduct = $(this).parent().parent().parent().find('.js-name-detail').html();

        $(this).on('click', function(){
            swal(nameProduct, "is added to wishlist !", "success");

            $(this).addClass('js-addedwish-detail');
            $(this).off('click');
        });
    });

    /*---------------------------------------------*/

    $('.js-addcart-detail').each(function(){
        var nameProduct = $(this).parent().parent().parent().parent().find('.js-name-detail').html();
        $(this).on('click', function(){
            swal(nameProduct, "is added to cart !", "success");
        });
    });
</script>
<!--===============================================================================================-->
<script src="/coza/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
<script>
    $('.js-pscroll').each(function(){
        $(this).css('position','relative');
        $(this).css('overflow','hidden');
        var ps = new PerfectScrollbar(this, {
            wheelSpeed: 1,
            scrollingThreshold: 1000,
            wheelPropagation: false,
        });

        $(window).on('resize', function(){
            ps.update();
        })
    });
</script>
<!--===============================================================================================-->
<script src="/coza/vendor/sidebarmenu.js"></script>
<!--========================main script that both mobile and desktop can use=======================================================================-->
<script src="/coza/js/main.js"></script>
<!--========================desktopMain.js that only desktop mode can use thí=======================================================================-->
<script src="/coza/js/desktopMain.js"></script>
<!--========================mobileMain.js that only mobile mode can use thí=======================================================================-->
<script src="/coza/js/mobileMain.js"></script>

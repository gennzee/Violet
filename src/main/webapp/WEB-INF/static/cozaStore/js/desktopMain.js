/**
 * Created by anhnx on 09/05/2020.
 */

(function ($) {
    "use strict";
    /*==================================================================
     [ Show modal1 ]*/
    /*when ajax load() called, DOM cannot understand class .js-show-modal2. so have to add parent into it.*/
    $('#iconHeaderDesktop').on('click', '.js-show-modal2', function(e){
        e.preventDefault();
        $('.js-modal2').addClass('show-modal1');
    });
    /*==================================================================
     [ AJAX ]*/
    /*login using ajax*/
    $("#loginForm").on( "submit", function( event ) {
        event.preventDefault();
        $.post('/postLoginAjax',{uname: $("#uname").val(), pwd: $("#pwd").val()},function (data, status, jqXHR) {
            if(data !== "" && status === "success"){
                $("#iconHeaderDesktop").load(" #iconHeaderDesktop");
                swal($("#uname").val(), "đã đăng nhập thành công !", "success");
                $('.js-modal2').removeClass('show-modal1');
            }else{
                swal("", "Thông tin tài khoản hoặc mật khẩu không đúng !", "error");
            }
        });
    });
    /*logout using ajax*/
    $('#iconHeaderDesktop').on('click', '#logoutBtn', function(){
        $.post('/postLogoutAjax',{},function (data, status, jqXHR) {
            if(status === "success"){
                $("#iconHeaderDesktop").load("  #iconHeaderDesktop");
                swal("", "Đã đăng xuất thành công !", "success");
            }
        });
    });


})(jQuery);
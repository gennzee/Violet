/**
 * Created by anhnx on 09/05/2020.
 */

(function ($) {
    "use strict";
    /*==================================================================
     [ Show modal1 ]*/
    /*when ajax load() called, DOM cannot understand class .js-show-modal0. so have to add parent into it.*/
    $('#iconHeaderMobile').on('click', '.js-show-modal0', function(e){
        e.preventDefault();
        $('.js-modal0').addClass('show-modal1');
    });
    /*==================================================================
    /*logout using ajax*/
    $('#iconHeaderMobile').on('click', '#logoutBtn', function(){
        $.post('/postLogoutAjax',{},function (data, status, jqXHR) {
            if(status === "success"){
                $("#iconHeaderMobile").load("  #iconHeaderMobile");
                swal("", "Đã đăng xuất thành công !", "success");
            }
        });
    });

    /*onClick cart icon*/
    // $('#iconHeaderMobile').on('click', '.js-show-cart', function(){
    //     $('.js-panel-cart').addClass('show-header-cart');
    // });


})(jQuery);
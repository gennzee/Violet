
(function ($) {
    "use strict";

    /*[ Load page ]
    ===========================================================*/
    $(".animsition").animsition({
        inClass: 'fade-in',
        outClass: 'fade-out',
        inDuration: 1500,
        outDuration: 800,
        linkElement: '.animsition-link',
        loading: true,
        loadingParentElement: 'html',
        loadingClass: 'animsition-loading-1',
        loadingInner: '<div class="loader05"></div>',
        timeout: false,
        timeoutCountdown: 5000,
        onLoadEvent: true,
        browser: [ 'animation-duration', '-webkit-animation-duration'],
        overlay : false,
        overlayClass : 'animsition-overlay-slide',
        overlayParentElement : 'html',
        transition: function(url){ window.location.href = url; }
    });
    
    /*[ Back to top ]
    ===========================================================*/
    var windowH = $(window).height()/2;

    $(window).on('scroll',function(){
        if ($(this).scrollTop() > windowH) {
            $("#myBtn").css('display','flex');
            $("#myBtn").css('margin-bottom','15px');
        } else {
            $("#myBtn").css('display','none');
        }
    });

    $('#myBtn').on("click", function(){
        $('html, body').animate({scrollTop: 0}, 300);
    });


    /*==================================================================
    [ Fixed Header ]*/
    var headerDesktop = $('.container-menu-desktop');
    var wrapMenu = $('.wrap-menu-desktop');

    if($('.top-bar').length > 0) {
        var posWrapHeader = $('.top-bar').height();
    }
    else {
        var posWrapHeader = 0;
    }
    

    if($(window).scrollTop() > posWrapHeader) {
        $(headerDesktop).addClass('fix-menu-desktop');
        $(wrapMenu).css('top',0); 
    }  
    else {
        $(headerDesktop).removeClass('fix-menu-desktop');
        $(wrapMenu).css('top',posWrapHeader - $(this).scrollTop()); 
    }

    $(window).on('scroll',function(){
        if($(this).scrollTop() > posWrapHeader) {
            $(headerDesktop).addClass('fix-menu-desktop');
            $(wrapMenu).css('top',0); 
        }  
        else {
            $(headerDesktop).removeClass('fix-menu-desktop');
            $(wrapMenu).css('top',posWrapHeader - $(this).scrollTop()); 
        } 
    });


    /*==================================================================
    [ Menu mobile ]*/
    $('.btn-show-menu-mobile').on('click', function(){
        $(this).toggleClass('is-active');
        $('.menu-mobile').slideToggle();
    });

    var arrowMainMenu = $('.arrow-main-menu-m');

    for(var i=0; i<arrowMainMenu.length; i++){
        $(arrowMainMenu[i]).on('click', function(){
            $(this).parent().find('.sub-menu-m').slideToggle();
            $(this).toggleClass('turn-arrow-main-menu-m');
        })
    }

    $(window).resize(function(){
        if($(window).width() >= 992){
            if($('.menu-mobile').css('display') == 'block') {
                $('.menu-mobile').css('display','none');
                $('.btn-show-menu-mobile').toggleClass('is-active');
            }

            $('.sub-menu-m').each(function(){
                if($(this).css('display') == 'block') { console.log('hello');
                    $(this).css('display','none');
                    $(arrowMainMenu).removeClass('turn-arrow-main-menu-m');
                }
            });
                
        }
    });


    /*==================================================================
    [ Show / hide modal search ]*/
    $('.js-show-modal-search').on('click', function(){
        $('.modal-search-header').addClass('show-modal-search');
        $(this).css('opacity','0');
    });

    $('.js-hide-modal-search').on('click', function(){
        $('.modal-search-header').removeClass('show-modal-search');
        $('.js-show-modal-search').css('opacity','1');
    });

    $('.container-search-header').on('click', function(e){
        e.stopPropagation();
    });


    /*==================================================================
    [ Isotope ]*/
    var $topeContainer = $('.isotope-grid');
    var $filter = $('.filter-tope-group');

    // filter items on button click
    $filter.each(function () {
        $filter.on('click', 'button', function () {
            var filterValue = $(this).attr('data-filter');
            $topeContainer.isotope({filter: filterValue});
        });
        
    });

    // init Isotope
    $(window).on('load', function () {
        var $grid = $topeContainer.each(function () {
            $(this).isotope({
                itemSelector: '.isotope-item',
                layoutMode: 'fitRows',
                percentPosition: true,
                animationEngine : 'best-available',
                masonry: {
                    columnWidth: '.isotope-item'
                }
            });
        });
    });

    var isotopeButton = $('.filter-tope-group button');

    $(isotopeButton).each(function(){
        $(this).on('click', function(){
            for(var i=0; i<isotopeButton.length; i++) {
                $(isotopeButton[i]).removeClass('how-active1');
            }

            $(this).addClass('how-active1');
        });
    });

    /*==================================================================
    [ Filter / Search product ]*/
    $('.js-show-filter').on('click',function(){
        $(this).toggleClass('show-filter');
        $('.panel-filter').slideToggle(400);

        if($('.js-show-search').hasClass('show-search')) {
            $('.js-show-search').removeClass('show-search');
            $('.panel-search').slideUp(400);
        }    
    });

    $('.js-show-search').on('click',function(){
        $(this).toggleClass('show-search');
        $('.panel-search').slideToggle(400);

        if($('.js-show-filter').hasClass('show-filter')) {
            $('.js-show-filter').removeClass('show-filter');
            $('.panel-filter').slideUp(400);
        }    
    });




    /*==================================================================
    [ Cart ]*/

    $("body").on("click", ".js-show-cart", function(){
        $('.js-panel-cart').addClass('show-header-cart');
    });

    $("body").on("click", ".js-show-favorite", function(){
        $('.js-panel-favorite').addClass('show-header-cart');
    });

    $("body").on("click", "#productCart", function (event) {
        var id = event.target.id;
        if(id && !isNaN(parseInt(id))){
            $.post("/deleteProductFromCartAjax/"+id,{},function (data, status, jqXHR) {
                $("#productCartDetail").load(" #productCartDetail");
                $("#iconHeaderDesktop").load(" #iconHeaderDesktop");
                $("#iconHeaderMobile").load(" #iconHeaderMobile");
            });
        }else{
            $('.js-panel-cart').removeClass('show-header-cart');
        }
    });

    $("body").on("click", "#productFavorite", function (event) {
        var id = event.target.id;
        if(id && !isNaN(parseInt(id))){
            $.post("/removeFavoriteAjax/"+id,{},function (data, status, jqXHR) {
                $("#productCartDetail").load(" #productCartDetail");
                $("#iconHeaderDesktop").load(" #iconHeaderDesktop");
                $("#iconHeaderMobile").load(" #iconHeaderMobile");
            });
        }else{
            $('.js-panel-favorite').removeClass('show-header-cart');
        }
    });

    /*==================================================================
    [ Cart ]*/
    $('.js-show-sidebar').on('click',function(){
        $('.js-sidebar').addClass('show-sidebar');
    });

    $('.js-hide-sidebar').on('click',function(){
        $('.js-sidebar').removeClass('show-sidebar');
    });

    /*==================================================================
    [ +/- num product ]*/
    $("body").on("click", ".btn-num-product-down", function (event) {
        var numProduct = Number($(this).next().val());
        if(numProduct > 0) $(this).next().val(numProduct - 1);
    });

    $("body").on("click", ".btn-num-product-up", function (event) {
        var numProduct = Number($(this).prev().val());
        $(this).prev().val(numProduct + 1);
    });

    /*==================================================================
    [ Rating ]*/
    $('.wrap-rating').each(function(){
        var item = $(this).find('.item-rating');
        var rated = -1;
        var input = $(this).find('input');
        $(input).val(0);

        $(item).on('mouseenter', function(){
            var index = item.index(this);
            var i = 0;
            for(i=0; i<=index; i++) {
                $(item[i]).removeClass('zmdi-star-outline');
                $(item[i]).addClass('zmdi-star');
            }

            for(var j=i; j<item.length; j++) {
                $(item[j]).addClass('zmdi-star-outline');
                $(item[j]).removeClass('zmdi-star');
            }
        });

        $(item).on('click', function(){
            var index = item.index(this);
            rated = index;
            $(input).val(index+1);
        });

        $(this).on('mouseleave', function(){
            var i = 0;
            for(i=0; i<=rated; i++) {
                $(item[i]).removeClass('zmdi-star-outline');
                $(item[i]).addClass('zmdi-star');
            }

            for(var j=i; j<item.length; j++) {
                $(item[j]).addClass('zmdi-star-outline');
                $(item[j]).removeClass('zmdi-star');
            }
        });
    });
    
    /*==================================================================
    [ Show modal1 ]*/
    $('.js-show-modal1').on('click',function(e){
        e.preventDefault();
        $(".js-modal"+e.target.id).addClass("show-modal1");
        //modify css of slick3
        $('.slick3-dots li img').each(function(e){
            $(this).css({"object-fit":"cover"});
        });
    });

    $('.js-hide-modal1').on('click',function(e){
        e.preventDefault();
        $(".js-modal"+e.target.dataset.id).removeClass('show-modal1');
    });

    /*login modal*/
    $('.js-show-modal0').on('click',function(e){
        e.preventDefault();
        $('.js-modal0').addClass('show-modal1');
    });

    $('.js-hide-modal0').on('click',function(){
        $('.js-modal0').removeClass('show-modal1');
    });

    /*add-product-to-cart-handler*/
    $(".addProductToCart").on( "submit", function( event ) {
        event.preventDefault();
        var id = event.target.id.value;
        var formData = $(this).serializeArray();
        console.log(formData);
        $.post('/addProductToCartAjax',formData,function (data, status, jqXHR) {
            if(data !== "" && data != 0 && status === "success"){
                $("#productCart").load(" #productCartDetail");
                $("#iconHeaderDesktop").load(" #iconHeaderDesktop");
                $("#iconHeaderMobile").load(" #iconHeaderMobile");
                swal("", "Đã thêm sản phẩm vào giỏ hàng !", "success");
            }else{
                swal("", "Lỗi !", "error");
            }
        });
    });

    $("#cartDetailForm").on("submit", function (event) {
        event.preventDefault();
        var formData = $(this).serializeArray();
        $.post('/updateCart',formData,function (data, status, jqXHR) {
            if(data !== "" && data != 0 && status === "success"){
                $("#productCart").load(" #productCartDetail");
                $("#totalPrice").load(" #totalPrice");
                $("#subTotalPrice").load(" #subTotalPrice");
                $("#iconHeaderDesktop").load(" #iconHeaderDesktop");
                $("#iconHeaderMobile").load(" #iconHeaderMobile");
                $(".table-shopping-cart").load(" .table-shopping-cart");
                swal("", "Thành công cập nhật giỏ hàng !", "success");
            }
        });
    });

    $("body").on("click", ".how-itemcart1", function (event) {
        var id = event.target.id;
        $.post("/deleteProductFromCartAjax/"+id, {}, function (data, status, jqXHR) {
            if(data !== "" && data != 0 && status === "success"){
                $("#productCart").load(" #productCartDetail");
                $("#totalPrice").load(" #totalPrice");
                $("#subTotalPrice").load(" #subTotalPrice");
                $("#iconHeaderDesktop").load(" #iconHeaderDesktop");
                $("#iconHeaderMobile").load(" #iconHeaderMobile");
                $(".table-shopping-cart").load(" .table-shopping-cart");
                swal("", "Xóa sản phẩm thành công !", "success");
            }
        });
    });

    /*add-product-to-favorite-handler*/
    $(".addProductToFavorite").on( "click", function( event ) {
        var id = event.currentTarget.id;
        if(!event.currentTarget.classList.contains("js-addedwish-b2")){
            $.post('/addtoFavoriteAjax/'+id,{},function (data, status, jqXHR) {
                if(data !== "" && data != 0 && status === "success"){
                    $("#productFavorite").load(" #productFavoriteDetail");
                    $("#iconHeaderDesktop").load(" #iconHeaderDesktop");
                    $("#iconHeaderMobile").load(" #iconHeaderMobile");
                    event.currentTarget.classList.add("js-addedwish-b2");
                    swal("", "Đã được thêm vào mục yêu thích !", "success");
                }else{
                    swal("", "Lỗi !", "error");
                }
            });
        }else{
            $.post('/removeFavoriteAjax/'+id,{},function (data, status, jqXHR) {
                if(data !== "" && data != 0 && status === "success"){
                    $("#productFavorite").load(" #productFavoriteDetail");
                    $("#iconHeaderDesktop").load(" #iconHeaderDesktop");
                    $("#iconHeaderMobile").load(" #iconHeaderMobile");
                    event.currentTarget.classList.remove("js-addedwish-b2");
                    swal("", "Ngon !", "success");
                }else{
                    swal("", "Lỗi !", "error");
                }
            });
        }
    });

    /*login-from-checkout-page*/
    $("#loginFormOnCheckout").on("click", function (event) {
        event.preventDefault();
        $.post('/postLoginAjax',{uname: $("#uname").val(), pwd: $("#pwd").val()},function (data, status, jqXHR) {
            if(data !== "" && data != 0 && status === "success"){
                location.reload();
            }else{
                swal("", "Thông tin tài khoản hoặc mật khẩu không đúng !", "error");
            }
        });
    });

})(jQuery);
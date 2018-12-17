$(document).ready(function () {

    var id;

    $('.card').on('hover', function(event){
        this.
    })

    $('.card').on('click',function(event) {
        event.preventDefault();
        var href = $(this).attr('href');



        $.get(href,function (menu) {

            debugger
            $('.myModal #exampleModalLabel').text(menu.name);
            $('.myModal #row_description').text(menu.description);
            $('.myModal #row_price').text(menu.price);

            id = menu.id;
        });
        $('.myModal #exampleModal').modal();
    })

    $('#submitorder').on('click', function(event){
        debugger
        window.location = '../order/create/?id=' + id + '&quantity=' + $('#guestcount').val();
        //$('.myModal #menuform').attr('action', `order/?id=${id}&quantity=${$('#guestcount').val()}`);

            $.get(href,function (menu,status) {

                $('.myModal #example-modal-label').text(menu.name);
                $('.myModal #row-description').text(menu.description);
                $('.myModal #row-price').text(menu.price);

                id = menu.id;

            });

            $('.myModal #example-modal').modal();
    })

    $('#submit-order').on('click', function(event){
        window.location = '../order/create/?id=' + id + '&quantity=' + $('#guest-count').val();
    })
});



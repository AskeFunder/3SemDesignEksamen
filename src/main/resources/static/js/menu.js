$(document).ready(function () {

    var id;

    $('.card').on('hover', function(event){
        this.
    })

    $('.card').on('click',function(event) {
        event.preventDefault();
        var href = $(this).attr('href');

        $('#someID')

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
    })
});



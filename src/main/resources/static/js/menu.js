$(document).ready(function () {
    $('.card').on('click',function(event) {
        event.preventDefault();
        var href = $(this).attr('href');

        $.get(href,function (menu,status) {


            //var $url + '/' + $id;
            //$href.goto(url);

            $('.myModal #exampleModalLabel').text(menu.name);
            $('.myModal #row_description').text(menu.description);
            $('.myModal #row_price').text(menu.price);

            $('.myModal #menuform').attr('action', `url/id=${menu.id}&quantity=${$('#guestcount').val()}`);
        });

        $('.myModal #exampleModal').modal();

    });

    ('#menuform').on('submit',function(event){alert('htfhgf');})

});


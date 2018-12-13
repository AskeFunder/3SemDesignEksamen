$(document).ready(function () {

    var id;

    $('.card').on('click',function(event) {
        event.preventDefault();
        let href = $(this).attr('href');


        //function getMenu(){
           /* $.ajax({
                type : "GET",
                url : window.location + ""
            })*/
            $.get(href,function (menu,status) {

                $('.myModal #exampleModalLabel').text(menu.name);
                $('.myModal #row_description').text(menu.description);
                $('.myModal #row_price').text(menu.price);

                id = menu.id;

            });


            $('.myModal #exampleModal').modal();


        //}


    })

    $('#submitorder').on('click', function(event){
        window.location = '../order/create/?id=' + id + '&quantity=' + $('#guestcount').val();
        //$('.myModal #menuform').attr('action', `order/?id=${id}&quantity=${$('#guestcount').val()}`);
    })
});



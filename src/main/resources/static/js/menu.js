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
                $('.myModal #menuform').attr('action', `url/id=${id}`);
            });


            $('.myModal #exampleModal').modal();


        //}


    })

    function myFunction(){
        $('.myModal #menuform').attr('action', `url/id=${id}quantity=${$('.myModal #guestcount').val()}`);
    }
});



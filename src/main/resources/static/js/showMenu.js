/*
*
 */

$(document).ready(function () {
    $('.table .eBtn').on('click',function(event) {
        event.preventDefault();
        var href = $(this).attr('href');

        $.get(href,function (menu,status) {
            $('.myModal #row_name').text(menu.name);
            $('.myModal #row_price').text(menu.price + 'DKK');
            $('.myModal #row_description').text(menu.description);
            $('.myModal #row_items').text(menu.items);

        });

        $('.myModal #exampleModal').modal();
    })
});


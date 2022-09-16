$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

    
});

function autenticarUsuario() {

    let apodo = $("#apodo").val();
    let contrasena = $("#contrasena").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuariosLogin",
        data: $.param({
            apodo: apodo,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let apodo = parsedResult['apodo'];
                document.location.href = "home.html?apodo=" + apodo;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
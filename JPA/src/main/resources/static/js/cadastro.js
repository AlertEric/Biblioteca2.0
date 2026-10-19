function Cadastro() {
    let email = document.getElementById( "email").value;
    let confimacaoemail = document.getElementById( "validacaoemail").value;
    let senha = document.getElementById( "senha").value;
    let confirmarSenha = document.getElementById( "confirmarsenha").value;
    let formulario =  document.getElementById("form");
    let login = document.getElementById("index.html");

    if (email === confimacaoemail){

        if(senha === confirmarSenha){

        formulario.addEventListener("submit",login);
        }else {

            event.preventDefault();
            return(alert(" Senha não são iguais!"));

        }
    }else {

        event.preventDefault();
        return( alert(" E-mails não são iguais!"));


    }

}
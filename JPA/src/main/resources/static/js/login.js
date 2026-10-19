function Login(){

 let email = document.getElementById("CPF").value;
 let Senha = document.getElementById("Senha").value;


 if(email === "email do banco" ) {

     if (Senha === "senha do banco") {


     } else {
         event.preventDefault();
         return (alert("Acesso negado senha incorreta"));

     }
 }else {
     event.preventDefault();
     return (alert("Acesso negado E-mail incorreto:"+ email));
 }




}
var form = document.querySelector("#form-cadastro");
var inputs = form.querySelectorAll("input");
var email = form.querySelector("#email");
console.log(email.value.indexOf("@") == -1);

form.addEventListener("submit", function(e) {
  e.preventDefault();

  for (var i = 0; i < inputs.length; i++) {
    if (inputs[i] == email) {
      if (email.value.indexOf("@") == -1 || email.value.length < 1) {
        alert("Preencha o campo email com um email valido!");
        email.style.borderColor = "red";
        return;
      }
    } else {
      email.style.borderColor = "#21a4a9";

      if (inputs[i].value.length < 1) {
        alert("Verifique se os campos foram preenchidos corretamente");

        inputs[i].style.borderColor = "red";

        return;
      } else {
        inputs[i].style.borderColor = "#21a4a9";
      }
    }
  }
});

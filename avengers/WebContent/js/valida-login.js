var form = document.querySelector("#form-geral");
var email = document.querySelector("#email");
var senha = document.querySelector("#senha");

email.focus();

email.onblur = () => {
  if (email.value.indexOf("@") == -1 || email.value.length < 3) {
    email.classList.add("erro");
    email.style.borderColor = "red";
    erroEmail.textContent = "Email inválido";
  } else {
    email.classList.add("sucesso");
    email.style.borderColor="green";
    erroEmail.textContent = "";
  }
};

senha.onblur = () => {
  if (senha.value.length < 8 || senha.value.length > 24) {
    senha.classList.add("erro");
    senha.style.borderColor = "red";
    erroSenha.textContent = "Senha inválida";
    
  } else {
    senha.classList.add("sucesso");
    senha.style.borderColor="green";
    erroSenha.textContent = "";
  }
};

form.onsubmit = validaCampo => {
  validaCampo.preventDefault();

    if (email.value.indexOf("@") == -1 || email.value.length < 3) {
      email.classList.add("erro");
      email.style.borderColor = "red";
      erroEmail.textContent = "Email inválido";
      
    } else {
      email.classList.add("sucesso");
      email.style.borderColor = "green";
      erroEmail.textContent = "";
    }


    if (senha.value.length < 8 || senha.value.length > 24) {
      senha.classList.add("erro");
      senha.style.borderColor = "red";
      erroSenha.textContent = "Senha inválida";
    } else {
      senha.classList.add("sucesso");
      senha.style.borderColor = "green";
      senha.textContent = "";
    }
    form.submit();
};

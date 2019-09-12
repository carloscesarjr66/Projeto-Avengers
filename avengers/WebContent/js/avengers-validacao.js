var form = document.querySelector("#form-geral");
var nome = document.querySelector("#name");
var email = document.querySelector("#email");
var senha = document.querySelector("#senha");
var confirmaSenha = document.querySelector("#confirmaSenha");

nome.focus();

confirmaSenha.onblur = () => {
  if (confirmaSenha.value != senha.value || confirmaSenha.value.length <= 0) {
    confirmaSenha.classList.add("erro");
    confirmaSenha.style.borderColor = "red";
    erroConfirmaSenha.textContent = "Senha incompatível!";
  } else {
    confirmaSenha.classList.add("sucesso");
    confirmaSenha.style.borderColor = "green";
    erroConfirmaSenha.textContent = "";
  }
};

senha.onblur = () => {
  if (senha.value.length < 8 || senha.value.length > 24) {
    senha.classList.add("erro");
    senha.style.borderColor = "red";
    erroSenha.textContent = "Senha inválida!";
  } else {
    senha.classList.add("sucesso");
    senha.style.borderColor = "green";
    erroSenha.textContent = "";
  }
};

email.onblur = () => {
  if (email.value.indexOf("@") == -1 || email.value.length < 3) {
    email.classList.add("erro");
    email.style.borderColor = "red";
    erroEmail.textContent = "Email inválido!";
  } else {
    email.classList.add("sucesso");
    email.style.borderColor = "green";
    erroEmail.textContent = "";
  }
};

nome.onblur = () => {
  if (nome.value.length < 3) {
    nome.classList.add("erro");
    nome.style.borderColor = "red";
    erroNome.textContent = "Nome inválido!";
  } else {
    nome.classList.add("sucesso");
    nome.style.borderColor = "green";
    erroNome.textContent = "";
  }
};

form.onsubmit = validaCampo => {
  validaCampo.preventDefault();
  
    if (confirmaSenha.value != senha.value || confirmaSenha.value.length < 0) {
      confirmaSenha.classList.add("erro");
      confirmaSenha.style.borderColor = "red";
      erroConfirmaSenha.textContent = "Senha incompatível!";
    } else {
      confirmaSenha.classList.add("sucesso");
      confirmaSenha.style.borderColor = "green";
      erroConfirmaSenha.textContent = "";
    }



    if (senha.value.length < 8 || senha.value.length > 24) {
      senha.classList.add("erro");
      senha.style.borderColor = "red";
      erroSenha.textContent = "Senha inválida!";
    } else {
      senha.classList.add("sucesso");
      senha.style.borderColor = "green";
      erroSenha.textContent = "";
    }


    if (email.value.indexOf("@") == -1 || email.value.length < 3) {
      email.classList.add("erro");
      email.style.borderColor = "red";
      erroEmail.textContent = "Email inválido!";
    } else {
      email.classList.add("sucesso");
      email.style.borderColor = "green";
      erroEmail.textContent = "";
    }

   
	  if (nome.value.length < 3) {
      nome.classList.add("erro");
      nome.style.borderColor = "red";
      erroNome.textContent = "Nome inválido!";
    } else {
      nome.classList.add("sucesso");
      nome.style.borderColor = "green";
      erroNome.textContent = "";
    } 
	form.submit();
};

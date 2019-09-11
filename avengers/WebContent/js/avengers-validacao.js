var form = document.querySelector("#form-geral");
var email = form.querySelector("#email");
var nome = form.querySelector("#name");
var senha = form.querySelector("#senha");
var confSenha = form.querySelector("#confirmaSenha");
nome.focus();
confSenha.onblur = () => {
  if (confSenha.value != senha.value || confSenha.value.length < 8) {
    confSenha.style.borderColor = "red";
    erroConfirmaSenha.textContent = "Senhas incompativeis!";
  } else {
    confSenha.style.borderColor = "#21a4a9";
    erroConfirmaSenha.textContent = "";
  }
};
senha.onblur = () => {
  if (senha.value.length < 8 || senha.value.length > 24) {
    senha.style.borderColor = "red";
    erroSenha.textContent = "Senha inválida!";
  } else {
    senha.style.borderColor = "#21a4a9";
    erroSenha.textContent = "";
  }
};
email.onblur = () => {
  if (email.value.indexOf("@") == -1 || email.value.length < 3) {
    email.style.borderColor = "red";
    erroEmail.textContent = "Email inválido!";
  } else {
    email.style.borderColor = "#21a4a9";
    erroEmail.textContent = "";
  }
};
nome.onblur = () => {
  if (nome.value.length < 3) {
    nome.style.borderColor = "red";
    erroNome.textContent = "Nome inválido!";
  } else {
    nome.style.borderColor = "#21a4a9";
    erroNome.textContent = "";
  }
};

form.onsubmit = e => {
  e.preventDefault();
  if (senha.value.length < 8 || senha.value.length > 24) {
    senha.style.borderColor = "red";
    erroSenha.textContent = "Senha inválida!";
  } else {
    senha.style.borderColor = "#21a4a9";
    erroSenha.textContent = "";
  }
  if (nome.value.length < 3) {
    nome.style.borderColor = "red";
    erroNome.textContent = "Nome inválido!";
  } else {
    nome.style.borderColor = "#21a4a9";
    erroNome.textContent = "";
  }
  if (email.value.indexOf("@") == -1 || email.value.length < 3) {
    email.style.borderColor = "red";
    erroEmail.textContent = "Email inválido!";
  } else {
    email.style.borderColor = "#21a4a9";
    erroEmail.textContent = "";
  }
  if (confSenha.value != senha.value || confSenha.value.length < 8) {
    confSenha.style.borderColor = "red";
    erroConfirmaSenha.textContent = "Senhas incompativeis!";
  } else {
    confSenha.style.borderColor = "#21a4a9";
    erroConfirmaSenha.textContent = "";
  }
};

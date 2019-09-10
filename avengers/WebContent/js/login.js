var login = document.querySelector("#login");
var senha = document.querySelector("#password");
var botao = document.querySelector("#btn");
login.focus();
login.onblur = () => {
  if (login.value.indexOf("@") == -1 || login.value.length < 3) {
    login.style.borderColor = "red";
    erroEmail.textContent = "Email inválido!";
  } else {
    login.style.borderColor = "#21a4a9";
    erroEmail.textContent = "";
  }
};

senha.onblur = () => {
  if (senha.value.length < 8 || senha.value.length > 24) {
    senha.style.borderColor = "red";
    erroSenha.textContent = "Senha Inválida!";
  } else {
    senha.style.borderColor = "#21a4a9";
    erroSenha.textContent = "";
  }
};

botao.onclick = e => {
  e.preventDefault();
  if (login.value.indexOf("@") == -1 || login.value.length < 3) {
    login.style.borderColor = "red";
    erroEmail.textContent = "Email inválido!";
  } else {
    login.style.borderColor = "#21a4a9";
  }
  if (senha.value.length < 8 || senha.value.length > 24) {
    senha.style.borderColor = "red";
    erroSenha.textContent = "Senha Inválida!";
  } else {
    senha.style.borderColor = "#21a4a9";
    erroSenha.textContent = "";
  }
};

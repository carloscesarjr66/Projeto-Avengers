<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="cabecalho.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de vingador</title>
</head>
<body onload="goFocus('nome')">
	<fieldset>
		<h3>Cadastro</h3>
		<form action="entrada" method="post">
			<label>Nome: </label>	
			<input type="text" name="nm_usuario" id="nome" 
			required	placeholder="Iron Man" 
			/> 
			<label>E-mail: </label>
			<input type="email" name="email_usuario" id="email" 
			required placeholder="ironman@avenger.com" 
			/> 
			<label>Senha: </label>	
			<input type="password" name="pwd_usuario" id="pwd" 
			required	placeholder="Sua senha super secreta" 
			/>
			<button>Cadastre-se</button>
		</form>

		<p>
			Ja é um vingador? <a href="entrada.jsp">Entrar</a>
		</p>
	</fieldset>
	<script type="text/javascript">
      function goFocus(elementID) {
        document.getElementById(elementID).focus();
      }
    </script>
</body>
</html>
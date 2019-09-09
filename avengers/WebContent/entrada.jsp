<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file="cabecalho.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN AVENGER'S PARK</title>
</head>
<body onload="goFocus('email')">
	<fieldset>
		<h3>LOGIN</h3>
		<form action="avengerspark" method="post">
			<label>E-mail: </label>
			<input type="email" name="email_usuario" id="email" required
				placeholder="ironman@avenger.com" 
			/> 
			<label>Senha: </label>	
			<input type="password" name="pwd_usuario" id="pwd" required
				placeholder="Sua senha super secreta" 
			/>
			<button>Logar</button>
		</form>

		<p>
			Não é um vingador? <a href="cadastro.jsp">Cadastre-se</a>
		</p>
	</fieldset>
	<script type="text/javascript">
      function goFocus(elementID) {
        document.getElementById(elementID).focus();
      }
    </script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="bootstrapcss.jsp"%>

<title>Login Avenger's</title>
</head>
<body class="bg">
	<div class="container">
		<div class="row">
			<div class="col">

				<img class="logo" src="img/logoAvenger.jpg" alt="">

				<form id="form-geral" class="login" action="login"
					method="post">

					<label class="desc_input" for="email">Email:</label>
					<div class="input-group mb-3">
						<input id="email" type="email" name="email" class="form-control"
							placeholder="ironman@avenger.com.br"  required/>
					</div>
					<div id='erroEmail' class="erros"></div>

					<label class="desc_input" for="password">Senha:</label>
					<div class="input-group mb-3">
						<input id="senha" type="password" name="senha" class="form-control"
							placeholder="Sua senha!"  required/>
					</div>
					<div id="erroSenha" class="erros"></div>

					<button type="submit"
						class="btn btnLogin btn-primary" id="btn">Login</button>
				</form>
			</div>

			<div class="col"></div>

		</div>
	</div>

	<script src="js/valida-login.js"></script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="bootstrapcss.jsp"%>

<title>Cadastro Avengers</title>
</head>
<body class="bg">
	<div class="container">
		<div class="row">
			<div class="col">

				<img class="logo" src="img/logoAvenger.jpg" alt="">

				<form id="form-geral" class="cadastro" action="avengers-login.html"
					method="post">
					<label class="desc_input" for="name">Nome:</label>
					<div class="input-group mb-3">
						<input id="name" type="text" class="form-control"
							placeholder="Iron Man" required />
					</div>
					<div id="erroNome" class="erros"></div>

					<label class="desc_input" for="email">Email:</label>
					<div class="input-group mb-3">
						<input id="email" type="email" class="form-control"
							placeholder="ironman@avenger.com.br" required />
					</div>
					<div id="erroEmail" class="erros"></div>

					<label class="desc_input" for="password">Senha:</label>
					<div class="input-group mb-3">
						<input id="senha" type="password" class="form-control"
							placeholder="Sua senha!" required />
					</div>
					<div id="erroSenha" class="erros"></div>

					<label class="desc_input" for="confirm-password">Confirmar
						Senha:</label>
					<div class="input-group mb-3">
						<input id="confirmaSenha" type="password" class="form-control"
							placeholder="Confirme sua senha" required />
					</div>
					<div id="erroConfirmaSenha" class="erros"></div>


					<div class="input-group mb-3">
						<input type="checkbox" id="caixa-adm" value="1" />
						 <label class="desc_input" for="user-adm">Usuário Administrador?</label>

					</div>
					<button type="submit" class="btn btnCadastrar btn-primary">Cadastrar</button>
				</form>
			</div>


			<div class="col"></div>

		</div>
	</div>

	<script src="js/avengers-validacao.js"></script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="bootstrapcss.jsp"%>

<title>Cadastro Avengers</title>
</head>
<body class="bg">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Alterna navegação">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="home.html">Home <span class="sr-only">(Página
							atual)</span></a></li>
				<li class="nav-item"><a class="nav-link"
					href="avengers-cadastro.html">Cadastro de Funcionário</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Gerar
						Relatório</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Logout</a>
				</li>
			</ul>
		</div>
	</nav>


	<div class="container">
		<div class="row">
			<div class="col">

				<img class="logo" src="img/logoAvenger.jpg" alt="">

				<form id="form-geral" class="cadastro" action="cadastro" method="post">
					<label class="desc_input" for="name">Nome:</label>
					<div class="input-group mb-3">
						<input id="name" type="text" name="nome" class="form-control">
					</div>
					<div id="erroNome"></div>

					<label class="desc_input" for="email">Email:</label>
					<div class="input-group mb-3">
						<input id="email" type="email" name="email" class="form-control">
					</div>
					<div id="erroEmail"></div>

					<label class="desc_input" for="password">Senha:</label>
					<div class="input-group mb-3">
						<input id="senha" type="password" name="senha" class="form-control">
					</div>
					<div id="erroSenha"></div>

					<label class="desc_input" for="confirm-password">Confirmar
						Senha:</label>
					<div class="input-group mb-3">
						<input id="confirmaSenha" type="password" class="form-control">
					</div>
					<div id="erroConfirmaSenha"></div>

					<button type="submit" onclick="validaCampo()"
						class="btn btnCadastrar btn-primary">Cadastrar</button>
			</div>
			</form>
			<div class="col"></div>

		</div>
	</div>


	<!-- -------------Mobile----------------------------------------------- -->

	<div class="container-pq">
		<div class="row">
			<div class="col-12">

				<img class="logo" src="img/logoAvenger.jpg" alt="">

				<form id="form-geral" class="cadastro" action="avengers-login.html"
					method="post">
					<label class="desc_input" for="name">Nome:</label>
					<div class="input-group mb-3">
						<input id="name" type="text" class="form-control">
					</div>
					<div id="erroNome"></div>

					<label class="desc_input" for="email">Email:</label>
					<div class="input-group mb-3">
						<input id="email" type="email" class="form-control">
					</div>
					<div id="erroEmail"></div>

					<label class="desc_input" for="password">Senha:</label>
					<div class="input-group mb-3">
						<input id="senha" type="password" class="form-control">
					</div>
					<div id="erroSenha"></div>

					<label class="desc_input" for="confirm-password">Confirmar
						Senha:</label>
					<div class="input-group mb-3">
						<input id="confirmaSenha" type="password" class="form-control">
					</div>
					<div id="erroConfirmaSenha"></div>

					<button type="submit" onclick="validaCampo()"
						class="btn btnCadastrar btn-primary">Cadastrar</button>
			</div>
			</form>

			<div class="col-12"></div>

		</div>
	</div>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
	<script src="js/avengers-validacao.js"></script>
</body>
</html>

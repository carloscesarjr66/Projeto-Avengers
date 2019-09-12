<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/bootstrapcss.jsp"%>
<title>Avenger's Park</title>
</head>
<body class="bg2">

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

	<!-- <img class="logo" src="img/logoAvenger.jpg" alt=""> -->
	<form id="form-geral" class="entrada" action="avengers-entrada.html"
		method="post">
		<div class="container">
			<div class="row">
				<div class="col-6">
					<label class="desc_input" for="placa">Placa:</label>
					<div class="input-group mb-3">
						<input id="placa" type="text" class="form-control">
					</div>
				</div>
				<div class="col-6">
					<label class="desc_input" for="modelo">Marca:</label>
					<div class="input-group mb-3">
						<select class="form-control" id="marca">
							<option>CHEVROLET</option>
							<option>VOLKSWAGEN</option>
							<option>FIAT</option>
							<option>MERCEDES-BENZ</option>
							<option>CITROEN</option>
						</select>
					</div>
				</div>
			</div>


			<div class="row">
				<div class="col-6">
					<label class="desc_input" for="placa">Modelo:</label>
					<div class="input-group mb-3">
						<input id="modelo" type="text" class="form-control">
					</div>
				</div>
				<div class="col-6">
					<button class="btn btn-primary btnEntrada">Entrada</button>
				</div>
	</form>
	</div>
	</div>

	<form id="form-geral" class="entrada" action="avengers-saida.html"
		method="post"></form>
	<div class="container">
		<div class="row">
			<div class="col">
				<label class="desc_input" for="placa">Placa:</label>
				<div class="input-group mb-3">
					<input id="placa" type="text" class="form-control">
				</div>
			</div>
			<div class="col">
				<button class="btn btn-primary btnSaida">Buscar</button>
			</div>
			</form>
		</div>
	</div>

	<!-- ----------------------------------------------------------- -->

	<form id="form-geral" class="entrada" action="avengers-entrada.html"
		method="post">
		<div class="container-pq">
			<div class="row">
				<div class="col-12">
					<label class="desc_input" for="placa">Placa:</label>
					<div class="input-group mb-3">
						<input id="placa" type="text" class="form-control">
					</div>
				</div>
				<div class="col-12">
					<label class="desc_input" for="modelo">Marca:</label>
					<div class="input-group mb-3">
						<select class="form-control" id="marca">
							<option>CHEVROLET</option>
							<option>VOLKSWAGEN</option>
							<option>FIAT</option>
							<option>MERCEDES-BENZ</option>
							<option>CITROEN</option>
						</select>
					</div>
				</div>
			</div>




			<div class="row">
				<div class="col-12">
					<label class="desc_input" for="placa">Modelo:</label>
					<div class="input-group mb-3">
						<input id="modelo" type="text" class="form-control">
					</div>
				</div>
				<div class="col-12">
					<button class="btn btn-primary btnEntrada">Entrada</button>
				</div>
	</form>



	</div>
	</div>

	<form id="form-geral" class="entrada" action="avengers-saida.html"
		method="post"></form>
	<div class="container-pq">
		<div class="row">
			<div class="col-12">
				<label class="desc_input" for="placa">Placa:</label>
				<div class="input-group mb-3">
					<input id="placa" type="text" class="form-control">
				</div>
			</div>
			<div class="col-12">
				<button class="btn btn-primary btnSaida">Buscar</button>
			
			</div>
			</form>
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
</body>
</html>

<%-- 
    Document   : login
    Created on : 12/11/2022, 02:13:12
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="../bootstrap/bootstrap.css">
    <title>Clinica Médica</title>
</head>

<body>
    <section class="headerNavegacao">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Clinica médica</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="#">Home</a>
                </div>
            </div>
        </nav>
    </section>
    <section class="container w-25 mt-5">
        <div class="card">
            <div class="card-body">
                <form action="AutenticaController?acao=Logar" method="POST">
                    <div class="mb-3">
                        <label for="cpf" class="form-label">CPF</label>
                        <input type="text" class="form-control" id="validationCustom01" required>
                        <div id="emailHelp" class="form-text">Digite seu CPF</div>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Senha</label>
                        <input type="password" class="form-control" id="exampleInputPassword1">
                    </div>
                    <div class="mb-3">
                        <button type="submit" class="btn btn-primary">Entrar</button>
                        <a class="btn btn-primary" href="cadastroPaciente.html" role="button">Casdastro</a>
                    </div>
                </form>
            </div>
        </div>
    </section>
</body>
<script src="../bootstrap/bootstrap.js"></script>
</html>

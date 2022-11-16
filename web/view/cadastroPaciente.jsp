<%-- 
    Document   : cadastroPaciente
    Created on : 13/11/2022, 21:48:24
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-item nav-link active" href="#">Home</a>  
                    </div>
                </div>
            </nav>
        </section>
        <section class="container w-50 mt-5">
            <h1>Cadastro Paciente</h1>
            <div class="card">
                <div class="card-body align-middle">
                    <form class="row g3" action="PacienteController?acao=Incluir" method="POST">
                        <div class="col-sm-12">
                            <label for="nome" class="form-label">Nome do paciente</label>
                            <input type="text" name="nome" class="form-control" required>
                        </div>
                        <div class="col-sm-6">
                            <label for="tipoPlano" class="form-label">Tipo do Plano</label>
                            <input type="text" name="tipoPlano" class="form-control" required>
                        </div>
                        <div class="col-sm-6">
                            <label for="cpf" class="form-label">CPF</label>
                            <input type="text" name="cpf" class="form-control" required>
                        </div>
                        <div class="col-sm-6">
                            <label for="senha" class="form-label">Senha</label>
                            <input type="password" name="senha" class="form-control" required>
                        </div>
                        <div class="d-flex justify-content-center">
                            <button type="submit" class="btn btn-primary mt-3">Finalizar Cadastro</button>
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <script src="../bootstrap/bootstrap.js"></script>
    </body>

</html>

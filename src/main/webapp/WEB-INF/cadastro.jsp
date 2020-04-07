<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Feed Noticias</title>
        <%@ page contentType="text/html; charset=UTF-8" %>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="resources/css/global.css"/>
        <link rel="stylesheet" href="resources/css/cadastro.css"/>
    </head>
    <body>
		<div class="cadastro-container">
            <div class="content">
                <section>
                    <img src="resources/images/logoPrincipal.png" alt="Logo Feed notícias"/>
                    <h1>Cadastrar-se</h1>
                    <p>
                        Cadastrar-se para ter acesso as notícias
                    </p>
                    <a 
                        class="back-link" 
                        href="/feed-noticias/feed"
                    >
                        <i class="material-icons">arrow_back</i>
                        Voltar para home
                    </a> 
                </section>  
                <form>
                    <input
                        type="text"
                        placeholder="Nome"
                        name="nome"
                    >
                    <input 
                        type="email"
                        name="email"
                        placeholder="Email"
                    >
                    <input 
                        type="password" 
                        name="password" 
                        id="password"
                        placeholder="Password"
                    >
                    <button type="submit" class="button"> Cadastrar </button>
                </form>
            </div>
        </div>
    </body>
</html>

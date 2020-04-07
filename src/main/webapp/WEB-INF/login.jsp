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
        <link rel="stylesheet" href="resources/css/global.css"/>
        <link rel="stylesheet" href="resources/css/login.css"/>
    </head>
    <body>
		<div class="login-container">
            <div class="content">
                <section>
                    <img src="resources/images/logoPrincipal.png" alt="Logo Feed notícias"/>
                    <h1>Faça Login</h1>
                </section>  
                <form>
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
                    <button type="submit" class="button">Logar</button>
                </form>
                <a class="back-link" href="/feed-noticias/cadastro">
                    Não possui conta? Cadastra-se já
                </a>
            </div>
        </div>
    </body>
</html>

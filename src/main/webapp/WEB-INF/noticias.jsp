<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="resources/css/global.css"/>
        <link rel="stylesheet" href="resources/css/noticias.css"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    <body>
        <div class="noticias-container">
            <header>
              <a href="/feed-noticias/feed">
                <img src="resources/images/icon.png" alt="logo feed noticias">
              </a>


              <a 
                class="button"
                href="/feed-noticias/feed"
              >
                Sair
              </a>
            </header>
            <section>
                <h1>Notícias</h1>
                <table>
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Nome</td>
                            <td>Ações</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${noticias}" var="noticia">
                            <tr>
                                <td><c:out value="${noticia.id}" /></td>
                                <td><c:out value="${noticia.titulo}" /></td>
                                <td>
                                    <i class="material-icons">update</i>
                                    <i class="material-icons">delete</i>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </section>
        </div>
    </body>
</html>

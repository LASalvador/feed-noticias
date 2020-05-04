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
        <link rel="stylesheet" href="resources/css/admin.css"/>
    </head>
    <body>
        <div class="admin-container">
            <header>
              <img src="resources/images/icon.png" alt="logo feed noticias">

              <span>
                <c:choose>
                  <c:when test="${empty sessionScope.uname}">
                    Bem vindo
                  </c:when>
                  <c:otherwise>
                    Bem vindo, <b><c:out value="${sessionScope.uname}" /></b>
                  </c:otherwise>
              </c:choose>
              </span>

               <a 
                  class="button"
                  href="/feed-noticias/feed"
                >
                  Sair
                </a>
            </header>

            <h1>Painel do administrador</h1>
            <divc class="content">
                <a 
                class="button"
                href="/feed-noticias/noticias"
              >
                Gerenciar noticias
              </a>
              <a 
                class="button"
                href="/feed-noticias/usuarios"
              >
                Gerenciar usuarios
              </a>
            </div>
        </div>
    </body>
</html>

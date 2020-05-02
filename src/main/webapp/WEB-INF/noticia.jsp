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
        <link rel="stylesheet" href="resources/css/noticia.css"/>
    </head>
    <body>
        <div class="noticia-container">
            <header>
              <a href="/feed-noticias/feed">
                <img src="resources/images/icon.png" alt="logo feed noticias">
              </a>
              <c:choose>
                  <c:when test="${empty sessionScope.uname}">
                    <a 
                      class="button"
                      href="/feed-noticias/login"
                    >
                      Logar
                    </a>
                  </c:when>
                  <c:otherwise>
                    <a 
                      class="button"
                      href="/feed-noticias/feed"
                    >
                      Sair
                    </a>
                  </c:otherwise>
                </c:choose>
            </header>
            <section>
                <h1><c:out value="${titulo}" /></h1>
                <c:choose>
                  <c:when test="${empty corpo}">
                      <p>Para ter acesso ao conteudo faça login ou cadastre-se</p>
                      <br>
                      <a 
                        class="button"
                        href="/feed-noticias/login"
                      >
                        Logar
                      </a>
                  </c:when>
                  <c:otherwise>
                    <p>
                      <c:out value="${corpo}" />
                    </p>
                  </c:otherwise>
                </c:choose>
                
            </section>
        </div>
    </body>
</html>

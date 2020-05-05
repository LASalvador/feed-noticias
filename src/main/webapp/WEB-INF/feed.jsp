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
        <link rel="stylesheet" href="resources/css/feed.css"/>
    </head>
    <body>
        <div class="feed-container">
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
                      href="/feed-noticias/sair"
                    >
                      Sair
                    </a>
                  </c:otherwise>
              </c:choose>
            </header>

            <h1>Últimas notícias</h1>
            <ul>
              <c:forEach items="${noticias}" var="noticia">
                <li>
                  <h3><c:out value="${noticia.titulo}" /></h3>
                  <strong>Data:</strong>
                  <p>21/04/2020</p>
  
                  <a 
                    class="button"
                    href="/feed-noticias/noticia?id=${noticia.id}"
                  >
                    Saiba mais
                  </a>
                </li>
                </c:forEach>
            </ul>
        </div>
    </body>
</html>

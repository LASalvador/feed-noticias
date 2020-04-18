<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
        <link rel="stylesheet" href="resources/css/salvar.css"/>
    </head>
    <body>
        <div class="salvar-container">
            <header>
              <a href="/feed-noticias/feed">
                <img src="resources/images/icon.png" alt="logo feed noticias">
              </a>


              <a 
                class="button"
                href="/feed-noticias/login"
              >
                Publicar
              </a>
            </header>
            <section>
                <form action="salvar" method="POST">
                    <input 
                        id="titulo"
                        type="text"
                        placeholder="título da notícia"
                        name="titulo"
                        value="${fn:escapeXml(param.titulo)}"
                        >
                        <textarea
                        id="corpo"
                        placeholder="corpo da notícia"
                        name="corpo"
                        value="${fn:escapeXml(param.corpo)}"
                        
                    ></textarea>
                    <button 
                        type="submit"
                        class="button"
                    >
                        Salvar
                    </button>
                </form>
            </section>
        </div>
    </body>
</html>

# Feed noticias
Feed noticias é um portal de notícias construído com Java, usando Servlet, JSP e JPA com Hibernate. Além disso, utilizou-se HTML5, CSS3, JavaScript e Jquery com  para construção de interfaces. Como ferramenta de build utilizou-se o Gradle. Nele um usuário pode olhar o feed e acessar uma notícia, caso ele não esteja logado não poderá ver o corpo da notícia. Caso ele não tenha conta poderá efetuar cadastro e ter acesso as notícias

## Pre requisitos

* Java (JDK e JRE)
* Gradle
* MySqlServer
 
## Rotas

### Rota:/
#### Método HTTP: GET

Ação: Retorna pagina de index


Parametros: Vazios


Pagina retornada: webapp/index.html



### Rota:/admin
#### Método HTTP: GET


Ação: Retorna pagina de painel de adminstrador


Controller: java/feed/noticias/controller/AdminController.java


Parametros: Vazios


Pagina retornada: webapp/WEB-INF/admin.jsp



### Rota:/cadastro
#### Método HTTP: GET


Ação: Retorna pagina de cadastro


Controller: java/feed/noticias/controller/CadastroController.java

Parametros: Vazios


Pagina retornada: webapp/WEB-INF/admin.jsp



#### Método HTTP: POST


Ação: Realiza o cadastro de um novo usuário


Controller: java/feed/noticias/controller/CadastroController.java


Parametros: Body Params(nome, email, senha)


Rediceriona: webapp/WEB-INF/feed.jsp



### Rota:/feed
#### Método HTTP: GET


Ação: Paga todas a noticias cadastradas e retona para gerar o feed de noticias


Controller: java/feed/noticias/controller/FeedController.java


Parametros: Vazios


Pagina retornada: webapp/WEB-INF/feed.jsp



### Rota:/login
#### Método HTTP: GET


Ação: Retorna pagina de login


Controller: java/feed/noticias/controller/LoginController.java


Parametros: Vazios


Pagina retornada: webapp/WEB-INF/login.jsp



#### Método HTTP: POST


Ação: Realiza o login de um usuário


Controller: java/feed/noticias/controller/LoginController.java


Parametros: Body Params(email, senha)


Rediceriona: se for usuário normal para `webapp/WEB-INF/feed.jsp` se for admin para `webapp/WEB-INF/admin.jsp`

### Rota:/sair
#### Método HTTP: GET


Ação: Limpa a sessão do usuário


Controller: java/feed/noticias/controller/LogoutController.java


Parametros: Vazios


Redireciona: webapp/WEB-INF/feed.jsp



### Rota:/noticia
#### Método HTTP: GET


Ação: Caso o usuário esteja logado traz titulo e corpo de noticia, se não só título.


Controller: java/feed/noticias/controller/NoticiaController.java


Parametros: Query Params(id)


Pagina retornada: webapp/WEB-INF/noticia.jsp



#### Método HTTP: DELETE


Ação: Deleta uma noticia


Controller: java/feed/noticias/controller/

NoticiaController.java
Parametros: Query Params(id)



### Rota:/noticias
#### Método HTTP: GET


Ação: Seleciona e lista todas as noticias disponíveis


Controller: java/feed/noticias/controller/NoticiasController.java


Parametros: Vazio


Pagina retornada: webapp/WEB-INF/noticias.jsp



### Rota:/salvar
#### Método HTTP: GET


Ação: Caso tenho o params(id) retorna o conteudo da noticia com id passado no parametro para ser editado, senão traz tela limpa para cadastrar nova noticia 

Controller: java/feed/noticias/controller/SalvarNoticiasController.java


Parametros: Query Params(id)


Pagina retornada: webapp/WEB-INF/salvar.jsp



#### Método HTTP: POST


Ação: Cadastrar uma nova noticia


Controller: java/feed/noticias/controller/SalvarNoticiasController.java


Parametros: BodyParams(titulo e corpo)



#### Método HTTP: PUT


Ação: Altera uma noticia já existente com id passado por parametro


Controller: java/feed/noticias/controller/SalvarNoticiasController.java


Parametros: Query Params(id) , BodyParams(titulo e corpo)

### Rota:/usuario
#### Método HTTP: GET


Ação: Traz uma pagina com os dados do usuario


Controller: java/feed/noticias/controller/UsuarioController.java


Parametros: Query Params(id)


Pagina retornada: webapp/WEB-INF/usuario.jsp



#### Método HTTP: DELETE


Ação: Deleta o usuario


Controller: java/feed/noticias/controller/UsuarioController.java


Parametros: Query Params(id)



### Rota:/usuarios
#### Método HTTP: GET


Ação: Traz uma lista de todos os usuário cadastrados


Controller: java/feed/noticias/controller/UsuariosController.java


Parametros: Vazio


Pagina retornada: webapp/WEB-INF/usuarios.jsp


## Telas Desktop

### Tela de Inicio
![Tela de Inicio](images/desktop/Desktopinicio.png)

### Tela de Feed Logado
![Tela de Feed Logado](images/desktop/DesktopFeedLogado.png)

### Tela de Feed Deslogado
![Tela de Feed DesLogado](images/desktop/DesktopFeedDeslogado.png)

### Tela de Noticia Deslogado
![Tela de Noticia DesLogado](images/desktop/DesktopNoticiaDeslogado.png)

### Tela de Noticia Logado
![Tela de Noticia Logado](images/desktop/DesktopNoticiaLogado.png)

### Tela de Cadastro
![Tela de Cadastro](images/desktop/Desktopcadastro.png)

### Tela de Login
![Tela de Login](images/desktop/DesktopLogin.png)

### Tela Painel de Admin
![Tela Painel de Admin](images/desktop/DesktopPainelAdmin.png)

### Tela Gerenciar Usuários
![Tela Gerenciar Usuários](images/desktop/DesktopGerenciarUsuarios.png)

### Tela Gerenciar Notícias
![Tela Gerenciar Notícias](images/desktop/DesktopGerenciarNoticias.png)

### Tela Cadastro Notícias
![Tela Cadastro Notícias](images/desktop/DesktopCadastrodeNoticia.png)

### Tela Atualização Notícias
![Tela Atualização Notícias](images/desktop/DesktopAlteracaoNoticia.png)

## Telas mobile

### Tela de Inicio
![Tela de Inicio](images/mobile/MobileInicio.png)

### Tela de Feed Logado
![Tela de Feed Logado](images/mobile/mobileFeedLogado.png)

### Tela de Feed Deslogado
![Tela de Feed DesLogado](images/mobile/mobileFeedDeslogado.png)

### Tela de Noticia Deslogado
![Tela de Noticia DesLogado](images/mobile/mobileNoticiaDeslogado.png)

### Tela de Noticia Logado
![Tela de Noticia Logado](images/mobile/mobileNoticiaLogado.png)

### Tela de Cadastro
![Tela de Cadastro](images/mobile/mobileCadastro.png)

### Tela de Login
![Tela de Login](images/mobile/mobileLogin.png)

### Tela Painel de Admin
![Tela Painel de Admin](images/mobile/mobilePainelAdmin.png)

### Tela Gerenciar Usuários
![Tela Gerenciar Usuários](images/mobile/mobileGerenciarUsuarios.png)

### Tela Gerenciar Notícias
![Tela Gerenciar Notícias](images/mobile/mobileGerenciarNoticias.png)

### Tela Cadastro Notícias
![Tela Cadastro Notícias](images/mobile/mobileCadastrarNoticias.png)

### Tela Atualização Notícias
![Tela Atualização Notícias](images/mobile/mobileAtualizarNoticia.png)










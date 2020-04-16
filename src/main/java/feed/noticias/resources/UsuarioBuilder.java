package feed.noticias.resources;

import feed.noticias.model.Usuario;

public class UsuarioBuilder {
    Usuario usuario;

    public UsuarioBuilder iniciar() {
        this.usuario = new Usuario();
        return this;
    }

    public UsuarioBuilder comNome(String nome) {
        this.usuario.setNome(nome);
        return this;
    }

    public UsuarioBuilder comEmail(String email) {
        this.usuario.setEmail(email);
        return this;
    }

    public UsuarioBuilder comSenha(String senha) {
        this.usuario.setSenha(senha);
        return this;
    }

    public UsuarioBuilder ehAdmin(Boolean admin) {
        this.usuario.setAdmin(admin);
        return this;
    }

    public Usuario criarUsuario() {
        return this.usuario;
    }
}
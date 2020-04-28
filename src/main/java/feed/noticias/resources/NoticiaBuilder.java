package feed.noticias.resources;

import feed.noticias.model.Noticia;

public class NoticiaBuilder {
    Noticia noticia;

    public NoticiaBuilder iniciar() {
        this.noticia = new Noticia();
        return this;
    }

    public NoticiaBuilder comId(Long id){
        this.noticia.setId(id);
        return this;
    }
    
    public NoticiaBuilder comTitulo(String titulo){
        this.noticia.setTitulo(titulo);
        return this;
    }

    public NoticiaBuilder comCorpo(String corpo) {
        this.noticia.setCorpo(corpo);
        return this;
    }

    public Noticia criarNoticia(){
        return this.noticia;
    }
}
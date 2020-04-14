package feed.noticias.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
@Entity
@Table(name = "noticia")
public class Noticia {
    @Id
	@GeneratedValue
    private Long id;
    
    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "corpo", nullable = false)
    private String corpo;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getCorpo() {
        return this.corpo;
    }
}   
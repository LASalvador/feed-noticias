package feed.noticias.model;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "noticia")
public class Noticia {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "corpo", nullable = false)
    private String corpo;

    @Column(name = "data", nullable = false)
    private String data;

    public Noticia() {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        this.data = f.format(data);
    }

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
    
    public String getData() {
        return this.data;
    }
}   
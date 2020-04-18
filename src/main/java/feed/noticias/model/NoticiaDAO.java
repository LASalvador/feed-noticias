package feed.noticias.model;

import java.util.List;

public class NoticiaDAO extends DAO{
    protected static NoticiaDAO instance;

    public NoticiaDAO() {
        super();
    }

    public static NoticiaDAO getInstance(){
        if (instance == null){
           instance = new NoticiaDAO();
        }
         
        return instance;
    }

    public void persist(Noticia noticia) {
        try {
           entityManager.getTransaction().begin();
           entityManager.persist(noticia);
           entityManager.getTransaction().commit();
        } catch (Exception ex) {
           ex.printStackTrace();
           entityManager.getTransaction().rollback();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Noticia> findAll() {
      return entityManager.createQuery("FROM " + 
      Noticia.class.getName()).getResultList();
    }

    public Noticia find(final int id) {
        return entityManager.find(Noticia.class, id);
    }

    public void merge(Noticia noticia) {
        entityManager.getTransaction().begin();
        entityManager.merge(noticia);
        entityManager.getTransaction().commit();
    }
    
    public void removeById(final int id) {
        try {
            Noticia noticia = entityManager.find(Noticia.class, id);
            entityManager.getTransaction().begin();
            entityManager.remove(noticia);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
}
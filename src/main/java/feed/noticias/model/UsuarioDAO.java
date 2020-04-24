package feed.noticias.model;

import java.util.List;

public class UsuarioDAO extends DAO{
    
    protected static UsuarioDAO instance;
    
    public UsuarioDAO() {
        super();
    }

    public static UsuarioDAO getInstance(){
        if (instance == null){
           instance = new UsuarioDAO();
        }
         
        return instance;
    }


    public void persist(final Usuario usuario) {
        try {
           entityManager.getTransaction().begin();
           entityManager.persist(usuario);
           entityManager.getTransaction().commit();
        } catch (final Exception ex) {
           ex.printStackTrace();
           entityManager.getTransaction().rollback();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> findAll() {
      return entityManager.createQuery("FROM " + 
      Usuario.class.getName()).getResultList();
    }

    public Usuario find(final Long id) {
        return entityManager.find(Usuario.class, id);
    }

    public void merge(final Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.merge(usuario);
        entityManager.getTransaction().commit();
    }
    
    public void removeById(final Long id) {
        try {
            final Usuario usuario = entityManager.find(Usuario.class, id);
            entityManager.getTransaction().begin();
            entityManager.remove(usuario);
            entityManager.getTransaction().commit();

        } catch (final Exception ex) {
           ex.printStackTrace();
        }
    }

}
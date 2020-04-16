package feed.noticias.model;

import java.util.List;

public class UsuarioDAO extends DAO{
    
    public UsuarioDAO() {
        super();
    }

    public void persist(Usuario usuario) {
        try {
           entityManager.getTransaction().begin();
           entityManager.persist(usuario);
           entityManager.getTransaction().commit();
        } catch (Exception ex) {
           ex.printStackTrace();
           entityManager.getTransaction().rollback();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> findAll() {
      return entityManager.createQuery("FROM " + 
      Usuario.class.getName()).getResultList();
    }

    public Usuario find(final int id) {
        return entityManager.find(Usuario.class, id);
    }

    public void merge(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.merge(usuario);
        entityManager.getTransaction().commit();
    }
    
    public void removeById(final int id) {
        try {
            Usuario usuario = entityManager.find(Usuario.class, id);
            entityManager.getTransaction().begin();
            entityManager.remove(usuario);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }

}
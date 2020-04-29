package feed.noticias.model;

import java.util.List;

import javax.persistence.Query;

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

    public boolean validate(final String email, final String senha) {
        Usuario usuario = null;
    
        Query query = entityManager.createQuery("FROM " + Usuario.class.getName() + " U WHERE U.email = :email").setParameter("email", email);
        
        usuario = (Usuario) query.getResultList().get(0);
        
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return true;
        }
        
        return false;
    }

    public Usuario findByEmail(final String email) {
        Usuario usuario = null;
        
        Query query = entityManager.createQuery("FROM " + Usuario.class.getName()+ " U WHERE U.email = :email").setParameter("email", email);
        
        usuario = (Usuario) query.getResultList().get(0);
        
        return usuario;
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
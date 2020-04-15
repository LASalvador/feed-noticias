package feed.noticias.model;

/**
 * DAO
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
    protected static DAO instance;
    protected EntityManager entityManager;

    protected DAO() {
        entityManager = getEntityManager();
    }

    public static DAO getInstance(){
        if (instance == null){
           instance = new DAO();
        }
         
        return instance;
      }

      private EntityManager getEntityManager() {
       EntityManagerFactory factory = 
       Persistence.createEntityManagerFactory("feed-noticias");
       if (entityManager == null) {
         entityManager = factory.createEntityManager();
       }

       return entityManager;
      }
}

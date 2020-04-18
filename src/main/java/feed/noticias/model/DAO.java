package feed.noticias.model;

/**
 * DAO
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO {
    protected EntityManager entityManager;

    protected DAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
      EntityManagerFactory factory = 
      Persistence.createEntityManagerFactory("feed_noticias");
      if (entityManager == null) {
        entityManager = factory.createEntityManager();
      }

      return entityManager;
      }
}

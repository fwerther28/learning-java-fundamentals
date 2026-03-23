package theory_concepts.jpa.application;
	
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import theory_concepts.jpa.entities.Pessoa;
	
	public class JpaAppplication {
	
		public static void main(String[] args) {
			
			
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
			EntityManager em = emf.createEntityManager();
			
			Pessoa p = em.find(Pessoa.class, 2);
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
			
			System.out.println("Pronto!");
			em.close();
			emf.close();
			
		}
	}

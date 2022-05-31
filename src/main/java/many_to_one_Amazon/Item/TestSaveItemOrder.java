package many_to_one_Amazon.Item;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveItemOrder {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	 
	Item item1=new Item();
	item1.setName("working table");
	item1.setPrice(5500.125);
	item1.setQuantity(2);

	Item item2=new Item();
	item2.setName("working chair");
	item2.setPrice(4500);
	item2.setQuantity(3);

	Item item3=new Item();
	item3.setName("Dining table");
	item3.setPrice(55000);
	item3.setQuantity(1);
	
	AmazonOrder amazonOrder=new AmazonOrder();
	amazonOrder.setAddress("Muneshwara layout blore");
	amazonOrder.setName("House items");
	 amazonOrder.setStatus("Dispatched");
	 
	 item1.setAmazonOrder(amazonOrder);
	 item2.setAmazonOrder(amazonOrder);
	 item3.setAmazonOrder(amazonOrder);
	 
	 entityTransaction.begin();
	 entityManager.persist(amazonOrder);
	 entityManager.persist(item1);
	 entityManager.persist(item2);
	 entityManager.persist(item3);
	 
	 entityTransaction.commit();
	 
	 }
}

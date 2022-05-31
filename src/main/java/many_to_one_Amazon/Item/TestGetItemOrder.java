package many_to_one_Amazon.Item;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestGetItemOrder {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Item item=entityManager.find(Item.class,1);
	
	if(item!=null) {
		System.out.println(item.getAmazonOrder());
		System.out.println(item.getName());
		System.out.println(item.getPrice());
        System.out.println(item.getQuantity());
	
	}else {
		System.out.println("Hogo magne");
	}
	
}
}

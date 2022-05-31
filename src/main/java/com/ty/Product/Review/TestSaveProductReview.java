package com.ty.Product.Review;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveProductReview {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	 
	
	Product product =new Product();
	product.setBrand("Puma");
	product.setProductName("Mens sport Shoe");
	product.setPrice(7896);
	
	Review review1=new Review();
	review1.setStatus("Like");
	review1.setRating(4);
	
	Review review2=new Review();
	review2.setStatus("Dislike");
	review2.setRating(5);
	
	Review review3=new Review();
	review3.setStatus("Bekaar china maal");
	review3.setRating(3);
	
	review1.setProduct(product);
	review2.setProduct(product);
	review3.setProduct(product);
	 entityTransaction.begin();
	 entityManager.persist(product);
	 entityManager.persist(review1);
	 entityManager.persist(review2);
	 entityManager.persist(review3);
	 
	 entityTransaction.commit();

}
}

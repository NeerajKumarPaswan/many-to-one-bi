package many_to_one_Hospital;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBranchHospital {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	 Branch branch1 =new Branch();
	 branch1.setName("Bannerghatta Road");
	 branch1.setState("Karnataka");
	 branch1.setCountry("India");
	 branch1.setPhone(80258693l);
	 
	 Branch branch2 =new Branch();
	 branch2.setName("Karachi");
	 branch2.setState("Atankwadpur");
	 branch2.setCountry("Pakistan");
	 branch2.setPhone(80258856l);
	 
	 Hospital hospital =new Hospital();
	 hospital.setName("Fortis");
	 hospital.setWeb("www.fortishealth.com");
	 
	 branch1.setHospital(hospital);
	 branch2.setHospital(hospital);
	 
	 
	 entityTransaction.begin();
	 entityManager.persist(hospital);
	 entityManager.persist(branch1);
	 entityManager.persist(branch2);
	 
	 entityTransaction.commit();
	 
	 
}
}

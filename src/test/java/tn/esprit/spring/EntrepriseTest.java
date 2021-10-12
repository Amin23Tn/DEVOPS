package tn.esprit.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.EntrepriseServiceImpl;
import static org.junit.Assert.assertEquals;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 
@RunWith(SpringRunner.class)
@SpringBootTest

public class EntrepriseTest {
	@Autowired
	EntrepriseServiceImpl es;
	@Autowired 
	EntrepriseRepository entrepriseRepository;
	
	
private static final Logger l = LogManager.getLogger(TMission.class);
	
	@Test
	 public void contextLoads() {
		
	}
	/*@Test
	public void testAjouterEntreprise() {
		 
	
		 int a = es.ajouterEntreprise(new Entreprise("esprit","informatique"));
		 assertThat(a).isGreaterThan(0);
			l.info("idEntreprise: " + a);
	
	}*/
	
/*	@Test
	public void verifIdEntreprise() {
	Entreprise entreprise = es.getEntrepriseById(1);
		System.out.println("****************************");
		assertEquals(1,entreprise.getId());
		
		l.info("id: " + entreprise.getId());
		
	}*/
	
	@Test
	public void supprimerEntreprise() {
		 es.deleteEntrepriseById(3);
		System.out.println("**************************");
		assertEquals(3,es);
		 
		l.info("id: " + es);
	}
	

}

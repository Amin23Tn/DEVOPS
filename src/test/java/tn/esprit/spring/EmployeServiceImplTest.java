package tn.esprit.spring;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.services.EmployeServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {

	
	@Autowired
	EmployeServiceImpl esp; 
	
	@Autowired
	EmployeRepository  emprepo; 
	
	
	private static final Logger l = LogManager.getLogger(EmployeServiceImplTest.class);
	
	@Test
	 public void contextLoads() {
		
	}
	
	/*
	@Test
	public void testCreateEmploye() {
		 
	
		 int a = esp.ajouterEmploye(new Employe("ben letaief", "archene", "archene9@gmail.com", true, Role.ADMINISTRATEUR));
		 assertThat(a).isGreaterThan(0);
			l.info("idEmplo: " + a);
	
	}*/
/*
	@Test
	public void verifEmailEmploye() {
		Employe emp = esp.getAllEmployes().get(0);
		System.out.println("****************************");
		assertEquals( "archene15@gmail.com",emp.getEmail());
		assertTrue(emp.getEmail().contains("@"));
		l.info("employe Email: " + emp.getEmail());
		
	}
	*/
	/*
	@Test
	public void getNombreEmploye() {
		int emps = esp.getNombreEmployeJPQL();
		System.out.println("****************************");
		assertTrue(emps > 0);
		l.info("NombreEmploye: " + emps);
	}
	*/
	
	@Test
	public void getAllEmployes() {
		List<Employe> emps = esp.getAllEmployes();
		System.out.println("****************************");
		assertTrue(emps.size() > 0);
		
		l.info("les employes: " + emps);
	}
	/*
	@Test
	public void getAllEmployeNames() {
		List<String> emps = esp.getAllEmployeNamesJPQL();
		System.out.println("****************************");
		assertTrue(emps.size() > 0);
		l.info("Taille: " + emps);
	}*/
	
	/*
	@Test
	public void modifier_emp() {
		 esp.mettreAjourEmailByEmployeId("archene9@gmail.com", 1);
		System.out.println("****************************");
		assertEquals("archene9@gmail.com",esp.getAllEmployes().get(0).getEmail());
		l.info("Email: " + esp.getAllEmployes().get(0).getEmail());
	}
*/
	/*
	@Test
	public void supp_emp() {
		 esp.deleteEmployeById(2);
		System.out.println("****************************");
		assertEquals("archene9@gmail.com",esp.getAllEmployes().get(0).getEmail());
		l.info("nom: " + esp.getAllEmployes().get(0).getNom());
	}*/
	}

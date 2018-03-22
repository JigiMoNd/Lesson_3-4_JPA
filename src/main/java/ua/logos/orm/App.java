package ua.logos.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.orm.entity.Teacher;
import ua.logos.orm.entity.TeacherDetails;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
        
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
    	EntityManager em = factory.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	
//    	Teacher teacher = new Teacher();
//    	teacher.setLogin("teacher_login");
//    	teacher.setPassword("teacher_password");
//    	em.persist(teacher);
    	
//    	Teacher teacher = em.find(Teacher.class, 2);
//    	System.out.println(teacher.getLogin() + " " + teacher.getPassword());
//    	teacher.setLogin("teacher_login_updated_v2");
//    	em.merge(teacher);
//    	
//    	TeacherDetails details = new TeacherDetails();
//    	details.setAge(20);
//    	details.setFirstName("firstName");
//    	details.setLastName("lastName");
//    	details.setHobby("hobby");
//    	em.persist(details);
    	
    	Teacher teacher = new Teacher();
    	teacher.setLogin("login");
    	teacher.setPassword("password_");
    	teacher.setTeacherDetails(new TeacherDetails());
    	em.persist(teacher);
    	
    	em.getTransaction().commit();
    	em.close();
    	factory.close();
    	
    }
}

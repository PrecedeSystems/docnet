package com.docnet.hibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.docnet.util.hibernate.HibernateUtil;

public class Main extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {
    	//String name = request.getParameter("username");
    	//String email = request.getParameter("email");
    	String name = "vikram";
    	String email = "vicky@precedesystems.com";
    	System.out.println("******* WRITE *******");
		Employee empl = new Employee(name,email);
		empl = save(empl);
		PrintWriter out = response.getWriter();
	    out.println( "SimpleServlet Executed" );
	   
	    out.flush();
	    out.close(); 
    }
		
	/*	// Read
		System.out.println("******* READ *******");
		List employees = list();
		System.out.println("Total Employees: " + employees.size());
		
		
		// Write
		System.out.println("******* WRITE *******");
		Employee empl = new Employee("Jack", "Bauer", new Date(System.currentTimeMillis()), "911");
		empl = save(empl);
		empl = read(empl.getId());
		System.out.printf("%d %s %s \n", empl.getId(), empl.getFirstname(), empl.getLastname());
		
		
		
		// Update
		System.out.println("******* UPDATE *******");
		Employee empl2 = read(200L); // read employee with id 1
		System.out.println("Name Before Update:" + empl2.getFirstname());
		empl2.setFirstname("James");
		update(empl2);	// save the updated employee details
		
		empl2 = read(200L); // read again employee with id 1
		System.out.println("Name Aftere Update:" + empl2.getFirstname());
		
		
		// Delete
		System.out.println("******* DELETE *******");
		delete(empl); 
		Employee empl3 = read(empl.getId());
		System.out.println("Object:" + empl3);
		
		PrintWriter out = response.getWriter();
        out.println( "SimpleServlet Executed" );
       
        out.flush();
        out.close();
	}
	
	

	private static List list() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		List employees = session.createQuery("from Employee").list();
		session.close();
		return employees;
	}
	private static Employee read(Long id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Employee employee = (Employee) session.get(Employee.class, id);
		session.close();
		return employee;
	} */
	private static Employee save(Employee employee) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();

		Long id = (Long) session.save(employee);
		employee.setId(id);
		
		session.getTransaction().commit();
		
		session.close();

		return employee;
	
	}

/*	private static Employee update(Employee employee) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();

		session.merge(employee);
		
		session.getTransaction().commit();
		
		session.close();
		return employee;

	}

	private static void delete(Employee employee) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.delete(employee);
		
		session.getTransaction().commit();
		
		session.close();
	}
	
}
*/
	 	
}
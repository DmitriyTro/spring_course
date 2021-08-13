package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Detail.class)
				.buildSessionFactory();

		Session session = null;
		try {
//			session = factory.getCurrentSession();
//			Employee employee = new Employee("Sergey", "Sidorov", "HR", 1500);
//			Detail detail = new Detail("London", "55442212121", "sergeyhr@gmail.com");
//
//			employee.setEmpDetail(detail);
//			detail.setEmployee(employee);
//			session.beginTransaction();
//
//			session.save(detail);
//
//			session.getTransaction().commit();
//			System.out.println("Done!");


//			session = factory.getCurrentSession();
//			session.beginTransaction();
//
//			Detail detail = session.get(Detail.class, 3);
//			System.out.println(detail.getEmployee());
//
//			session.getTransaction().commit();
//			System.out.println("Done!");


			session = factory.getCurrentSession();
			session.beginTransaction();

			Detail detail = session.get(Detail.class, 3);
			session.delete(detail);

			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			session.close();
			factory.close();
		}
	}
}

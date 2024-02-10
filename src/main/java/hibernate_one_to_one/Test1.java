package hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
//        Session session = factory.getCurrentSession();
        try {
                    Session session = factory.getCurrentSession();

            Employee employee = new Employee("Andrei", "Cataraga", "IT", 800);
            Detail detail = new Detail("Chisinau", "07954875", "andreicataraga@gmail.com");
            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//            session = factory.getCurrentSession();
//            Employee employee1 = new Employee("Elena", "Mihailov", "HR", 650);
//            Detail details1 = new Detail("Roma", "068746594", "elena@gmail.com");
//            employee1.setEmpDetail(details1);
            session.beginTransaction();
            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // Assuming you have a Hibernate Session object named 'session'
//            Query<Employee> query = session.createQuery("from Employee", Employee.class);
//            List<Employee> employees = query.getResultList();
//
//            for (Employee emplo : employees) {
//                System.out.println(emplo);
//            }

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee2 = session.get(Employee.class, 9);
//            System.out.println(employee2.getEmpDetail());
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Detail details2 = session.get(Detail.class, 3);
//            session.delete(details2);
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 9);
//            session.delete(employee);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
//            session.close();
            factory.close();
        }
    }
}
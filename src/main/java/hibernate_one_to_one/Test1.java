package hibernate_one_to_one;

import hibernate_test_entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cgf.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
              // Adaugarea obiectelor in baza de date
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Andrei", "Cataraga", "IT", 500);
//            Detail detail = new Detail("Chisinau", "068157232", "andreicataraga@gmail.com");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.set(employee);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


              // Obtinea obiectelor din baza de date
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


            // Eliminarea obiectelor din baza de date
            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");


        } finally {
            session.close();
            factory.close();
        }
    }
}
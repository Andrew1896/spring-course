package hibernate_test_entity;

import javax.security.auth.login.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cgf.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Andrei", "Cataraga", "IT", 1000);
            session.beginTransaction();
            session.save(emp);
            session.beginTransaction().commit();

            int myID = emp.getId();
            session = factory.getCurrentSession();
            session = beginTransaction();
            Employee employee = session.get(Employee.class, myID);
            session = getTransaction().commit();
            System.out.println(employee);


            System.out.println("Done!");

        }
        finally {
            factory.close();
        }
    }
}
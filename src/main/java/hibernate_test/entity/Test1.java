package hibernate_test.entity;

import javax.security.auth.login.Configuration;

public class Test1 {
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

        } finally {
            factory.close();
        }
    }
}
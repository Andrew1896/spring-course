package hibernate_one_to_many_bi_entity;

import hibernate_test.entity.Employee;

import javax.security.auth.login.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cgf.xml")
                .addAnnotatedClass(hibernate_test.entity.Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            hibernate_test.entity.Employee emp = new Employee("Andrei", "Cataraga", "IT", 1000);
            session.beginTransaction();
            session.save(emp);
            session.beginTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
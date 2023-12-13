package hibernate_test.entity;

import javax.security.auth.login.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cgf.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);

            session.createQuery("delete Employee" +
                    "where firstName = 'Alexandr'").executeUpdate();


            session = getTransaction().commit();

            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
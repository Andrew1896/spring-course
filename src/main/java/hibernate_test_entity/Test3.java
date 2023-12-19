package hibernate_test_entity;

import javax.security.auth.login.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cgf.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> emps = session.createQuery("from Employee" +
                            "where name = 'Alexandr' AND salary>650")
                    .getResultList();

            for (Employee e : emps)
                System.out.println(e);

            session = getTransaction().commit();

            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
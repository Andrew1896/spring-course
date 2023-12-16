package hibernate_test_2.entity;

import hibernate_test.entity.Employee;

import javax.security.auth.login.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cgf.xml")
                .addAnnotatedClass(hibernate_test_2.entity.Employee.class)
                .addAnnotatedClass(hibernate_test_2.entity.Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Tudor", "Axinte", "HR", 550);
//            Detail detail = new Detail("Chisinau", "069157762", "tudoraxinte@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.set(employee);
//
//            session.beginTransaction().commit();
//            System.out.println("Done!");


            session = factory.getCurrentSession();

            session.beginTransaction();
            Detail detail =session.get(Detail.class, 4);
            System.out.println(detail.getEmployee());


            session.beginTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            factory.close();
        }
    }
}
package hibernate_one_to_one;

import javax.security.auth.login.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cgf.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
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
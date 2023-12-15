package hibernate_test_2.entity;

import hibernate_test.entity.Employee;

import javax.security.auth.login.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cgf.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Andrei", "Cataraga", "IT", 500);
            Detail detail = new Detail("Chisinau", "068157232", "andreicataraga@gmail.com");

            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.set(employee);


            session.beginTransaction().commit();
            System.out.println("Done!");




        } finally {
            factory.close();
        }
    }
}
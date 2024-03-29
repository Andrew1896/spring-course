package hibernate_one_to_many_uni_entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Ana", "Pusca",  800);
//            Employee emp2= new Employee("Victor", "Plop",  1000);
//
//            dep.adEmployeeToDepartment(emp1);
//            dep.adEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get (Department.class, 3);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


            session = factory.getCurrentSession();

            session.beginTransaction();
            Department department = session.get(Department.class, 4);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
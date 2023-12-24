package hibernate_one_to_many_bi_entity;

import hibernate_test_entity.Employee;

import javax.security.auth.login.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cgf.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("Sales", 300, 1200);
//            Employee emp1 = new Employee("Andrei", "Cataraga",  800);
//            Employee emp2= new Employee("Victor", "Punga",  1000);
//            Employee emp3= new Employee("Alex", "Caruso",  1000);
//
//            dep.adEmployeeToDepartment(emp1);
//            dep.adEmployeeToDepartment(emp2);
//            dep.adEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            ****************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            System.out.println("Get Department");
//            Department department = session.get(Department.class, 4);
//
//            System.out.println("Show Department");
//            System.out.println(department);
//
//            System.out.println("Uploading our employees");
//            department.getEmps().get(0);
//
//            session.beginTransaction().commit();
//
//            System.out.println("Show employees of the department");
//            System.out.println(department.getEmps());
//            System.out.println("Done!");

//            ****************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get (Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(department.getDepartment());
//
//            session.beginTransaction().commit();
//            System.out.println("Done!");

//            ****************************************

            session = factory.getCurrentSession();

            session.beginTransaction();
            Department department = session.get(Department.class, 1);

            session.delete(employee);

            session.beginTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
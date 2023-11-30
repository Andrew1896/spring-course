package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Lancelot");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Artik");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

//        System.out.println("Variabilele se bazaeaza pe unul si acelasi obiect? "
//                + (myDog == yourDog));
//        System.out.println(myDog);
//        System.out.println(myDog);

        context.close();


    }
}
package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

      /*  myDog.setName("Белка");
        yourDog.setName("Стрелка");*/
        System.out.println(myDog == yourDog);
        System.out.println(myDog);
        System.out.println(yourDog);
       /* System.out.println(yourDog.getName() + myDog.getName());*/
    }
}

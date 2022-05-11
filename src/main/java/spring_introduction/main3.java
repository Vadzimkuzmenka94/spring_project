package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getAge() + " " + person.getSurname() );


        context.close();

    }
}

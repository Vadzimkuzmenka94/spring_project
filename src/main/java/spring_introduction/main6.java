package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(myConfig.class);

      Person person = context.getBean("personBean", Person.class);
    person.callYourPet();

      /*  Pet cat = context.getBean("catBean", Pet.class);
        Pet cat1 = context.getBean("catBean", Pet.class);
        cat.say();*/
    }
}

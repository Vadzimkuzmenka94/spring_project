package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component ("personBean")*/
public class Person {
    private Pet pet;
/*    @Value("${person.age}")*/
    private int age;
  /*  @Value("${person.surname}")*/
    private String surname;

    public Pet getPet() {
        return pet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public Person(Pet pet) {
        this.pet = pet;
    }
/*@Autowired*/
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet () {
        System.out.println("Hello Pet");
        pet.say();
    }
}

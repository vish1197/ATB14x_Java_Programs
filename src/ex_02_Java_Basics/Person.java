package ex_02_Java_Basics;

import java.sql.SQLOutput;

public class Person {
    public static void main(String[] args) {
        Person person1 = new Person(); {
            System.out.println("Name=john, Age=25");

        }
        Person person2=new Person();{
            System.out.println("Name=Alice, Age=30");

        }
        System.out.println(person1);
        System.out.println(person2);

    }
}

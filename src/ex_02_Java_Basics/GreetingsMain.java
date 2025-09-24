package ex_02_Java_Basics;

public class GreetingsMain {

    public static void main(String[] args){
        Greetings gr=new Greetings();
        gr.m1(); //1



        String s=gr.m2();//2
        System.out.println(s);

        gr.m3("Vishal");

    }
}

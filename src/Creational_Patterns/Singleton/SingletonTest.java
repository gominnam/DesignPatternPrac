package Creational_Patterns.Singleton;

public class SingletonTest {
    public static void main(String[] args){

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        /*
        Examples of Creational_Patterns.Singleton in general usages

        1. Runtime.getRuntime();
        2. Spring Beans
        3. Logger

         */
    }
}

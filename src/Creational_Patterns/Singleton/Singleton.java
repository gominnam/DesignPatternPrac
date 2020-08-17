package Creational_Patterns.Singleton;

public class Singleton {
    // volatile AND synchronized are used for MultiThread secure
    private static volatile Singleton instance = null; // volatile is saving variable in main memory

    private Singleton(){};

    public static  Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }


}

package Singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                Singleton instance = Singleton.getInstance();

                //Singleton 인스턴스 해시코드 값이 같은지 확인
                System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
            }
        };

        // 두 개의 스레드 생성
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        // 스레드 시작
        thread1.start();
        thread2.start();
    }
}

/*
- Runnable Inteface

@FunctionalInterface
public interface Runnable {
    void run(); //thread 가 실행될 때 호출되는 매서드.
}

 */

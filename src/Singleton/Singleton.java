package Singleton;

public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
/*

- non-volatile 변수는 JVM이 메인 메모로부터 CPU 캐시로 읽거나 CPU 캐시에서 메인 메모리로 데이터를 쓸 경우 어떠한 보장도 하지 않는다.

- volatile 키워드를 변수에 사용하게 되면 이 변수에 대한 쓰기 작업은 즉각 메인 메모리로 이루어지, 읽기작업 또한 메인 메모리로부터 다이렉트로 이루어진다.

>> 멀티쓰레드 환경에서 non-volatile 변수는 언제 CPU 캐시에서 메인메모리에 쓰일지 보장이 안되기 때문에 스레드마다 다른 값을 갖는 문제가 발생 할 수 있다.
   이를 해결하기 위해 volatile 키워드를 사용한다.

>> volatile 키워드는 메인 메모리로 부터 수행하는 것을 보장할지라도 멀티쓰레드 환경에서 변수의 값을 읽고 쓰는 것은 원자적으로 이루어지지 않는다.
   즉, volatile 키워드는 멀티쓰레드 환경에서 변수의 값을 읽고 쓰는 것을 보장하지만, 변수의 값을 읽고 쓰는 것은 원자적으로 이루어지지 않는다.

- 위의 원자성을 보장하기에 `Syncronized` 키워드를 사용한다.
  변수를 읽고 쓸 때 volatile 선언은 변수에 접근하는 쓰레드들을 블록시키지 않는다. 이런 임계 영역에는 synchronized 키워드가 필요하다.
 */

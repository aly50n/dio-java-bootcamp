import dio.bootcamp.gof.SingletonEager;
import dio.bootcamp.gof.SingletonLazy;
import dio.bootcamp.gof.SingletonLazyHolder;

public class App {
    public static void main(String[] args) throws Exception {

        //Testes relacionados ao Design Parttern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Lazy: "+ lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println("Lazy: "+lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Eager: "+eager);
        eager = SingletonEager.getInstancia();
        System.out.println("Eager: "+eager);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("LazyHolder: "+lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("LazyHolder: "+lazyHolder);
    }
}

import dio.bootcamp.gof.facade.Facade;
import dio.bootcamp.gof.singleton.SingletonEager;
import dio.bootcamp.gof.singleton.SingletonLazy;
import dio.bootcamp.gof.singleton.SingletonLazyHolder;
import dio.bootcamp.gof.strategy.Comportamento;
import dio.bootcamp.gof.strategy.ComportamentoAgressivo;
import dio.bootcamp.gof.strategy.ComportamentoDefensivo;
import dio.bootcamp.gof.strategy.ComportamentoNormal;
import dio.bootcamp.gof.strategy.Robo;

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

        //Testes relacionados ao Design Parttern Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamentoStrategy(normal);
        robo.mover();

        robo.setComportamentoStrategy(agressivo);
        robo.mover();

        robo.setComportamentoStrategy(defensivo);
        robo.mover();

        //Testes relacionados ao Design Parttern Facade

        Facade facade = new Facade();

        facade.migrarCliente("Alyson", "14801788");

    }
}

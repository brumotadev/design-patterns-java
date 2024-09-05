

import design.pattern.singleton.SingletonEager;
import design.pattern.singleton.SingletonLazy;
import design.pattern.singleton.SingletonLazyHolder;
import design.pattern.strategy.Comportamento;
import design.pattern.strategy.ComportamentoAgressivo;
import design.pattern.strategy.ComportamentoDefensivo;
import design.pattern.strategy.ComportamentoNormal;
import design.pattern.strategy.Robo;

public class Test {

    public static void main(String[] args) {


        // Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        // Strategy - usa bastante do conceito do polimorfismo
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        
    }
}

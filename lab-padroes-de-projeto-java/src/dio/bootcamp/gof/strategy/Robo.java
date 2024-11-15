package dio.bootcamp.gof.strategy;

public class Robo {

    private Comportamento comportamentoStrategy;

    public void setComportamentoStrategy(Comportamento comportamento){
        this.comportamentoStrategy = comportamento;
    }

    public void mover(){
        comportamentoStrategy.mover();
    }


}

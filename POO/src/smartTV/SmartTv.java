package smartTV;
public class SmartTv {
    
    private boolean ligada = false;
    private int volume = 50;
    private int canal = 1;


    public void setLigarTV(){
        this.ligada = true;
    }

    public void setDesligarTV(){
        this.ligada = false;
    }

    public void setAumentarVolume(){
        if(volume == 100){
            System.out.println("100 - O volume está no máximo");
        }
        else{
            this.volume++;
        } 
    }

    public void setDiminuirVolume(){
        if(volume == 0){
            System.out.println("0 - O volume está no mínimo");
        }
        else{
            this.volume--;
        }
    }

    public void diminuirCanal(int canal){
        if(canal == 1){
            this.canal = 100; //canal máximo == 100, ao diminuir vai rotar para o maior canal.
        }
        else{
            this.canal--;
        }
    }

    public void aumentarCanal(int canal){
        if(canal == 100){
            this.canal = 1; //canal máximo == 100, ao aumentar vai rotar para o menor canal.
        }
        else{
            this.canal++;
        }
    }

    public void setCanal(int canal){
        if(canal > 100){
            this.canal = 100; //canal maximo == 100.
        }
        else if(canal < 1) {
            this.canal = 1; //canal minimo == 1.
        }
        else{
            this.canal = canal;
        }    
    }

    public boolean getEstadoTV(){
        return this.ligada;
    }

    public int getCanal(){
        return this.canal;
    }

    public int getVolume(){
        return this.volume;
    }
}

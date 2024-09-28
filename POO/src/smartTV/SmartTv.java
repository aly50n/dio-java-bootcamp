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

    public void setCanal(int canal){
        this.canal = canal;
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

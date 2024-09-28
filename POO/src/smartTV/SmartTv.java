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
        if(ligada == true){
            if(volume == 100){
                System.out.println("100 - O volume está no máximo");
            }
            else{
                this.volume++;
            } 
        }
        else{
            System.out.println("A TV está desligada.");
        }
    }

    public void setDiminuirVolume(){
        if(ligada == true){
            if(volume == 0){
                System.out.println("0 - O volume está no mínimo");
            }
            else{
                this.volume--;
            }
        }
        else{
            System.out.println("A TV está desligada.");
        }
    }

    public void diminuirCanal(){
        if(ligada == true){
            if(canal == 1){
                this.canal = 100; //canal máximo == 100, ao diminuir vai rotar para o maior canal.
            }
            else{
                this.canal--;
            }
        }
        else{
            System.out.println("A TV está desligada.");
        }
    }

    public void aumentarCanal(){
        if(ligada == true){
            if(canal == 100){
                this.canal = 1; //canal máximo == 100, ao aumentar vai rotar para o menor canal.
            }
            else{
                this.canal++;
            }
        }
        else{
            System.out.println("A TV está desligada.");
        }
    }

    public void setCanal(int canal){
        if(ligada == true){
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
        else{
            System.out.println("A TV está desligada.");
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

    public void getStatusTV(){
        System.out.println("==================STATUS===================");
        System.out.println("A TV está ligada? "+ this.getEstadoTV());
        System.out.println("O canal atual da TV é: "+ this.getCanal());
        System.out.println("O volume da TV está: "+ this.getVolume());
        System.out.println("===========================================");
    }
}

public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++ ;
    }

    public void reduzirVolume(){
        volume -- ;
    }

    public void proximoCanal(){
        canal ++ ;
    }

    public void reduzirCanal(){
        canal -- ;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}

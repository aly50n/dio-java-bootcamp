package smartTV;

public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirCanal();
        smartTv.getStatusTV();
        smartTv.setLigarTV();
        smartTv.aumentarCanal();
        smartTv.getStatusTV();
        smartTv.setAumentarVolume();
        smartTv.getStatusTV();
        smartTv.setDesligarTV();
        smartTv.getStatusTV();
    }
}

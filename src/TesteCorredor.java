import java.util.Random;
public class TesteCorredor {
    public static void main (String[] args){ 
    	Random random = new Random();
        Thread mainThread = Thread.currentThread();
        Thread corredor1 = new Thread(new Corredor(mainThread, random.nextInt(250)), "senna");
        Thread corredor2 = new Thread(new Corredor(mainThread, random.nextInt(150)), "Barrichello");
        Thread corredor3 = new Thread(new Corredor(mainThread, random.nextInt(70)), "Mansell");
        Thread corredor4 = new Thread(new Corredor(mainThread, random.nextInt(55)), "Piquet");
        Thread corredor5 = new Thread(new Corredor(mainThread, random.nextInt(100)), "Hilll");
        
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        corredor5.start();
        
        System.out.println("Comecou !!!!");
    }
}

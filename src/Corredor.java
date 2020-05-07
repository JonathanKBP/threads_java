public class Corredor implements Runnable{

    private double distanciaTotalDaCorrida = 500;
    private double distanciaTotalPercorrida = 0;
    private int max = 0;
    private Thread mainThread;
      
    
    public Corredor (Thread mainThread,int  maximo){
        this.mainThread = mainThread;
        max = maximo;
    }
    
    @Override
    public void run() {
        
        try{
            mainThread.join();
        }catch(InterruptedException el){
            el.printStackTrace();
        }
        
        while(distanciaTotalPercorrida < distanciaTotalDaCorrida){
            distanciaTotalPercorrida += Math.random() * max;
            System.out.printf("%s: %.2fm \n", Thread.currentThread().getName(), distanciaTotalPercorrida);
            if(distanciaTotalPercorrida > distanciaTotalDaCorrida)
                System.out.println(Thread.currentThread().getName() + " acabou");
            try{
                Thread.sleep(2000 + (int)Math.random() * 10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
    
}

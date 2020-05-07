public class MinhaPrimeiraThread extends Thread{
    public void run(){
        System.out.println("Estou sendo executado por uma thread diferente da principal, veja: " + 
                Thread.currentThread().getName());
        m();
    }
    
    public void m(){}
}

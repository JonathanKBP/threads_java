public class Teste {
    public static void main(String[] args){
        MinhaPrimeiraThread thread = new MinhaPrimeiraThread();
        //thread.run(); chamar o metodo run não cria uma nova thread 
        //devermos chamar o metodo start
        
        for(int i=0; i<10; i++){
            new MinhaPrimeiraThread().start();
        }
        
        //thread.start();
        System.out.println("no main:" + Thread.currentThread().getName());
    }
}

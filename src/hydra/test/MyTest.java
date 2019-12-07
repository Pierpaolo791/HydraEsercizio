package hydra.test;

import hydra.thread.eroi.EroiFactory;

public class MyTest {
    
    public void test01() {
        // Vediamo se l'interfaccia 
        Thread t0 = new Thread(EroiFactory.getGuaritore());
        Thread t1 = new Thread(EroiFactory.getGuerriero());
        t0.start();
        t1.start();
        t0.stop();
        t0.stop();
        
    }
}

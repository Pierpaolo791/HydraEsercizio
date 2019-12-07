package hydra.test;

import hydra.thread.eroi.Guaritore;
import hydra.thread.eroi.Guerriero;

public class MyTest {
    
    public void test01() {
        // Vediamo se l'interfaccia 
        Thread t0 = new Thread(new Guerriero());
        Thread t1 = new Thread(new Guaritore());
        t0.start();
        t1.start();
        t0.stop();
        t0.stop();
        
    }
}

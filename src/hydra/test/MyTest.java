package hydra.test;

import hydra.hydra.Hydra;
import hydra.hydra.Testa;
import hydra.thread.eroi.EroiFactory;

public class MyTest {
    
    public void test01() {
        // Vediamo se l'interfaccia funziona bene
        Thread t0 = new Thread(EroiFactory.getGuaritore());
        Thread t1 = new Thread(EroiFactory.getGuerriero());
        t0.start();
        t1.start();
        t0.stop();
        t0.stop();
    }
    public void test02() {
        // Test Singleton
        Hydra h = Hydra.getHydra();
        Hydra h2 =  Hydra.getHydra();
        Hydra h3 =  Hydra.getHydra();
        // Possiamo notare da questo test che viene creato una sola istanza, quindi il Singleton funziona.
    }
}

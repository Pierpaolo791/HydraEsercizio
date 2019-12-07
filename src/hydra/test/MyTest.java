package hydra.test;

import hydra.hydra.Hydra;
import hydra.hydra.Testa;
import hydra.thread.eroi.EroiFactory;

public class MyTest {
    

    public void test02() {
        // Test Singleton
        Hydra h = Hydra.getHydra();
        Hydra h2 =  Hydra.getHydra();
        Hydra h3 =  Hydra.getHydra();
        // Possiamo notare da questo test che viene creato una sola istanza, quindi il Singleton funziona.
    }
}

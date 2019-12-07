
package hydra.hydra;

import java.util.Arrays;
import java.util.List;

public class Hydra {
    
    private static Hydra hydra;
    private List<Testa> teste;
    

    private Hydra() {
        init(); 
    }
    
    public static Hydra getHydra() {
        if (hydra == null) 
            hydra = new Hydra();
        return hydra;
    }

    private void init() {
        System.out.println("Viene generato l'Hydra...");
        genTeste(); 
    }
    private void genTeste() {
        teste = Arrays.asList(
           new Testa(),
           new Testa(),
           new Testa(),
           new Testa(),
           new Testa(),
           new Testa()
        );
    }
}

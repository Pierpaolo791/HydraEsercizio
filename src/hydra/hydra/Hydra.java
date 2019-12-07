
package hydra.hydra;

public class Hydra {
    
    private static Hydra hydra = null;

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
        
    }
}

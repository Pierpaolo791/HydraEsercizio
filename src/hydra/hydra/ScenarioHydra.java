package hydra.hydra;

import hydra.thread.eroi.Guerriero;
import hydra.thread.eroi.Spada;
import java.util.Optional;


public class ScenarioHydra {
    
    private final Hydra hydra;

    public ScenarioHydra(Hydra hydra) {
        this.hydra = hydra;
    }
    
    public synchronized boolean executeAttacco(Guerriero g) {
        Optional<Testa> testaAlive = hydra.getFirstTestaIsAlive();
        Spada spada = g.afferraSpada();
        if (testaAlive.isPresent()) {
            System.out.println(" Tenta di attaccare l'Hydra con la spada "+ spada);
            if (testaAlive.get().isVulnerable(spada)) {
                System.out.println(" E' debole all'arma! Sconfigge la testa!");
                testaAlive.get().setAlive(false);
            }
            else {
                System.out.println("Oh, il guerriero corrente viene sconfitto!");
                try {
                    wait();
                } catch (InterruptedException ex) {
                   
                }
            }
            return true;
        }
        else {
            System.out.println("L'Hydra è stato sconfitto.");
            return false;
        } 
    }
}

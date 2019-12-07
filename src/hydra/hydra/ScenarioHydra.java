package hydra.hydra;

import hydra.thread.eroi.Guerriero;
import hydra.thread.eroi.Spada;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ScenarioHydra {
    
    private final Hydra hydra;

    public ScenarioHydra() {
        hydra = Hydra.getHydra();
    }
    
    public synchronized boolean executeAttacco(Guerriero g) {
        Optional<Testa> testaAlive = hydra.getFirstTestaIsAlive();
        Spada spada = g.afferraSpada();
        if (testaAlive.isPresent()) {
            System.out.println (" Il guerriero "+ g.getNome() +" prova ad attaccare l'Hydra...");
            System.out.println("\tTenta di attaccare l'Hydra con la spada "+ spada);
            if (testaAlive.get().isVulnerable(spada)) {
                System.out.println("\tE' debole all'arma! Sconfigge la testa!");
                testaAlive.get().setAlive(false);       
            }
            else {
                System.out.println("\tOh, il guerriero corrente viene sconfitto!");
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ScenarioHydra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return true;
            
        }
        else {
            System.out.println("L'Hydra è stato sconfitto.");
            return false;
        } 
    }
    
    public synchronized boolean executeCura() {
        Optional<Testa> testaAlive = hydra.getFirstTestaIsAlive();
        if(testaAlive.isPresent()) {
            notifyAll();
            return true;
        }  
        else return false;
            
    }

}

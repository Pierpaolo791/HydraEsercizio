package hydra.thread.eroi;

import hydra.hydra.ScenarioHydra;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Guerriero implements Eroe{
    
    private final ScenarioHydra scenario;
    private final String nome; 
    Guerriero(ScenarioHydra scenario, String nome) {
        this.scenario = scenario;
        this.nome = nome;
    }
    @Override
    public void run() {
        boolean stateHydra = true; 
        while(stateHydra) {
            
            stateHydra = scenario.executeAttacco(this);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
               
            }
        }
        System.out.println("Mi vado a prendere un birra...");
        
    }
    
    public Spada afferraSpada() {
        return FactorySpada.getRandomSpada();
    }
    public String getNome() {
        return nome;
    }
}

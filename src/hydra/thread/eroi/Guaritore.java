package hydra.thread.eroi;

import hydra.hydra.ScenarioHydra;

public class Guaritore implements Eroe {
    private ScenarioHydra scenario;
    Guaritore(ScenarioHydra scenario) {
        this.scenario = scenario;
    }
    
    @Override
    public void run() {
        boolean stateHydra = true; 
        while (stateHydra) {
            try {
                Thread.sleep(1000);
                System.out.println("Interviene il curatore..");
                stateHydra = scenario.executeCura();
                
            } catch (InterruptedException ex) {
                
            }
            
        }
        System.out.println("Vado a casa...");
    }
    
}

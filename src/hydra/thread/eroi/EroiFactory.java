package hydra.thread.eroi;

import hydra.hydra.ScenarioHydra;

public class EroiFactory {
    
    public static Guerriero getGuerriero(ScenarioHydra scenario, String nome) {
        return new Guerriero(scenario, nome);
    }
    
    public static Guaritore getGuaritore(ScenarioHydra scenario) {
        return new Guaritore(scenario);
    }
}

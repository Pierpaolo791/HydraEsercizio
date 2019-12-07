package hydra.thread.eroi;

import hydra.hydra.ScenarioHydra;

public class Guerriero implements Eroe{
    
    private final ScenarioHydra scenario;
    private final String nome; 
    Guerriero(ScenarioHydra scenario, String nome) {
        this.scenario = scenario;
        this.nome = nome;
    }
    @Override
    public void run() {
        
        System.out.println (" Il guerriero "+ nome +" prova ad attaccare l'Hydra...");
        scenario.executeAttacco(this);
        
    }
    
    public Spada afferraSpada() {
        return FactorySpada.getRandomSpada();
    }
}

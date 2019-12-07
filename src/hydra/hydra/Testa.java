package hydra.hydra;

import hydra.thread.eroi.Spada;

public class Testa {
    
    private final Spada vulnerable;
    private boolean alive;
    
    public Testa() {
        vulnerable = FactorySpada.getRandomSpada();
        alive = true;
        System.out.println("Testa debola alla spada: "+vulnerable);
    }

    public boolean isVulnerable(Spada spada) {
        return spada == vulnerable;
    }
    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
}

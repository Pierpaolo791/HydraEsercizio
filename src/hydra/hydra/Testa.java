package hydra.hydra;

import hydra.thread.eroi.Spada;
import java.util.Random;

public class Testa {
    
    private Spada vulnerable;
    private boolean alive;
    
    public Testa() {
        genRandomVulnerable();
        alive = true;
        System.out.println("Testa debola alla spada: "+vulnerable);
    }

    private void genRandomVulnerable() {
        int rand = ((new Random().nextInt()) & Integer.MAX_VALUE) % 3;
        vulnerable = Spada.values()[rand];
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

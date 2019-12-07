package hydra.hydra;

import hydra.thread.eroi.Spada;
import java.util.Random;

public class FactorySpada {
    private Spada getRandomSpada() {
        int rand = ((new Random().nextInt()) & Integer.MAX_VALUE) % 3;
        return Spada.values()[rand];
    }
}

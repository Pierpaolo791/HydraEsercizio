package hydra.thread.eroi;

public class EroiFactory {
    public static Guerriero getGuerriero() {
        return new Guerriero();
    }
    public static Guaritore getGuaritore() {
        return new Guaritore();
    }
}

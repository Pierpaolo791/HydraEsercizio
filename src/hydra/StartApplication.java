package hydra;

import hydra.hydra.ScenarioHydra;
import hydra.test.MyTest;
import hydra.thread.eroi.EroiFactory;

public class StartApplication {

    public static void main(String[] args) {
        testSuite(); 
        ScenarioHydra scenario = new ScenarioHydra();
        
        Thread guerriero1 = new Thread(EroiFactory.getGuerriero(scenario, "Guerriero Fortissimo"));
        Thread guerriero2 = new Thread(EroiFactory.getGuerriero(scenario, "Guerriero Meno Fortissimo"));
        guerriero1.start();
        guerriero2.start();
        Thread guaritore = new Thread(EroiFactory.getGuaritore(scenario));
        guaritore.start();
    }

    private static void testSuite() {
        MyTest tests = new MyTest(); 
        //tests.test01();
        tests.test02();
    }
    
}

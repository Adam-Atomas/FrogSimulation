//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean sim(){
        FrogSimulation sim = new FrogSimulation(24, 5);
        return sim.simulate();
    }
    public static double RunSim(){
        FrogSimulation RunSim = new FrogSimulation(24, 5);
        return RunSim.runSimulations(400);
    }
    public static void main(String[] args) {
        System.out.println(RunSim());
    }

    }
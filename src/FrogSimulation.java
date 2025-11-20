public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops){
        if (dist>0 && numHops>0) {
            goalDistance = dist;
            maxHops = numHops;
        }
    }
    private int hopDistance(){
        int sign;
        if (Math.random()>=0.5){
            sign= -1;
        }
        else{
            sign = 1;
        }
    return (sign)*(int)(Math.random()*(goalDistance+1));
    }
    public boolean simulate(){
        int FinalPos=0;
    for (int i=1; i<=maxHops; i++){
        int HopDist = hopDistance();
        FinalPos+= HopDist;
        if (FinalPos>=goalDistance){
            return true;
        }
    }
    return false;
    }
    public double runSimulations(int num) {
        if (num > 0) {
            int TimesTrue = 0;
            for (int i = 1; i <= num; i++) {
                if (simulate() == true) {
                    TimesTrue += 1;
                }
            }
            return (TimesTrue / num);
        }
        else {
            return 0.0;
        }
    }
}

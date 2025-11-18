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
        System.out.print(HopDist+" ");
        if (FinalPos>=goalDistance){
            System.out.print("Final:"+FinalPos+" ");
            return true;
        }
    }
    System.out.print("Final:"+FinalPos+" ");
    return false;
    }
}

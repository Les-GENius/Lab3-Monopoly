public class Cup {

    private Die[] dies;
    private int total;

    Cup(int nbDies){
        dies = new Die[nbDies];

        for(int i = 0; i < nbDies; ++i){
            dies[i] = new Die();
        }
    }

    public void roll(){

        total = 0;
        for(Die d: dies){
            d.roll();
            total += d.getFaceValue();
        }
    }

    public int getTotal(){
        return total;
    }
}

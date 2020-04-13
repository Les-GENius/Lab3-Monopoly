import java.util.Random;

public class Die {
<<<<<<< HEAD
    int faceValue;
    private Random random = new Random();
    private static final int nbFaces = 6;

    public void roll(){
        faceValue = random.nextInt(nbFaces)+1;
    }

    public int getFaceValue(){
=======

    private int faceValue;
    private static Random random = new Random();
    private static int nbFaces = 6;


    public void roll(){
        faceValue = random.nextInt(nbFaces) + 1;
    }

    public int getFaceValue() {
>>>>>>> b587a2f8e297fe54eb5fd48bdc87ca8dc4066bb4
        return faceValue;
    }
}

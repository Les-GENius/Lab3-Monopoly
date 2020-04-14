import java.util.Random;

public class Die {

    private int faceValue;
    private static Random random = new Random();
    private static int nbFaces = 6;


    public void roll(){
        faceValue = random.nextInt(nbFaces) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
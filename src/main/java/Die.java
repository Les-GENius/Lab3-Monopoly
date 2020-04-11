import java.util.Random;

public class Die {
    int faceValue;
    private Random random = new Random();
    private static final int nbFaces = 6;

    public void roll(){
        faceValue = random.nextInt(nbFaces+1);
    }

    public int getFaceValue(){
        return faceValue;
    }
}

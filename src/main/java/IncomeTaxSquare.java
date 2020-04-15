import static java.lang.Integer.min;

public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        double w = p.getNetWorth();
        p.reduceCash(min(200, (int) (0.1*w)));
    }
}

public class GoSquare extends Square {
    static final int CASH_INCOME = 200;

    public GoSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        p.addCash(CASH_INCOME);
    }
}

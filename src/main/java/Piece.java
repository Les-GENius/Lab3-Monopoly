public class Piece {
    private String name;
    private Square location;

    public Piece(String name) {
        this.name = name;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}

public abstract class Square {
    String name;

    public Square(String name){
        this.name = name;
    }

    public String toString(){
        return  name;
    }

 abstract public void landedOn(Player p);
}

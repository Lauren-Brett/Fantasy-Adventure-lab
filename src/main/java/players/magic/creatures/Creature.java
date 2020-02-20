package players.magic.creatures;

public abstract class Creature {
    //idefenale

    private String name;
    private int defendValue;


    public Creature(String name, int defendValue){
        this.defendValue = defendValue;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDefendValue() {
        return defendValue;
    }
}

package players.attackers;

public class Weapon {

    private String name;
    private int attackValue;

    public Weapon(String name, int attackValue){
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }
}

package players.healers;

public class HealingItem {

    private String type;
    private int healValue;

    public HealingItem(String type, int healValue){
        this.healValue = healValue;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getHealValue() {
        return healValue;
    }
}

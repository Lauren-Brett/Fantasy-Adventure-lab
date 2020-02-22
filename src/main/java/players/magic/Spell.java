package players.magic;

public class Spell {

    private String type;
    private int spellEffect;


    public Spell(String type, int spellEffect){
        this.spellEffect = spellEffect;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getSpellEffect() {
        return spellEffect;
    }


}

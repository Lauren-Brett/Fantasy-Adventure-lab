package players.magic;

public class Spell {

    private String type;
    private String spellEffect;


    public Spell(String type, String spellEffect){
        this.spellEffect = spellEffect;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getSpellEffect() {
        return spellEffect;
    }
}

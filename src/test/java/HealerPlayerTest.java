import enemies.Enemy;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.attackers.Dwarf;
import players.attackers.Weapon;
import players.healers.Cleric;
import players.healers.HealingItem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class HealerPlayerTest {

    private Cleric cleric;
    private HealingItem healingItem;
    private Dwarf dwarf;
    private Weapon weapon;
    private Troll troll;


    @Before
    public void before(){
        weapon = new Weapon("Club", 2);
        dwarf = new Dwarf("Dwain", weapon);
        healingItem = new HealingItem("Potion", 5);
        cleric = new Cleric("Dolly", healingItem);
        troll = new Troll("Brad", 6, 8);
        }



    @Test
    public void canGetHealingItemFromCleric(){
        assertEquals(healingItem, cleric.getHealingItem());
    }

    @Test
    public void canGetHealValue(){
        assertEquals(5, healingItem.getHealValue());
    }

    @Test
    public void canHealPlayer(){
        troll.attack(dwarf);
        cleric.heal(dwarf);
        assertEquals(7, dwarf.getHealthPoints());
    }


}

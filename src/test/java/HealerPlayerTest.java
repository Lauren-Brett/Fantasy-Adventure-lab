import org.junit.Before;
import org.junit.Test;
import players.healers.Cleric;
import players.healers.HealingItem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class HealerPlayerTest {

    private Cleric cleric;
    private HealingItem healingItem;


    @Before
    public void before(){
        healingItem = new HealingItem("Potion", 5);
        cleric = new Cleric("Dolly", healingItem);
    }

    @Test
    public void canGetHealingItemFromCleric(){
        assertEquals(healingItem, cleric.getHealingItem());
    }

    @Test
    public void canGetHealValue(){
        assertEquals(5, healingItem.getHealValue());
    }
}

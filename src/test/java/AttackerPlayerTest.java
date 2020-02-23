import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.attackers.Barbarian;
import players.attackers.Weapon;

import static org.junit.Assert.assertEquals;

public class AttackerPlayerTest {

    private Barbarian barbarian;
    private Weapon weapon;
    private Troll troll;

    @Before
        public void before(){
        weapon = new Weapon("Club", 5);
        barbarian = new Barbarian("Bob", weapon);
        troll = new Troll("Stanly", 5, 7);
    }

    @Test
    public void hasWeapon(){
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(5, weapon.getAttackValue());
    }

    @Test
    public void canAttackEnemy(){
        barbarian.attackEnemy(troll);
        assertEquals(0, troll.getHealthPoints());
    }

    @Test
    public void canKillPlayer(){
        troll.attackPlayer(barbarian);
        troll.attackPlayer(barbarian);
        assertEquals(false, barbarian.getAlive());
    }





}

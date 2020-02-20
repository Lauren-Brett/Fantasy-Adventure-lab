import enemies.Enemy;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.attackers.Barbarian;
import players.attackers.Weapon;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class AttackerPlayerTest {

    private Barbarian barabarian;
    private Weapon weapon;
    private Troll troll;

    @Before
        public void before(){
        weapon = new Weapon("Club", 5);
        barabarian = new Barbarian("Bob", weapon);
        troll = new Troll("Stanly", 5, 7);
    }

    @Test
    public void hasWeapon(){
        assertEquals(weapon, barabarian.getWeapon());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(5, weapon.getAttackValue());
    }

    @Test
    public void canAttackEnemy(){
        barabarian.attack(troll);
        assertEquals(0, troll.getHealthPoints());
    }





}

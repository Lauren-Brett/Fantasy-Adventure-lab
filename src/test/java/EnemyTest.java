import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.attackers.Knight;
import players.attackers.Weapon;
import players.magic.Wizard;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Orc orc;
    private Knight knight;
    private Weapon weapon;
    private Wizard wizard;

    @Before
    public void before(){
        orc = new Orc("Ron", 6, 3);
        weapon = new Weapon("Sword", 3);
        knight = new Knight("Steve", weapon);
        wizard = new
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(6, orc.getHealthPoints());
    }

    @Test
    public void canAttackPlayer(){
        orc.attack(knight);
        assertEquals(7, knight.getHealthPoints());
    }

    @Test
    public void attacksPlayerWithDefendingCreature(){

    }


}



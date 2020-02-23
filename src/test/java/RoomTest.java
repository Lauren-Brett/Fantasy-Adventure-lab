import enemies.Enemy;
import enemies.Orc;
import enemies.Troll;
import game.Room;
import game.Treasure;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.attackers.Knight;
import players.attackers.Weapon;
import players.healers.Cleric;
import players.healers.HealingItem;
import players.magic.Spell;
import players.magic.Wardlock;
import players.magic.Wizard;
import players.magic.creatures.Dragon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Room room1;
    private Orc orc;
    private Troll troll;
    private ArrayList<Enemy> enemies;
    private ArrayList<Treasure> treasures;
    private Treasure treasure1;
    private Treasure treasure2;
    private Treasure treasure3;

    private Cleric cleric;
    private Wardlock wardlock;
    private Wizard wizard;
    private Dragon dragon;
    private Spell spell;
    private HealingItem healingItem;
    private ArrayList<Player> players;

    @Before
    public void before(){
        orc = new Orc("Ron", 5, 7);
        troll = new Troll("Bert", 3, 6);
        enemies = new ArrayList<Enemy>();
        enemies.add(orc);
        enemies.add(troll);
        treasures = new ArrayList<Treasure>();
        treasure1 = new Treasure("gold");
        treasure2 = new Treasure("gem");
        treasure3 = new Treasure("silver");
        treasures.add(treasure1);
        treasures.add(treasure2);
        treasures.add(treasure3);
        healingItem = new HealingItem("potion", 8);
        dragon = new Dragon("Donald", 10);
        spell = new Spell("fire", 8);
        cleric = new Cleric("Russ", healingItem);
        wardlock = new Wardlock("Harry", spell, dragon);
        players = new ArrayList<Player>();
        players.add(cleric);
        players.add(wardlock);
        room = new Room(enemies, treasures, players);


    }

    @Test
    public void canCollectTreasure(){
        cleric.collect(treasure1);
        room.removeTreasure(treasure1);
        assertEquals(1, cleric.getBag().size());
    }


    @Test
    public void canMagicPlayerCollectTreasure(){
        wardlock.collect(treasure1);
        wardlock.collect(treasure2);
        room.removeTreasure(treasure1);
        room.removeTreasure(treasure2);
        assertEquals(2, wardlock.getBag().size());
        assertEquals(1, room.getTreasure().size());
    }

    @Test
    public void roomGetEnemyToAttack(){
        room.runEnemyAttack();
        assertEquals(10, wardlock.getHealthPoints());
        assertEquals(0, cleric.getHealthPoints());
    }

    @Test
    public void roomCompletesGameEnemyDies(){
        room.runEnemyAttack();
        wardlock.castSpell(troll);
        wardlock.castSpell(troll);
        wardlock.castSpell(orc);
        wardlock.castSpell(orc);
        wardlock.castSpell(orc);
//        room.allEnemiesDead();
        room.testallEnemiesDead();
        assertEquals(10, wardlock.getHealthPoints());
        assertEquals(0, cleric.getHealthPoints());
        assertEquals(0, troll.getHealthPoints());
        assertEquals(0, orc.getHealthPoints());
        assertEquals(0, room.getEnemies());
    }


    @Test
    public void roomContinuesGamePlayerHealed(){
        Weapon weapon = new Weapon("knife", 2);
        Knight knight = new Knight("Will", weapon);
        ArrayList<Player> players1 = new ArrayList<Player>();
        players1.add(knight);
        players1.add(cleric);
        Room room1 = new Room(enemies, treasures, players1);
        room1.runEnemyAttack();
        cleric.heal(knight);
        assertEquals(10, wardlock.getHealthPoints());
        assertEquals(8, knight.getHealthPoints());
//        assertEquals(false, room1.allEnemiesDead());

    }

//       wardlock.castSpell(troll);
////        wardlock.defendWithCreature(troll);
////        assertEquals(0, troll.getHealthPoints());


//    @Test
//    public void checkRoomForVictory() {
//        wardlock.defendWithCreature(troll);
//        wardlock.castSpell(troll);
//        room.runEnemyAttack();
//        room.checkForVictory();
//        assertEquals(4, dragon.getDefendValue());
//        assertEquals(0, troll.getSpellStatus());
//        assertEquals(2, room.getNumberOfPlayers());
//    }

//    @Test
//    public void checkEnemiesAreALlDead(){
//
//    }

}

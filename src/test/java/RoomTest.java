import com.sun.tools.javac.tree.DCTree;
import enemies.Enemy;
import enemies.Orc;
import enemies.Troll;
import game.ICollectable;
import game.Room;
import game.Treasure;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.healers.Cleric;
import players.healers.HealingItem;
import players.magic.ISpellable;
import players.magic.Spell;
import players.magic.Wardlock;
import players.magic.creatures.Dragon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Orc orc;
    private Troll troll;
    private ArrayList<Enemy> enemies;
    private ArrayList<Treasure> treasures;
    private Treasure treasure1;
    private Treasure treasure2;
    private Treasure treasure3;
    private Cleric cleric;
    private Wardlock wardlock;
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
        players = new ArrayList<Player>();
        players.add(cleric);
        players.add(wardlock);
//        room.add(treasure);
        room = new Room(enemies, treasures, players);
        healingItem = new HealingItem("potion", 8);
        cleric = new Cleric("Russ", healingItem);
        dragon = new Dragon("Donald", 10);
        spell = new Spell("fire", "die");
        wardlock = new Wardlock("Harry", spell, dragon);


    }

    @Test
    public void canCollectTreasure(){
        cleric.collect(treasure1);
        room.removeTreasure(treasure1);
        assertEquals(1, cleric.getBag().size());
    }


    @Test
    public void canMagicPlayerCollectTreasure(){
        troll.attack(wardlock);
        wardlock.defendWithCreature(troll);
        wardlock.castSpell(troll);
        wardlock.collect(treasure1);
        wardlock.collect(treasure2);
        room.removeTreasure(treasure1);
        room.removeTreasure(treasure2);
        assertEquals(4, dragon.getDefendValue());
        assertEquals("die", troll.getSpellStatus());
        assertEquals(2, wardlock.getBag().size());
        assertEquals(1, room.getTreasure().size());
        assertEquals(2, room.getNumberOfPlayers());
    }

}

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

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Orc orc;
    private Troll troll;
    private ArrayList<Enemy> enemies;
    private Treasure treasure;
    private Cleric cleric;
    private HealingItem healingItem;
    private ArrayList<Player> players;

    @Before
    public void before(){
        orc = new Orc("Ron", 5, 7);
        troll = new Troll("Bert", 3, 6);
        enemies = new ArrayList<Enemy>();
        enemies.add(orc);
        enemies.add(troll);
        treasure = new Treasure("gold");
        players = new ArrayList<Player>();
        players.add(cleric);
        room = new Room(enemies, treasure, players);
        healingItem = new HealingItem("potion", 8);
        cleric = new Cleric("Russ", healingItem);

    }

    @Test
    public void canCollectTreasure(){
        cleric.collect(treasure);
        room.removeTreasure(treasure);
        assertEquals(1, cleric.getBag().size());
    }

}

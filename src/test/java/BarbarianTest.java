import org.junit.Before;
import org.junit.Test;
import players.attackers.Barbarian;
import players.attackers.Weapon;

public class BarbarianTest {

    private Barbarian barabarian;
    private Weapon weapon;

    @Before
        public void before(){
        weapon = new Weapon("Club", 5);
        barabarian = new Barbarian("Bob", weapon);
    }

    @Test

    


}

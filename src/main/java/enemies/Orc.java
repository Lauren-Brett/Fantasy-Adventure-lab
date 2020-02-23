package enemies;

public class Orc extends Enemy implements IDieable {

    public Orc(String name, int healthPoints, int enemyAttackValue){
        super(name, healthPoints, enemyAttackValue);
    }

    public void enemyDies(Enemy enemy){

    }

}

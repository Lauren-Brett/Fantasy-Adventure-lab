package game;

import enemies.Enemy;

public interface ICollectable {

    void collect(Treasure treasure);
    void enemyDeadCollectTreasure(Enemy enemy);
}

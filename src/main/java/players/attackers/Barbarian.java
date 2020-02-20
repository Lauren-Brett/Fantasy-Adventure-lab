package players.attackers;

import players.Player;

public class Barbarian extends Player {

    private Weapon weapon;


    public Barbarian(String name, Weapon weapon){
        super(name);
        this.weapon = weapon;
    }


}

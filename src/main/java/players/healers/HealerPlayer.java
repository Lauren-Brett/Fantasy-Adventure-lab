package players.healers;

import players.Player;

public class HealerPlayer extends Player {

    private HealingItem healingItem;

    public HealerPlayer(String name, HealingItem healingItem){
        super(name);
        this.healingItem = healingItem;

    }

    public HealingItem getHealingItem() {
        return healingItem;
    }
}

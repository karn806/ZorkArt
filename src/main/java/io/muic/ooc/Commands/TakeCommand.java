package io.muic.ooc.Commands;

import io.muic.ooc.Items.Item;
import io.muic.ooc.Items.Potions;
import io.muic.ooc.Items.Weapon;
import io.muic.ooc.Player;

/**
 * Created by karn806 on 2/2/17.
 */
public class TakeCommand implements Command {

    @Override
    public void apply(Player player, String args) {
        if (args.equals("weapon")){
            Weapon weapon = new Weapon();
            player.setWeapons(weapon);
        }
        if (args.equals("potion")){
            Potions potion = new Potions();
            player.setPotions(potion);
        }
    }
}

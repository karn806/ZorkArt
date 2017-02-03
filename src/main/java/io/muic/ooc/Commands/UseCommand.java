package io.muic.ooc.Commands;

import io.muic.ooc.Items.Item;
import io.muic.ooc.Map.Room;
import io.muic.ooc.Player;

/**
 * Created by karn806 on 2/3/17.
 */
public class UseCommand implements Command{
    @Override
    public void apply(Player player, String args) {
        if (args.equals("Potion")){
            if (player.getBag().size()!=0){
                Item potion = player.getBag().get(0);
                int playerHp = player.getHp();
                player.setHp(playerHp+potion.getHealPoint());
                System.out.println("Your HP: "+player.getHp());
                player.getBag().remove(0);
            } else {
                System.out.println("There is no more Potion! :(");
            }
        } else {
            System.out.println("  There is no such command. Please insert (item) after command 'use' ");
            System.out.println("  Hint: use Potion");
        }
    }
}

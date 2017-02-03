package io.muic.ooc.Commands;

import io.muic.ooc.Items.Item;
import io.muic.ooc.Items.Potion;
import io.muic.ooc.Map.Room;
import io.muic.ooc.Player;

/**
 * Created by karn806 on 2/2/17.
 */
public class TakeCommand implements Command {

    @Override
    public void apply(Player player, String args) {

        Room room = player.getCurrentRoom();
        if (args.equals("potion")){
            if (room.getPotions()!=null){
                Item potion = new Potion();
                potion.setName("Potion A");
                potion.setHealPoint(5);
                player.setBag(potion);
                System.out.println("Potion taken!");
            } else {
                System.out.println("There is no potion here.");
            }

        }
        else {
            System.out.println("No such command. Please try again.");
            System.out.println("Hint: (take) weapon, (take) potion");
        }
    }
}

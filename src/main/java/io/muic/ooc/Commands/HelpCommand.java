package io.muic.ooc.Commands;

import io.muic.ooc.Player;

/**
 * Created by karn806 on 2/4/17.
 */
public class HelpCommand implements Command {
    @Override
    public void apply(Player player, String args) {
        System.out.println("  Hello, this is help! :D \n");
        System.out.println("  info [ ... ] -- info room, info player");
        System.out.println("          info room -- info of the room: direction a player can go, items player can take, monsters");
        System.out.println("          info player -- info of the player: HP, ATK, EXP, Bag<Items>");
        System.out.println("  attack [ monster name ] -- attack the monster by inserting its name in the bracket");
        System.out.println("  take [ item ] -- items: potion, weapon");
        System.out.println("  use [ item ] -- items: potion, weapon");
        System.out.println("  walk [ direction ] -- Directions: north, south, east, west");
        System.out.println("  quit -- quit the game");
    }
}

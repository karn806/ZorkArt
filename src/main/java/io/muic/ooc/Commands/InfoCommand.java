package io.muic.ooc.Commands;

import io.muic.ooc.Map.Room;
import io.muic.ooc.Player;

/**
 * Created by karn806 on 1/31/17.
 */
public class InfoCommand implements Command {

    @Override
    public void apply(Player player, String args) {
        if (args.equals(null)){
            System.out.println("Please type in argument after 'info' -- 'room', 'player')");
        }
        if (args.equals("player")){
            System.out.println("   Name: "+player.getName());
            System.out.println("   ATK: "+player.getAtk());
            System.out.println("   Exp: "+player.getExp());
            System.out.println("   HP: "+player.getHp());
            System.out.println("   Weapons: "+player.getWeapons());
            System.out.println("   Potions: "+player.getPotions());
        }
        if (args.equals("room")){
            Room currentRoom = player.getCurrentRoom();
            System.out.println("You are at "+currentRoom);
            System.out.println("   East: "+currentRoom.getEastExit());
            System.out.println("   West: "+currentRoom.getWestExit());
            System.out.println("   North: "+currentRoom.getNorthExit());
            System.out.println("   South: "+currentRoom.getSouthExit());
            System.out.println("   Drop potions: "+currentRoom.getPotions());
            System.out.println("   Drop weapons: "+currentRoom.getWeapons());
            System.out.println("   Monsters: "+currentRoom.getMonsters());
        }

    }
}

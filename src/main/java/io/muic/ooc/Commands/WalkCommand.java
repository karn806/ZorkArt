package io.muic.ooc.Commands;

import io.muic.ooc.Map.Room;
import io.muic.ooc.Player;

/**
 * Created by karn806 on 2/1/17.
 */
public class WalkCommand implements Command {

    @Override
    public void apply(Player player, String args) {
        Room nextRoom = null;
        Room currentRoom = player.getCurrentRoom();

        if (args.equals("north")) {
            if (currentRoom.getNorthExit() != null) {
                nextRoom = currentRoom.getNorthExit();
                player.setCurrentRoom(nextRoom);
                System.out.println("Go North!");
            }
        } else if (args.equals("south")){
            if (currentRoom.getSouthExit() != null){
                nextRoom = currentRoom.getSouthExit();
                player.setCurrentRoom(nextRoom);
                System.out.println("Go South!");
            }
        } else if (args.equals("east")){
            if (currentRoom.getEastExit() != null){
                nextRoom = currentRoom.getEastExit();
                player.setCurrentRoom(nextRoom);
                System.out.println("Go East!");
            }
        } else if (args.equals("west")){
            if (currentRoom.getWestExit() != null){
                nextRoom = currentRoom.getWestExit();
                player.setCurrentRoom(nextRoom);
                System.out.println("Go West!");
            }
        }



    }
}

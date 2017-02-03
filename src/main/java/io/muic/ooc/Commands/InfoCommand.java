package io.muic.ooc.Commands;

import io.muic.ooc.Items.Item;
import io.muic.ooc.Items.Potion;
import io.muic.ooc.Items.Weapon;
import io.muic.ooc.Map.Room;
import io.muic.ooc.Monsters.Monster;
import io.muic.ooc.Player;

import java.util.Iterator;

/**
 * Created by karn806 on 1/31/17.
 */
public class InfoCommand implements Command {

    @Override
    public void apply(Player player, String args) {

        if (args==null){
            System.out.println("Please type in argument after command 'info'");
            System.out.println("Hint: (info) player, (info) room");
        }
        else if (args.equals("player")){
            System.out.println("   Name: "+player.getName());
            System.out.println("   ATK: "+player.getAtk());
            System.out.println("   Exp: "+player.getExp());
            System.out.println("   HP: "+player.getHp());
            Iterator<Item> loop = player.getBag().iterator();
            while (loop.hasNext()){
                System.out.println("   Bag: "+loop.next().getName());
            }
        }
        else if (args.equals("room")){
            Room currentRoom = player.getCurrentRoom();

            if (currentRoom.getEastExit()!=null){
                System.out.println("   East: yes");
            } else {
                System.out.println("   East: no");
            }
            if (currentRoom.getWestExit()!=null){
                System.out.println("   West: yes");
            } else {
                System.out.println("   West: no");
            }
            if (currentRoom.getNorthExit()!=null){
                System.out.println("   North: yes");
            } else {
                System.out.println("   North: no");
            }
            if (currentRoom.getSouthExit()!=null){
                System.out.println("   South: yes");
            } else {
                System.out.println("   South: no");
            }

            int n = 1;

            Iterator<Monster> loop = currentRoom.getMonsters().iterator();
            while (loop.hasNext()){
                System.out.println("   Monster: "+n+" "+loop.next().getName());
                n+=1;
            }

            Iterator<Potion> po = currentRoom.getPotions().iterator();
            while (po.hasNext()){
                System.out.println("   Potions: "+po.next().getName());
            }

            Iterator<Weapon> weap = currentRoom.getWeapons().iterator();
            while (weap.hasNext()){
                System.out.println("   Weapons: "+weap.next().getName());
            }

        }
        else {
            System.out.println("Please type in argument after 'info' -- 'room', 'player')");
        }

    }
}

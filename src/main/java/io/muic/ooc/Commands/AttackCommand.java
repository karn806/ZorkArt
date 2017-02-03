package io.muic.ooc.Commands;

import io.muic.ooc.Map.MapLevel1Factory;
import io.muic.ooc.Map.Room;
import io.muic.ooc.Monsters.Monster;
import io.muic.ooc.Player;

/**
 * Created by karn806 on 2/3/17.
 */
public class AttackCommand implements Command {
    @Override
    public void apply(Player player, String args) {
        Room room = player.getCurrentRoom();
        MapLevel1Factory level1  = new MapLevel1Factory();
        int numMon = level1.getNumMonster();

        if (args.equals("MonMon")){
            if (room.getMonsters().size()!=0){
                Monster mon = room.getMonsters().get(0);
                int monHP = mon.getHp();
//                System.out.println("Mon hp!!!!!!"+monHP);
                int monATK = mon.getAtk();
                int playerATK = player.getAtk();
                int playerHP = player.getHp();
                int playerEXP = player.getExp();
                mon.setHp(monHP-playerATK);

                if (mon.getHp()!=0){
                    player.setHp(playerHP-monATK);
                    System.out.println("  Your HP: "+player.getHp());
                    System.out.println("  Monster HP: "+mon.getHp());
                    if (playerHP==0){
                        System.out.println("You died.");
                        System.exit(0);
                    }
                } else {
                    room.getMonsters().remove(0);
                    System.out.println("  You killed the monster. Yay!!");
                    System.out.println("  Gained 2 EXP");
                    player.setExp(playerEXP+2);
                    level1.setNumMonster(numMon-1);
                    if (level1.getNumMonster()==0){
                        System.out.println("  Congrats! You have killed all the monster");
                        System.out.println("  Now you can proceed to the next level!!");
                        System.exit(0);
                    }

                }
            }
        } else {
            System.out.println("There is no monster here.");
        }
    }
}

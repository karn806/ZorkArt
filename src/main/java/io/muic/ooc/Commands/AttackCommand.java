package io.muic.ooc.Commands;

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

        if (args.equals("MonMon")){
            if (room.getMonsters()!=null){
                Monster mon = room.getMonsters().get(0);
                int monHP = mon.getHp();
                int monATK = mon.getAtk();
                int playerATK = player.getAtk();
                int playerHP = player.getHp();
                mon.setHp(playerATK-monHP);

                if (mon.getHp()!=0){
                    player.setHp(monATK-playerHP);
                    if (playerHP==0){
                        System.out.println("You died.");
                        System.exit(0);
                    }
                } else {
                    room.getMonsters().remove(0);
                    System.out.println("You killed the monster. Yay!!");
                }
            }
        } else {
            System.out.println("There is no monster here.");
        }
    }
}

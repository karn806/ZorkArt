package io.muic.ooc.Commands;

import io.muic.ooc.Player;

/**
 * Created by karn806 on 1/31/17.
 */
public class PlayerInfoCommand implements Command {

    @Override
    public void apply(Player player) {
        System.out.println("   Name: "+player.getName());
        System.out.println("   ATK: "+player.getAtk());
        System.out.println("   Exp: "+player.getExp());
        System.out.println("   HP: "+player.getHp());
        System.out.println("   Items: ");
    }
}

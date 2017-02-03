package io.muic.ooc.Commands;

import io.muic.ooc.Player;

/**
 * Created by karn806 on 1/31/17.
 */
public class ExitCommand implements Command{
    @Override
    public void apply(Player player, String args){
        System.exit(0);
    }
}

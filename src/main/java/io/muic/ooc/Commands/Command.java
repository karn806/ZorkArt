package io.muic.ooc.Commands;

import io.muic.ooc.Player;

/**
 * Created by karn806 on 1/27/17.
 */
public interface Command {
    void apply(Player player, String args);
}

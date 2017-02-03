package io.muic.ooc.Commands;

import io.muic.ooc.Map.MapLevel1Factory;
import io.muic.ooc.Map.Room;
import io.muic.ooc.Player;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karn806 on 2/3/17.
 */
public class WalkCommandTest {
    @Test
    public void apply() throws Exception {
        Player player = new Player();
        Room A = new Room();
        Room B = new Room();
        A.setEastExit(B);
        B.setWestExit(A);
        player.setCurrentRoom(A);

    }

}
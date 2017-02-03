package io.muic.ooc.Commands;

import io.muic.ooc.Items.Item;
import io.muic.ooc.Items.Potion;
import io.muic.ooc.Player;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karn806 on 2/4/17.
 */
public class TakeCommandTest {
    @Test
    public void apply() throws Exception {
        Potion potion = new Potion();
        Player player = new Player();
        player.setBag(potion);

        assertTrue(potion == player.getBag().get(0));

    }



}
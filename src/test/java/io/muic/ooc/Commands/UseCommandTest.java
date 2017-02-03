package io.muic.ooc.Commands;

import io.muic.ooc.Items.Potion;
import io.muic.ooc.Player;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karn806 on 2/4/17.
 */
public class UseCommandTest {
    @Test
    public void apply() throws Exception {
        Player player = new Player();
        Potion potion = new Potion();
        potion.setHealPoint(5);
        player.setHp(10);
    }

}
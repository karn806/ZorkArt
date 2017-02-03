package io.muic.ooc;

/**
 * Created by karn806 on 1/27/17.
 */

/* classes needed:
    1. io.muic.ooc.Player
    2. io.muic.ooc.Monsters.Monster
    3. io.muic.ooc.Monsters.Monster
    4. io.muic.ooc.Items.Item
        - more sub-class (there are many types of item)
    5. io.muic.ooc.Items.ItemFactory
    6. io.muic.ooc.Map.Room
    7. GameMap
    8. CommandParser
    9. io.muic.ooc.Commands.Command
        - many sub-class of io.muic.ooc.Commands.Command
*/

public class ZorkRunner {
    public static void main(String[] args) {

        ZorkGame zorkGame = new ZorkGame();
        zorkGame.start();
    }

}

/**
 * Created by karn806 on 1/27/17.
 */

/* classes needed:
    1. Player
    2. Monster
    3. MonsterFactory
    4. Item
        - more sub-class (there are many types of item)
    5. ItemFactory
    6. Room
    7. GameMap
    8. CommandParser
    9. Command
        - many sub-class of Command
*/

public class ZorkRunner {
    public static void main(String[] args) {
        ZorkGame zorkGame = new ZorkGame();
        zorkGame.start();
    }
}

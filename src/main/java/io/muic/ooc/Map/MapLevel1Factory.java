package io.muic.ooc.Map;


/**
 * Created by karn806 on 1/30/17.
 */

public class MapLevel1Factory {

    public void createRoom(){
        Room a = new Room();
        Room b = new Room();
        Room c = new Room();

        a.setEastExit(b);
    }
}

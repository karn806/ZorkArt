package io.muic.ooc.Map;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by karn806 on 1/30/17.
 */

public class MapLevel1Factory{

    ArrayList<Room> rooms = new ArrayList<Room>();

    public void createRoom(){
        Room A = new Room();
        Room B = new Room();
        Room C = new Room();
        rooms.add(A);
        rooms.add(B);
        rooms.add(C);

    }
}

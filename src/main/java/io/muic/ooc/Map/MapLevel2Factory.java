package io.muic.ooc.Map;

import io.muic.ooc.Items.Potion;
import io.muic.ooc.Monsters.Monster;

import java.util.ArrayList;

/**
 * Created by karn806 on 2/3/17.
 */
public class MapLevel2Factory extends GameMap implements MapFactory {

    @Override
    public ArrayList<Room> createRoom(){
        ArrayList<Room> rooms = new ArrayList<Room>();
        Room A = new Room();
        Room B = new Room();
        Room C = new Room();
        rooms.add(A);
        rooms.add(B);
        rooms.add(C);
        A.setSouthExit(B);
        B.setNorthExit(A);
        B.setEastExit(C);
        C.setWestExit(C);
        return rooms;
    }

    public Monster createMonster() {
        Monster monster = new Monster();
        monster.setAtk(2);
        monster.setHp(10);
        monster.setName("MonMon");
        return monster;
    }

    @Override
    public Potion createPotions(){
        Potion potion = new Potion();
        potion.setName("Potion");
        potion.setHealPoint(5);
        return potion;
    }

}

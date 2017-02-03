package io.muic.ooc.Map;


import io.muic.ooc.Items.Potion;
import io.muic.ooc.Monsters.Monster;

import java.util.ArrayList;

/**
 * Created by karn806 on 1/30/17.
 */

public class MapLevel1Factory extends GameMap implements MapFactory{

    private int numMonster = 2;

    @Override
    public int getNumMonster() {
        return numMonster;
    }

    @Override
    public void setNumMonster(int numMonster) {
        this.numMonster = numMonster;
    }

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
        C.setWestExit(B);
        return rooms;
    }
    @Override
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

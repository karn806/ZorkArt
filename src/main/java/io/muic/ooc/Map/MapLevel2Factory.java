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

    @Override
    public ArrayList<Monster> createMonster() {
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        Monster monster = new Monster();
        monster.setAtk(10);
        monster.setHp(15);
        monster.setName("MonMon");
        Monster monster1 = new Monster();
        monster1.setAtk(10);
        monster1.setHp(15);
        monster1.setName("MonMon");
        Monster monster2 = new Monster();
        monster2.setAtk(10);
        monster2.setHp(15);
        monster2.setName("MonMon");

        monsters.add(monster);
        monsters.add(monster1);
        monsters.add(monster2);


        return monsters;
    }

    @Override
    public Potion createPotions(){
        Potion potion = new Potion();
        potion.setName("Potion");
        potion.setHealPoint(5);
        return potion;
    }

}

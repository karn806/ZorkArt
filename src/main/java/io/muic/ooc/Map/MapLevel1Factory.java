package io.muic.ooc.Map;


import io.muic.ooc.Items.Potions;
import io.muic.ooc.Items.Weapon;
import io.muic.ooc.Monsters.KingMon;
import io.muic.ooc.Monsters.MonMon;
import io.muic.ooc.Monsters.Monster;

import java.util.ArrayList;

/**
 * Created by karn806 on 1/30/17.
 */

public class MapLevel1Factory implements MapFactory{

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
    public Monster createMonster() {
        Monster monMon = new MonMon();
        monMon.setAtk(1);
        monMon.setHp(5);
        monMon.setName("MonMon");
        return monMon;
    }

    @Override
    public Potions createPotions(){
        Potions potion = new Potions();
        potion.setHealPoint(5);
        return potion;
    }

    @Override
    public Weapon createWeapon(){
        Weapon weapon = new Weapon();
        weapon.setAttackPoint(5);
        return weapon;
    }


}

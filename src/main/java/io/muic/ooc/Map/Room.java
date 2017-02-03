package io.muic.ooc.Map;

import io.muic.ooc.Items.Item;
import io.muic.ooc.Items.Potions;
import io.muic.ooc.Items.Weapon;
import io.muic.ooc.Monsters.MonMon;
import io.muic.ooc.Monsters.Monster;

import java.util.ArrayList;

/**
 * Created by karn806 on 1/27/17.
 */
public class Room {
    private Room northExit = null;
    private Room southExit = null;
    private Room westExit = null;
    private Room eastExit = null;
//    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Potions> potions = new ArrayList<Potions>();
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    private ArrayList<Monster> monsters = new ArrayList<Monster>();

    public ArrayList<Weapon> getWeapons() {
        for (Weapon weapon: weapons) {
            System.out.println(weapon.getName());
        }
        return weapons;
    }
    public void setWeapons(Weapon weapon) {
        this.weapons = weapons;
        weapons.add(weapon);
    }

    public ArrayList<Potions> getPotions() {
        for (Potions potion: potions) {
            System.out.println(potion.getName());
        }
        return potions;
    }
    public void setPotions(Potions potion) {
        this.potions = potions;
        potions.add(potion);
    }

    public Room getNorthExit() {
        return northExit;
    }

    public void setNorthExit(Room northExit) {
        this.northExit = northExit;
    }

    public Room getSouthExit() {
        return southExit;
    }

    public void setSouthExit(Room southExit) {
        this.southExit = southExit;
    }

    public Room getWestExit() {
        return westExit;
    }

    public void setWestExit(Room westExit) {
        this.westExit = westExit;
    }

    public Room getEastExit() {
        return eastExit;
    }

    public void setEastExit(Room eastExit) {
        this.eastExit = eastExit;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(MonMon monsters) {
        this.monsters = monsters;
    }
}

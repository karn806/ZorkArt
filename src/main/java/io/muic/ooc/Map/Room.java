package io.muic.ooc.Map;

import io.muic.ooc.Items.Potion;
import io.muic.ooc.Items.Weapon;
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
    private ArrayList<Potion> potions = new ArrayList<Potion>();
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

    public ArrayList<Potion> getPotions() {
        for (Potion potion: potions) {
            System.out.println(potion.getName());
        }
        return potions;
    }
    public void setPotions(Potion potion) {
        this.potions = potions;
        potions.add(potion);
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(Monster monster) {
        this.monsters = monsters;
        monsters.add(monster);

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


}

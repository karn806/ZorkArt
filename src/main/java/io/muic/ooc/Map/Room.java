package io.muic.ooc.Map;

import io.muic.ooc.Item;
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
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Monster> monsters = new ArrayList<Monster>();

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

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }
}

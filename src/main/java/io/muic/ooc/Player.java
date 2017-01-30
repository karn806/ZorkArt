package io.muic.ooc;

import java.util.ArrayList;

/**
 * Created by karn806 on 1/27/17.
 */
public class Player {
    private int hp;
    private int atk;
    private int exp;
    private String name;
    private ArrayList<Item> bag = new ArrayList<Item>();

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getBag() {
        return bag;
    }

    public void setBag(ArrayList<Item> bag) {
        this.bag = bag;
    }


}

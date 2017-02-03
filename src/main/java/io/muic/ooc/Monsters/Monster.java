package io.muic.ooc.Monsters;

/**
 * Created by karn806 on 1/27/17.
 */
public class Monster {
    private int hp;
    private int atk;
    private String name;
    private int level;


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() { return hp; }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

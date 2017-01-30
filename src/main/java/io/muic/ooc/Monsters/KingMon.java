package io.muic.ooc.Monsters;

/**
 * Created by karn806 on 1/30/17.
 */
public class KingMon extends Monster{
    private int hp = 20;
    private int atk = 20;
    private int giveExp = 10;

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
}

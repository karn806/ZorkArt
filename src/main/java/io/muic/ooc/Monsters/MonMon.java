package io.muic.ooc.Monsters;

/**
 * Created by karn806 on 1/30/17.
 */
public class MonMon extends Monster{
    private int hp = 10;
    private int atk = 1;
    private int giveExp = 5;

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

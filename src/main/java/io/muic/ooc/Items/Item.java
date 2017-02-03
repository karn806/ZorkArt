package io.muic.ooc.Items;

/**
 * Created by karn806 on 1/27/17.
 */
public abstract class Item {
    String name;

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }

    private int attackPoint;
    private int healPoint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

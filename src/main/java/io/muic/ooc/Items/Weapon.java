package io.muic.ooc.Items;

/**
 * Created by karn806 on 2/1/17.
 */
public class Weapon extends Item {

//    Item item = new Weapon();
    private String name;
    private int attackPoint;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }
}

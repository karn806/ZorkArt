package io.muic.ooc.Items;

/**
 * Created by karn806 on 1/27/17.
 */
public abstract class Item {

    String name;
    private int healPoint;

    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

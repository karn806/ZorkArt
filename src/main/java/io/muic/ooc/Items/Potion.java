package io.muic.ooc.Items;

/**
 * Created by karn806 on 1/31/17.
 */
public class Potion extends Item {

    private String name;
    private int healPoint;

    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}

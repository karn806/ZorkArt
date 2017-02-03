package io.muic.ooc.Map;

import io.muic.ooc.Items.Potions;
import io.muic.ooc.Items.Weapon;
import io.muic.ooc.Monsters.Monster;

import java.util.ArrayList;

/**
 * Created by karn806 on 1/30/17.
 */
public interface MapFactory {
    ArrayList<Room> createRoom();
    Monster createMonster();
    Potions createPotions();
    Weapon createWeapon();
}

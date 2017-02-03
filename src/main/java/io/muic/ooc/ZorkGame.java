package io.muic.ooc;

import io.muic.ooc.Commands.Command;
import io.muic.ooc.Commands.CommandParser;
import io.muic.ooc.Items.Item;
import io.muic.ooc.Items.Potion;
import io.muic.ooc.Map.MapLevel1Factory;
import io.muic.ooc.Map.Room;
import io.muic.ooc.Monsters.Monster;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by karn806 on 1/27/17.
 */
public class ZorkGame {

    Random random = new Random();

    public void initialize(Player player, String name, ArrayList<Room> rooms, Monster monster,
                           Item potions, Item weapon){
        player.setAtk(10);
        player.setExp(0);
        player.setHp(30);
        player.setName(name);
        // random starting room
        Room room = rooms.get(random.nextInt(rooms.size()));
        player.setCurrentRoom(room);
        // initial weapon for player
        player.setBag(weapon);
        rooms.get(0).setPotions((Potion) potions);
        rooms.get(0).setMonsters(monster);
        rooms.get(1).setPotions((Potion) potions);
        rooms.get(2).setPotions((Potion) potions);
        rooms.get(2).setMonsters(monster);
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zork: Welcome to ZorkArt!");
        System.out.println("Zork: What's your name?");
        String name = scanner.nextLine();
        System.out.println("Zork: Hello, "+name);
        Player player = new Player();
        MapLevel1Factory level1 = new MapLevel1Factory();
        ArrayList<Room> rooms = level1.createRoom();
        Monster monster = level1.createMonster();
        Item potion = level1.createPotions();
        Item weapon = level1.createWeapon();

        initialize(player, name, rooms, monster, potion, weapon);

        String argCommand = null;
        Command command;

        boolean quit = false;
        while (!quit) {
            System.out.print(name+": ");
            String commandLine = scanner.nextLine();
            String cmd = commandLine.split(" ")[0];

            if (commandLine.contains(" ")){
                argCommand = commandLine.split(" ")[1];
            }

            command = CommandParser.getCommand(cmd);

            if (null == command) {
                System.out.println("Unknown command [" + commandLine + "]. Available commands: player info, quit.");
            } else {
                command.apply(player, argCommand);
            }
        }

    }



}

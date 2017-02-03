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

    public void initialize(Player player, String name, ArrayList<Room> rooms, ArrayList<Monster> monsters,
                           Item potions){
        player.setAtk(5);
        player.setExp(0);
        player.setHp(30);
        player.setName(name);
        // random starting room
        Room room = rooms.get(random.nextInt(rooms.size()));
        player.setCurrentRoom(room);

        for (int i = 0; i < monsters.size(); i++) {
            rooms.get(i).setPotions((Potion) potions);
            rooms.get(i).setMonsters(monsters.get(i));
        }
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
        ArrayList<Monster> monster = level1.createMonster();
        Item potion = level1.createPotions();

        initialize(player, name, rooms, monster, potion);

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

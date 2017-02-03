package io.muic.ooc;

import io.muic.ooc.Commands.Command;
import io.muic.ooc.Commands.CommandParser;
import io.muic.ooc.Items.Potions;
import io.muic.ooc.Items.Weapon;
import io.muic.ooc.Map.MapLevel1Factory;
import io.muic.ooc.Map.Room;
import io.muic.ooc.Monsters.MonMon;
import io.muic.ooc.Monsters.Monster;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by karn806 on 1/27/17.
 */
public class ZorkGame {

    public void initialize(Player player, String name, ArrayList<Room> rooms, Monster monster,
                           Potions potions, Weapon weapons){
        player.setAtk(10);
        player.setExp(0);
        player.setHp(30);
        player.setName(name);
        player.setCurrentRoom(rooms.get(0));
        rooms.get(0).setPotions(potions);
        rooms.get(0).setMonsters((MonMon) monster);
        rooms.get(2).setPotions(potions);
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
        Monster monMon = level1.createMonster();
        Potions potions = level1.createPotions();
        Weapon weapons = level1.createWeapon();

        initialize(player, name, rooms, monMon, potions, weapons);
        String argCommand = null;
        Command command;



        boolean quit = false;
        while (!quit) {
            System.out.print(name+": ");
            String commandLine = scanner.nextLine();
            if (commandLine.contains(" ")){
                String cmd = commandLine.split(" ")[0];
                argCommand = commandLine.split(" ")[1];
                command = CommandParser.getCommand(cmd);
            } else {
                command = CommandParser.getCommand(commandLine);
            }

            if (null == command) {
                System.out.println("Unknown command [" + commandLine + "]. Available commands: player info, quit.");
            } else {
                command.apply(player, argCommand);
            }
        }

    }



}

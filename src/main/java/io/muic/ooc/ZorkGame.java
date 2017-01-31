package io.muic.ooc;

import io.muic.ooc.Commands.Command;
import io.muic.ooc.Commands.CommandParser;

import java.util.Scanner;

/**
 * Created by karn806 on 1/27/17.
 */
public class ZorkGame {

    public void initialize(Player player, String name){
        player.setAtk(10);
        player.setExp(0);
        player.setHp(30);
        player.setName(name);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zork: Welcome to ZorkArt!");
        System.out.println("Zork: What's your name?");
        String name = scanner.nextLine();
        System.out.println("Zork: Hello, "+name);
        Player player = new Player();
        initialize(player, name);

        boolean quit = false;
        while (!quit) {
            System.out.print(name+": ");
            String commandLine = scanner.nextLine();
            Command command = CommandParser.getCommand(commandLine);
            if (null == command) {
                System.out.println("Unknown command [" + commandLine + "]. Available commands: player info, quit.");
            } else {
                command.apply(player);
            }
        }

    }



}

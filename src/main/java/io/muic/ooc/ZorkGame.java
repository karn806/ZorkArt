package io.muic.ooc;

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
        System.out.println("Zork: Hello "+name);
        Player player = new Player();
        initialize(player, name);

        boolean quit = false;

        while (!quit) {
            System.out.print(name+": ");
            String cmd = scanner.nextLine();
            if (cmd.equals("player info")){
                System.out.println("ATK: "+player.getAtk());
                System.out.println("Exp: "+player.getExp());
                System.out.println("HP: "+player.getHp());
            }
            if (cmd.equals("quit")){
                quit = true;
            }
        }
    }

}

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game rpg = new Game();
        Character mainPlayer = rpg.homeland.player;
        System.out.println(rpg.homeland.player.getPicture());
        mainPlayer.drawHealth();
        mainPlayer.drawStamina();
        rpg.homeland.drawMap();

        boolean gameRunning = true;



        System.out.println(Assets.redTerminal+"Welcome to the game!!! ");
        System.out.println(Assets.whiteTerminal);



        while (gameRunning) {
            Scanner scan = new Scanner(System.in);

            System.out.println();


            System.out.println("Your character info: " + "Name: "+ mainPlayer.getName() + "|" + " Coin balance: $"+ mainPlayer.getCoins() + " | " + "Character Level: " + mainPlayer.getLevel());
            System.out.println();
            System.out.println("Make a move:");
            System.out.println("move up| move down| move left| move right| map| inventory ");
            String response = scan.nextLine();
            rpg.homeland.commandReader(response);
            if(mainPlayer.getCurrentHealth()<=0){
                gameRunning = false;
            }
        }
        System.out.println("Game Over");





    }
}
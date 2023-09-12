package org.example;

import java.util.Scanner;

public  class  Game {

    World homeland;

    public Game(){
        Scanner scan = new Scanner(System.in);

        String name = "";

        int strength = -1;
        int speed = -1;
        int defense = -1;
        int intelligence = -1;





            System.out.println("What is the name of your character?");

             name = scan.nextLine();


            int points = 11;

            System.out.println("Give your player some stats: your balance 11 points");

            if(points > 0){
                while (strength<0) {
                    System.out.println("your point balance: "+ points + "strength: ");
                    try {
                       int temp  = Integer.parseInt(scan.nextLine());
                        if(points >= temp){
                            strength = temp;
                            points -= strength;
                        }

                    } catch (Exception e) {
                        System.out.println("Not a valid input please try again");
                    }
                }
            }

            if(points > 0){
                while (speed < 0) {
                    System.out.println("your point balance: "+ points +"speed: ");
                    try {
                        int temp = Integer.parseInt(scan.nextLine());
                        if(points >= temp) {
                            speed = temp;
                            points -= speed;
                        }
                    } catch (Exception e) {
                        System.out.println("Not a valid input please try again");
                    }
                }
            }

            if(points > 0){
                while (defense < 0) {
                    System.out.println("your point balance: "+ points + "defense: ");
                    try {
                        int temp = Integer.parseInt(scan.nextLine());
                        if(points >= temp) {
                            defense = temp;
                            points -= defense;
                        }
                    } catch (Exception e) {
                        System.out.println("Not a valid input please try again");
                    }
                }
            }

            if(points > 0){
                while (intelligence<0) {
                    System.out.println("your point balance: "+ points + " intelligence: " );
                    try {
                        int temp = Integer.parseInt(scan.nextLine());
                        if(points >= temp) {

                        intelligence = temp;
                        points -= intelligence;
                        }
                    } catch (Exception e) {
                        System.out.println("Not a valid input please try again");
                    }
                }
            }


            if(intelligence < 0){
                intelligence = 0;
            }




         homeland = new World(name, speed,defense,intelligence,strength,1,"                   _.--.    .--._\n" +
                "                 .\"  .\"      \".  \".\n" +
                "                ;  .\"    /\\    \".  ;\n" +
                "                ;  '._,-/  \\-,_.`  ;\n" +
                "                \\  ,`  / /\\ \\  `,  /\n" +
                "                 \\/    \\/  \\/    \\/\n" +
                "                 ,=_    \\/\\/    _=,\n" +
                "                 |  \"_   \\/   _\"  |\n" +
                "                 |_   '\"-..-\"'   _|\n" +
                "                 | \"-.        .-\" |\n" +
                "                 |    \"\\    /\"    |\n" +
                "                 |      |  |      |\n" +
                "         ___     |      |  |      |     ___\n" +
                "     _,-\",  \",   '_     |  |     _'   ,\"  ,\"-,_\n" +
                "   _(  \\  \\   \\\"=--\"-.  |  |  .-\"--=\"/   /  /  )_\n" +
                " ,\"  \\  \\  \\   \\      \"-'--'-\"      /   /  /  /  \".\n" +
                "!     \\  \\  \\   \\                  /   /  /  /     !\n" +
                ":      \\  \\  \\   \\                /   /  /  /      ");
    }





}

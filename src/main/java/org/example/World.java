package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class World {

//    Create items
    Items healthPotion50 = new Items("small health potion","health",50, Assets.smallHealthPotionPicture);
    Items staminaPotion50 = new Items("small stamina potion","stamina",50, Assets.smallHealthPotionPicture);
//    Create items end

// Create attacks Start

    ArrayList<SpecialEffects> rustedBlowEffects = new ArrayList<>();

    String rustedBlowSpDesc = "Special Effect: 'Rust' has a 3% chance of dealing 5 extra damage for 4 turns";

    Attack rustedBlow = new Attack(Assets.attackRustedBlow,"rusted blow",80,50,20,rustedBlowEffects,rustedBlowSpDesc,"earth");

    ArrayList<SpecialEffects> fireBreathEffects = new ArrayList<>();

    String fireBreathSpDesc = "Special Effect: 'Burn' has a 7% chance of dealing 8 extra damage for 4 turns";

    Attack fireBreath = new Attack(Assets.attackRustedBlow,"fire breath",90,70,25,fireBreathEffects,fireBreathSpDesc,"fire");


    String[] mapL = new String[100];


    String[] occupiedLocations = new String[100];

    ArrayList<Character> entities = new ArrayList<>();






    Character player;
    public World(String name, int speed, int defense, int intelligence, int strength, int level, String picture){

        mapInit();
        initPlayer(name,speed,defense,intelligence,strength,level,picture);
        initEntities();

    }

    private void initInventory(){
        player.addToInventory(healthPotion50);
        player.addToInventory(staminaPotion50);
    }

    private void initEntities(){

        Character dragon = new Character("denv",1,2,3,4,10,Assets.dragonPicture,randomCoordinates(),Assets.highLevelIcon,"enemy");
        placePlayer(dragon);
        entities.add(dragon);
        dragon.addAttacks(rustedBlow);
        dragon.addAttacks(fireBreath);
        dragon.addAttacks(fireBreath);
        dragon.addAttacks(fireBreath);

        Character chest = new Character("treasure1",0,0,0,0,0,"",randomCoordinates(),Assets.treasureIcon,"treasure");
        placePlayer(chest);
        entities.add(chest);

        Character skeleton = new Character("skeleton",1,2,3,4,1,Assets.skeletonPicture,randomCoordinates(),Assets.highLevelIcon,"enemy");
        placePlayer(skeleton);
        entities.add(skeleton);
        skeleton.addAttacks(rustedBlow);
        skeleton.addAttacks(rustedBlow);
        skeleton.addAttacks(rustedBlow);
        skeleton.addAttacks(rustedBlow);

        Character reaper = new Character("reaper",1,2,3,4,5,Assets.reaperPicture,randomCoordinates(),"?","enemy");
        placePlayer(reaper);
        entities.add(reaper);
        reaper.addAttacks(rustedBlow);
        reaper.addAttacks(rustedBlow);
        reaper.addAttacks(rustedBlow);
        reaper.addAttacks(rustedBlow);
    }

    private void initPlayer(String name, int speed, int defense, int intelligence, int strength, int level, String picture){
        player = new Character(name, speed ,defense, intelligence,strength,level,picture,randomCoordinates(),Assets.playerIcon,"player");
        placePlayer(player);

        entities.add(player);
        assignDefaultItems();
        initAttacks();
        player.addAttacks(rustedBlow);
        player.addAttacks(rustedBlow);
    }

    private void initAttacks(){
        //0           ,1          , 2           , 3            , 4           ,5                ,6          , 7              , 8                 , 9                  , 10
        //effect name ,effect type, effect score, effect chance, effect turns,side effect name, side effect, side effect type, side effect score, side effect chance, side effect turns
        SpecialEffects rust = new SpecialEffects("rust","damage",5,3,4,"none","heal",0,0,0);
        rustedBlow.addSpecialEffects(rust);

        SpecialEffects burn = new SpecialEffects("burn","damage",7,8,4,"none","heal",0,0,0);
        fireBreath.addSpecialEffects(burn);
    }





    private int randomCoordinates(){
        Random rand = new Random();
        int location = rand.nextInt(100);
        while(!hasEmptyLocation(location)) {
            location = rand.nextInt(100);
        }
        return location;
    }





    public void drawMap(){
        String map =
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[0]+" | "+ mapL[1]+ " | "+mapL[2]+" | "+mapL[3]+" | "+mapL[4]+" | "+mapL[5]+" | "+mapL[6]+" | "+mapL[7]+" | "+mapL[8]+" | "+mapL[9]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[10]+" | "+ mapL[11]+ " | "+mapL[12]+" | "+mapL[13]+" | "+mapL[14]+" | "+mapL[15]+" | "+mapL[16]+" | "+mapL[17]+" | "+mapL[18]+" | "+mapL[19]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[20]+" | "+ mapL[21]+ " | "+mapL[22]+" | "+mapL[23]+" | "+mapL[24]+" | "+mapL[25]+" | "+mapL[26]+" | "+mapL[27]+" | "+mapL[28]+" | "+mapL[29]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[30]+" | "+ mapL[31]+ " | "+mapL[32]+" | "+mapL[33]+" | "+mapL[34]+" | "+mapL[35]+" | "+mapL[36]+" | "+mapL[37]+" | "+mapL[38]+" | "+mapL[39]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[40]+" | "+ mapL[41]+ " | "+mapL[42]+" | "+mapL[43]+" | "+mapL[44]+" | "+mapL[45]+" | "+mapL[46]+" | "+mapL[47]+" | "+mapL[48]+" | "+mapL[49]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[50]+" | "+ mapL[51]+ " | "+mapL[52]+" | "+mapL[53]+" | "+mapL[54]+" | "+mapL[55]+" | "+mapL[56]+" | "+mapL[57]+" | "+mapL[58]+" | "+mapL[59]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[60]+" | "+ mapL[61]+ " | "+mapL[62]+" | "+mapL[63]+" | "+mapL[64]+" | "+mapL[65]+" | "+mapL[66]+" | "+mapL[67]+" | "+mapL[68]+" | "+mapL[69]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[70]+" | "+ mapL[71]+ " | "+mapL[72]+" | "+mapL[73]+" | "+mapL[74]+" | "+mapL[75]+" | "+mapL[76]+" | "+mapL[77]+" | "+mapL[78]+" | "+mapL[79]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[80]+" | "+ mapL[81]+ " | "+mapL[82]+" | "+mapL[83]+" | "+mapL[84]+" | "+mapL[85]+" | "+mapL[86]+" | "+mapL[87]+" | "+mapL[88]+" | "+mapL[89]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"+
                        "| "+ mapL[90]+" | "+ mapL[91]+ " | "+mapL[92]+" | "+mapL[93]+" | "+mapL[94]+" | "+mapL[95]+" | "+mapL[96]+" | "+mapL[97]+" | "+mapL[98]+" | "+mapL[99]+" |\n"+
                        "+---+---+---+---+---+---+---+---+---+---+\n"
                        ;

        Messages.sidePrint(map,Assets.legend,"",20,Assets.whiteTerminal,Assets.yellowTerminal,Assets.whiteTerminal);
    }

    private void mapInit(){

        for (int i =0; i < mapL.length; i++){
                    mapL[i] = "?";
        }
    }

    public void placePlayer( Character character){
        mapL[character.getLocation()] = character.characterIcon ;
    }

    public boolean hasEmptyLocation(int loc){
        for (int i = 0; i < mapL.length; i++){
            if (mapL[i].equals("?") || mapL[i].equals("")  ){
                return true;
            }
        }
        return false;
    }

    public void placeEntities(){

        for(Character e: entities) {
            mapL[e.getLocation()] = e.characterIcon;
        }
        mapL[player.getLocation()]= player.characterIcon;
    }

    public void move(Character character ,String direction){
        int currentLocation = character.getLocation();
        switch (direction){

            case "up":
                if(currentLocation>10){
                    int newLocation = currentLocation-10;
                    mapL[currentLocation]=" ";
                    mapL[newLocation] = character.characterIcon;
                    character.setLocation(newLocation);

                    placeEntities();
                    drawMap();
                    globalLocationTracker();

                }else{
                    System.out.println("you're already at the edge");
                }

                break;
            case "down":
                if(currentLocation<90){
                    int newLocation = currentLocation+10;
                    mapL[currentLocation]=" ";
                    mapL[newLocation] = character.characterIcon;
                    character.setLocation(newLocation);
                    placeEntities();
                    drawMap();
                    globalLocationTracker();
                }else{
                    System.out.println("you're already at the edge");
                }

                break;
            case "left":
                if(currentLocation>0){
                    int newLocation = currentLocation-1;
                    mapL[currentLocation]=" ";
                    mapL[newLocation] = character.characterIcon;
                    character.setLocation(newLocation);
                    placeEntities();
                    drawMap();
                    globalLocationTracker();
                }else{
                    System.out.println("you're already at the edge");
                }

                break;
            case "right":
                if(currentLocation<99){
                    int newLocation = currentLocation+1;
                    mapL[currentLocation]=" ";
                    mapL[newLocation] = character.characterIcon;
                    character.setLocation(newLocation);
                    placeEntities();
                    drawMap();
                    globalLocationTracker();
                }else{
                    System.out.println("you're already at the edge");
                }

                break;
            default:
                System.out.println("not a valid input please try again");
                break;
        }
    }

    public void commandReader(String command){
        String[] comandList = command.split(" ");
        switch (comandList[0]){
            case "move":
                move(player,comandList[1]);
                break;
            default:
                System.out.println("not a valid input try again");
        }
    }

    public void globalLocationTracker(){
        for (Character character:
             entities) {
            for (Character character2:
                 entities) {
                if(!character.getName().equals(character2.getName())){
                    if((character.getLocation() == character2.getLocation())&& character.getCurrentHealth()>0 && character2.getCurrentHealth()>0){
                        action(character,character2);
                        return;
                    }
                }
            }
        }

    }

    public void action(Character character1, Character character2){
        Character entity;


        if(!character1.getRole().equals("player")){
             entity = character1;
        }else {
             entity = character2;
        }

        switch (entity.getRole()){
            case "enemy":
                battle(player,entity);
                break;
            case "treasure":
                treasure(entity);
            default:
                break;
        }


    }

    public void treasure(Character treasure){
        System.out.println(
                Assets.yellowTerminal +
                "                                                                                                                                    \n" +
                "8888888 8888888888 8 888888888o.   8 8888888888            .8.            d888888o.   8 8888      88 8 888888888o.   8 8888888888   \n" +
                "      8 8888       8 8888    `88.  8 8888                 .888.         .`8888:' `88. 8 8888      88 8 8888    `88.  8 8888         \n" +
                "      8 8888       8 8888     `88  8 8888                :88888.        8.`8888.   Y8 8 8888      88 8 8888     `88  8 8888         \n" +
                "      8 8888       8 8888     ,88  8 8888               . `88888.       `8.`8888.     8 8888      88 8 8888     ,88  8 8888         \n" +
                "      8 8888       8 8888.   ,88'  8 888888888888      .8. `88888.       `8.`8888.    8 8888      88 8 8888.   ,88'  8 888888888888 \n" +
                "      8 8888       8 888888888P'   8 8888             .8`8. `88888.       `8.`8888.   8 8888      88 8 888888888P'   8 8888         \n" +
                "      8 8888       8 8888`8b       8 8888            .8' `8. `88888.       `8.`8888.  8 8888      88 8 8888`8b       8 8888         \n" +
                "      8 8888       8 8888 `8b.     8 8888           .8'   `8. `88888.  8b   `8.`8888. ` 8888     ,8P 8 8888 `8b.     8 8888         \n" +
                "      8 8888       8 8888   `8b.   8 8888          .888888888. `88888. `8b.  ;8.`8888   8888   ,d8P  8 8888   `8b.   8 8888         \n" +
                "      8 8888       8 8888     `88. 8 888888888888 .8'       `8. `88888. `Y8888P ,88P'    `Y88888P'   8 8888     `88. 8 888888888888 ");
        System.out.println("*******************************************************************************\n" +
                "          |                   |                  |                     |\n" +
                " _________|________________.=\"\"_;=.______________|_____________________|_______\n" +
                "|                   |  ,-\"_,=\"\"     `\"=.|                  |\n" +
                "|___________________|__\"=._o`\"-._        `\"=.______________|___________________\n" +
                "          |                `\"=._o`\"=._      _`\"=._                     |\n" +
                " _________|_____________________:=._o \"=._.\"_.-=\"'\"=.__________________|_______\n" +
                "|                   |    __.--\" , ; `\"=._o.\" ,-\"\"\"-._ \".   |\n" +
                "|___________________|_._\"  ,. .` ` `` ,  `\"-._\"-._   \". '__|___________________\n" +
                "          |           |o`\"=._` , \"` `; .\". ,  \"-._\"-._; ;              |\n" +
                " _________|___________| ;`-.o`\"=._; .\" ` '`.\"\\` . \"-._ /_______________|_______\n" +
                "|                   | |o;    `\"-.o`\"=._``  '` \" ,__.--o;   |\n" +
                "|___________________|_| ;     (#) `-.o `\"=.`_.--\"_o.-; ;___|___________________\n" +
                "____/______/______/___|o;._    \"      `\".o|o_.--\"    ;o;____/______/______/____\n" +
                "/______/______/______/_\"=._o--._        ; | ;        ; ;/______/______/______/_\n" +
                "____/______/______/______/__\"=._o--._   ;o|o;     _._;o;____/______/______/____\n" +
                "/______/______/______/______/____\"=._o._; | ;_.--\"o.--\"_/______/______/______/_\n" +
                "____/______/______/______/______/_____\"=.o|o_.--\"\"___/______/______/______/____\n" +
                "/______/______/______/______/______/______/______/______/______/______/__________\n" +
                "*******************************************************************************"
                + Assets.whiteTerminal);
        rest(1000);
        treasure.setCurrentHealth(0);
        player.setCoins(player.getCoins() + 50);
        entities.remove(treasure);
        drawMap();
    }

    public void battle(Character player, Character enemy){
        boolean activeBattle = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("          XX                                    XX\n" +
                "        XX..X                                  X..XX\n" +
                "      XX.....X                                X.....XX\n" +
                " XXXXX.....XX               Get                XX.....XXXXX\n" +
                "X |......XX%,.@          ready for             @#%,XX......| X\n" +
                "X |.....X  @#%,.@          Battle!           @#%,.@  X.....| X\n" +
                "X  \\...X     @#%,.@                      @#%,.@     X.../  X\n" +
                " X# \\.X        @#%,.@                  @#%,.@        X./  #\n" +
                "  ##  X          @#%,.@              @#%,.@          X   #\n" +
                ", \"# #X            @#%,.@          @#%,.@            X ##\n" +
                "   `###X             @#%,.@      @#%,.@             ####'\n" +
                "  . ' ###              @#%.,@  @#%,.@              ###`\"\n" +
                "    . \";\"                @#%.@#%,.@                ;\"` ' .\n" +
                "      '                    @#%,.@                   ,.\n" +
                "      ` ,                @#%,.@  @@                `\n" +
                "                          @@@  @@@                  .");

        rest(1000);
        while (activeBattle){
            if (player.getCurrentHealth() <= 0) {
                activeBattle = false;
                break;
            }
            System.out.println(Messages.yourTurn);
            rest(1500);
            System.out.println(Messages.sideString(enemy.stringPicture(Assets.redTerminal),Messages.stringMoveMenu(enemy),"",5,Assets.redTerminal,Assets.magentaTerminal,Assets.whiteTerminal));
            System.out.println(enemy.getName());
            String enemyHealthBar =enemy.stringDrawHealth();
            String enemyStaminaBar = enemy.stringDrawStamina();
            Messages.sidePrint(enemyHealthBar,enemyStaminaBar,"",enemyHealthBar.split("\\r?\\n")[1].length()+10,Assets.brightRedTerminal,Assets.blueTerminal,Assets.whiteTerminal);
            //System.out.println(player.stringPicture(Assets.blueTerminal));
          System.out.println(Messages.sideString(player.stringPicture(Assets.blueTerminal),Messages.stringMoveMenu(player),"",5,Assets.blueTerminal,Assets.greenTerminal,Assets.whiteTerminal));

            String healthBar =player.stringDrawHealth();
            String staminaBar = player.stringDrawStamina();
            Messages.sidePrint(healthBar,staminaBar,"",healthBar.split("\\r?\\n")[1].length()+10,Assets.brightRedTerminal,Assets.blueTerminal,Assets.whiteTerminal);

            boolean validAttack = false;

            while(!validAttack) {

                System.out.println("Attack");
                if (!player.getEffect1().effectName.equals("none")) {
                    System.out.println(player.getEffect1().effectName + "effect active | " + "active for the next | " + player.getEffect1TurnCounter());
                }
                if (!player.getEffect2().effectName.equals("none")) {
                    System.out.println(player.getEffect2().effectName + "effect active | " + "active for the next | " + player.getEffect2TurnCounter());
                }
                String attack = scan.nextLine();

                String[] commands = attack.split(" ");

                boolean validItem = false;

                switch (commands[0].toLowerCase()) {
                    case "use":
                        switch (commands[1]) {
                            case "item":
                                switch (Integer.parseInt(commands[2])) {
                                    case 1:
                                        try {
                                            useItem(player, enemy, player.getInventory().get(0));
                                            player.getInventory().remove(0);
                                            validItem = true;
                                            turnReducer(player, enemy);
                                            validAttack = true;
                                        }catch (Exception e){
                                            System.out.println("Theere is no item in the inventory slot 1");
                                        }
                                        break;
                                    default:
                                        break;

                                }
                        }
                        break;
                    default:
                        break;
                }

                if (!validItem) {
                    switch (attack) {
                        case "rusted blow":

                            turnReducer(player, enemy);
                            validAttack = true;

                            Messages.drawRustedBlow();
                            Messages.drawSword();

                            useStamina(player, rustedBlow.getAttackStamina());
                            for (SpecialEffects specialEffects : rustedBlow.getSpecialEffects()) {
                                specialEffects(specialEffects, enemy, player, true);
                            }

                            if (randomChance(rustedBlow.getAttackProbability())) {
                                damage(enemy, rustedBlow.getAttackDamage());

                                rest(1000);
                                Messages.drawSucessfulAttack();
                                rest(1000);
                                Messages.drawEnemyHealthPrompt();
                                Messages.drawNumber(-30);
                                rest(1000);
                            } else {
                                Messages.drawFailedAttack();
                                rest(1000);
                            }


                            if (enemy.getCurrentHealth() <= 0) {
                                activeBattle = false;
                                Messages.drawEnemyDefeated();
                                enemy.setCharacterIcon("✟");
                                rest(1000);
                                placeEntities();
                                drawMap();
                            }

                            break;
                        default:
                            if (!validItem) {
                                System.out.println("Not a valid attack please try again");
                            }
                    }


                }
            }

            if(enemy.getCurrentHealth() > 0){
                System.out.println(Messages.enemyTurn);
                rest(1500);

                enemyTurnBattle(enemy,player);
            }


        }

    }

    public void useItem(Character currentEntity, Character enemy, Items item){

        switch (item.getType()){
            case "health":
                currentEntity.setCurrentHealth(currentEntity.getCurrentHealth()+ item.effectPoints);
                System.out.println(Messages.usedItem);
                break;
            case "stamina":
                currentEntity.setCurrentStamina(currentEntity.getMaxStamina()+item.effectPoints);
                break;
            default:
                break;
        }
    }


    public void enemyTurnBattle(Character enemy, Character player){

//            enemy.drawPicture(Assets.greenTerminal);
//            enemy.drawHealth();
//            String currentEffect = "";
//            //System.out.println(player.stringPicture(Assets.blueTerminal));
//            System.out.println(Messages.sideString(player.stringPicture(Assets.blueTerminal),Messages.stringMoveMenu(player),"",5,Assets.blueTerminal,Assets.greenTerminal,Assets.whiteTerminal));
//
//            String healthBar =player.stringDrawHealth();
//            String staminaBar = player.stringDrawStamina();
//            Messages.sidePrint(healthBar,staminaBar,"",healthBar.split("\\r?\\n")[1].length()+10,Assets.brightRedTerminal,Assets.blueTerminal,Assets.whiteTerminal);


                int attack = fiveSidedDice();

                switch (attack) {
                    case  1 :

                        turnReducer(enemy,player);

                        Messages.drawAttack(enemy.getAttacks().get(0).getAttackName());

                        useStamina(enemy, enemy.getAttacks().get(0).getAttackStamina());
                        for(SpecialEffects specialEffects: enemy.getAttacks().get(0).getSpecialEffects()){
                            specialEffects(specialEffects, player,enemy,true);
                        }

                        if(randomChance(enemy.getAttacks().get(0).getAttackProbability())){
                            damage(player, enemy.getAttacks().get(0).getAttackDamage());

                            rest(1000);
                            Messages.drawSucessfulAttack();
                            rest(1000);
                            Messages.drawPlayerHealthPrompt();
                            Messages.drawNumber(enemy.getAttacks().get(0).getAttackDamage()*-1);
                            rest(1000);
                        }else{
                            Messages.drawFailedAttack();
                            rest(1000);
                        }


                        if (player.getCurrentHealth() <= 0) {
                            Messages.drawPlayerDefeated();
                            player.setCharacterIcon("✟");
                            rest(1000);
                            placeEntities();
                            drawMap();
                        }
                        break;
                    case  2 :

                        turnReducer(enemy,player);

                        Messages.drawAttack(enemy.getAttacks().get(1).getAttackName());

                        useStamina(enemy, enemy.getAttacks().get(1).getAttackStamina());
                        for(SpecialEffects specialEffects: enemy.getAttacks().get(1).getSpecialEffects()){
                            specialEffects(specialEffects, player,enemy,true);
                        }

                        if(randomChance(enemy.getAttacks().get(1).getAttackProbability())){
                            damage(player, enemy.getAttacks().get(1).getAttackDamage());

                            rest(1000);
                            Messages.drawSucessfulAttack();
                            rest(1000);
                            Messages.drawPlayerHealthPrompt();
                            Messages.drawNumber(enemy.getAttacks().get(1).getAttackDamage()*-1);
                            rest(1000);
                        }else{
                            Messages.drawFailedAttack();
                            rest(1000);
                        }


                        if (player.getCurrentHealth() <= 0) {
                            Messages.drawPlayerDefeated();
                            player.setCharacterIcon("✟");
                            rest(1000);
                            placeEntities();
                            drawMap();
                        }
                        break;

                    case  3 :

                        turnReducer(enemy,player);

                        Messages.drawAttack(enemy.getAttacks().get(2).getAttackName());

                        useStamina(enemy, enemy.getAttacks().get(2).getAttackStamina());
                        for(SpecialEffects specialEffects: enemy.getAttacks().get(2).getSpecialEffects()){
                            specialEffects(specialEffects, player,enemy,true);
                        }

                        if(randomChance(enemy.getAttacks().get(2).getAttackProbability())){
                            damage(player, enemy.getAttacks().get(2).getAttackDamage());

                            rest(1000);
                            Messages.drawSucessfulAttack();
                            rest(1000);
                            Messages.drawPlayerHealthPrompt();
                            Messages.drawNumber(enemy.getAttacks().get(2).getAttackDamage()*-1);
                            rest(1000);
                        }else{
                            Messages.drawFailedAttack();
                            rest(1000);
                        }


                        if (player.getCurrentHealth() <= 0) {
                            Messages.drawPlayerDefeated();
                            player.setCharacterIcon("✟");
                            rest(1000);
                            placeEntities();
                            drawMap();
                        }
                        break;

                    case  4 :

                        turnReducer(enemy,player);

                        Messages.drawAttack(enemy.getAttacks().get(3).getAttackName());

                        useStamina(enemy, enemy.getAttacks().get(3).getAttackStamina());
                        for(SpecialEffects specialEffects: enemy.getAttacks().get(3).getSpecialEffects()){
                            specialEffects(specialEffects, player,enemy,true);
                        }

                        if(randomChance(enemy.getAttacks().get(3).getAttackProbability())){
                            damage(player, enemy.getAttacks().get(3).getAttackDamage());

                            rest(1000);
                            Messages.drawSucessfulAttack();
                            rest(1000);
                            Messages.drawPlayerHealthPrompt();
                            Messages.drawNumber(enemy.getAttacks().get(3).getAttackDamage()*-1);
                            rest(1000);
                        }else{
                            Messages.drawFailedAttack();
                            rest(1000);
                        }


                        if (player.getCurrentHealth() <= 0) {
                            Messages.drawPlayerDefeated();
                            player.setCharacterIcon("✟");
                            rest(1000);
                            placeEntities();
                            drawMap();
                        }
                        break;

                    default:
                        System.out.println("Enemy attack failed");
                }


    }

    public int fiveSidedDice(){
        Random rand = new Random();
        int num = rand.nextInt(5);
        return num;
    }

    public void turnReducer(Character currentEntity, Character enemy){
        if(currentEntity.getEffect1TurnCounter()>0){
            specialEffects(currentEntity.getEffect1(),enemy,currentEntity,false);
            currentEntity.setEffect1TurnCounter(currentEntity.getEffect1TurnCounter()-1);

        }
        if( currentEntity.getEffect2TurnCounter()>0){
            specialEffects(currentEntity.getEffect2(),enemy,currentEntity,false);
            currentEntity.setEffect2TurnCounter(currentEntity.getEffect2TurnCounter()-1);
        }
    }

    public void specialEffects(SpecialEffects specialEffect,Character enemy,Character currentEntity, boolean roll){
        if(randomChance(specialEffect.effectChance)){
            if (roll) {
                if (currentEntity.getEffect1TurnCounter() == 0) {
                    if(currentEntity.getEffect2TurnCounter() == 0 && (!currentEntity.getEffect2().effectName.equals(currentEntity.getEffect1().effectName)||currentEntity.getEffect2().effectName.equals("none"))){
                        currentEntity.setEffect1(specialEffect);
                        currentEntity.setEffect1TurnCounter(specialEffect.effectTurns);
                    }


                } else if(currentEntity.getEffect2TurnCounter() == 0) {
                    if(currentEntity.getEffect1TurnCounter() == 0 && (!currentEntity.getEffect2().effectName.equals(currentEntity.getEffect1().effectName)||currentEntity.getEffect1().effectName.equals("none"))){
                        currentEntity.setEffect2(specialEffect);
                        currentEntity.setEffect2TurnCounter(specialEffect.effectTurns);
                    }
                }
            }

            switch (specialEffect.effectType){
                case "damage":
                    System.out.println(Messages.effectPrint(specialEffect.effectName));
                    rest(1000);
                    enemy.setCurrentHealth(enemy.getCurrentHealth()-specialEffect.effectScore);
                    break;
                case "heal":
                    currentEntity.setCurrentHealth(currentEntity.getCurrentHealth()+specialEffect.effectScore);
                    break;
                default:
                    break;
            }
        }else{
            return;
        }
    }

    public boolean randomChance(int probability){
        Random rand = new Random();
        int num = rand.nextInt(100);
        if(num < probability){
            return true;
        }
        else {
            return false;
        }
    }



    public void rest(int miliseconds){
        try{
            TimeUnit.MILLISECONDS.sleep(miliseconds);
        }catch (Exception e){
            System.out.println("time out error");
        }
    }

    public void damage(Character character, int damage){
        character.setCurrentHealth(character.getCurrentHealth()-damage);
    }

    public void useStamina(Character character, int usedStamina){
        character.setCurrentStamina(character.getCurrentStamina()-usedStamina);
    }



    public void assignDefaultItems(){
        player.addToInventory(healthPotion50);
        player.addToInventory(staminaPotion50);
    }



}

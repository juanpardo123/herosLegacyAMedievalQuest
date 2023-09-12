package org.example;

import java.util.ArrayList;

public class Character {
    private String name;

    private int coins;

    int index;

    int currentXP;

    int nextLevelXP;

    private static String game;

    private int strength;
    private int speed;
    private int defense;

    private int intelligence;

    private String picture;

    private int level;

    private int maxHealth;

    private int currentHealth;

    private int maxStamina;

    private int currentStamina;

    private int location;

    public String characterIcon;

    private int effect1TurnCounter = 0;

    private SpecialEffects effect1 ;

    private SpecialEffects effect2;

    public SpecialEffects getEffect1() {
        return effect1;
    }

    public void setEffect1(SpecialEffects effect1) {
        this.effect1 = effect1;
    }

    public SpecialEffects getEffect2() {
        return effect2;
    }

    public void setEffect2(SpecialEffects effect2) {
        this.effect2 = effect2;
    }

    public int getEffect1TurnCounter() {
        return effect1TurnCounter;
    }

    public void setEffect1TurnCounter(int effect1TurnCounter) {
        this.effect1TurnCounter = effect1TurnCounter;
    }

    public int getEffect2TurnCounter() {
        return effect2TurnCounter;
    }

    public void setEffect2TurnCounter(int effect2TurnCounter) {
        this.effect2TurnCounter = effect2TurnCounter;
    }

    private int effect2TurnCounter = 0;


    private ArrayList<Items> inventory = new ArrayList<>();

    private ArrayList<Attack> attacks = new ArrayList<>();

    public int getLocation() {
        return location;
    }

    public String getRole() {
        return role;
    }

    public ArrayList<Items> getInventory() {
        return inventory;
    }

    public void addToInventory(Items item){
        inventory.add(item);
    }

    public void removeFromInventory(int index){
        inventory.remove(index);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String role;

    public void setLocation(int location) {
        this.location = location;
    }



    public String getPicture() {
        return picture;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getCurrentXP() {
        return currentXP;
    }

    public void setCurrentXP(int currentXP) {
        this.currentXP = currentXP;
    }

    public int getNextLevelXP() {
        return nextLevelXP;
    }

    public void setNextLevelXP(int nextLevelXP) {
        this.nextLevelXP = nextLevelXP;
    }



    public Character(String name, int speed, int defense, int intelligence, int strength, int level, String picture, int location, String icon, String role){
        this.name =  name;
        this.speed = speed;
        this.defense = defense;
        this.intelligence = intelligence;
        this.strength = strength;
        this.picture = picture;
        this.location = location;
        characterIcon = icon;
        this.role = role;
        this.coins = 100;
        this.currentXP = 0;
        this.nextLevelXP = 100;

        this.level = level;

        int levelCalc = level * 8;


        maxHealth = 200 + levelCalc;
        currentHealth = 200 + levelCalc;
        maxStamina = 300 + levelCalc;
        currentStamina = 300 + levelCalc;

        initEffects();

    }
public void initEffects(){
        SpecialEffects emptyEffect = new SpecialEffects("none", "heal",0,0,0,"none","heal",0,0,0 );
        effect1 = emptyEffect;
        effect2 = emptyEffect;
}
    public void printAttributes(){
        System.out.println("Name:" + name);
        System.out.println("Speed:" + speed);
        System.out.println("Defense:" + defense);
        System.out.println("Intelligence:" + intelligence);
        System.out.println("Strength:" + strength);
    }

    public String getName() {
        return name;
    }

    public void setInventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<Attack> attacks) {
        this.attacks = attacks;
    }

    public void addAttacks(Attack attack){
        this.attacks.add(attack);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getGame() {
        return game;
    }

    public static void setGame(String game) {
        Character.game = game;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void levelUp(){

        level++;

        int levelCalc = level * 8;

        maxHealth = 200 + levelCalc;
        currentHealth = 200 + levelCalc;
        maxStamina = 300 + levelCalc;
        currentStamina = 300 + levelCalc;
    }

    public void drawHealth(){
        int healthTotal = maxHealth/10;
        int healthFill = currentHealth/10;
        int healthEmpty = healthTotal - healthFill;

        System.out.println(Assets.redTerminal);

        String fill = "█";

        String empty = "▒";

        System.out.println("Health: " + currentHealth + "/" + maxHealth);

        for(int i =0; i < healthFill; i++){
            System.out.print(fill);
        }
        for (int i =0; i <healthEmpty;i++){
            System.out.print(empty);
        }
        System.out.println(Assets.whiteTerminal);

    }

    public String stringDrawHealth(){
        int healthTotal = maxHealth/10;
        int healthFill = currentHealth/10;
        int healthEmpty = healthTotal - healthFill;

        String newString = "";


        newString += Assets.redTerminal;

        String fill = "█";

        String empty = "▒";

        newString = "Health: " + currentHealth + "/" + maxHealth +"\n";

        for(int i =0; i < healthFill; i++){
            newString += fill;
        }
        for (int i =0; i <healthEmpty;i++){
            newString += empty;
        }
        newString+=Assets.whiteTerminal;
return newString;
    }

    public void drawStamina(){
        int staminaTotal = maxStamina/10;
        int staminaFill = currentStamina/10;
        int staminaEmpty = staminaTotal - staminaFill;

        System.out.println(Assets.brightBlueTerminal);

        String fill = "█";

        String empty = "▒";

        System.out.println("Stamina: " + currentStamina + "/" + maxStamina);

        for(int i =0; i < staminaFill; i++){
            System.out.print(fill);
        }
        for (int i =0; i <staminaEmpty;i++){
            System.out.print(empty);
        }
        System.out.println(Assets.whiteTerminal);
    }

    public String stringDrawStamina(){
        int staminaTotal = maxStamina/10;
        int staminaFill = currentStamina/10;
        int staminaEmpty = staminaTotal - staminaFill;

        System.out.print(Assets.brightBlueTerminal);

        String newString = "";

        String fill = "█";

        String empty = "▒";

        newString += "Stamina: " + currentStamina + "/" + maxStamina + "\n";

        for(int i =0; i < staminaFill; i++){
            newString += fill;
        }
        for (int i =0; i <staminaEmpty;i++){
            newString += empty;
        }
        return newString;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public int getCurrentStamina() {
        return currentStamina;
    }

    public void setCurrentStamina(int currentStamina) {
        this.currentStamina = currentStamina;
    }

    public String getCharacterIcon() {
        return characterIcon;
    }

    public void setCharacterIcon(String characterIcon) {
        this.characterIcon = characterIcon;
    }

    public void drawPicture(){

        System.out.println(picture);
    }

    public void drawPicture(String color){
        System.out.println(color);
        System.out.println(picture);
        System.out.println(Assets.whiteTerminal);
    }

    public String stringPicture(String color){
        String newpicture = "";
        newpicture += color + "\n";
        newpicture += picture + "\n";
        newpicture += Assets.whiteTerminal;

        return newpicture;
    }
}


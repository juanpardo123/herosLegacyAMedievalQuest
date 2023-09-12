package org.example;

import java.util.ArrayList;

public class Attack {
    private String attackPicture;

    private String attackName;
    private int attackDamage;

    private int attackStamina;

    private String type;

    private int attackProbability;

    private String specialEffectDesc;

    private ArrayList<SpecialEffects> specialEffects = new ArrayList<>();

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<SpecialEffects> getSpecialEffects() {
        return specialEffects;
    }


    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public void addSpecialEffects(SpecialEffects specialEffect){
        specialEffects.add(specialEffect);
    }

    public int getAttackStamina() {
        return attackStamina;
    }

    public void setAttackStamina(int attackStamina) {
        this.attackStamina = attackStamina;
    }

    public int getAttackProbability() {
        return attackProbability;
    }

    public void setAttackProbability(int attackProbability) {
        this.attackProbability = attackProbability;
    }

    public String getSpecialEffectDesc() {
        return specialEffectDesc;
    }

    public void setSpecialEffectDesc(String specialEffectDesc) {
        this.specialEffectDesc = specialEffectDesc;
    }

    public Attack(String attackPicture, String attackName, int attackProbability, int attackDamage, int attackStamina, ArrayList<SpecialEffects> specialEffects, String specialEffectDesc, String type){
        this.attackPicture = attackPicture;
        this.attackName = attackName;
        this.attackProbability = attackProbability;
        this.attackDamage = attackDamage;
        this.attackStamina = attackStamina;
        this.specialEffects = specialEffects;
        this.specialEffectDesc = specialEffectDesc;
        this.type = type;
    }
    public Attack(String attackPicture, String attackName, int attackProbability, int attackDamage, int attackStamina, String specialEffectDesc, String type){
        this.attackPicture = attackPicture;
        this.attackName = attackName;
        this.attackProbability = attackProbability;
        this.attackDamage = attackDamage;
        this.attackStamina = attackStamina;
        this.specialEffectDesc = specialEffectDesc;
        this.type = type;
    }

    public String getAttackPicture() {
        return attackPicture;
    }

    public void setAttackPicture(String attackPicture) {
        this.attackPicture = attackPicture;
    }
}

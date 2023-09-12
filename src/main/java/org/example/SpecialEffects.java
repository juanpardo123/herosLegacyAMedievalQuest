package org.example;

public class SpecialEffects {
    //0           ,1          , 2           , 3            , 4           ,5                ,6          , 7              , 8                 , 9                  , 10
    String effectName;
    String effectType;
    int effectScore;
    int effectChance;
    int effectTurns;
    String sideEffectName;
    String sideEffectType;
    int sideEffectScore;
    int sideEffectChance;
    int sideEffectTurns;

    public SpecialEffects(String effectName, String effectType, int effectScore, int effectChance, int effectTurns, String sideEffectName, String sideEffectType, int sideEffectScore, int sideEffectChance, int sideEffectTurns){
        this.effectName = effectName;
        this.effectType = effectType;
        this.effectScore = effectScore;
        this.effectChance = effectChance;
        this.effectTurns = effectTurns;
        this.sideEffectName = sideEffectName;
        this.sideEffectType = sideEffectType;
        this.sideEffectScore =sideEffectScore;
        this.sideEffectChance=sideEffectChance;
        this.sideEffectTurns= sideEffectTurns;

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccerteammanagementapp;

/**
 *
 * @author applemac
 */
public class Forward extends Player{
      private int goalsScored;

    public Forward(String name, int age) {
        super(name, age, "Forward");
        this.goalsScored = 0;
    }

    public void recordGoal() {
        goalsScored++;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Goals Scored: " + goalsScored;
    }
    
}

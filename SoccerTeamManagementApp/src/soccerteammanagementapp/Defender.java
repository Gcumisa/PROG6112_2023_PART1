/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccerteammanagementapp;

/**
 *
 * @author applemac
 */
public class Defender extends Player {
      private int tacklesMade;

    public Defender(String name, int age) {
        super(name, age, "Defender");
        this.tacklesMade = 0;
    }

    public void makeTackle() {
        tacklesMade++;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Tackles Made: " + tacklesMade;
    }
}
    


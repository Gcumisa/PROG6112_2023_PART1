/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soccerteammanagementapp;

/**
 *
 * @author applemac
 */
public class SoccerTeamManagementApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Team teamA = new Team("Team A", 11);

        Forward forward1 = new Forward("Forward 1", 25);
        Defender defender1 = new Defender("Defender 1", 28);

        forward1.recordGoal();
        // Corrected the method call for a defender
        defender1.makeTackle();

        teamA.addPlayer(forward1);
        teamA.addPlayer(defender1);

        teamA.listPlayers();
    }
}

    
    


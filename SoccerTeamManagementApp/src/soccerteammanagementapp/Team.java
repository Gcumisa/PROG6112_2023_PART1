/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccerteammanagementapp;

/**
 *
 * @author applemac
 */
public class Team {
      private String name;
    private Player[] players;
    private int playerCount;

    public Team(String name, int maxPlayers) {
        this.name = name;
        this.players = new Player[maxPlayers];
        this.playerCount = 0;
    }

    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
        } else {
            System.out.println("Team is full. Cannot add more players.");
        }
    }

    public void listPlayers() {
        System.out.println("Team: " + name + " Roster:");
        for (int i = 0; i < playerCount; i++) {
            System.out.println(players[i].getDetails());
        }
    }
}
    


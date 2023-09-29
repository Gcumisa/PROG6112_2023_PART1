/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import soccerteammanagementapp.Defender;
import soccerteammanagementapp.Forward;
import soccerteammanagementapp.Player;
import soccerteammanagementapp.Team;

public class TeamManagementTest {
    private Team teamA;
    
   
    public void setUp() {
        teamA = new Team("Team A", 11);
    }

    @Test
    public void testAddPlayer() {
        Forward forward1 = new Forward("Forward 1", 25);
        teamA.addPlayer(forward1);
        
        Player[] players = teamA.getPlayers();
        assertEquals(1, players.length);
        assertEquals(forward1, players[0]);
    }

    @Test
    public void testListPlayers() {
        Forward forward1 = new Forward("Forward 1", 25);
        Defender defender1 = new Defender("Defender 1", 28);

        teamA.addPlayer(forward1);
        teamA.addPlayer(defender1);

        String expectedRoster = "Team: Team A Roster:\n" +
                                "Name: Forward 1, Age: 25, Position: Forward, Goals Scored: 1\n" +
                                "Name: Defender 1, Age: 28, Position: Defender, Tackles Made: 1\n";
        
        assertEquals(expectedRoster, teamA.listPlayers());
    }
}

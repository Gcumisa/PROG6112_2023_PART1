/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccerteammanagementapp;

/**
 *
 * @author applemac
 */
public class Player {
    private String name;
    private int age;
    private String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Position: " + position;
    }
}
    


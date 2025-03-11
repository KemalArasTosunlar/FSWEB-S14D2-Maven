package org.example.model;

public class Wall {
    private String direction;

    // Constructor
    public Wall(String direction) {
        this.direction = direction;
    }

    // Getter method
    public String getDirection() {
        return direction;
    }

    // Method
    public void create() {
        System.out.println("Wall has been built.");
    }
}

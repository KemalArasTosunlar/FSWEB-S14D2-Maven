package org.example.model;

public class Bed {
    private String type;
    private int quilts;
    private int width;
    private int pillows;
    private int sheets;

    // Updated constructor to accept a String and the correct number of integers
    public Bed(String type, int quilts, int width, int pillows, int sheets) {
        this.type = type;
        this.quilts = quilts;
        this.width = width;
        this.pillows = pillows;
        this.sheets = sheets;
    }

    // Getter methods for each field
    public String getType() {
        return type;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getWidth() {
        return width;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    // New method to return the style of the bed (i.e., the type)
    public String getStyle() {
        return type;
    }

    // New method to return the height of the bed (you can define this based on your requirements)
    public int getHeight() {
        return 50; // Placeholder value for height, modify if you need a real calculation
    }

    // Method to simulate making the bed
    public void make() {
        System.out.println("The bed has been made with " + quilts + " quilts, " + pillows + " pillows, and " + sheets + " sheets.");
    }
}

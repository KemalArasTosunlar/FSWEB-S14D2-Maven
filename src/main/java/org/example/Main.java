package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        // Create the walls
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        // Create the ceiling with its size and color
        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);

        // Create the bed with the appropriate constructor parameters:
        // Type, number of quilts, bed width, number of pillows, and number of sheets
        Bed bed = new Bed("Wooden", 2, 180, 2, 1);

        // Create the lamp
        Lamp lamp = new Lamp(LampType.NORMAL, true, 5);

        // Create the wardrobe
        Wardrobe wardrobe = new Wardrobe(200, 180, 50.5);

        // Create the carpet
        Carpet carpet = new Carpet(200, 150, PaintColor.RED);

        // Create the bedroom with all the components
        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        // Output the details of the bedroom and interact with its components
        System.out.println("Bedroom Name: " + bedroom.getName());

        // Call the make method of the bed
        bedroom.getBed().make();

        // Call the turnOn method of the lamp
        bedroom.getLamp().turnOn();

        // Add an item to the wardrobe
        bedroom.getWardrobe().add();

        // Lay the carpet
        bedroom.getCarpet().lying();

        // Create the ceiling
        bedroom.getCeiling().create();
    }
}

package org.example.robotdrivetrain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import org.example.robotdrivetrain.drivesystem.DriveSystemName;
import org.example.robotdrivetrain.drivesystem.DriveSystemAbstractFactory;
import org.example.robotdrivetrain.drivesystem.DriveSystemFactory;

public class Main {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: <DriveSystemName> <InstructionsFile>");
            System.out.println("where DriveSystemName is one of " + Arrays.toString(DriveSystemName.values()));
            System.exit(1);
        }

        // todo: replace with Scanner & try-with-resources
        BufferedReader reader;
        try {
            DriveSystemFactory factory = DriveSystemAbstractFactory
                .getFactory(DriveSystemName.valueOf(args[0]));
            Robot robot = new Robot(factory.newInstance());
            System.out.println(robot.pose());

            reader = new BufferedReader(new FileReader(args[1]));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(robot.move(new Command(line)));
                line = reader.readLine();
            }
        } catch (IllegalArgumentException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package org.example.robotdrivetrain.drivesystem;

import java.util.Arrays;

public class DriveSystemAbstractFactory {

    public static DriveSystemFactory getFactory(DriveSystemName driveSystemName) {
        switch (driveSystemName) {
            case SWERVE:
                return new SwerveDriveFactory();
            default:
                throw new IllegalArgumentException("Drive System must be one of " + Arrays.toString(DriveSystemName.values()));
        }
    }
}

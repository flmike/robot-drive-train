package org.example.robotdrivetrain.drivesystem;

public class SwerveDriveFactory implements DriveSystemFactory {
    @Override
    public DriveSystem newInstance() {
        return new SwerveDrive();
    }
}

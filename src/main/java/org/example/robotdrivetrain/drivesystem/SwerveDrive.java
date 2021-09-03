package org.example.robotdrivetrain.drivesystem;

import org.example.robotdrivetrain.Command;
import org.example.robotdrivetrain.JoystickInput;
import org.example.robotdrivetrain.Pose;

public class SwerveDrive implements DriveSystem {
    @Override
    public Pose move(Pose pose, Command command) {
        switch (command.getInput()) {
            case L:
                break;
            case R:
                break;
            case F:
                pose.forward();
            case B:
                break;
            default:
                throw new IllegalArgumentException();
        }
        return pose;
    }
}

package org.example.robotdrivetrain.drivesystem;

import org.example.robotdrivetrain.Command;
import org.example.robotdrivetrain.Pose;

public interface DriveSystem {
    Pose move(Pose pose, Command command);
}

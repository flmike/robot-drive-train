package org.example.robotdrivetrain;

import org.example.robotdrivetrain.drivesystem.DriveSystem;

public class Robot {
    private Pose pose = Pose.initialPose();
    private DriveSystem driveSystem;

    public Robot(DriveSystem driveSystem) {
        this.driveSystem = driveSystem;
    }

    public Pose pose() {
        return pose;
    }

    public Pose move(Command command) {
        pose = this.driveSystem.move(pose, command);
        return pose;
    }
}

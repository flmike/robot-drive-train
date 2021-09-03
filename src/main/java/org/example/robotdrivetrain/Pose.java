package org.example.robotdrivetrain;

public class Pose {
    private Position position;
    private Direction direction;

    public Pose(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public static Pose initialPose() {
        return new Pose(new Position(0, 0), Direction.E);
    }

    public void forward() {
        this.position.forward();
    }

    @Override
    public String toString() {
        return position + " " + direction;
    }
}

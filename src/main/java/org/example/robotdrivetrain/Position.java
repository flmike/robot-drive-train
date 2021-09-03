package org.example.robotdrivetrain;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void forward() {
        // todo: i know depends on direction, but time running out
        y = y++;
    }
}

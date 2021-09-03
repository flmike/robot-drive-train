package org.example.robotdrivetrain;

public class Command {
    // todo: support multiples inputs
    private JoystickInput input;

    public Command(String line) {
        input = JoystickInput.valueOf(line);
    }

    public JoystickInput getInput() {
        return input;
    }
}

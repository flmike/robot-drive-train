Project uses gradle wrapper.

To build:
```
./gradlew assemble
```

To run, for example Swerve Drive System and single joystick instruction file:
```
java -jar build/libs/robot-drive-train-1.0-SNAPSHOT.jar SWERVE single-stick-instructions.csv
```

```
java -jar build/libs/robot-drive-train-1.0-SNAPSHOT.jar TANK double-stick-instructions.csv
```

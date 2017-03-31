package org.usfirst.frc.team3356.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name.
 * This provides flexibility changing wiring, makes checking the wiring easier and significantly
 * reduces the number of magic numbers floating around.
 */
public class RobotMap
{

  public static RobotDrive driveTrainMotors;

  public static CANTalon fLeft;
  public static CANTalon fRight;
  public static CANTalon rLeft;
  public static CANTalon rRight;

  public static CANTalon climber;

  public static void init() {

    fLeft = new CANTalon(21);
    fRight = new CANTalon(22);
    rLeft = new CANTalon(23);
    rRight = new CANTalon(24);

    climber = new CANTalon(27);

    driveTrainMotors = new RobotDrive(fLeft, rLeft, fRight, rRight);

    driveTrainMotors.setSafetyEnabled(true);
    driveTrainMotors.setExpiration(0.1);
    driveTrainMotors.setSensitivity(0.6);
    driveTrainMotors.setMaxOutput(1.0);
  }
}

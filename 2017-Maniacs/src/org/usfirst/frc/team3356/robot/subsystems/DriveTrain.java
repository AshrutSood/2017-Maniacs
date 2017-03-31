package org.usfirst.frc.team3356.robot.subsystems;

import org.usfirst.frc.team3356.robot.RobotMap;
import org.usfirst.frc.team3356.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem
{
  public DriveTrain() {
    RobotMap.driveTrainMotors.setExpiration(1.0);
  }

  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive());
  }

  public void move(double left, double right) {
    RobotMap.driveTrainMotors.tankDrive(-left, -right);
  }

  public void stop() {
    RobotMap.driveTrainMotors.stopMotor();
  }
}

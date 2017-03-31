package org.usfirst.frc.team3356.robot.subsystems;

import org.usfirst.frc.team3356.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem
{

  public void initDefaultCommand() {}

  public void move(double value) {
    RobotMap.climber.set(value);
  }

  public void climb() {
    move(-1.0);
  }

  public void stop() {
    move(0.0);
  }
}

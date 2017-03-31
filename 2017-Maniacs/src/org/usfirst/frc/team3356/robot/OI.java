package org.usfirst.frc.team3356.robot;

import org.usfirst.frc.team3356.robot.commands.ClimbRope;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator interface to the commands
 * and command groups that allow control of the robot.
 */
public class OI
{
  public static Joystick joystick0;
  public static Joystick joystick1;

  public JoystickButton joystick1button3;

  public OI() {
    joystick0 = new Joystick(0);
    joystick1 = new Joystick(1);
    joystick1button3 = new JoystickButton(joystick1, 3);
    joystick1button3.whileHeld(new ClimbRope());
  }

  public double getJoystick0() {
    return joystick0.getY();
  }

  public double getJoystick1() {
    return joystick1.getY();
  }
}

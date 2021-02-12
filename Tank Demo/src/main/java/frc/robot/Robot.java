/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private Joystick m_leftStick;
  private Joystick m_rightStick;
  private TalonSRX frontLeft;
  private TalonSRX frontRight;
  private TalonSRX backLeft;
  private TalonSRX backRight;

  @Override
  public void robotInit() {
    frontLeft = new TalonSRX(0);
    frontRight = new TalonSRX(1);
    backLeft = new TalonSRX(2);
    backRight = new TalonSRX(3);
    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(1);
  }

  @Override
  public void teleopPeriodic() {
    frontLeft.set(ControlMode.Velocity,m_leftStick.getY());
    frontRight.set(ControlMode.Velocity, m_rightStick.getY());
    backLeft.set(ControlMode.Velocity, m_leftStick.getY());
    backRight.set(ControlMode.Velocity, m_rightStick.getY());
    
  }
}

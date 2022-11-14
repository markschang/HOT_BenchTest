

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

public class Robot extends TimedRobot {

  Joystick stick = new Joystick(0);
  double xAxis;
  TalonFX motor = new TalonFX(2);

  @Override
  public void robotInit() {
  }


  @Override
  public void robotPeriodic() {}


  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {

  }

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    motor.set(ControlMode.PercentOutput, 0.1);
    xAxis = stick.getRawAxis(0);  /* axis 0 = left x axis*/
    SmartDashboard.putNumber("Left X", xAxis);
    SmartDashboard.putNumber("HOT", 67);
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}

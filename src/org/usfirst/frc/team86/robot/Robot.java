
package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {
	@Override
	public void robotInit() {
	}

	
	@Override
	public void autonomousInit() {
	}

	
	@Override
	public void autonomousPeriodic() {
	}
	
	@Override
	public void teleopInit() {
		IO.left.setSelectedSensorPosition(0);
		IO.right.setSelectedSensorPosition(0);
		SmartDashboard.putNumber("Encoder Val left", 0);
	    SmartDashboard.putNumber("Encoder Val right", 0);
	}

	@Override
	public void teleopPeriodic() {
		Drive.Update();
	}

	
	@Override
	public void testPeriodic() {
	}
}

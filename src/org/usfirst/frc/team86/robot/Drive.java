package org.usfirst.frc.team86.robot;

import org.usfirst.frc.team86.robot.IO;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drive {
	public static void Update() {
		
		//Tells robot to power the motors
		IO.right.set(ControlMode.PercentOutput,.5*(IO.control.getRawAxis(5)));
		IO.left.set(ControlMode.PercentOutput,.5*(-IO.control.getRawAxis(1)));
		//SmartDashboard useful information
	    SmartDashboard.putNumber("Encoder Val left", IO.left.getSelectedSensorPosition(0));
	    SmartDashboard.putNumber("Encoder Val right", IO.right.getSelectedSensorPosition(0));
	    SmartDashboard.putNumber("NormAngle", IO.navX.getNormalizedAngle());
	    SmartDashboard.putNumber("Angle", IO.navX.getAngle());
	}
}

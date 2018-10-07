package org.usfirst.frc.team86.robot;


import org.usfirst.frc.team86.util.NavX;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;

public class IO {
	
//Talon Speed Controllers
public static TalonSRX right = new TalonSRX(56);
public static TalonSRX left = new TalonSRX(57);

//Xbox Controller Object
public static Joystick control =new Joystick(0);

//NavX-MXP navigation sensor
	public static NavX navX = new NavX();
	
	
}

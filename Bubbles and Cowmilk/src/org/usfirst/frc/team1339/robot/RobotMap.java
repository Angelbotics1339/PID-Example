/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1339.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public final static int rightTopDriveMotor = 1;
	public final static int rightFrontDriveMotor = 2;
	public final static int rightBackDriveMotor = 3;
	public final static int leftTopDriveMotor = 12;
	public final static int leftFrontDriveMotor = 11;
	public final static int leftBackDriveMotor = 10;
	
	public final static int joystickPort = 0;
	public final static int joystickYbutton = 4;
	
	public final static int rightYAxis = 5;
	public final static int leftYAxis = 1; 
	public final static int rightXAxis = 4; 
	
	public final static int rightLEDStripId = 1;
	public final static int leftLEDStripId = 2;
	
	public final static double p = 0.0007;
	public final static double i = 0.00001;
	public final static double d = 0.00002;
}

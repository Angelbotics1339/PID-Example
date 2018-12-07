package org.usfirst.frc.team1339.robot.subsystems;

import org.usfirst.frc.team1339.robot.RobotMap;
import org.usfirst.frc.team1339.robot.commands.Christmas;
import org.usfirst.frc.team1339.utils.leds.AngelLight;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

public class Sparkles extends Subsystem {
	public AngelLight leftLights;
	public AngelLight rightLights;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Christmas());
    }
    public Sparkles () {
    	leftLights = new AngelLight(RobotMap.leftLEDStripId);
    	rightLights = new AngelLight(RobotMap.rightLEDStripId);
    
    }
}


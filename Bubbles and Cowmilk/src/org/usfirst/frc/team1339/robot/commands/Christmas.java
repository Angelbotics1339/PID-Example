package org.usfirst.frc.team1339.robot.commands;

import org.usfirst.frc.team1339.utils.leds.Color;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Christmas extends CommandBase {
	private boolean green = false;
    public Christmas() {
        // Use requires() here to declare subsystem dependencies
         requires(sparkles);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(sparkles.leftLights.done) {
    		if(!green) {
    			sparkles.leftLights.fade(new Color(255,0,0), new Color(0,255,0), 4);
    			green = true;
    		}
    		else {
    			sparkles.leftLights.fade(new Color(0,255,0), new Color(255,0,0), 4);
    			green = false;
    		}
    	}
    	sparkles.leftLights.updateLED();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

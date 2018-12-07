package org.usfirst.frc.team1339.robot.commands;

import org.usfirst.frc.team1339.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FrikinGo extends CommandBase {

    public FrikinGo() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(dino);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double throttle = oi.stick.getRawAxis(RobotMap.leftYAxis);
    	double turn = oi.stick.getRawAxis(RobotMap.rightXAxis);
    	double left = throttle + turn;
    	double right = throttle - turn;
    	dino.setMotorValues(left*left*left, right*right*right);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	dino.setMotorValues(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	dino.setMotorValues(0, 0);
    }
}

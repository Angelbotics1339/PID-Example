package org.usfirst.frc.team1339.robot.subsystems;

import org.usfirst.frc.team1339.robot.RobotMap;
import org.usfirst.frc.team1339.robot.commands.FrikinGo;
import org.usfirst.frc.team1339.utils.leds.SynchronousPID;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Dino extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public TalonSRX leftTop;
	TalonSRX leftFront;
	TalonSRX leftBack;
	public TalonSRX rightTop;
	TalonSRX rightFront;
	TalonSRX rightBack;
	
	public SynchronousPID chips;
	
	public Dino() {
		leftTop=new TalonSRX(RobotMap.leftTopDriveMotor);
		leftFront=new TalonSRX(RobotMap.leftFrontDriveMotor);
		leftFront.setInverted(true);
		leftBack = new TalonSRX(RobotMap.leftBackDriveMotor);
		rightTop = new TalonSRX(RobotMap.rightTopDriveMotor);
		rightFront = new TalonSRX(RobotMap.rightFrontDriveMotor);
		rightBack = new TalonSRX(RobotMap.rightBackDriveMotor);
		leftFront.follow(leftTop);
		leftBack.follow(leftTop);
		rightFront.follow(rightTop);
		rightBack.follow(rightTop);
		
		leftTop.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
		rightTop.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
		leftTop.setSensorPhase(false);
		
		chips = new SynchronousPID(RobotMap.p, RobotMap.i, RobotMap.d);
		leftTop.setSelectedSensorPosition(0, 0, 10);
    	rightTop.setSelectedSensorPosition(0, 0, 10);
		//leftTop.setInverted(true);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new FrikinGo());
    }
    public void setMotorValues(double left, double right) {
    	System.out.println(-leftTop.getSelectedSensorPosition(0) + " , " + rightTop.getSelectedSensorPosition(0));
    	leftTop.set(ControlMode.PercentOutput, left);
    	rightTop.set(ControlMode.PercentOutput, -right);
    	
    }
    
    public void guacamole() {
    	chips.calculate((-leftTop.getSelectedSensorPosition(0) + rightTop.getSelectedSensorPosition(0))/2);
    	double devil = chips.get();
    	System.out.println(devil);
    	setMotorValues(devil, devil);
    }
}

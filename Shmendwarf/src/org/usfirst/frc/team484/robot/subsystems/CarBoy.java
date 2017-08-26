package org.usfirst.frc.team484.robot.subsystems;

import org.usfirst.frc.team484.robot.OI;
import org.usfirst.frc.team484.robot.Robot;
import org.usfirst.frc.team484.robot.commands.DriveBoy;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CarBoy extends Subsystem {
	//carBoy is a subsystem for SwerveDrive

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveBoy());
    }
    public void halfCarhalfBoy(){
    	Robot.swervey.drive(OI.SwarveStick.getDirectionDegrees(), OI.SwarveStick.getMagnitude(), -OI.SwarveStick.getTwist());
    }
    public void driveAtSpeed(double speed){
    	Robot.swervey.drive(0, speed, 0);
    }
    public void kickIt(double speed){
    	Robot.swervey.drive(90, speed, 0);
    }
}


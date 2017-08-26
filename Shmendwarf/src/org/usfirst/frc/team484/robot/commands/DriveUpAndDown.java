package org.usfirst.frc.team484.robot.commands;

import org.usfirst.frc.team484.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveUpAndDown extends Command {
	

	double speed;
	
    public DriveUpAndDown(double speed) {
    	this.speed = speed;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.carBoy);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.carBoy.kickIt(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.carBoy.halfCarhalfBoy();
    }
}
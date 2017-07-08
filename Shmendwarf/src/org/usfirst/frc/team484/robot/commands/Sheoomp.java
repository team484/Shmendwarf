package org.usfirst.frc.team484.robot.commands;

import org.usfirst.frc.team484.robot.Robot;
import org.usfirst.frc.team484.robot.subsystems.SphereIntake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Sheoomp extends Command {

    public Sheoomp() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.sphereIntake);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.sphereIntake.setSheoomp(0.7);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.sphereIntake.setSheoomp(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}

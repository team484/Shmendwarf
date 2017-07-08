package org.usfirst.frc.team484.robot.subsystems;

import org.usfirst.frc.team484.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SphereIntake extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void goSheoomp(){
    	Robot.sheOomp.set(-0.7);
    }
    public void noSheoomp(){
    	Robot.sheOomp.set(0);
    }
    public void antiSheoomp(){
    	Robot.sheOomp.set(0.7);
    }
    
}


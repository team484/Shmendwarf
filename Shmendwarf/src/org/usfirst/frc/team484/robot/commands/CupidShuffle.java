package org.usfirst.frc.team484.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class CupidShuffle extends CommandGroup {

    public CupidShuffle() {
    	addSequential(new DriveSpeed(0.4), 0.5); //right
    	addSequential(new WaitCommand(0.25));
    	addSequential(new DriveSpeed(0.4), 0.5); //right
    	addSequential(new WaitCommand(0.25));
    	addSequential(new DriveSpeed(0.4), 0.5); //right
    	addSequential(new WaitCommand(0.25));
    	addSequential(new DriveSpeed(0.4), 0.5); //right
    	addSequential(new WaitCommand(0.25));
    	
    	addSequential(new DriveSpeed(-0.4), 0.5); //left
    	addSequential(new WaitCommand(0.25));
    	addSequential(new DriveSpeed(-0.4), 0.5); //left
    	addSequential(new WaitCommand(0.25));
    	addSequential(new DriveSpeed(-0.4), 0.5); //left
    	addSequential(new WaitCommand(0.25));
    	addSequential(new DriveSpeed(-0.4), 0.5); //left
    	addSequential(new WaitCommand(0.25));
    	
    	addSequential(new DriveUpAndDown(0.4), 0.25); //forward
    	addSequential(new DriveUpAndDown(-0.4), 0.25); //back
    	addSequential(new WaitCommand(0.25));
    	addSequential(new DriveUpAndDown(0.4), 0.25);
    	addSequential(new DriveUpAndDown(-0.4), 0.25);//kick
    	addSequential(new WaitCommand(0.25));
    	addSequential(new DriveUpAndDown(0.4), 0.25);
    	addSequential(new DriveUpAndDown(-0.4), 0.25);
    	addSequential(new WaitCommand(0.25));
    	addSequential(new DriveUpAndDown(0.4), 0.25);
    	addSequential(new DriveUpAndDown(-0.4), 0.25);
    	
    	

        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}

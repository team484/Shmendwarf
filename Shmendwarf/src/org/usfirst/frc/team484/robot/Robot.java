
package org.usfirst.frc.team484.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team484.robot.commands.ExampleCommand;
import org.usfirst.frc.team484.robot.commands.CupidShuffle;
import org.usfirst.frc.team484.robot.subsystems.AscendModule;
import org.usfirst.frc.team484.robot.subsystems.CarBoy;
import org.usfirst.frc.team484.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team484.robot.subsystems.Shooter;
import org.usfirst.frc.team484.robot.subsystems.SphereIntake;
import org.usfirst.frc.team484.robot.subsystems.AgitatorOne;

import com.ctre.CANTalon;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	public static final VictorSP sheOomp = new VictorSP(3);
	public static final VictorSP climberLeft = new VictorSP(0);
	public static final VictorSP climberTwo = new VictorSP(1);
	public static final CANTalon highnoon = new CANTalon(9);
	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static final VictorSP agitated = new VictorSP(2);
	public static final CANTalon FlCim = new CANTalon(1);
	public static final CANTalon FlRot = new CANTalon(2);
	public static final CANTalon RlCim = new CANTalon(3);
	public static final CANTalon RlRot = new CANTalon(4);
	public static final CANTalon FrCim = new CANTalon(5);
	public static final CANTalon FrRot = new CANTalon(6);
	public static final CANTalon RrCim = new CANTalon(7);
	public static final CANTalon RrRot = new CANTalon(8);
	public static final Encoder FLencoder = new Encoder(0,1);
	public static final Encoder RLencoder = new Encoder(2,3);
	public static final Encoder FRencoder = new Encoder(4,5);
	public static final Encoder RRencoder = new Encoder(6,7);
	public static final SwerveDrive swervey = new SwerveDrive(0.03, 0.0, 0.0, FLencoder, RLencoder, FRencoder, RRencoder, FlRot, RlRot, FrRot, RrRot, FlCim, RlCim, FrCim, RrCim, false);
	public static OI oi;

	Command autonomousCommand = new CupidShuffle();
	public static final SphereIntake sphereIntake = new SphereIntake();
	public static final AscendModule ascendModule = new AscendModule();
	public static final Shooter shooter = new Shooter();
	public static final AgitatorOne agitator = new AgitatorOne();
	public static final CarBoy carBoy = new CarBoy();
			
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		FLencoder.setDistancePerPulse(0.86694762);
		RLencoder.setDistancePerPulse(0.86694762);
		FRencoder.setDistancePerPulse(0.86694762);
		RRencoder.setDistancePerPulse(0.86694762);
		swervey.setWheelbaseDimensions(26, 18);

	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {
		FlRot.enableBrakeMode(false);
		RlRot.enableBrakeMode(false);
		FrRot.enableBrakeMode(false);
		RrRot.enableBrakeMode(false);
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		FlRot.enableBrakeMode(true);
		RlRot.enableBrakeMode(true);
		FrRot.enableBrakeMode(true);
		RrRot.enableBrakeMode(true);

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		autonomousCommand.cancel();
		FlRot.enableBrakeMode(true);
		RlRot.enableBrakeMode(true);
		FrRot.enableBrakeMode(true);
		RrRot.enableBrakeMode(true);
		
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}

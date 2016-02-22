package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterAim extends Command {

    public ShooterAim() {
    	requires(Robot.aimer);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	if(Robot.aimer.aimpot.get() > 4.3){
//    		Robot.aimer.aimshooter(-.5);
//    	}else if(Robot.aimer.aimpot.get() < 2.7){
//    		Robot.aimer.aimshooter(.5);
//    	}else{{
    		Robot.aimer.aimshooter(Robot.oi.getxbox().getRawAxis(5));
    	}
    	
//    }

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

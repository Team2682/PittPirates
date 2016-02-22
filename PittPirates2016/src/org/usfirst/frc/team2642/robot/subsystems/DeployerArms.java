package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.MoveLowArms;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DeployerArms extends Subsystem {
    Talon dmotor = new Talon(RobotMap.deploymotor);
    public AnalogPotentiometer dpot = new AnalogPotentiometer(RobotMap.deploypot);
    
    public void lowerarms(){
    	dmotor.set(-.4);
    }
    public void raisearms(){
    	dmotor.set(.4);
    }
    public void lowidle(){
    	dmotor.set(0);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new MoveLowArms());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


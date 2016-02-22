package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Aimer extends Subsystem {
	Talon aimmotor = new Talon(RobotMap.aimmotor);
	public AnalogPotentiometer aimpot = new AnalogPotentiometer(RobotMap.aimpot);
	
	public void aimshooter(double speed){
		aimmotor.set(speed);
	}
	public void idleaim(){
		aimmotor.set(0);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


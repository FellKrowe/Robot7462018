// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc746.Robot7462018;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static SpeedController armarmMotor;
    public static SpeedController intakeintakeMotor;
    public static SpeedController intakeintakeMotor2;
    
    public static SpeedController driveTraintalonLeft1;
    public static SpeedController driveTraintalonLeft2;
    public static SpeedControllerGroup driveTrainleftMotors;
    public static SpeedController driveTraintalonRight1;
    public static SpeedController driveTraintalonRight2;
    public static SpeedControllerGroup driveTrainrightMotors;
    public static DifferentialDrive driveTrainDifferentialDrive1;
    
    public static void init() {
    	
    	driveTraintalonLeft1 = new Talon(0);
        driveTraintalonLeft1.setInverted(false);
        driveTraintalonLeft2 = new Talon(1);
        driveTraintalonLeft2.setInverted(false);
        driveTrainleftMotors = new SpeedControllerGroup(driveTraintalonLeft1, driveTraintalonLeft2  );
        
        driveTraintalonRight1 = new Talon(2);
        driveTraintalonRight1.setInverted(false);
        driveTraintalonRight2 = new Talon(3);
        driveTraintalonRight2.setInverted(false);
        driveTrainrightMotors = new SpeedControllerGroup(driveTraintalonRight1, driveTraintalonRight2  );
        
        driveTrainDifferentialDrive1 = new DifferentialDrive(driveTrainleftMotors, driveTrainrightMotors);
        driveTrainDifferentialDrive1.setSafetyEnabled(true);
        driveTrainDifferentialDrive1.setExpiration(0.1);
        driveTrainDifferentialDrive1.setMaxOutput(.75);

        armarmMotor = new Spark(4);
        armarmMotor.setInverted(false);
        intakeintakeMotor = new Talon(5);
        intakeintakeMotor.setInverted(false);
        intakeintakeMotor2 = new Talon (6);
        intakeintakeMotor2.setInverted(false);
    }
}

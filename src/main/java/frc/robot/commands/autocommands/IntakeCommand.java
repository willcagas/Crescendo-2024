// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.autocommands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.IntakeSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class IntakeCommand extends InstantCommand {
  private final IntakeSubsystem m_intake;
  private final String action;

  public IntakeCommand(IntakeSubsystem intake, String act) {
     this.m_intake = intake;
     this.action = act;

     addRequirements(m_intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  @Override
  public void execute() {
    if (action == "run") {
      m_intake.mainIntake();
    } else if (action == "delay") {
      m_intake.tertiaryDelay();
    } else if (action == "stop") {
      m_intake.stop();
    }
  }
}

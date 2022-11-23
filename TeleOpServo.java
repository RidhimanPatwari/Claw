package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "TeleOpServo2 (Java)")
public class TeleOpServo2 extends LinearOpMode {

  private Servo Servo0;
  private Servo Servo1;

  
  @Override
  public void runOpMode() {
    Servo0 = hardwareMap.get(Servo.class, "Servo 0");
    Servo1 = hardwareMap.get(Servo.class, "Servo 1");

    
    Servo0.setPosition(0.3425);
    Servo1.setPosition(0.03);
    waitForStart();
    if (opModeIsActive()) {
      int servoMode = 2;
      
      while (opModeIsActive()) {
       
        if (gamepad1.y) {
        servoMode += 1;
        if (servoMode % 2 == 1) {
          Servo0.setPosition(0.0925);
          Servo1.setPosition(0.28);
        } else {
          Servo0.setPosition(0.3425);
          Servo1.setPosition(0.03);
        }
      }
        //elemetry.addData("Servo Position", Servo0.getPosition());
        //telemetry.addData("Servo Position", Servo1.getPosition());
        telemetry.update();
      }
    }
  }
}

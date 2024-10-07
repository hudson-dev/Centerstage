package org.firstinspires.ftc.teamcode.tests;

import android.util.Log;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp
public class LimitSwitchTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Robot robot = new Robot(hardwareMap);
        waitForStart();
        while (!isStopRequested()) {
            Log.e("isdeposittouched*****", robot.sensors.isDepositTouched() + "");
            robot.update();
        }

    }
}

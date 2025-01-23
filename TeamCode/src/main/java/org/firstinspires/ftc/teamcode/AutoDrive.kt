package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.hardware.Hardware


@Autonomous(name = "Drive")
class AutoDrive : LinearOpMode() {
    override fun runOpMode() {
        var hwmap = Hardware(this)
        waitForStart()

        while (opModeIsActive() && (runtime < 0.25+3) && (runtime > 0.25)) {
            telemetry.addData("Forward", "Leg 1: %4.1f S Elapsed", runtime)
            telemetry.update()

            hwmap.driveRobot(0.5,0.075,0.0)
        }

        while (opModeIsActive() && (runtime < 0.25+3+3) && (runtime > 0.25+3)) {
            telemetry.addData("Backwards", "Leg 2: %4.1f S Elapsed", runtime)
            telemetry.update()

            hwmap.driveRobot(-0.5,-0.075,0.0)
        }

    }


}
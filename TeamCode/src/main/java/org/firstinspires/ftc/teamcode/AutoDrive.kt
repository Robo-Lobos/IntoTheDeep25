package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.hardware.Hardware


@TeleOp(name = "Drive")
class AutoDrive : LinearOpMode() {
    override fun runOpMode() {
        var hwmap = Hardware(this)
        waitForStart()

        while (opModeIsActive() && (runtime < 1.75) && (runtime > 0.25)) {
            telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime)
            telemetry.update()

            hwmap.driveRobot(0.5,0.0,0.0)
        }

    }


}
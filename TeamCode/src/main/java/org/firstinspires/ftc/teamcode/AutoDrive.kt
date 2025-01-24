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

        //drives forward to push middle sample
        while (opModeIsActive() && (runtime < 0.25+3) && (runtime > 0.25)) {
            telemetry.addData("Forward", "Leg 1: %4.1f S Elapsed", runtime)
            telemetry.update()

            hwmap.driveRobot(0.5,0.075,0.0)
        }


        var a = 0.25 + 3
        var deltat: Double = 3.0
        var b: Double  = a+deltat
        //drives back to starting position
        while (opModeIsActive() && (runtime < b) && (runtime > a)) {
            telemetry.addData("Backwards", "Leg 2: %4.1f S Elapsed", runtime)
            telemetry.update()

            hwmap.driveRobot(-0.5,-0.075,0.0)
        }

        deltat = 1.5
        var b2: Double = b + deltat
        while (opModeIsActive() && (runtime < b2) && (runtime > b)) {
            telemetry.addData("Forward left", "Leg 1: %4.1f S Elapsed", runtime)
            telemetry.update()

            hwmap.driveRobot(0.5,0.1,0.0)
        }

        var b3: Double = b2 + deltat
        while (opModeIsActive() && (runtime < b3) && (runtime > b2)) {
            telemetry.addData("Forward right", "Leg 1: %4.1f S Elapsed", runtime)
            telemetry.update()

            hwmap.driveRobot(0.5,-0.1,0.0)
        }
    }






}
package org.firstinspires.ftc.teamcode

import  com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.hardware.Hardware


@TeleOp(name = "Arm")
class Arm : LinearOpMode() {
    override fun runOpMode() {
        var hwmap = Hardware(this)
        waitForStart()

        while (opModeIsActive() && !isStopRequested) {
            //set variables to controller
            var armpwr = -(gamepad1.right_stick_y).toDouble()
            hwmap.arm((armpwr/0.01))


        }

    }

}
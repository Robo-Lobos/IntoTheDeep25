package org.firstinspires.ftc.teamcode

import  com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.hardware.Hardware


@TeleOp(name = "Drive")
class Drive : LinearOpMode() {
    override fun runOpMode() {
        var hwmap = Hardware(this)
        waitForStart()

        if (opModeIsActive() && !isStopRequested) {
            //set variables to controller
            var drive = -(gamepad1.left_stick_y).toDouble() //aka forward
            var strafe =
                (gamepad1.left_stick_x * 1.1).toDouble() //aka sideways //try *1.1 to counteract strafing
            var turn = (gamepad1.right_stick_x).toDouble()

            //send to drive function that is still here lmao
            hwmap.driveRobot(drive, strafe, turn)

        }

    }

}
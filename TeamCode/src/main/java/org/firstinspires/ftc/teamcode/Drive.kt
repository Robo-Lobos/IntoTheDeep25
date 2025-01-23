package org.firstinspires.ftc.teamcode

import  com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.hardware.Hardware


@TeleOp(name = "DriveReal")
class Drive : LinearOpMode() {
    override fun runOpMode() {
        var hwmap = Hardware(this)
        waitForStart()

        while (opModeIsActive() && !isStopRequested) {
            //set variables to controller
            var drive = -(gamepad1.left_stick_y).toDouble() //aka forward
            var strafe =
                (gamepad1.left_stick_x * 1.1).toDouble() //aka sideways //try *1.1 to counteract strafing
            var turn = (gamepad1.right_stick_x).toDouble()

            //send to drive function that is still here lmao
            hwmap.driveRobot(drive, strafe, turn)

            if (gamepad1.x){
                //start intake motor
                hwmap.startIntake()
            }

            else if (gamepad1.y){
                //stop intake motor
                hwmap.stopIntake()
            }

            else if (gamepad1.b){
                //release sample thingie (reverses intake for a bit)
                hwmap.releaseIntake()
            }

        }

    }

}
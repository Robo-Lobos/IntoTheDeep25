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

            //for arm movement
            var armpwr = -(gamepad2.right_stick_y).toDouble()

            //normal
            if (gamepad2.right_trigger == 0.0f) {
                hwmap.arm(armpwr)
            }

            //boost
            if (gamepad2.right_trigger > 0) {
            hwmap.armBoost(armpwr)
        }

            //boost arm power maybe


            //for intake stuff
            if (gamepad2.x){
                //start intake motor
                hwmap.startIntake()
            }

            else if (gamepad2.y){
                //stop intake motor
                hwmap.stopIntake()
            }

            else if (gamepad2.b){
                //release sample thingie (reverses intake for a bit)
                hwmap.releaseIntake()
            }

        }

    }

}
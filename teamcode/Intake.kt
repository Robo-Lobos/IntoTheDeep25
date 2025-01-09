package org.firstinspires.ftc.teamcode

import  com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.hardware.Hardware


@TeleOp(name = "Intake")
class Intake : LinearOpMode() {
    override fun runOpMode() {
        var hwmap = Hardware(this)
        waitForStart()

        if (gamepad1.x && !isStopRequested) {
            //start intake motor
            hwmap.startIntake()
        }

        else if (gamepad1.y && !isStopRequested){
            //stop intake motor
            hwmap.stopIntake()
        }

        else if (gamepad1.b && !isStopRequested){
            //release sample thingie (reverses intake for a bit)
            hwmap.releaseIntake()
        }

        }

    }

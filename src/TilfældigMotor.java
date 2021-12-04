import java.util.Random;

public class TilfældigMotor
{

    private MotorFabrik motorFabrik = new MotorFabrik();

    Random random = new Random();


    public IfMoter nyMoter() {


        Integer tilfældigtal = random.nextInt(motorFabrik.antalMoterTyper());

        return motorFabrik.lavMoter(tilfældigtal);


    }

    public void tilføjNyMotor(IfMoter ifMoter) {

        motorFabrik.nyTypeMoter(ifMoter);


    }


}

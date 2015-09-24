package matthewallenlinsoftware.keepy_uppy.Ball;

/**
 * Created by Darthpwner on 9/22/15.
 */
public class Ball {
    private enum BallType {
        BeachBall, Basketball, BowlingBall
    }

    /*Ball constants*/
    private final double ballFriction = 0.3;
    private final double ballMass = 0.5;
    private final double ballScalingFactor = 0.1;
    /*End of Ball constants*/

    //Impulse factor
    private final double impuleFactor = 100.0;
}

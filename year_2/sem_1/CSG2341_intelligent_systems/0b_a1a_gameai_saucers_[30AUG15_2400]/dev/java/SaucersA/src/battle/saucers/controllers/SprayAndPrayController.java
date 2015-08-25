package battle.saucers.controllers;

import au.edu.ecu.is.fuzzy.*;
import battle.Constants;
import battle.saucers.Saucer;

import java.awt.*;

/**
 * Created by marty on 9/08/2015.
 */
public class SprayAndPrayController implements SaucerController {

    // just testing opponent direction here
    private double opDir;

    // saucer visual config
    private static final String NAME = "spray and pray";
    private static final Color BASE = Color.yellow;
    private static final Color ARROW = Color.black;

    // input variables
    private FuzzyVariable distance;
    private FuzzyVariable energyDifference;

    private FuzzyVariable headingAngle;

    // output variables
    private FuzzyVariable turn;
    private FuzzyVariable firePower;

    // fuzzy sets
    private FuzzySet[] distanceSets = new FuzzySet[3];
    private FuzzySet[] energyDiffSets = new FuzzySet[3];
    private FuzzySet[] headingAngleSets = new FuzzySet[9];
    private FuzzySet[] turnSets = new FuzzySet[3];

    // the ruleset
    private SugenoRuleSet rules;

    public SprayAndPrayController() throws FuzzyException {

        // instantiate rule
        rules = new SugenoRuleSet();

        // TODO: define fuzzy variables

        // set up fuzzy variables
        setupDistanceInput();
        setupEnergyDifferenceInput();
        setupHeadingAngleInput();
        setupTurnInput();

        setupFirePowerOutput();


        // TODO: define rules

    }

    /**
     * This function sets up the distance variables and sets.
     *
     * @throws FuzzyException
     */
    private void setupDistanceInput() throws FuzzyException {

        final double maxDistance = Math.sqrt(
                Constants.STARFIELD_WIDTH * Constants.STARFIELD_WIDTH +
                        Constants.STARFIELD_HEIGHT * Constants.STARFIELD_HEIGHT
        );

        final double ramp1 = 0.05 * maxDistance;
        final double ramp2 = 0.15 * maxDistance;
        final double ramp3 = 0.25 * maxDistance;
        final double ramp4 = 0.35 * maxDistance;
        final double ramp5 = 0.50 * maxDistance;

        distance = new FuzzyVariable("distance to target", "m", 0.0, maxDistance, 2);

        FuzzySet close = new FuzzySet("close", 0.0, 0.0, ramp1, ramp2);
        FuzzySet near = new FuzzySet("near", ramp1, ramp3, ramp3, ramp4);
        FuzzySet far = new FuzzySet("far", ramp3, ramp5, maxDistance, maxDistance);

        distance.add(close);
        distance.add(near);
        distance.add(far);

        distance.checkGaps();
        distance.display();

        distanceSets[0] = close;
        distanceSets[1] = near;
        distanceSets[2] = far;
    }

    /**
     * This method sets up the energy difference fuzzy variables and sets.
     *
     * @throws FuzzyException
     */
    private void setupEnergyDifferenceInput() throws FuzzyException {

        final double maxDiff = Saucer.START_ENERGY;
        final double minDiff = -maxDiff;

        final double ramp1 = 0.1 * maxDiff;
        final double ramp2 = 0.2 * maxDiff;
        final double ramp3 = -0.2 * maxDiff;
        final double ramp4 = -0.1 * maxDiff;

        energyDifference = new FuzzyVariable("energy difference", "J", minDiff, maxDiff, 2);

        FuzzySet losing = new FuzzySet("losing", minDiff, minDiff, ramp3, ramp4);
        FuzzySet even = new FuzzySet("even", ramp3, 0.0, 0.0, ramp2);
        FuzzySet winning = new FuzzySet("winning", ramp1, ramp2, maxDiff, maxDiff);

        energyDifference.add(losing);
        energyDifference.add(even);
        energyDifference.add(winning);

        energyDifference.checkGaps();
        energyDifference.display();

        energyDiffSets[0] = losing;
        energyDiffSets[1] = even;
        energyDiffSets[2] = winning;
    }

    private void setupHeadingAngleInput() throws FuzzyException {

        final double maxLeft = 360.0;
        final double maxRight = -maxLeft;

        final double ramp1 = 337.5;
        final double ramp2 = 281.25;
        final double ramp3 = 225.0;
        final double ramp4 = 168.75;
        final double ramp5 = 90.0;
        final double ramp6 = 56.25;
        final double ramp7 = 28.15;

        headingAngle = new FuzzyVariable("heading angle", "*", maxRight, maxLeft, 2);

        FuzzySet rearRight = new FuzzySet("rear right", maxRight, maxRight, maxRight, -ramp2);
        FuzzySet hardRight = new FuzzySet("hard right", -ramp1, -ramp2, -ramp3, -ramp4);
        FuzzySet smallRight = new FuzzySet("small right", -ramp5, -ramp5, -ramp6, -ramp7);
        FuzzySet rightDir = new FuzzySet("right dir", maxRight, maxRight, -ramp6, 0.0);
        FuzzySet straightAhead = new FuzzySet("straight ahead", -ramp6, 0.0, 0.0, ramp6);
        FuzzySet leftDir = new FuzzySet("left dir", 0.0, ramp6, maxLeft, maxLeft);
        FuzzySet smallLeft = new FuzzySet("small left", ramp7, ramp6, ramp5, ramp5);
        FuzzySet hardLeft = new FuzzySet("hard left", ramp4, ramp3, ramp2, ramp1);
        FuzzySet rearLeft = new FuzzySet("rear left", ramp2, maxLeft, maxLeft, maxLeft);

        headingAngle.add(rearRight);
        headingAngle.add(hardRight);
        headingAngle.add(smallRight);
        headingAngle.add(rightDir);
        headingAngle.add(straightAhead);
        headingAngle.add(leftDir);
        headingAngle.add(smallLeft);
        headingAngle.add(hardLeft);
        headingAngle.add(rearLeft);

        headingAngle.checkGaps();
        headingAngle.display();

        headingAngleSets[0] = rearRight;
        headingAngleSets[1] = hardRight;
        headingAngleSets[2] = smallRight;
        headingAngleSets[3] = rightDir;
        headingAngleSets[4] = straightAhead;
        headingAngleSets[5] = leftDir;
        headingAngleSets[6] = smallLeft;
        headingAngleSets[7] = hardLeft;
        headingAngleSets[8] = rearLeft;
    }

    /**
     * This method sets up the turn fuzzy variables and sets.
     *
     * @throws FuzzyException
     */
    private void setupTurnInput() throws FuzzyException {

        final double maxLeft = 360.0;
        final double maxRight = -maxLeft;

        final double ramp1 = 0.1 * maxLeft;
        final double ramp2 = 0.2 * maxLeft;
        final double ramp3 = 0.2 * maxRight;
        final double ramp4 = 0.1 * maxRight;

        turn = new FuzzyVariable("turn", "*", maxRight, maxLeft, 2);

        FuzzySet right = new FuzzySet("right", maxRight, maxRight, ramp3, ramp4);
        FuzzySet straight = new FuzzySet("straight", ramp3, 0.0, 0.0, ramp2);
        FuzzySet left = new FuzzySet("left", ramp1, ramp2, maxLeft, maxLeft);

        turn.add(right);
        turn.add(straight);
        turn.add(left);

        turn.checkGaps();
        turn.display();

        turnSets[0] = right;
        turnSets[1] = straight;
        turnSets[2] = left;

        double[][] turnSets = {
                // losing even winning
                {-180.0, 0.0, 180.0}, // close
                {180.0, 0.0, -180.0}, // near
                {-180.0, 0.0, 180.0} // far
        };

        rules.addRuleMatrix(
                distance, distanceSets,
                energyDifference, energyDiffSets,
                turn, turnSets
        );

        rules.displayRuleMatrix(
                distance, distanceSets,
                energyDifference, energyDiffSets,
                turn
        );
    }

    /**
     *
     * @throws FuzzyException
     */
    private void setupFirePowerOutput() throws FuzzyException {

        final double maxPower = Saucer.MAX_POWER;
        final double highPower = maxPower * 0.4;
        final double midPower = maxPower * 0.2;
        final double lowPower = maxPower * 0.05;

        firePower = new FuzzyVariable("firepower", "J", -maxPower, maxPower, 2);

        double[][] firePowerLevels = {
                // losing even winning
                {0.0, lowPower, highPower}, // close
                {0.0, midPower, maxPower}, // near
                {0.0, 0.0, 0.0} // far
        };

        rules.addRuleMatrix(
                distance, distanceSets,
                energyDifference, energyDiffSets,
                firePower, firePowerLevels
        );

        // TODO: delete after testing
        rules.displayRuleMatrix(
                distance, distanceSets,
                energyDifference, energyDiffSets,
                firePower
        );
    }

    @Override
    public void sensorUpdate(double opponentDistance, double opponentDirection, double opponentEnergy, double energy) throws FuzzyException {

        // clear previous values
        rules.clearVariables();

        // TODO: set new rules
        distance.setValue(opponentDistance);
        energyDifference.setValue(energy -  opponentEnergy);

        // TODO: fire rules
        rules.update();

        // testing
        System.out.println(opponentDirection);
        opDir = opponentDirection;

    }

    /**
     * TODO: Use fuzzy inference to generate firepower.
     * @return
     * @throws Exception
     */
    @Override
    public double getFirePower() throws Exception {
        return firePower.getValue();
    }

    /**
     * TODO: Use fuzzy inference to generate speed.
     * @return
     * @throws Exception
     */
    @Override
    public double getSpeed() throws Exception {
        return 0;
    }

    /**
     * TODO: Use fuzzy inference to generate turn.
     * @return
     * @throws Exception
     */
    @Override
    public double getTurn() throws Exception {
        return turn.getValue();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Color getBaseColor() {
        return BASE;
    }

    @Override
    public Color getTurretColor() {
        return ARROW;
    }
}

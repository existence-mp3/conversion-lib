package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Decameter implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.DECAMETERS_PER_UNIT;
    }

}

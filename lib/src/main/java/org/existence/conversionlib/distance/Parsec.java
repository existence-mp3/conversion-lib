package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Parsec implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.PARSECS_PER_UNIT;
    }

}

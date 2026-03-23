package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Kilometer implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.KILOMETERS_PER_UNIT;
    }

}

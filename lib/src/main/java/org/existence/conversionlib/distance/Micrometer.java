package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Micrometer implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.MICROMETERS_PER_UNIT;
    }

}

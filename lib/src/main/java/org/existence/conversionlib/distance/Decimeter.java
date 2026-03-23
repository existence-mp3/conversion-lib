package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Decimeter implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.DECIMETERS_PER_UNIT;
    }

}

package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Picometer implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.PICOMETERS_PER_UNIT;
    }

}

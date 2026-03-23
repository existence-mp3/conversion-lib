package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class Hectometer implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.HECTOMETERS_PER_UNIT;
    }

}

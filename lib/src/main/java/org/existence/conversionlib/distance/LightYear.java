package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion.DistanceConversion;

public class LightYear implements DistanceUnit {

    @Override
    public double unitsToStandard() {
        return DistanceConversion.LIGHTYEARS_PER_UNIT;
    }

}

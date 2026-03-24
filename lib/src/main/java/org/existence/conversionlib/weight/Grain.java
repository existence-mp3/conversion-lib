package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Grain implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.GRAINS_PER_UNIT;
    }

}

package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Milligram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.MILLIGRAMS_PER_UNIT;
    }

}

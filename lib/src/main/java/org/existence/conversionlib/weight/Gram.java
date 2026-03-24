package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Gram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.GRAMS_PER_UNIT;
    }

}

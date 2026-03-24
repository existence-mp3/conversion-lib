package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Decigram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.DECIGRAMS_PER_UNIT;
    }

}

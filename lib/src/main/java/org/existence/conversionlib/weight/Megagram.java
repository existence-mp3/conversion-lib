package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Megagram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.MEGAGRAMS_PER_UNIT;
    }

}

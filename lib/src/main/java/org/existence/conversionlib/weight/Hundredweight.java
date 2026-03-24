package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Hundredweight implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.HUNDREDWEIGHTS_PER_UNIT;
    }

}

package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Carat implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.CARATS_PER_UNIT;
    }

}

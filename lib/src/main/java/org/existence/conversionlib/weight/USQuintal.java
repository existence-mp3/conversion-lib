package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class USQuintal implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.USQUINTALS_PER_UNIT;
    }

}

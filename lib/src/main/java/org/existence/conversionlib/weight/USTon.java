package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class USTon implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.USTONS_PER_UNIT;
    }

}

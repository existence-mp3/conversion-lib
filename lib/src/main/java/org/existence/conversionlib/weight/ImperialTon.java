package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class ImperialTon implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.ITONS_PER_UNIT;
    }

}

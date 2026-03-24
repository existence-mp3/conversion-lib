package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class TroyOunce implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.TROYOUNCES_PER_UNIT;
    }

}

package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Centigram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.CENTIGRAMS_PER_UNIT;
    }

}

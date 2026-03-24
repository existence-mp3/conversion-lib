package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class Picogram implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.PICOGRAMS_PER_UNIT;
    }

}

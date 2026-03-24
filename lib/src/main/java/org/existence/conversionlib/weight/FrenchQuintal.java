package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;

public class FrenchQuintal implements WeightUnit {

    @Override
    public double unitsToStandard() {
        return CentralConversion.WeightConversion.FQUNITALS_PER_UNIT;
    }

}

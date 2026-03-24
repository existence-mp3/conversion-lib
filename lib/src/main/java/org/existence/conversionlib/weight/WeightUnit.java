package org.existence.conversionlib.weight;

import org.existence.conversionlib.CentralConversion;
import org.existence.conversionlib.CentralConversion.WeightConversion;

interface WeightUnit {

    double unitsToStandard();

    default double toAtomicMassUnit(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.ATOMIC_PER_UNIT);
    }

    default double toCarat(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.CARATS_PER_UNIT);
    }

    default double toCentigram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.CENTIGRAMS_PER_UNIT);
    }

    default double toDecigram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.DECIGRAMS_PER_UNIT);
    }

    default double toDekagram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.DEKAGRAMS_PER_UNIT);
    }

    default double toDram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.DRAMS_PER_UNIT);
    }

    default double toFemtogram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.FEMTOGRAMS_PER_UNIT);
    }

    default double toFrenchQuintal(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.FQUNITALS_PER_UNIT);
    }

    default double toGrain(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.GRAINS_PER_UNIT);
    }

    default double toGram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.GRAMS_PER_UNIT);
    }

    default double toHectogram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.HECTORGRAMS_PER_UNIT);
    }

    default double toHundredweight(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.HUNDREDWEIGHTS_PER_UNIT);
    }

    default double toImperialTon(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.ITONS_PER_UNIT);
    }

    default double toKilogram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.KILOGRAMS_PER_UNIT);
    }

    default double toMegagram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.MEGAGRAMS_PER_UNIT);
    }

    default double toMetricQuintals(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.MQUINTALS_PER_UNIT);
    }

    default double toMetricTons(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.MTONS_PER_UNIT);
    }

    default double toMicrogram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.MICROGRAMS_PER_UNIT);
    }

    default double toMilligram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.MILLIGRAMS_PER_UNIT);
    }

    default double toOunce(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.OUNCES_PER_UNIT);
    }

    default double toPicogram(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.PICOGRAMS_PER_UNIT);
    }

    default double toPound(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.POUNDS_PER_UNIT);
    }

    default double toSlug(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.SLUGS_PER_UNIT);
    }

    default double toStick(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.STICKS_PER_UNIT);
    }

    default double toStone(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.STONES_PER_UNIT);
    }

    default double toTola(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.TOLAS_PER_UNIT);
    }

    default double toTroyOunce(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.TROYOUNCES_PER_UNIT);
    }

    default double toUSQuintal(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.USQUINTALS_PER_UNIT);
    }

    default double toUSTon(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), WeightConversion.USTONS_PER_UNIT);
    }

}

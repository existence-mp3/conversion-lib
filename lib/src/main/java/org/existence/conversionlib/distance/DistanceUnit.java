package org.existence.conversionlib.distance;

import org.existence.conversionlib.CentralConversion;
import org.existence.conversionlib.CentralConversion.DistanceConversion;

interface DistanceUnit {

    double unitsToStandard();

    default double toAngstroms(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.ANGSTROMS_PER_UNIT);
    }

    default double toAstronomicalUnits(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.ASTRONOMICAL_PER_UNIT);
    }

    default double toCentimeters(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.CENTIMETERS_PER_UNIT);
    }

    default double toChains(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.CHAINS_PER_UNIT);
    }

    default double toDecameters(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.DECAMETERS_PER_UNIT);
    }

    default double toDecimeters(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.DECIMETERS_PER_UNIT);
    }

    default double toFeet(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.FEET_PER_UNIT);
    }

    default double toHectometers(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.HECTOMETERS_PER_UNIT);
    }

    default double toInches(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.INCHES_PER_UNIT);
    }

    default double toKilometers(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.KILOMETERS_PER_UNIT);
    }

    default double toLightYears(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.LIGHTYEARS_PER_UNIT);
    }

    default double toLinks(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.LINKS_PER_UNIT);
    }

    default double toMeters(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.METERS_PER_UNIT);
    }

    default double toMicrometers(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.MICROMETERS_PER_UNIT);
    }

    default double toMil(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.MILS_PER_UNIT);
    }

    default double toMiles(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.MILES_PER_UNIT);
    }

    default double toMilimeters(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.MILIMETERS_PER_UNIT);
    }

    default double toNanometers(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.NANOMETERS_PER_UNIT);
    }

    default double toNauticalMiles(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.NAUTICAL_PER_UNIT);
    }

    default double toParsecs(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.PARSECS_PER_UNIT);
    }

    default double toPicometers(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.PICOMETERS_PER_UNIT);
    }

    default double toRods(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.RODS_PER_UNIT);
    }

    default double toYards(double input) {
        return CentralConversion.conversion(input, unitsToStandard(), DistanceConversion.YARDS_PER_UNIT);
    }

}

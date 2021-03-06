//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 08:03:21 AM EST 
//


package com.pos.mismo34;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressUnitDesignatorBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressUnitDesignatorBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Apartment"/>
 *     &lt;enumeration value="Basement"/>
 *     &lt;enumeration value="Building"/>
 *     &lt;enumeration value="Condo"/>
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="Floor"/>
 *     &lt;enumeration value="Front"/>
 *     &lt;enumeration value="Hangar"/>
 *     &lt;enumeration value="Key"/>
 *     &lt;enumeration value="Lobby"/>
 *     &lt;enumeration value="Lot"/>
 *     &lt;enumeration value="Lower"/>
 *     &lt;enumeration value="Office"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Penthouse"/>
 *     &lt;enumeration value="Pier"/>
 *     &lt;enumeration value="Rear"/>
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="Side"/>
 *     &lt;enumeration value="Space"/>
 *     &lt;enumeration value="Stop"/>
 *     &lt;enumeration value="Suite"/>
 *     &lt;enumeration value="Trailer"/>
 *     &lt;enumeration value="Unit"/>
 *     &lt;enumeration value="Upper"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressUnitDesignatorBase")
@XmlEnum
public enum AddressUnitDesignatorBase {

    @XmlEnumValue("Apartment")
    APARTMENT("Apartment"),
    @XmlEnumValue("Basement")
    BASEMENT("Basement"),
    @XmlEnumValue("Building")
    BUILDING("Building"),
    @XmlEnumValue("Condo")
    CONDO("Condo"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Floor")
    FLOOR("Floor"),
    @XmlEnumValue("Front")
    FRONT("Front"),

    /**
     * A covered, usually enclosed area for housing or repairing aircraft.
     * 
     */
    @XmlEnumValue("Hangar")
    HANGAR("Hangar"),
    @XmlEnumValue("Key")
    KEY("Key"),
    @XmlEnumValue("Lobby")
    LOBBY("Lobby"),
    @XmlEnumValue("Lot")
    LOT("Lot"),
    @XmlEnumValue("Lower")
    LOWER("Lower"),
    @XmlEnumValue("Office")
    OFFICE("Office"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Penthouse")
    PENTHOUSE("Penthouse"),
    @XmlEnumValue("Pier")
    PIER("Pier"),
    @XmlEnumValue("Rear")
    REAR("Rear"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Side")
    SIDE("Side"),
    @XmlEnumValue("Space")
    SPACE("Space"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Suite")
    SUITE("Suite"),
    @XmlEnumValue("Trailer")
    TRAILER("Trailer"),
    @XmlEnumValue("Unit")
    UNIT("Unit"),
    @XmlEnumValue("Upper")
    UPPER("Upper");
    private final String value;

    AddressUnitDesignatorBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressUnitDesignatorBase fromValue(String v) {
        for (AddressUnitDesignatorBase c: AddressUnitDesignatorBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

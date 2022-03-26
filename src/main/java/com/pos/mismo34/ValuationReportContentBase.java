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
 * <p>Java class for ValuationReportContentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationReportContentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AppraisalForm"/>
 *     &lt;enumeration value="AppraisalLicense"/>
 *     &lt;enumeration value="Certification"/>
 *     &lt;enumeration value="CommentAddendum"/>
 *     &lt;enumeration value="CoverPage"/>
 *     &lt;enumeration value="Exhibit"/>
 *     &lt;enumeration value="ExtraListings"/>
 *     &lt;enumeration value="ExtraRentals"/>
 *     &lt;enumeration value="ExtraSales"/>
 *     &lt;enumeration value="FloodMap"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="ListingPhotos"/>
 *     &lt;enumeration value="LocationMap"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PlatMap"/>
 *     &lt;enumeration value="RentalPhotos"/>
 *     &lt;enumeration value="SalePhotos"/>
 *     &lt;enumeration value="SalesContract"/>
 *     &lt;enumeration value="Sketch"/>
 *     &lt;enumeration value="SubjectPhotos"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValuationReportContentBase")
@XmlEnum
public enum ValuationReportContentBase {

    @XmlEnumValue("AppraisalForm")
    APPRAISAL_FORM("AppraisalForm"),
    @XmlEnumValue("AppraisalLicense")
    APPRAISAL_LICENSE("AppraisalLicense"),
    @XmlEnumValue("Certification")
    CERTIFICATION("Certification"),
    @XmlEnumValue("CommentAddendum")
    COMMENT_ADDENDUM("CommentAddendum"),
    @XmlEnumValue("CoverPage")
    COVER_PAGE("CoverPage"),
    @XmlEnumValue("Exhibit")
    EXHIBIT("Exhibit"),
    @XmlEnumValue("ExtraListings")
    EXTRA_LISTINGS("ExtraListings"),
    @XmlEnumValue("ExtraRentals")
    EXTRA_RENTALS("ExtraRentals"),
    @XmlEnumValue("ExtraSales")
    EXTRA_SALES("ExtraSales"),
    @XmlEnumValue("FloodMap")
    FLOOD_MAP("FloodMap"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("ListingPhotos")
    LISTING_PHOTOS("ListingPhotos"),
    @XmlEnumValue("LocationMap")
    LOCATION_MAP("LocationMap"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PlatMap")
    PLAT_MAP("PlatMap"),
    @XmlEnumValue("RentalPhotos")
    RENTAL_PHOTOS("RentalPhotos"),
    @XmlEnumValue("SalePhotos")
    SALE_PHOTOS("SalePhotos"),
    @XmlEnumValue("SalesContract")
    SALES_CONTRACT("SalesContract"),
    @XmlEnumValue("Sketch")
    SKETCH("Sketch"),
    @XmlEnumValue("SubjectPhotos")
    SUBJECT_PHOTOS("SubjectPhotos");
    private final String value;

    ValuationReportContentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValuationReportContentBase fromValue(String v) {
        for (ValuationReportContentBase c: ValuationReportContentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

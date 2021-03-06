//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 08:03:21 AM EST 
//


package com.pos.mismo34;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Contains information about the documents that may be associated with an Asset.
 * 
 * <p>Java class for ASSET_DOCUMENTATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASSET_DOCUMENTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetDocumentType" type="{http://www.mismo.org/residential/2009/schemas}AssetDocumentEnum" minOccurs="0"/>
 *         &lt;element name="AssetDocumentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AssetVerificationRangeCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="AssetVerificationRangeType" type="{http://www.mismo.org/residential/2009/schemas}AssetVerificationRangeEnum" minOccurs="0"/>
 *         &lt;element name="AssetVerificationRangeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DocumentationStateType" type="{http://www.mismo.org/residential/2009/schemas}DocumentationStateEnum" minOccurs="0"/>
 *         &lt;element name="DocumentationStateTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ASSET_DOCUMENTATION_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASSET_DOCUMENTATION", propOrder = {
    "assetDocumentType",
    "assetDocumentTypeOtherDescription",
    "assetVerificationRangeCount",
    "assetVerificationRangeType",
    "assetVerificationRangeTypeOtherDescription",
    "documentationStateType",
    "documentationStateTypeOtherDescription",
    "extension"
})
public class ASSETDOCUMENTATION {

    @XmlElementRef(name = "AssetDocumentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AssetDocumentEnum> assetDocumentType;
    @XmlElementRef(name = "AssetDocumentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> assetDocumentTypeOtherDescription;
    @XmlElementRef(name = "AssetVerificationRangeCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> assetVerificationRangeCount;
    @XmlElementRef(name = "AssetVerificationRangeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<AssetVerificationRangeEnum> assetVerificationRangeType;
    @XmlElementRef(name = "AssetVerificationRangeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> assetVerificationRangeTypeOtherDescription;
    @XmlElementRef(name = "DocumentationStateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentationStateEnum> documentationStateType;
    @XmlElementRef(name = "DocumentationStateTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> documentationStateTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected ASSETDOCUMENTATIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the assetDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssetDocumentEnum }{@code >}
     *     
     */
    public JAXBElement<AssetDocumentEnum> getAssetDocumentType() {
        return assetDocumentType;
    }

    /**
     * Sets the value of the assetDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssetDocumentEnum }{@code >}
     *     
     */
    public void setAssetDocumentType(JAXBElement<AssetDocumentEnum> value) {
        this.assetDocumentType = value;
    }

    /**
     * Gets the value of the assetDocumentTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAssetDocumentTypeOtherDescription() {
        return assetDocumentTypeOtherDescription;
    }

    /**
     * Sets the value of the assetDocumentTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAssetDocumentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.assetDocumentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the assetVerificationRangeCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getAssetVerificationRangeCount() {
        return assetVerificationRangeCount;
    }

    /**
     * Sets the value of the assetVerificationRangeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setAssetVerificationRangeCount(JAXBElement<MISMOCount> value) {
        this.assetVerificationRangeCount = value;
    }

    /**
     * Gets the value of the assetVerificationRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssetVerificationRangeEnum }{@code >}
     *     
     */
    public JAXBElement<AssetVerificationRangeEnum> getAssetVerificationRangeType() {
        return assetVerificationRangeType;
    }

    /**
     * Sets the value of the assetVerificationRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssetVerificationRangeEnum }{@code >}
     *     
     */
    public void setAssetVerificationRangeType(JAXBElement<AssetVerificationRangeEnum> value) {
        this.assetVerificationRangeType = value;
    }

    /**
     * Gets the value of the assetVerificationRangeTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getAssetVerificationRangeTypeOtherDescription() {
        return assetVerificationRangeTypeOtherDescription;
    }

    /**
     * Sets the value of the assetVerificationRangeTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setAssetVerificationRangeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.assetVerificationRangeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the documentationStateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentationStateEnum }{@code >}
     *     
     */
    public JAXBElement<DocumentationStateEnum> getDocumentationStateType() {
        return documentationStateType;
    }

    /**
     * Sets the value of the documentationStateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentationStateEnum }{@code >}
     *     
     */
    public void setDocumentationStateType(JAXBElement<DocumentationStateEnum> value) {
        this.documentationStateType = value;
    }

    /**
     * Gets the value of the documentationStateTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public JAXBElement<MISMOString> getDocumentationStateTypeOtherDescription() {
        return documentationStateTypeOtherDescription;
    }

    /**
     * Sets the value of the documentationStateTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *     
     */
    public void setDocumentationStateTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.documentationStateTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ASSETDOCUMENTATIONEXTENSION }
     *     
     */
    public ASSETDOCUMENTATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSETDOCUMENTATIONEXTENSION }
     *     
     */
    public void setEXTENSION(ASSETDOCUMENTATIONEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}

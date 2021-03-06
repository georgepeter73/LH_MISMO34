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
 * Summary information about delinquencies that have occurred on the loan.
 * 
 * <p>Java class for DELINQUENCY_SUMMARY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DELINQUENCY_SUMMARY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DelinquentPaymentCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="DelinquentPaymentsOverPastTwelveMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LoanDelinquencyHistoryPeriodMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LoanReinstateTotalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="NetLiquidationProceedsAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="OnTimePaymentCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PaymentDelinquentDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="TotalDelinquentInterestAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="TotalDelinquentInterestReportedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="TotalLiquidationExpenseAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DELINQUENCY_SUMMARY_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DELINQUENCY_SUMMARY", propOrder = {
    "delinquentPaymentCount",
    "delinquentPaymentsOverPastTwelveMonthsCount",
    "loanDelinquencyHistoryPeriodMonthsCount",
    "loanReinstateTotalAmount",
    "netLiquidationProceedsAmount",
    "onTimePaymentCount",
    "paymentDelinquentDaysCount",
    "totalDelinquentInterestAmount",
    "totalDelinquentInterestReportedDate",
    "totalLiquidationExpenseAmount",
    "extension"
})
public class DELINQUENCYSUMMARY {

    @XmlElementRef(name = "DelinquentPaymentCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> delinquentPaymentCount;
    @XmlElementRef(name = "DelinquentPaymentsOverPastTwelveMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> delinquentPaymentsOverPastTwelveMonthsCount;
    @XmlElementRef(name = "LoanDelinquencyHistoryPeriodMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loanDelinquencyHistoryPeriodMonthsCount;
    @XmlElementRef(name = "LoanReinstateTotalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> loanReinstateTotalAmount;
    @XmlElementRef(name = "NetLiquidationProceedsAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> netLiquidationProceedsAmount;
    @XmlElementRef(name = "OnTimePaymentCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> onTimePaymentCount;
    @XmlElementRef(name = "PaymentDelinquentDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> paymentDelinquentDaysCount;
    @XmlElementRef(name = "TotalDelinquentInterestAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> totalDelinquentInterestAmount;
    @XmlElementRef(name = "TotalDelinquentInterestReportedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> totalDelinquentInterestReportedDate;
    @XmlElementRef(name = "TotalLiquidationExpenseAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> totalLiquidationExpenseAmount;
    @XmlElement(name = "EXTENSION")
    protected DELINQUENCYSUMMARYEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the delinquentPaymentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getDelinquentPaymentCount() {
        return delinquentPaymentCount;
    }

    /**
     * Sets the value of the delinquentPaymentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setDelinquentPaymentCount(JAXBElement<MISMOCount> value) {
        this.delinquentPaymentCount = value;
    }

    /**
     * Gets the value of the delinquentPaymentsOverPastTwelveMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getDelinquentPaymentsOverPastTwelveMonthsCount() {
        return delinquentPaymentsOverPastTwelveMonthsCount;
    }

    /**
     * Sets the value of the delinquentPaymentsOverPastTwelveMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setDelinquentPaymentsOverPastTwelveMonthsCount(JAXBElement<MISMOCount> value) {
        this.delinquentPaymentsOverPastTwelveMonthsCount = value;
    }

    /**
     * Gets the value of the loanDelinquencyHistoryPeriodMonthsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getLoanDelinquencyHistoryPeriodMonthsCount() {
        return loanDelinquencyHistoryPeriodMonthsCount;
    }

    /**
     * Sets the value of the loanDelinquencyHistoryPeriodMonthsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setLoanDelinquencyHistoryPeriodMonthsCount(JAXBElement<MISMOCount> value) {
        this.loanDelinquencyHistoryPeriodMonthsCount = value;
    }

    /**
     * Gets the value of the loanReinstateTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getLoanReinstateTotalAmount() {
        return loanReinstateTotalAmount;
    }

    /**
     * Sets the value of the loanReinstateTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setLoanReinstateTotalAmount(JAXBElement<MISMOAmount> value) {
        this.loanReinstateTotalAmount = value;
    }

    /**
     * Gets the value of the netLiquidationProceedsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getNetLiquidationProceedsAmount() {
        return netLiquidationProceedsAmount;
    }

    /**
     * Sets the value of the netLiquidationProceedsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setNetLiquidationProceedsAmount(JAXBElement<MISMOAmount> value) {
        this.netLiquidationProceedsAmount = value;
    }

    /**
     * Gets the value of the onTimePaymentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getOnTimePaymentCount() {
        return onTimePaymentCount;
    }

    /**
     * Sets the value of the onTimePaymentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setOnTimePaymentCount(JAXBElement<MISMOCount> value) {
        this.onTimePaymentCount = value;
    }

    /**
     * Gets the value of the paymentDelinquentDaysCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public JAXBElement<MISMOCount> getPaymentDelinquentDaysCount() {
        return paymentDelinquentDaysCount;
    }

    /**
     * Sets the value of the paymentDelinquentDaysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *     
     */
    public void setPaymentDelinquentDaysCount(JAXBElement<MISMOCount> value) {
        this.paymentDelinquentDaysCount = value;
    }

    /**
     * Gets the value of the totalDelinquentInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTotalDelinquentInterestAmount() {
        return totalDelinquentInterestAmount;
    }

    /**
     * Sets the value of the totalDelinquentInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTotalDelinquentInterestAmount(JAXBElement<MISMOAmount> value) {
        this.totalDelinquentInterestAmount = value;
    }

    /**
     * Gets the value of the totalDelinquentInterestReportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public JAXBElement<MISMODate> getTotalDelinquentInterestReportedDate() {
        return totalDelinquentInterestReportedDate;
    }

    /**
     * Sets the value of the totalDelinquentInterestReportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *     
     */
    public void setTotalDelinquentInterestReportedDate(JAXBElement<MISMODate> value) {
        this.totalDelinquentInterestReportedDate = value;
    }

    /**
     * Gets the value of the totalLiquidationExpenseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public JAXBElement<MISMOAmount> getTotalLiquidationExpenseAmount() {
        return totalLiquidationExpenseAmount;
    }

    /**
     * Sets the value of the totalLiquidationExpenseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *     
     */
    public void setTotalLiquidationExpenseAmount(JAXBElement<MISMOAmount> value) {
        this.totalLiquidationExpenseAmount = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DELINQUENCYSUMMARYEXTENSION }
     *     
     */
    public DELINQUENCYSUMMARYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELINQUENCYSUMMARYEXTENSION }
     *     
     */
    public void setEXTENSION(DELINQUENCYSUMMARYEXTENSION value) {
        this.extension = value;
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

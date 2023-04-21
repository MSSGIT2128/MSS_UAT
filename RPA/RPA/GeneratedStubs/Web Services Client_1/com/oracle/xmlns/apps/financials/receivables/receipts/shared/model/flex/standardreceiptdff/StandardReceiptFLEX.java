
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.model.flex.standardreceiptdff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardReceiptFLEX complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardReceiptFLEX"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CashReceiptId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="instrumenttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentAdviceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentAdviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidentifiedTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="__FLEX_Context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="__FLEX_Context_DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_FLEX_NumOfSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardReceiptFLEX", propOrder = {
    "cashReceiptId",
    "instrumenttype",
    "paymentAdviceStatus",
    "paymentAdviceType",
    "unidentifiedTransaction",
    "flexContext",
    "flexContextDisplayValue",
    "flexNumOfSegments"
})
@XmlSeeAlso({
    ZenginCashReceipts.class
})
public class StandardReceiptFLEX {

    @XmlElement(name = "CashReceiptId")
    protected Long cashReceiptId;
    @XmlElementRef(name = "instrumenttype", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instrumenttype;
    @XmlElementRef(name = "paymentAdviceStatus", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentAdviceStatus;
    @XmlElementRef(name = "paymentAdviceType", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentAdviceType;
    @XmlElementRef(name = "unidentifiedTransaction", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidentifiedTransaction;
    @XmlElementRef(name = "__FLEX_Context", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flexContext;
    @XmlElementRef(name = "__FLEX_Context_DisplayValue", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flexContextDisplayValue;
    @XmlElementRef(name = "_FLEX_NumOfSegments", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> flexNumOfSegments;

    /**
     * Gets the value of the cashReceiptId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCashReceiptId() {
        return cashReceiptId;
    }

    /**
     * Sets the value of the cashReceiptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCashReceiptId(Long value) {
        this.cashReceiptId = value;
    }

    /**
     * Gets the value of the instrumenttype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstrumenttype() {
        return instrumenttype;
    }

    /**
     * Sets the value of the instrumenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstrumenttype(JAXBElement<String> value) {
        this.instrumenttype = value;
    }

    /**
     * Gets the value of the paymentAdviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentAdviceStatus() {
        return paymentAdviceStatus;
    }

    /**
     * Sets the value of the paymentAdviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentAdviceStatus(JAXBElement<String> value) {
        this.paymentAdviceStatus = value;
    }

    /**
     * Gets the value of the paymentAdviceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentAdviceType() {
        return paymentAdviceType;
    }

    /**
     * Sets the value of the paymentAdviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentAdviceType(JAXBElement<String> value) {
        this.paymentAdviceType = value;
    }

    /**
     * Gets the value of the unidentifiedTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidentifiedTransaction() {
        return unidentifiedTransaction;
    }

    /**
     * Sets the value of the unidentifiedTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidentifiedTransaction(JAXBElement<String> value) {
        this.unidentifiedTransaction = value;
    }

    /**
     * Gets the value of the flexContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLEXContext() {
        return flexContext;
    }

    /**
     * Sets the value of the flexContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLEXContext(JAXBElement<String> value) {
        this.flexContext = value;
    }

    /**
     * Gets the value of the flexContextDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLEXContextDisplayValue() {
        return flexContextDisplayValue;
    }

    /**
     * Sets the value of the flexContextDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLEXContextDisplayValue(JAXBElement<String> value) {
        this.flexContextDisplayValue = value;
    }

    /**
     * Gets the value of the flexNumOfSegments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFLEXNumOfSegments() {
        return flexNumOfSegments;
    }

    /**
     * Sets the value of the flexNumOfSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFLEXNumOfSegments(JAXBElement<Integer> value) {
        this.flexNumOfSegments = value;
    }

}

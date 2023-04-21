
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.model.flex.standardreceiptgdf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JExILReceiptInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JExILReceiptInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/}StandardReceiptGdf"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalReceiptPrinted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalReceiptPrinted_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiptType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiptType_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardDealType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardDealType_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardClearingHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardClearingHouse_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JExILReceiptInformation", propOrder = {
    "checkNumber",
    "originalReceiptPrinted",
    "originalReceiptPrintedDisplay",
    "receiptType",
    "receiptTypeDisplay",
    "creditCardDealType",
    "creditCardDealTypeDisplay",
    "creditCardClearingHouse",
    "creditCardClearingHouseDisplay"
})
public class JExILReceiptInformation
    extends StandardReceiptGdf
{

    @XmlElementRef(name = "CheckNumber", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkNumber;
    @XmlElementRef(name = "OriginalReceiptPrinted", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalReceiptPrinted;
    @XmlElementRef(name = "OriginalReceiptPrinted_Display", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalReceiptPrintedDisplay;
    @XmlElementRef(name = "receiptType", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptType;
    @XmlElementRef(name = "receiptType_Display", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptTypeDisplay;
    @XmlElementRef(name = "creditCardDealType", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardDealType;
    @XmlElementRef(name = "creditCardDealType_Display", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardDealTypeDisplay;
    @XmlElementRef(name = "creditCardClearingHouse", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardClearingHouse;
    @XmlElementRef(name = "creditCardClearingHouse_Display", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardClearingHouseDisplay;

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckNumber(JAXBElement<String> value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the originalReceiptPrinted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalReceiptPrinted() {
        return originalReceiptPrinted;
    }

    /**
     * Sets the value of the originalReceiptPrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalReceiptPrinted(JAXBElement<String> value) {
        this.originalReceiptPrinted = value;
    }

    /**
     * Gets the value of the originalReceiptPrintedDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalReceiptPrintedDisplay() {
        return originalReceiptPrintedDisplay;
    }

    /**
     * Sets the value of the originalReceiptPrintedDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalReceiptPrintedDisplay(JAXBElement<String> value) {
        this.originalReceiptPrintedDisplay = value;
    }

    /**
     * Gets the value of the receiptType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptType() {
        return receiptType;
    }

    /**
     * Sets the value of the receiptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptType(JAXBElement<String> value) {
        this.receiptType = value;
    }

    /**
     * Gets the value of the receiptTypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptTypeDisplay() {
        return receiptTypeDisplay;
    }

    /**
     * Sets the value of the receiptTypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptTypeDisplay(JAXBElement<String> value) {
        this.receiptTypeDisplay = value;
    }

    /**
     * Gets the value of the creditCardDealType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardDealType() {
        return creditCardDealType;
    }

    /**
     * Sets the value of the creditCardDealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardDealType(JAXBElement<String> value) {
        this.creditCardDealType = value;
    }

    /**
     * Gets the value of the creditCardDealTypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardDealTypeDisplay() {
        return creditCardDealTypeDisplay;
    }

    /**
     * Sets the value of the creditCardDealTypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardDealTypeDisplay(JAXBElement<String> value) {
        this.creditCardDealTypeDisplay = value;
    }

    /**
     * Gets the value of the creditCardClearingHouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardClearingHouse() {
        return creditCardClearingHouse;
    }

    /**
     * Sets the value of the creditCardClearingHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardClearingHouse(JAXBElement<String> value) {
        this.creditCardClearingHouse = value;
    }

    /**
     * Gets the value of the creditCardClearingHouseDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardClearingHouseDisplay() {
        return creditCardClearingHouseDisplay;
    }

    /**
     * Sets the value of the creditCardClearingHouseDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardClearingHouseDisplay(JAXBElement<String> value) {
        this.creditCardClearingHouseDisplay = value;
    }

}

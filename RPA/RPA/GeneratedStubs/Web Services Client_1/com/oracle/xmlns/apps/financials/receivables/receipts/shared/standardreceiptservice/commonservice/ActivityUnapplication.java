
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ActivityUnapplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityUnapplication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceivableApplicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReversalGlDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/&gt;
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityUnapplication", propOrder = {
    "receiptNumber",
    "receivableApplicationId",
    "reversalGlDate",
    "businessUnit"
})
public class ActivityUnapplication {

    @XmlElementRef(name = "ReceiptNumber", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/standardReceiptService/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptNumber;
    @XmlElementRef(name = "ReceivableApplicationId", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/standardReceiptService/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> receivableApplicationId;
    @XmlElementRef(name = "ReversalGlDate", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/standardReceiptService/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reversalGlDate;
    @XmlElementRef(name = "BusinessUnit", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/standardReceiptService/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnit;

    /**
     * Gets the value of the receiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Sets the value of the receiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptNumber(JAXBElement<String> value) {
        this.receiptNumber = value;
    }

    /**
     * Gets the value of the receivableApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReceivableApplicationId() {
        return receivableApplicationId;
    }

    /**
     * Sets the value of the receivableApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReceivableApplicationId(JAXBElement<Long> value) {
        this.receivableApplicationId = value;
    }

    /**
     * Gets the value of the reversalGlDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReversalGlDate() {
        return reversalGlDate;
    }

    /**
     * Sets the value of the reversalGlDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReversalGlDate(JAXBElement<XMLGregorianCalendar> value) {
        this.reversalGlDate = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnit(JAXBElement<String> value) {
        this.businessUnit = value;
    }

}

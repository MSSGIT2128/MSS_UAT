
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.model.flex.standardreceiptgdf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardReceiptGdfJAxJPReceipts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardReceiptGdfJAxJPReceipts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/}StandardReceiptGdf"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transmissionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternatePayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerBankBranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerVirtualAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eftRequestorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ediInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remittanceBankBranchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardReceiptGdfJAxJPReceipts", propOrder = {
    "transmissionName",
    "alternatePayerName",
    "customerBankName",
    "customerBankBranchName",
    "customerVirtualAccountNumber",
    "eftRequestorNumber",
    "ediInformation",
    "description",
    "remittanceBankBranchNumber"
})
public class StandardReceiptGdfJAxJPReceipts
    extends StandardReceiptGdf
{

    @XmlElementRef(name = "transmissionName", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionName;
    @XmlElementRef(name = "alternatePayerName", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternatePayerName;
    @XmlElementRef(name = "customerBankName", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerBankName;
    @XmlElementRef(name = "customerBankBranchName", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerBankBranchName;
    @XmlElementRef(name = "customerVirtualAccountNumber", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerVirtualAccountNumber;
    @XmlElementRef(name = "eftRequestorNumber", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eftRequestorNumber;
    @XmlElementRef(name = "ediInformation", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediInformation;
    @XmlElementRef(name = "description", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "remittanceBankBranchNumber", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remittanceBankBranchNumber;

    /**
     * Gets the value of the transmissionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransmissionName() {
        return transmissionName;
    }

    /**
     * Sets the value of the transmissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransmissionName(JAXBElement<String> value) {
        this.transmissionName = value;
    }

    /**
     * Gets the value of the alternatePayerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternatePayerName() {
        return alternatePayerName;
    }

    /**
     * Sets the value of the alternatePayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternatePayerName(JAXBElement<String> value) {
        this.alternatePayerName = value;
    }

    /**
     * Gets the value of the customerBankName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerBankName() {
        return customerBankName;
    }

    /**
     * Sets the value of the customerBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerBankName(JAXBElement<String> value) {
        this.customerBankName = value;
    }

    /**
     * Gets the value of the customerBankBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerBankBranchName() {
        return customerBankBranchName;
    }

    /**
     * Sets the value of the customerBankBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerBankBranchName(JAXBElement<String> value) {
        this.customerBankBranchName = value;
    }

    /**
     * Gets the value of the customerVirtualAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerVirtualAccountNumber() {
        return customerVirtualAccountNumber;
    }

    /**
     * Sets the value of the customerVirtualAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerVirtualAccountNumber(JAXBElement<String> value) {
        this.customerVirtualAccountNumber = value;
    }

    /**
     * Gets the value of the eftRequestorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEftRequestorNumber() {
        return eftRequestorNumber;
    }

    /**
     * Sets the value of the eftRequestorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEftRequestorNumber(JAXBElement<String> value) {
        this.eftRequestorNumber = value;
    }

    /**
     * Gets the value of the ediInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEdiInformation() {
        return ediInformation;
    }

    /**
     * Sets the value of the ediInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEdiInformation(JAXBElement<String> value) {
        this.ediInformation = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the remittanceBankBranchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemittanceBankBranchNumber() {
        return remittanceBankBranchNumber;
    }

    /**
     * Sets the value of the remittanceBankBranchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemittanceBankBranchNumber(JAXBElement<String> value) {
        this.remittanceBankBranchNumber = value;
    }

}

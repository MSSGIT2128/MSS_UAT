
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.model.flex.standardreceiptgdf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JLxMXReceipts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JLxMXReceipts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/}StandardReceiptGdf"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="digitalTaxReceiptUsingInternet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JLxMXReceipts", propOrder = {
    "digitalTaxReceiptUsingInternet"
})
public class JLxMXReceipts
    extends StandardReceiptGdf
{

    @XmlElementRef(name = "digitalTaxReceiptUsingInternet", namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptGdf/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> digitalTaxReceiptUsingInternet;

    /**
     * Gets the value of the digitalTaxReceiptUsingInternet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDigitalTaxReceiptUsingInternet() {
        return digitalTaxReceiptUsingInternet;
    }

    /**
     * Sets the value of the digitalTaxReceiptUsingInternet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDigitalTaxReceiptUsingInternet(JAXBElement<String> value) {
        this.digitalTaxReceiptUsingInternet = value;
    }

}

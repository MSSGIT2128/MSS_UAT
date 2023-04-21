
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.ReverseReceipt;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reverseReceipt" type="{http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/standardReceiptService/commonService/}ReverseReceipt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reverseReceipt"
})
@XmlRootElement(name = "createReverseReceiptAsync")
public class CreateReverseReceiptAsync {

    @XmlElement(required = true)
    protected ReverseReceipt reverseReceipt;

    /**
     * Gets the value of the reverseReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link ReverseReceipt }
     *     
     */
    public ReverseReceipt getReverseReceipt() {
        return reverseReceipt;
    }

    /**
     * Sets the value of the reverseReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReverseReceipt }
     *     
     */
    public void setReverseReceipt(ReverseReceipt value) {
        this.reverseReceipt = value;
    }

}

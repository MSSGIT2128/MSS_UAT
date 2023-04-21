
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.ApplyReceipt;


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
 *         &lt;element name="applyReceipt" type="{http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/standardReceiptService/commonService/}ApplyReceipt"/&gt;
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
    "applyReceipt"
})
@XmlRootElement(name = "createApplyReceiptAsync")
public class CreateApplyReceiptAsync {

    @XmlElement(required = true)
    protected ApplyReceipt applyReceipt;

    /**
     * Gets the value of the applyReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyReceipt }
     *     
     */
    public ApplyReceipt getApplyReceipt() {
        return applyReceipt;
    }

    /**
     * Sets the value of the applyReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyReceipt }
     *     
     */
    public void setApplyReceipt(ApplyReceipt value) {
        this.applyReceipt = value;
    }

}

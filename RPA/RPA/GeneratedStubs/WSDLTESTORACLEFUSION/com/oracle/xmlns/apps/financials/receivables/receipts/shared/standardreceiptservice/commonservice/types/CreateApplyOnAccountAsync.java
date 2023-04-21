
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.ApplyOnAccount;


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
 *         &lt;element name="applyOnAccount" type="{http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/standardReceiptService/commonService/}ApplyOnAccount"/&gt;
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
    "applyOnAccount"
})
@XmlRootElement(name = "createApplyOnAccountAsync")
public class CreateApplyOnAccountAsync {

    @XmlElement(required = true)
    protected ApplyOnAccount applyOnAccount;

    /**
     * Gets the value of the applyOnAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyOnAccount }
     *     
     */
    public ApplyOnAccount getApplyOnAccount() {
        return applyOnAccount;
    }

    /**
     * Sets the value of the applyOnAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyOnAccount }
     *     
     */
    public void setApplyOnAccount(ApplyOnAccount value) {
        this.applyOnAccount = value;
    }

}

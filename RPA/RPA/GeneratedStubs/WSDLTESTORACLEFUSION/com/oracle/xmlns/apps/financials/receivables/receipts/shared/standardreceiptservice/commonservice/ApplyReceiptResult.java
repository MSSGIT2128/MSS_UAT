
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.adf.svc.types.MethodResult;


/**
 * <p>Java class for ApplyReceiptResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplyReceiptResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/adf/svc/types/}MethodResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/standardReceiptService/commonService/}ApplyReceipt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyReceiptResult", propOrder = {
    "value"
})
public class ApplyReceiptResult
    extends MethodResult
{

    @XmlElement(name = "Value")
    protected List<ApplyReceipt> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplyReceipt }
     * 
     * 
     */
    public List<ApplyReceipt> getValue() {
        if (value == null) {
            value = new ArrayList<ApplyReceipt>();
        }
        return this.value;
    }

}

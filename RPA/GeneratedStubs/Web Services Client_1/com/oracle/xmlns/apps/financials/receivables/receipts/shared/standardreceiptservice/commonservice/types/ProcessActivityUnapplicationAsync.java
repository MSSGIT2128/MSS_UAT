
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.adf.svc.types.ProcessControl;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.ActivityUnapplication;


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
 *         &lt;element name="changeOperation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activityUnapplication" type="{http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/standardReceiptService/commonService/}ActivityUnapplication" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="processControl" type="{http://xmlns.oracle.com/adf/svc/types/}ProcessControl"/&gt;
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
    "changeOperation",
    "activityUnapplication",
    "processControl"
})
@XmlRootElement(name = "processActivityUnapplicationAsync")
public class ProcessActivityUnapplicationAsync {

    @XmlElement(required = true)
    protected String changeOperation;
    protected List<ActivityUnapplication> activityUnapplication;
    @XmlElement(required = true)
    protected ProcessControl processControl;

    /**
     * Gets the value of the changeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeOperation() {
        return changeOperation;
    }

    /**
     * Sets the value of the changeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeOperation(String value) {
        this.changeOperation = value;
    }

    /**
     * Gets the value of the activityUnapplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityUnapplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityUnapplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityUnapplication }
     * 
     * 
     */
    public List<ActivityUnapplication> getActivityUnapplication() {
        if (activityUnapplication == null) {
            activityUnapplication = new ArrayList<ActivityUnapplication>();
        }
        return this.activityUnapplication;
    }

    /**
     * Gets the value of the processControl property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessControl }
     *     
     */
    public ProcessControl getProcessControl() {
        return processControl;
    }

    /**
     * Sets the value of the processControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessControl }
     *     
     */
    public void setProcessControl(ProcessControl value) {
        this.processControl = value;
    }

}


package com.oracle.xmlns.adf.svc.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.adf.svc.errors.ServiceMessage;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.ActivityApplicationResult;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.ActivityUnapplicationResult;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.ApplyOnAccountResult;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.ApplyReceiptResult;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.ReverseReceiptResult;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.StandardReceiptResult;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.UnapplyOnAccountResult;
import com.oracle.xmlns.apps.financials.receivables.receipts.shared.standardreceiptservice.commonservice.UnapplyReceiptResult;


/**
 * <p>Java class for MethodResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Message" type="{http://xmlns.oracle.com/adf/svc/errors/}ServiceMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodResult", propOrder = {
    "message"
})
@XmlSeeAlso({
    StandardReceiptResult.class,
    UnapplyOnAccountResult.class,
    ApplyReceiptResult.class,
    UnapplyReceiptResult.class,
    ActivityUnapplicationResult.class,
    ReverseReceiptResult.class,
    ActivityApplicationResult.class,
    ApplyOnAccountResult.class,
    BigDecimalResult.class,
    BigIntegerResult.class,
    BooleanResult.class,
    ByteResult.class,
    BytesResult.class,
    TimestampResult.class,
    TimeResult.class,
    DateResult.class,
    DoubleResult.class,
    FloatResult.class,
    IntegerResult.class,
    LongResult.class,
    ShortResult.class,
    StringResult.class,
    DataHandlerResult.class,
    DataObjectResult.class
})
public class MethodResult {

    @XmlElement(name = "Message")
    protected List<ServiceMessage> message;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMessage }
     * 
     * 
     */
    public List<ServiceMessage> getMessage() {
        if (message == null) {
            message = new ArrayList<ServiceMessage>();
        }
        return this.message;
    }

}

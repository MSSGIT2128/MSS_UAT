
package com.oracle.xmlns.apps.financials.receivables.receipts.shared.model.flex.standardreceiptdff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.financials.receivables.receipts.shared.model.flex.standardreceiptdff package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StandardReceiptFLEX_QNAME = new QName("http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", "standardReceiptFLEX");
    private final static QName _ZenginCashReceipts_QNAME = new QName("http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", "zenginCashReceipts");
    private final static QName _StandardReceiptFLEXInstrumenttype_QNAME = new QName("http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", "instrumenttype");
    private final static QName _StandardReceiptFLEXPaymentAdviceStatus_QNAME = new QName("http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", "paymentAdviceStatus");
    private final static QName _StandardReceiptFLEXPaymentAdviceType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", "paymentAdviceType");
    private final static QName _StandardReceiptFLEXUnidentifiedTransaction_QNAME = new QName("http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", "unidentifiedTransaction");
    private final static QName _StandardReceiptFLEXFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", "__FLEX_Context");
    private final static QName _StandardReceiptFLEXFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", "__FLEX_Context_DisplayValue");
    private final static QName _StandardReceiptFLEXFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", "_FLEX_NumOfSegments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.financials.receivables.receipts.shared.model.flex.standardreceiptdff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StandardReceiptFLEX }
     * 
     */
    public StandardReceiptFLEX createStandardReceiptFLEX() {
        return new StandardReceiptFLEX();
    }

    /**
     * Create an instance of {@link ZenginCashReceipts }
     * 
     */
    public ZenginCashReceipts createZenginCashReceipts() {
        return new ZenginCashReceipts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardReceiptFLEX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StandardReceiptFLEX }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", name = "standardReceiptFLEX")
    public JAXBElement<StandardReceiptFLEX> createStandardReceiptFLEX(StandardReceiptFLEX value) {
        return new JAXBElement<StandardReceiptFLEX>(_StandardReceiptFLEX_QNAME, StandardReceiptFLEX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZenginCashReceipts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZenginCashReceipts }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", name = "zenginCashReceipts")
    public JAXBElement<ZenginCashReceipts> createZenginCashReceipts(ZenginCashReceipts value) {
        return new JAXBElement<ZenginCashReceipts>(_ZenginCashReceipts_QNAME, ZenginCashReceipts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", name = "instrumenttype", scope = StandardReceiptFLEX.class)
    public JAXBElement<String> createStandardReceiptFLEXInstrumenttype(String value) {
        return new JAXBElement<String>(_StandardReceiptFLEXInstrumenttype_QNAME, String.class, StandardReceiptFLEX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", name = "paymentAdviceStatus", scope = StandardReceiptFLEX.class)
    public JAXBElement<String> createStandardReceiptFLEXPaymentAdviceStatus(String value) {
        return new JAXBElement<String>(_StandardReceiptFLEXPaymentAdviceStatus_QNAME, String.class, StandardReceiptFLEX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", name = "paymentAdviceType", scope = StandardReceiptFLEX.class)
    public JAXBElement<String> createStandardReceiptFLEXPaymentAdviceType(String value) {
        return new JAXBElement<String>(_StandardReceiptFLEXPaymentAdviceType_QNAME, String.class, StandardReceiptFLEX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", name = "unidentifiedTransaction", scope = StandardReceiptFLEX.class)
    public JAXBElement<String> createStandardReceiptFLEXUnidentifiedTransaction(String value) {
        return new JAXBElement<String>(_StandardReceiptFLEXUnidentifiedTransaction_QNAME, String.class, StandardReceiptFLEX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", name = "__FLEX_Context", scope = StandardReceiptFLEX.class)
    public JAXBElement<String> createStandardReceiptFLEXFLEXContext(String value) {
        return new JAXBElement<String>(_StandardReceiptFLEXFLEXContext_QNAME, String.class, StandardReceiptFLEX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", name = "__FLEX_Context_DisplayValue", scope = StandardReceiptFLEX.class)
    public JAXBElement<String> createStandardReceiptFLEXFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_StandardReceiptFLEXFLEXContextDisplayValue_QNAME, String.class, StandardReceiptFLEX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/receivables/receipts/shared/model/flex/StandardReceiptDff/", name = "_FLEX_NumOfSegments", scope = StandardReceiptFLEX.class)
    public JAXBElement<Integer> createStandardReceiptFLEXFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_StandardReceiptFLEXFLEXNumOfSegments_QNAME, Integer.class, StandardReceiptFLEX.class, value);
    }

}


package com.soap.type;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.type package. 
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

    private final static QName _SumResponse_QNAME = new QName("http://service.com/", "sumResponse");
    private final static QName _GetProductDetail_QNAME = new QName("http://service.com/", "getProductDetail");
    private final static QName _Sum_QNAME = new QName("http://service.com/", "sum");
    private final static QName _GetProductDetailResponse_QNAME = new QName("http://service.com/", "getProductDetailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.type
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sum }
     * 
     */
    public Sum createSum() {
        return new Sum();
    }

    /**
     * Create an instance of {@link GetProductDetail }
     * 
     */
    public GetProductDetail createGetProductDetail() {
        return new GetProductDetail();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link SumResponse }
     * 
     */
    public SumResponse createSumResponse() {
        return new SumResponse();
    }

    /**
     * Create an instance of {@link GetProductDetailResponse }
     * 
     */
    public GetProductDetailResponse createGetProductDetailResponse() {
        return new GetProductDetailResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "sumResponse")
    public JAXBElement<SumResponse> createSumResponse(SumResponse value) {
        return new JAXBElement<SumResponse>(_SumResponse_QNAME, SumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getProductDetail")
    public JAXBElement<GetProductDetail> createGetProductDetail(GetProductDetail value) {
        return new JAXBElement<GetProductDetail>(_GetProductDetail_QNAME, GetProductDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "sum")
    public JAXBElement<Sum> createSum(Sum value) {
        return new JAXBElement<Sum>(_Sum_QNAME, Sum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getProductDetailResponse")
    public JAXBElement<GetProductDetailResponse> createGetProductDetailResponse(GetProductDetailResponse value) {
        return new JAXBElement<GetProductDetailResponse>(_GetProductDetailResponse_QNAME, GetProductDetailResponse.class, null, value);
    }

}

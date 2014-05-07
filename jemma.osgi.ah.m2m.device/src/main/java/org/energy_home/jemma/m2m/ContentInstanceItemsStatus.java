//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.05 at 05:19:55 PM CEST 
//


package org.energy_home.jemma.m2m;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentInstanceItemsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentInstanceItemsStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentInstanceItemStatus" type="{http://schemas.telecomitalia.it/m2m}ContentInstanceItemStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://schemas.telecomitalia.it/m2m}AddressedIdAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInstanceItemsStatus", propOrder = {
    "contentInstanceItemStatuses"
})
public class ContentInstanceItemsStatus
    extends M2MXmlObject
{

    @XmlElement(name = "ContentInstanceItemStatus")
    protected List<ContentInstanceItemStatus> contentInstanceItemStatuses;
    @XmlAttribute(name = "AddressedId")
    @XmlSchemaType(name = "anyURI")
    protected String addressedId;

    /**
     * Gets the value of the contentInstanceItemStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentInstanceItemStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentInstanceItemStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentInstanceItemStatus }
     * 
     * 
     */
    public List<ContentInstanceItemStatus> getContentInstanceItemStatuses() {
        if (contentInstanceItemStatuses == null) {
            contentInstanceItemStatuses = new ArrayList<ContentInstanceItemStatus>();
        }
        return this.contentInstanceItemStatuses;
    }

    /**
     * 
     * The addressedId property is used to define the scope of contained resources id property
     *                         
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressedId() {
        return addressedId;
    }

    /**
     * Sets the value of the addressedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressedId(String value) {
        this.addressedId = value;
    }

}

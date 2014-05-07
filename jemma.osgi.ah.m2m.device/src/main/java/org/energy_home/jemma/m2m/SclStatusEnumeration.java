//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.05 at 05:19:55 PM CEST 
//


package org.energy_home.jemma.m2m;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SclStatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SclStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Online"/>
 *     &lt;enumeration value="Offline"/>
 *     &lt;enumeration value="Disconnected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SclStatusEnumeration")
@XmlEnum
public enum SclStatusEnumeration {

    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("Offline")
    OFFLINE("Offline"),
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected");
    private final String value;

    SclStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SclStatusEnumeration fromValue(String v) {
        for (SclStatusEnumeration c: SclStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

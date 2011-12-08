//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.08 at 10:28:42 AM GMT+05:30 
//


package org.apache.airavat.oozie.coordinator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WORKFLOW complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WORKFLOW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="app-path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="configuration" type="{uri:oozie:coordinator:0.1}CONFIGURATION" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WORKFLOW", propOrder = {
    "appPath",
    "configuration"
})
public class WORKFLOW {

    @XmlElement(name = "app-path", required = true)
    protected String appPath;
    protected CONFIGURATION configuration;

    /**
     * Gets the value of the appPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPath() {
        return appPath;
    }

    /**
     * Sets the value of the appPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPath(String value) {
        this.appPath = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link CONFIGURATION }
     *     
     */
    public CONFIGURATION getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONFIGURATION }
     *     
     */
    public void setConfiguration(CONFIGURATION value) {
        this.configuration = value;
    }

}
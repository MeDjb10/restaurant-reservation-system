//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.04 at 09:51:33 PM WAT 
//


package com.example.tableavailability;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.tableavailability package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.tableavailability
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAvailableTablesRequest }
     * 
     */
    public GetAvailableTablesRequest createGetAvailableTablesRequest() {
        return new GetAvailableTablesRequest();
    }

    /**
     * Create an instance of {@link GetAvailableTablesResponse }
     * 
     */
    public GetAvailableTablesResponse createGetAvailableTablesResponse() {
        return new GetAvailableTablesResponse();
    }

    /**
     * Create an instance of {@link Table }
     * 
     */
    public Table createTable() {
        return new Table();
    }

}
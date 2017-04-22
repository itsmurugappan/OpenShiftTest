package com.et.controller;

/**
 * Created by msevugan on 4/21/17.
 */

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;


@RestController
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld()
    {
        String DATASOURCE_CONTEXT = "java:jboss/datasources/ExampleDS";

        Connection result = null;
        try {
            Context initialContext = new InitialContext();
            if ( initialContext == null){
                System.out.println("JNDI problem. Cannot get InitialContext.");
            }
            DataSource datasource = (DataSource)initialContext.lookup(DATASOURCE_CONTEXT);
            if (datasource != null) {
                result = datasource.getConnection();
                System.out.println("connection + " + result);
                return "success" ;
            }
            else {
                System.out.println("Failed to lookup datasource.");
            }
        }
        catch ( NamingException ex ) {
            System.out.println("Cannot get connection: " + ex);
        }
        catch(SQLException ex){
            System.out.println("Cannot get connection: " + ex);
        }
        return "hello world";
    }

}

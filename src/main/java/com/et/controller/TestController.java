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
        return "successsdss";
    }

}

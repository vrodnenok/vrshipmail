package com.rodnenok;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fasterxml.jackson.databind.*;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author vic
 */

@Controller
public class SendController {
    
    @RequestMapping("sent.htm")
    protected @ResponseBody Object showAllDistances 
            (HttpServletRequest req, 
             HttpServletResponse resp) throws Exception {
        
        
        if(!req.getMethod().equals("POST")){
            return new ModelAndView("error");
        }
        
        String filter = req.getParameter("subject");
        System.out.println(filter);
                        
        //return "{\"port\":\"kherson\"}";
        return "Okay";
    }    
}

/*
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.

package ua.com.kievship.vrshipman;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.*;
import java.math.BigDecimal;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author victor
 

@Controller
public class PortController{

    PortManager pm = new PortManager();
    private static Log log = LogFactory.getLog(PortController.class); 
    
    @RequestMapping("add_port.htm")
    protected @ResponseBody Object addNewDistance
            (HttpServletRequest req,
             HttpServletResponse resp) throws Exception{
        
        Port p = new Port();
        p.setFport(req.getParameter("fport").trim().toUpperCase());
        p.setTport(req.getParameter("tport").trim().toUpperCase());
        p.setDistance(new BigDecimal(req.getParameter("dist")));
        p.setRegion(req.getParameter("region").trim().toUpperCase());
        pm.savePort(p);
        return req.getParameter("ok");
    }
    
    @RequestMapping("upd_port.htm")
    protected @ResponseBody Object updDistance
            (HttpServletRequest req,
             HttpServletResponse resp) throws Exception{
        
        Port p = new Port();
        p.setId(Integer.parseInt(req.getParameter("id")));
        p.setFport(req.getParameter("fport").trim().toUpperCase());
        p.setTport(req.getParameter("tport").trim().toUpperCase());
        p.setDistance(new BigDecimal(req.getParameter("dist")));
        p.setRegion(req.getParameter("region").trim().toUpperCase());
        pm.savePort(p);
        return ""+p.getId();
    }
    
    
    @RequestMapping("del_port.htm")
    protected @ResponseBody Object deleteDistance(HttpServletRequest req,
            HttpServletResponse resp) throws Exception {
        int id = Integer.parseInt(req.getParameter("id"));
        pm.deletePort(id);        
        return("ok");
    }
    
    @RequestMapping("port.htm")
    protected @ResponseBody Object showAllDistances 
            (HttpServletRequest req, 
             HttpServletResponse resp) throws Exception {
        
        /*
        if(!req.getMethod().equals("POST")){
            return new ModelAndView("error");
        }
        
        String filter = req.getParameter("filter");
                         
        List <Port> ports = pm.getAllPorts(filter);

        ObjectMapper om= new ObjectMapper();
        String s = om.writeValueAsString(ports);

        //return "{\"port\":\"kherson\"}";
        return s;
    }
    
}

*/
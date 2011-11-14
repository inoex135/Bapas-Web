/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.javan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 *
 * @author wisnu
 */
public class IndexController extends MultiActionController{
    public String index(HttpServletRequest req, HttpServletResponse resp){
        return "index";
    }
}

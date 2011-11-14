/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.javan.controller.api;

import id.co.javan.model.Institusi;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 *
 * @author wisnu
 */
public class ApiInstitusiController extends MultiActionController {

    public ModelAndView list(HttpServletRequest req, HttpServletResponse resp) {
        ArrayList institusiList = new ArrayList();

        Institusi institusi1 = new Institusi();
        institusi1.setId(1L);
        institusi1.setKode("001");
        institusi1.setNama("Institusi 1");
        institusiList.add(institusi1);

        id.co.javan.model.Institusi institusi2 = new id.co.javan.model.Institusi();
        institusi2.setId(1L);
        institusi2.setKode("001");
        institusi2.setNama("Institusi 2");
        institusiList.add(institusi1);

        ModelAndView mv = new ModelAndView("api");
        mv.addObject("json", JSONArray.fromObject(institusiList).toString());
        return mv;
    }

    public ModelAndView doAdd(HttpServletRequest req, HttpServletResponse resp) {
        id.co.javan.model.Institusi institusi1 = new id.co.javan.model.Institusi();
        institusi1.setId(1L);
        institusi1.setKode("001");
        institusi1.setNama("Institusi 1");
        ModelAndView mv = new ModelAndView("api");
        mv.addObject("json", JSONObject.fromObject(institusi1).toString());

        return mv;
    }

    public ModelAndView doSave(HttpServletRequest req, HttpServletResponse resp) {
        id.co.javan.model.Institusi institusi1 = new id.co.javan.model.Institusi();
        institusi1.setId(1L);
        institusi1.setKode("001");
        institusi1.setNama("Institusi 1");
        ModelAndView mv = new ModelAndView("api");
        mv.addObject("json", JSONObject.fromObject(institusi1).toString());

        return mv;
    }

    public ModelAndView delete(HttpServletRequest req, HttpServletResponse resp) {
        ModelAndView mv = new ModelAndView("api");
        mv.addObject("json", true);

        return mv;
    }


    public ModelAndView get(HttpServletRequest req, HttpServletResponse resp) {
        id.co.javan.model.Institusi institusi1 = new id.co.javan.model.Institusi();
        institusi1.setId(1L);
        institusi1.setKode("001");
        institusi1.setNama("Institusi 1");

        ModelAndView mv = new ModelAndView("api");
        mv.addObject("json", JSONObject.fromObject(institusi1).toString());

        return mv;
    }
}

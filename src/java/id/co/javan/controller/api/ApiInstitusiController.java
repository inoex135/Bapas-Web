/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.javan.controller.api;

import id.co.javan.model.Institusi;
import id.co.javan.model.ResponseJSON;
import id.co.javan.service.InstitusiService;
import java.util.List;
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

    InstitusiService institusiSrv;

    public InstitusiService getInstitusiSrv() {
        return institusiSrv;
    }

    public void setInstitusiSrv(InstitusiService institusiSrv) {
        this.institusiSrv = institusiSrv;
    }

    public ModelAndView list(HttpServletRequest req, HttpServletResponse resp) {
        List<Institusi> institusiList = institusiSrv.list();

        ModelAndView mv = new ModelAndView("api");
        ResponseJSON response = new ResponseJSON();
        response.setArrayOfObject(institusiList.toArray());
        response.setMessage("Daftar Institusi");
        String json = "";
        if (req.getParameter("callback") != null && req.getParameter("callback").length() > 0) {
            json = req.getParameter("callback") + "(" + JSONObject.fromObject(response).toString() + ")";
        } else {
            json = JSONObject.fromObject(response).toString();
        }

        mv.addObject("json", json);
        return mv;
    }

    public ModelAndView doAdd(HttpServletRequest req, HttpServletResponse resp) {
        String kode = req.getParameter("kode");
        String nama = req.getParameter("nama");
        String json = "";
        ResponseJSON response = new ResponseJSON();
        ModelAndView mv = new ModelAndView("api");
        if (kode != null && nama != null) {
            Institusi institusi1 = new Institusi();
            institusi1.setKode(kode);
            institusi1.setNama(nama);
            institusiSrv.add(institusi1);

            response.setObject(institusi1);
            response.setMessage("Sukses menambahkan institusi");

        } else {
            response.setError(true);
            response.setMessage("kode dan nama tidak boleh kosong");
        }
        if (req.getParameter("callback") != null && req.getParameter("callback").length() > 0) {
            json = req.getParameter("callback") + "(" + JSONObject.fromObject(response).toString() + ")";
        } else {
            json = JSONObject.fromObject(response).toString();
        }
        mv.addObject("json", json);

        return mv;
    }

    public ModelAndView doSave(HttpServletRequest req, HttpServletResponse resp) {
        ModelAndView mv = new ModelAndView("api");
        String json = "";
        ResponseJSON response = new ResponseJSON();
        if (req.getParameter("id") != null) {
            Long id = Long.parseLong(req.getParameter("id"));
            Institusi institusi1 = institusiSrv.findById(id);


            if (institusi1 != null) {
                String kode = req.getParameter("kode");
                String nama = req.getParameter("nama");

                institusi1.setKode(kode);
                institusi1.setNama(nama);
                institusiSrv.update(institusi1);

                response.setObject(institusi1);
                response.setMessage("Sukses menyimpan institusi");
            } else {
                response.setError(true);
                response.setMessage("Objek tidak ditemukan");
            }
        } else {
            response.setError(true);
            response.setMessage("Objek tidak ditemukan");
        }
        if (req.getParameter("callback") != null && req.getParameter("callback").length() > 0) {
            json = req.getParameter("callback") + "(" + JSONObject.fromObject(response).toString() + ")";
        } else {
            json = JSONObject.fromObject(response).toString();
        }
        mv.addObject("json", json);
        return mv;
    }

    public ModelAndView delete(HttpServletRequest req, HttpServletResponse resp) {
        ModelAndView mv = new ModelAndView("api");
        String json = "";
        ResponseJSON response = new ResponseJSON();
        if (req.getParameter("id") != null) {
            Long id = Long.parseLong(req.getParameter("id"));
            Institusi institusi1 = institusiSrv.findById(id);
            if (institusi1 != null) {
                institusiSrv.delete(institusi1);
                response.setMessage("Sukses menyimpan institusi");
            } else {
                response.setError(true);
                response.setMessage("Ada kesalahan di server");
            }
        } else {
            response.setError(true);
            response.setMessage("Ada kesalahan di server");
        }
        if (req.getParameter("callback") != null && req.getParameter("callback").length() > 0) {
            json = req.getParameter("callback") + "(" + JSONObject.fromObject(response).toString() + ")";
        } else {
            json = JSONObject.fromObject(response).toString();
        }
        mv.addObject("json", json);
        return mv;
    }

    public ModelAndView get(HttpServletRequest req, HttpServletResponse resp) {
        Long id = Long.parseLong(req.getParameter("id"));
        Institusi institusi1 = institusiSrv.findById(id);

        ModelAndView mv = new ModelAndView("api");
        ResponseJSON response = new ResponseJSON();
        if (institusi1 != null) {
            response.setObject(institusi1);
            response.setMessage("Institusi ditemukan");
        } else {
            response.setError(true);
            response.setMessage("Institusi tidak ditemukan");
        }
        String json = "";
        if (req.getParameter("callback") != null && req.getParameter("callback").length() > 0) {
            json = req.getParameter("callback") + "(" + JSONObject.fromObject(response).toString() + ")";
        } else {
            json = JSONObject.fromObject(response).toString();
        }
        mv.addObject("json", json);

        return mv;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.javan.service;

import id.co.javan.model.Institusi;
import id.co.javan.model.dao.InstitusiDao;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author wisnu
 */
public class InstitusiService extends HibernateDaoSupport implements InstitusiDao{

    public Long add(Institusi i) {
        return (Long) getHibernateTemplate().save(i);
    }

    public void delete(Institusi i) {
        getHibernateTemplate().delete(i);
    }

    public void update(Institusi i) {
        getHibernateTemplate().update(i);
    }

    public List<Institusi> list() {
        return getHibernateTemplate().find("from Institusi i");
    }

    public Institusi findById(Long id) {
        return (Institusi) getHibernateTemplate().get(Institusi.class, id);
    }

}

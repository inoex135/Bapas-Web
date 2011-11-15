/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.javan.model.dao;

import id.co.javan.model.Institusi;
import java.util.List;

/**
 *
 * @author wisnu
 */
public interface InstitusiDao {

    Long add(Institusi c);

    void delete(Institusi c);

    void update(Institusi c);

    List<Institusi> list();

    Institusi findById(Long id);
}

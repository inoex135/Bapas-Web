/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.javan.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author wisnu
 */
@Entity
public class Institusi implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String kode;
    private String nama;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    

}

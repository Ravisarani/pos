/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ravisarani
 */
@Entity
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String billNo;
    private Date billDate;
    private Time billTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abc.entity.Bill[ id=" + id + " ]";
    }

    
    public String getBillNo() {
        return billNo;
    }

   
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    
    public Date getBillDate() {
        return billDate;
    }

    
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

   
    public Time getBillTime() {
        return billTime;
    }

    
    public void setBillTime(Time billTime) {
        this.billTime = billTime;
    }

}
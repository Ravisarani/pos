package hib;
// Generated May 14, 2014 11:33:34 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Suppliers generated by hbm2java
 */
public class Suppliers  implements java.io.Serializable {


     private int idSup;
     private String supName;
     private String contactNo;
     private String address;
     private String email;
     private String comnyRegNo;
     private Set<ItemHasCategory> itemHasCategories = new HashSet<ItemHasCategory>(0);

    public Suppliers() {
    }

	
    public Suppliers(int idSup) {
        this.idSup = idSup;
    }
    public Suppliers(int idSup, String supName, String contactNo, String address, String email, String comnyRegNo, Set<ItemHasCategory> itemHasCategories) {
       this.idSup = idSup;
       this.supName = supName;
       this.contactNo = contactNo;
       this.address = address;
       this.email = email;
       this.comnyRegNo = comnyRegNo;
       this.itemHasCategories = itemHasCategories;
    }
   
    public int getIdSup() {
        return this.idSup;
    }
    
    public void setIdSup(int idSup) {
        this.idSup = idSup;
    }
    public String getSupName() {
        return this.supName;
    }
    
    public void setSupName(String supName) {
        this.supName = supName;
    }
    public String getContactNo() {
        return this.contactNo;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getComnyRegNo() {
        return this.comnyRegNo;
    }
    
    public void setComnyRegNo(String comnyRegNo) {
        this.comnyRegNo = comnyRegNo;
    }
    public Set<ItemHasCategory> getItemHasCategories() {
        return this.itemHasCategories;
    }
    
    public void setItemHasCategories(Set<ItemHasCategory> itemHasCategories) {
        this.itemHasCategories = itemHasCategories;
    }




}



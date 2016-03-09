package hib;
// Generated May 14, 2014 11:33:34 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Type generated by hbm2java
 */
public class Type  implements java.io.Serializable {


     private int idType;
     private Category category;
     private String typeName;
     private Set<Model> models = new HashSet<Model>(0);
     private Set<ItemHasCategory> itemHasCategories = new HashSet<ItemHasCategory>(0);

    public Type() {
    }

	
    public Type(int idType, Category category) {
        this.idType = idType;
        this.category = category;
    }
    public Type(int idType, Category category, String typeName, Set<Model> models, Set<ItemHasCategory> itemHasCategories) {
       this.idType = idType;
       this.category = category;
       this.typeName = typeName;
       this.models = models;
       this.itemHasCategories = itemHasCategories;
    }
   
    public int getIdType() {
        return this.idType;
    }
    
    public void setIdType(int idType) {
        this.idType = idType;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public Set<Model> getModels() {
        return this.models;
    }
    
    public void setModels(Set<Model> models) {
        this.models = models;
    }
    public Set<ItemHasCategory> getItemHasCategories() {
        return this.itemHasCategories;
    }
    
    public void setItemHasCategories(Set<ItemHasCategory> itemHasCategories) {
        this.itemHasCategories = itemHasCategories;
    }




}



package com.abc.entity;

import com.abc.entity.Bill;
import com.abc.entity.Drug;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2016-03-09T10:08:30")
@StaticMetamodel(BillItem.class)
public class BillItem_ { 

    public static volatile SingularAttribute<BillItem, Double> qty;
    public static volatile SingularAttribute<BillItem, Bill> bill;
    public static volatile SingularAttribute<BillItem, Long> id;
    public static volatile SingularAttribute<BillItem, Double> value;
    public static volatile SingularAttribute<BillItem, Drug> drug;

}
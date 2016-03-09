package com.abc.entity;

import java.sql.Time;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2016-03-09T10:08:30")
@StaticMetamodel(Bill.class)
public class Bill_ { 

    public static volatile SingularAttribute<Bill, Time> billTime;
    public static volatile SingularAttribute<Bill, Date> billDate;
    public static volatile SingularAttribute<Bill, Long> id;
    public static volatile SingularAttribute<Bill, String> billNo;

}
package com.redsamurai.counter.model.views;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 20 20:51:13 EEST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BlogStatsViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public BlogStatsViewImpl() {
    }

    @Override
    public void executeQuery() {
        ViewObjectImpl vo = (ViewObjectImpl) this.getRootApplicationModule().findViewObject("BlogStatsEntryView1");
        Row row = vo.createRow();
        vo.insertRow(row);
        this.getDBTransaction().commit();
        
        super.executeQuery();
    }
}

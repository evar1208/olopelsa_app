package com.example.efren.olopelsa_app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ListModel {

    private  String CompanyName="";
    private  String Url="";

    /*********** Set Methods ******************/

    public void setCompanyName(String CompanyName)
    {
        this.CompanyName = CompanyName;
    }

        public void setUrl(String Url)
    {
        this.Url = Url;
    }

    /*********** Get Methods ****************/

    public String getCompanyName()
    {
        return this.CompanyName;
    }

        public String getUrl()
    {
        return this.Url;
    }
}

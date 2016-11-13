package com.fows.entity.gateway;

/**
 * Created by ByJacob on 2016-11-12.
 */
public interface PrelegentGateway {
    String getFullName();
    String getCompany();
    String getInformation();
    String getUrlCompanyImage(); //chyba że interfejs powinien już zwracać obraz
    String getUrlPerconImage();
}

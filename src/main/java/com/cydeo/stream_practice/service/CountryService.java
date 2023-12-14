package com.cydeo.stream_practice.service;

import com.cydeo.stream_practice.model.Country;

import java.util.List;


public interface CountryService extends CrudService<Country, String> {
    /*
     * This method takes a List of Country objects as parameter,
     * and puts all of them into the Map, which is in the CrudServiceImpl class.
     * At the end, it returns the List of Country objects which it put into Map.
     *
     * The Map mentioned above -> {@link com.cydeo.streampractice.service.impl.CrudServiceImpl#map}
     * @param list List of Country objects
     * @return List of Country objects
     */
    List<Country> createAllCountry(List<Country> list);
}


package com.cydeo.stream_practice.service;

import com.cydeo.stream_practice.model.Region;

import java.util.List;

public interface RegionService extends CrudService<Region, Long> {
    /*
     * This method takes a List of Region objects as parameter,
     * and puts all of them into the Map, which is in the CrudServiceImpl class.
     * At the end, it returns the List of Region objects which it put into Map.
     *
     * The Map mentioned above -> {@link com.cydeo.streampractice.service.impl.CrudServiceImpl#map}
     * @param list List of Region objects
     * @return List of Region objects
     */ List<Region> createAllRegion(List<Region> list);
}

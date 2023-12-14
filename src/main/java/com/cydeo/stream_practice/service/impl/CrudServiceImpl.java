package com.cydeo.stream_practice.service.impl;



import com.cydeo.stream_practice.model.Department;
import com.cydeo.stream_practice.model.Employee;
import com.cydeo.stream_practice.model.Region;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CrudServiceImpl<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    /*
     * This generic method puts an object with the given id into the Map above.
     * At the end, it returns the object which it put into Map.
     *
     * @param id ID id (ID is a generic type)
     * @param object T object (T is a generic type)
     * @return T object (T is a generic type)
     */
    T create(ID id, T object) {
        map.put(id, object);
        return object;
    }

    /*
     * This generic method updates an object with the given id inside the Map created above,
     * This generic method doesn't return anything after it updated the corresponding object in the Map.
     *
     * @param id ID id (ID is a generic type)
     * @param object T object (T is a generic type)
     */
    void update(ID id, T object) {
        map.put(id, object);
    }

    public abstract Department create(Department object);

    public abstract List<Department> createAllDepartment(List<Department> list);

    public abstract void update(Department object);

    public abstract Region create(Region object);

    public abstract List<Region> createAllRegion(List<Region> list);

    public abstract void update(Region object);

    public abstract Employee create(Employee object);

    /*
     * This generic method doesn't take any parameters,
     * It returns all the objects inside the Map created above as List of T objects (T is a generic type).
     *
     * @return List of T objects (T is a generic type)
     */
    List<T> readAll() {
        return new ArrayList<>(map.values());
    }

    /*
     * This generic method returns the object which has an id equals the id coming from the method parameter, from the Map created above.
     *
     * @param id ID id (ID is a generic type)
     * @return T object (T is a generic type)
     */
    T readById(ID id) {
        return map.get(id);
    }

    /*
     * This generic method removes the object which is equals the object coming from the method parameter, from the Map created above.
     * This generic method doesn't return anything after it removed the corresponding object in the Map.
     *
     * @param object T object (T is a generic type)
     */
    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    /*
     * This generic method removes the object which has an id equals the id coming from the method parameter, from the Map created above.
     * This generic method doesn't return anything after it removed the corresponding object in the Map.
     *
     * @param id ID id (ID is a generic type)
     */
    void deleteById(ID id) {
        map.remove(id);
    }

}

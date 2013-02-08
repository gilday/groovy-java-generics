package org.ozoneplatform.example;

import java.util.List;

interface Repository<T> {

    T getById(Integer id);

    List<T> findAll();
}

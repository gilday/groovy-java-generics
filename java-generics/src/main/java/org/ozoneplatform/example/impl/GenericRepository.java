package org.ozoneplatform.example.impl;

import java.util.List;

class GenericRepository<T> {

    public T getById(Integer id) {
        throw new RuntimeException("Not Implemented");
    }

    public List<T> findAll() {
        throw new RuntimeException("Not Implemented");
    }
}

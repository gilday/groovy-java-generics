package org.ozoneplatform.example;

import java.util.List;

interface RepositoryWithId<T, TKey> {

    T getById(TKey id);

    List<T> findAll();
}

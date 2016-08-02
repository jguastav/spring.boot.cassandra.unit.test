package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyCassandraRepository extends CrudRepository<MyCassandraEntry, MyCassandraKey> {
    // nothing
}
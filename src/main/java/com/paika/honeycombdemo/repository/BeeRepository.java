package com.paika.honeycombdemo.repository;

import com.paika.honeycombdemo.domain.Bee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BeeRepository extends PagingAndSortingRepository<Bee, Long> {
    List<Bee> findByName(@Param("name") String name);
}

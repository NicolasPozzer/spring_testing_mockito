package com.demo.spring_testing_mockito.repository;

import com.demo.spring_testing_mockito.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutoRepository extends JpaRepository<Auto, Long> {
}

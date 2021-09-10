package com.digitalinnovationone.pgp.repository;

import com.digitalinnovationone.pgp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

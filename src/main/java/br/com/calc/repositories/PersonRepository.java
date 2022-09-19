package br.com.calc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.calc.model.Person;

@Repository
public interface PersonRepository  extends JpaRepository<Person, Long>{

}

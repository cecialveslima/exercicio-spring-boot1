package br.com.calc.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.calc.exceptions.ResourceNotFoundException;
import br.com.calc.model.Person;
import br.com.calc.repositories.PersonRepository;

@Service
public class PersonServices {
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	public List<Person> findAll() {
		return repository.findAll();
	}

	public Person findById(Long id) {
		
		logger.info("Pesquisando uma pessoa!");
		
		return repository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Registro não encontrado para o ID"));
	}
	
	
	public Person create(Person person) {
		logger.info("Inserindo uma pessoa");
		return  repository.save(person);
	}
	
	public Person update(Person person) {
		logger.info("Atualizando uma pessoa");
		
		var Entity = repository.findById(person.getId()) 
		.orElseThrow(() -> new ResourceNotFoundException("Registro não encontrado para o ID"));
		
		
		Entity.setName(person.getName());
		Entity.setSobrenome(person.getSobrenome());
		Entity.setSexo(person.getSexo());
		Entity.setEndereco(person.getEndereco());
		
		
		return repository.save(person);
	}	
	
	public void delete(Long id) {
		logger.info("Removendo uma pessoa");
		
		var Entity = repository.findById(id) 
		.orElseThrow(() -> new ResourceNotFoundException("Registro não encontrado para o ID"));		
		
		repository.delete(Entity);
	}	
}

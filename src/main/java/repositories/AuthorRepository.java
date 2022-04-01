package repositories;

import org.springframework.data.repository.CrudRepository;

import domain.Author;
//Author Long ist der primary key
//Crud Operationen.
public interface AuthorRepository extends CrudRepository<Author, Long>{
	

}

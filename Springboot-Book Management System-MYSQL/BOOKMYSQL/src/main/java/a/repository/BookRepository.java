/*
 * @Author Vinodha 
 * JPA Repository are available here
 */
package a.repository;

import org.springframework.data.repository.CrudRepository;

import a.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}

/*
 * @Author Vinodha 
 * JPA Controller are available here
 */
package a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import a.model.Book;
import a.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;

	@GetMapping("/getallbooks")
	private List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/bookget/{bbb}")
	private Book getBook(@PathVariable("bbb") int bookid) {
		return bookService.getBookById(bookid);

	}

	@GetMapping("/bookdelete/{bbb}")
	private void deleteBook(@PathVariable("bbb") int bookid) {
		bookService.delete(bookid);

	}

	@PostMapping("/booksave")
	private int saveBook(@RequestBody Book book) {
		bookService.saveOrUpdate(book);
		return book.getBookId();
	}

	@PutMapping("/bookput")
	private Book update(@RequestBody Book book) {
		bookService.saveOrUpdate(book);
		return book;
	}

}

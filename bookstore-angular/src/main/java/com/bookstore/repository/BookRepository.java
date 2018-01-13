package com.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Book;
import com.bookstore.domain.User;

public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findByTitleContaining(String keyword);
}

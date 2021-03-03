package com.nhan.RentBook.repository;

import com.nhan.RentBook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

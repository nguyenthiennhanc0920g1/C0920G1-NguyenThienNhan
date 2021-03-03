package com.nhan.RentBook.repository;

import com.nhan.RentBook.model.Book;
import com.nhan.RentBook.model.OrderBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderBookRepository extends JpaRepository<OrderBook, Integer> {
    Iterable<OrderBook> findAllByBook(Book book);
    OrderBook findByCode(int code);
}

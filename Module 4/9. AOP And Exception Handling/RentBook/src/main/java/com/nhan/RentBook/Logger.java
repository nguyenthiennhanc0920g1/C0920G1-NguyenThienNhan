package com.nhan.RentBook;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Logger {
    @AfterThrowing(pointcut = "execution(public * com.nhan.RentBook.service.BookService(..))",
            throwing = "ex")
    public void error(Exception ex) {
        System.err.println("lỗi");
    }
}

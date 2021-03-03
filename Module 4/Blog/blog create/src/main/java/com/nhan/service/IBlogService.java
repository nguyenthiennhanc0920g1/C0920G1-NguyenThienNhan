package com.nhan.service;

import com.nhan.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {

    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

    Page<Blog> findAllByFirstNameContaining(String search, Pageable pageable);
}

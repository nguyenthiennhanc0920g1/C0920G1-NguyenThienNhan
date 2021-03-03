package com.nhan.repository;

import com.nhan.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Long> {

    Page<Blog> findAllByContentContaining(String content, Pageable pageable);
}

package com.abidev.newsapi.repository;

import com.abidev.newsapi.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

    @Query("SELECT n FROM News n JOIN n.categories c WHERE c.id = :categoryId")
    List<News> findTop3ByCategoriesId(@Param("categoryId") Long categoryId, org.springframework.data.domain.Pageable pageable);

}

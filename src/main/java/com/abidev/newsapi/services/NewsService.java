package com.abidev.newsapi.services;

import com.abidev.newsapi.entity.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface NewsService {

    Page<News> getPagedNews(Pageable pageable);

    News getNewsById(Long id);

}

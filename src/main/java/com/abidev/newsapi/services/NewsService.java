package com.abidev.newsapi.services;

import com.abidev.newsapi.entity.News;

public interface NewsService {

    Iterable<News> getAllNews();

    News getNewsById(Long id);

}

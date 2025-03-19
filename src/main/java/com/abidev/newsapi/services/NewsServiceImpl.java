package com.abidev.newsapi.services;

import com.abidev.newsapi.entity.News;
import com.abidev.newsapi.repository.NewsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public Page<News> getPagedNews(Pageable pageable) {
        return newsRepository.findAll(pageable);
    }

    @Override
    public News getNewsById(Long id) {
        return newsRepository.findById(id).orElse(null);
    }
}

package com.abidev.newsapi.services;

import com.abidev.newsapi.entity.News;
import com.abidev.newsapi.repository.NewsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


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

    @Override
    public List<News> getTop3NewsByCategoryId(Long newsId) {
        return newsRepository.findById(newsId)
                .flatMap(news -> news.getCategories().stream().findAny())
                .map(category -> newsRepository.findTop3ByCategoriesId(category.getId(), org.springframework.data.domain.PageRequest.of(0, 3)))
                .orElse(Collections.emptyList());
    }
}

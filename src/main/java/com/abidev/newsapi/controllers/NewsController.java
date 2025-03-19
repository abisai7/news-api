package com.abidev.newsapi.controllers;

import com.abidev.newsapi.entity.News;
import com.abidev.newsapi.services.NewsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }


    @GetMapping("/")
    public Page<News> getPagedNews(Pageable pageable) {
        return newsService.getPagedNews(pageable);
    }

    @RequestMapping("/{id}")
    public News getNewsById(@PathVariable String id) {
        return newsService.getNewsById(Long.valueOf(id));
    }

}

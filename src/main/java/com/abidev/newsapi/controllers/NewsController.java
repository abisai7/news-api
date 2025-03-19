package com.abidev.newsapi.controllers;

import com.abidev.newsapi.entity.News;
import com.abidev.newsapi.services.NewsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @RequestMapping("/all")
    public Iterable<News> getAllNews() {
        return newsService.getAllNews();
    }

    @RequestMapping("/{id}")
    public News getNewsById(Long id) {
        return newsService.getNewsById(id);
    }

}

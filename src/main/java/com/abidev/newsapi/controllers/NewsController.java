package com.abidev.newsapi.controllers;

import com.abidev.newsapi.entity.News;
import com.abidev.newsapi.services.NewsService;
import jakarta.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

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

    @GetMapping("/{id}")
    public News getNewsById(@PathVariable @Min(1) Long id) {
        News news = newsService.getNewsById(id);
        if (news == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "News not found");
        }
        return news;
    }

    @GetMapping("/{id}/top3")
    public List<News> getTop3NewsByCategoryId(@PathVariable String id) {
        return newsService.getTop3NewsByCategoryId(Long.valueOf(id));
    }
}

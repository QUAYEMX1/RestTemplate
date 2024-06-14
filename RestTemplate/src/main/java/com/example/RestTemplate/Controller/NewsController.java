package com.example.RestTemplate.Controller;

import com.example.RestTemplate.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/news")
public class NewsController {
  @Autowired
  NewsService newsService;

  @GetMapping
    public Object getNews(@RequestParam("country-code")String countryCode,
                          @RequestParam("api-key")String apiKey){

      return newsService.getNews(countryCode,apiKey);
  }
}

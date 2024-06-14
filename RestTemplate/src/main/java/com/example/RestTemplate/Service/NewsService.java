package com.example.RestTemplate.Service;

import com.example.RestTemplate.dto.ArticleResponse;
import com.example.RestTemplate.dto.NewsResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    String baseurl="https://newsapi.org/v2/top-headlines?country=";
    public Object getNews(String countryCode, String apiKey) {

        RestTemplate restTemplate=new RestTemplate();

        String url=prepareUrl(countryCode,apiKey);

        NewsResponse res=restTemplate.getForObject(url, NewsResponse.class);

        return res;
    }

    private String prepareUrl(String countryCode, String apiKey) {

        String res=baseurl+countryCode+'&'+ "apiKey="+apiKey;
        return res;
    }
}

package com.example.RestTemplate.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@FieldDefaults(level = AccessLevel.PRIVATE)

public class NewsResponse {

    List<ArticleResponse>articles;
}

package com.hiking.article.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleVO, Integer> {

}

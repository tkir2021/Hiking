package com.hiking.article.service;

import java.util.List;
import com.hiking.article.model.ArticleVO;

public interface ArticleService {

	List<ArticleVO> getAll();

	ArticleVO getOneArticle(Integer articleId);

}

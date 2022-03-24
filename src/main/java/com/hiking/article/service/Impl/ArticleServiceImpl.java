package com.hiking.article.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiking.article.model.ArticleRepository;
import com.hiking.article.model.ArticleVO;
import com.hiking.article.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public List<ArticleVO> getAll() {
		return articleRepository.findAll();
	}

	@Override
	public ArticleVO getOneArticle(Integer articleId) {
		return articleRepository.getById(articleId);
	}

}

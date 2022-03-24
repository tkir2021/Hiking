package com.hiking.article.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hiking.article.model.ArticleVO;
import com.hiking.article.service.ArticleService;

@RestController("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@GetMapping("/list")
	public String ListAll(Model model) {
		List<ArticleVO> articleVOs = articleService.getAll();
		model.addAttribute("articleVOs",articleVOs);
		return "article/list";

	}

}

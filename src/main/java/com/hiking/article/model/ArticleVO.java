package com.hiking.article.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "article")
public class ArticleVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "article_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer articleId;

	@Column(name = "member_id")
	private Integer memberId;

	@Column(name = "mountain_id")
	private Integer mountainId;

	@Column(name = "article_title")
	private String articleTitle;

	@Column(name = "article_content")
	private String articleContent;

	@Column(name = "article_date_created")
	private Timestamp articleDateCreated;

	@Column(name = "event_date")
	private Date eventDate;

	@Column(name = "recommendation")
	private Integer recommendation;

	@Column(name = "article_points_recieved")
	private Integer articlePointRecieved;

	@Column(name = "article_status")
	private Integer articleStatus;

	@Column(name = "aritcle_viewer")
	private Integer articleViewer;

	@Column(name = "other_mtn")
	private String otherMtn;

	public ArticleVO(Integer articleId, Integer memberId, Integer mountainId, String articleTitle,
			String articleContent, Timestamp articleDateCreated, Date eventDate, Integer recommendation,
			Integer articlePointRecieved, Integer articleStatus, Integer articleViewer, String otherMtn) {
		super();
		this.articleId = articleId;
		this.memberId = memberId;
		this.mountainId = mountainId;
		this.articleTitle = articleTitle;
		this.articleContent = articleContent;
		this.articleDateCreated = articleDateCreated;
		this.eventDate = eventDate;
		this.recommendation = recommendation;
		this.articlePointRecieved = articlePointRecieved;
		this.articleStatus = articleStatus;
		this.articleViewer = articleViewer;
		this.otherMtn = otherMtn;
	}

	@Override
	public String toString() {
		return "ArticleVO [articleId=" + articleId + ", memberId=" + memberId + ", mountainId=" + mountainId
				+ ", articleTitle=" + articleTitle + ", articleContent=" + articleContent + ", articleDateCreated="
				+ articleDateCreated + ", eventDate=" + eventDate + ", recommendation=" + recommendation
				+ ", articlePointRecieved=" + articlePointRecieved + ", articleStatus=" + articleStatus
				+ ", articleViewer=" + articleViewer + ", otherMtn=" + otherMtn + "]";
	}

}

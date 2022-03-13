package com.hiking.member.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;


@Data
//宣告為實體
@Entity
//對應資料庫表名稱
@Table(name = "member")
//啟用審計(Auditing)的實體中都必須註冊這個 Listener，否則是沒有效果
@EntityListeners(AuditingEntityListener.class)
public class MemberVO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id", nullable = false)
	private Integer memberId;
	
	@Column(name = "member_name", nullable = false)
	private String memberName;
	
	@Column(name = "member_email", nullable = false)
	private String memberEmail;
	
	@Column(name = "member_password", nullable = false)
	private String memberPassword;
	
	@Column(name = "member_username", nullable = false)
	private String memberUsername;
	
	@Column(name = "member_phone_num", nullable = false)
	private String memberPhoneNum;
	
	@Column(name = "member_register_date", nullable = false)
	//自動創建時間
	@CreatedDate
	private Date memberRegisterDate;
	
	@Column(name = "member_profile_pic", nullable = false)
	private byte[] memberProfilePic;
	
	@Column(name = "member_intro", nullable = false)
	private String memberIntro;
	
	@Column(name = "member_status", nullable = false)
	private Integer memberStatus;
	
	@Column(name = "member_sum_points", nullable = false)
	private Integer memberSumPoints;
	
	@Column(name = "member_subscription", nullable = false)
	private Integer memberSubscription;
}

package com.example.demo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tweet {
	private long id;
	private String idRow;
	private String issueName;
	private long totalPost;
	private String statisticPost;
	private long totalInfluencer;
	private long score;
	private String listIssue;
	private List<String> listMentions = new ArrayList<String>();
	private List<String> listCategory = new ArrayList<String>();
	private List<String> listHashtag = new ArrayList<String>();
	private String listIssue2;
	private String status;
	private String createdAt;
	private String createdAtDate;
	private String medsos;
	private String ai, statusSimilar, issueRake, issueKey;
	private long viral;
	private  String follower, speed, socmed;
	private HashMap<String, String>stat_speed = new HashMap<>();
	private String stat_statisticPost;
	private String post_speed;
	private Long oriPost_speed, post_follower, oriPost_follower;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdRow() {
		return idRow;
	}
	public void setIdRow(String idRow) {
		this.idRow = idRow;
	}
	public String getIssueName() {
		return issueName;
	}
	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}
	public long getTotalPost() {
		return totalPost;
	}
	public void setTotalPost(long totalPost) {
		this.totalPost = totalPost;
	}
	public String getStatisticPost() {
		return statisticPost;
	}
	public void setStatisticPost(String statisticPost) {
		this.statisticPost = statisticPost;
	}
	public long getTotalInfluencer() {
		return totalInfluencer;
	}
	public void setTotalInfluencer(long totalInfluencer) {
		this.totalInfluencer = totalInfluencer;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public String getListIssue() {
		return listIssue;
	}
	public void setListIssue(String listIssue) {
		this.listIssue = listIssue;
	}
	public List<String> getListMentions() {
		return listMentions;
	}
	public void setListMentions(List<String> listMentions) {
		this.listMentions = listMentions;
	}
	public List<String> getListCategory() {
		return listCategory;
	}
	public void setListCategory(List<String> listCategory) {
		this.listCategory = listCategory;
	}
	public List<String> getListHashtag() {
		return listHashtag;
	}
	public void setListHashtag(List<String> listHashtag) {
		this.listHashtag = listHashtag;
	}
	public String getListIssue2() {
		return listIssue2;
	}
	public void setListIssue2(String listIssue2) {
		this.listIssue2 = listIssue2;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedAtDate() {
		return createdAtDate;
	}
	public void setCreatedAtDate(String createdAtDate) {
		this.createdAtDate = createdAtDate;
	}
	public String getMedsos() {
		return medsos;
	}
	public void setMedsos(String medsos) {
		this.medsos = medsos;
	}
	public String getAi() {
		return ai;
	}
	public void setAi(String ai) {
		this.ai = ai;
	}
	public String getStatusSimilar() {
		return statusSimilar;
	}
	public void setStatusSimilar(String statusSimilar) {
		this.statusSimilar = statusSimilar;
	}
	public String getIssueRake() {
		return issueRake;
	}
	public void setIssueRake(String issueRake) {
		this.issueRake = issueRake;
	}
	public String getIssueKey() {
		return issueKey;
	}
	public void setIssueKey(String issueKey) {
		this.issueKey = issueKey;
	}
	public long getViral() {
		return viral;
	}
	public void setViral(long viral) {
		this.viral = viral;
	}
	public String getFollower() {
		return follower;
	}
	public void setFollower(String follower) {
		this.follower = follower;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getSocmed() {
		return socmed;
	}
	public void setSocmed(String socmed) {
		this.socmed = socmed;
	}
	public HashMap<String, String> getStat_speed() {
		return stat_speed;
	}
	public void setStat_speed(HashMap<String, String> stat_speed) {
		this.stat_speed = stat_speed;
	}
	public String getStat_statisticPost() {
		return stat_statisticPost;
	}
	public void setStat_statisticPost(String stat_statisticPost) {
		this.stat_statisticPost = stat_statisticPost;
	}
	public String getPost_speed() {
		return post_speed;
	}
	public void setPost_speed(String post_speed) {
		this.post_speed = post_speed;
	}
	public Long getOriPost_speed() {
		return oriPost_speed;
	}
	public void setOriPost_speed(Long oriPost_speed) {
		this.oriPost_speed = oriPost_speed;
	}
	public Long getPost_follower() {
		return post_follower;
	}
	public void setPost_follower(Long post_follower) {
		this.post_follower = post_follower;
	}
	public Long getOriPost_follower() {
		return oriPost_follower;
	}
	public void setOriPost_follower(Long oriPost_follower) {
		this.oriPost_follower = oriPost_follower;
	}
}

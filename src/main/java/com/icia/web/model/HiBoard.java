package com.icia.web.model;

import java.io.Serializable;

public class HiBoard implements Serializable
{
	private static final long serialVersionUID = 1L;

	private long hiBbsSeq;				//게시물 번호
	private String userId;					//사용자 아이디
	private long hiBbsGroup;			//게시물 그룹번호
	private int hiBbsOrder;				//게시물 그룹 내 순서
	private int hiBbsIndent;				//게시물들 들여쓰기
	private String hiBbsTitle;			//게시물 제목
	private String hiBbsContent;		//게시물 내용
	private int hiBbsReadCnt;			//게시물 조회수
	private String regDate;				//등록일
	private long hiBbsParent;			//부모 게시물 번호
	private String plan;
	   

	private String userName;			//사용자 이름
	private String userEmail;			//사용자 이메일
	private String gender;				//사용자 성별
	   

	private long startRow;				//시작 rownum
	private long endRow;				//끝 rownum
	
	private String searchType;			//검색타입 (1: 이름, 2:제목, 3: 내용)
	private String searchValue;			//검색값
	
	private HiBoardFile hiBoardFile;			//첨부파일
	
	public HiBoard()
	{
		hiBbsSeq=0;				
		userId="";					
		hiBbsGroup=0;			
		hiBbsOrder=0;				
		hiBbsIndent=0;				
		hiBbsTitle="";			
		hiBbsContent="";		
		hiBbsReadCnt=0;			
		regDate="";				
		
		userName="";		
		userEmail="";			
		
		startRow=0;				
		endRow=0;				
		
		searchType="";			
		searchValue="";			
		
		hiBoardFile=null;
		
		hiBbsParent=0;
		
		plan = "";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public long getHiBbsParent() {
		return hiBbsParent;
	}

	public void setHiBbsParent(long hiBbsParent) {
		this.hiBbsParent = hiBbsParent;
	}

	public long getHiBbsSeq() {
		return hiBbsSeq;
	}

	public String getUserId() {
		return userId;
	}

	public long getHiBbsGroup() {
		return hiBbsGroup;
	}

	public int getHiBbsOrder() {
		return hiBbsOrder;
	}

	public int getHiBbsIndent() {
		return hiBbsIndent;
	}

	public String getHiBbsTitle() {
		return hiBbsTitle;
	}

	public String getHiBbsContent() {
		return hiBbsContent;
	}

	public int getHiBbsReadCnt() {
		return hiBbsReadCnt;
	}

	public String getRegDate() {
		return regDate;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public long getStartRow() {
		return startRow;
	}

	public long getEndRow() {
		return endRow;
	}

	public String getSearchType() {
		return searchType;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public HiBoardFile getHiBoardFile() {
		return hiBoardFile;
	}

	public void setHiBbsSeq(long hiBbsSeq) {
		this.hiBbsSeq = hiBbsSeq;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setHiBbsGroup(long hiBbsGroup) {
		this.hiBbsGroup = hiBbsGroup;
	}

	public void setHiBbsOrder(int hiBbsOrder) {
		this.hiBbsOrder = hiBbsOrder;
	}

	public void setHiBbsIndent(int hiBbsIndent) {
		this.hiBbsIndent = hiBbsIndent;
	}

	public void setHiBbsTitle(String hiBbsTitle) {
		this.hiBbsTitle = hiBbsTitle;
	}

	public void setHiBbsContent(String hiBbsContent) {
		this.hiBbsContent = hiBbsContent;
	}

	public void setHiBbsReadCnt(int hiBbsReadCnt) {
		this.hiBbsReadCnt = hiBbsReadCnt;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}

	public void setEndRow(long endRow) {
		this.endRow = endRow;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	public void setHiBoardFile(HiBoardFile hiBoardFile) {
		this.hiBoardFile = hiBoardFile;
	}

	public String getPlan() {
      return plan;
   }

    public void setPlan(String plan) {
	    this.plan = plan;
   }

}

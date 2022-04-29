package kr.co.imh.utils;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class PageMaker {
	
	private int totalCount; // 페이징에 적용할 전체 데이터 갯수
	private int startPage; // 게시판 화면에 보여질 첫번째 페이지 번호 
	private int endPage; // 게시판 화면에 보여질 마지막 페이지 번호
	private boolean prev; // 이전 페이지 버튼 활성화 여부
	private boolean next; // 다음으로 가는 화살표
	
	private int displayPageNum = 10; // 화면에 보여지는 페이지번호의 숫자
	
	private Criteria cri;
	
	private void calcData() {
		endPage = (int) (Math.ceil(cri.getPage() / 
				(double) displayPageNum)* displayPageNum);
		startPage = (endPage - displayPageNum) +1 ;
		
		//게시판의 실제 마지막 페이지 번호
		int tempEndPage = (int) (Math.ceil(totalCount/
				(double) cri.getPerPageNum()));
		
		if (endPage > tempEndPage) {
			endPage = tempEndPage;
		}
		
		prev = startPage == 1? false : true;
		
		next = endPage* cri.getPerPageNum() >=totalCount ? false : true;
	}
	
	public String makeQuery(int page) {
		UriComponents uriComponents = 
				UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				.queryParam("perPageNum", cri.getPerPageNum())
				.build();
		
		return uriComponents.toUriString();
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}
	

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
		
	}

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}


}

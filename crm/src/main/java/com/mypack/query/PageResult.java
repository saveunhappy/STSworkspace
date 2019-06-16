package com.mypack.query;

import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageResult {
	private Long total;
	private List rows;
	
	public static final PageResult EMPTY = new PageResult(0L, Collections.EMPTY_LIST);
	public PageResult(Long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public PageResult() {
		super();
	}
	
}

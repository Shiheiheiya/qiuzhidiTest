package com.qiuzhidi.utils;

import java.util.List;

public class Page<T> {
    
	private int total;//信息总条数
	private int page;//页号
	private int size;//页面最大容量
    private List<T> rows;//当前页面信息
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
    
	
    
}

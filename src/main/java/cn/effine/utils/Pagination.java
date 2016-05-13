/**
 * @author  effine
 * @email   iballader#gmail.com
 * @date    May 13, 2016  10:45:21 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.utils;

import java.util.List;

/**
 * 分页工具类
 */
public class Pagination {

	private int currentPage; // 当前页码
	private int pageSize; // 每页记录数
	private int totalSize; // 总记录数
	private int totalPage; // 总页数
	private List<?> list; // 分页记录

	public Pagination() {
	}

	public Pagination(int currentPage, int pageSize) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
}

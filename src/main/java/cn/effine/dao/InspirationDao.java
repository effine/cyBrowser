/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 13, 2016  10:42:24 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.dao;

import cn.effine.utils.Pagination;

public interface InspirationDao {
	/**
	 * 获得灵感列表
	 *
	 * @param currentPage
	 *            当前页码
	 * @param pageSize
	 *            页长[每页记录数]
	 * @return 灵感分页数据
	 */
	Pagination getInspirationList(int currentPage, int pageSize);
}

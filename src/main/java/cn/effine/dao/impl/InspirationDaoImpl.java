/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 13, 2016  10:42:33 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.effine.dao.DaoSupport;
import cn.effine.dao.InspirationDao;
import cn.effine.utils.Pagination;

@Repository
public class InspirationDaoImpl extends DaoSupport implements InspirationDao {

	public Pagination getInspirationList(int currentPage, int pageSize) {
		Pagination pagination = new Pagination(currentPage, pageSize);
		String sql = "select count(id) from inspiration";
		List<?> list = super.getJdbcTemplate().queryForList(sql);
		int totalSize = null != list ? list.size() : 0;
		pagination.setTotalSize(totalSize);
		pagination.setTotalPage((totalSize/pageSize) == 0 ? totalSize/pageSize : (totalSize/pageSize + 1));
		
		sql = "select id, img_url imgUrl from inspiration limit ?,?";
		List<?> dataList = super.getJdbcTemplate().queryForList(sql, currentPage, pageSize);
		pagination.setList(dataList);
		return pagination;
	}
}

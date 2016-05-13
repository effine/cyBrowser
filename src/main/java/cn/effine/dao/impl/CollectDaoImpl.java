/**
 * @author  effine
 * @email   iballader#gmail.com
 * @date    May 13, 2016  11:36:20 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.dao.impl;

import org.springframework.stereotype.Repository;

import cn.effine.dao.CollectDao;
import cn.effine.dao.DaoSupport;

@Repository
public class CollectDaoImpl extends DaoSupport implements CollectDao {

	public boolean addCollect(int userId, int inspirationId) {
		String sql = "insert into collect(user_id, inspiration_id, collect_time) values(?, ?, now())";
		int status = super.getJdbcTemplate().update(sql, userId, inspirationId);
		return status > 0;
	}

	public boolean cancelCollect(int userId, int inspirationId) {
		String sql = "delete collect where user_id=? and inspiration_id=?)";
		int status = super.getJdbcTemplate().update(sql, userId, inspirationId);
		return status > 0;
	}
}

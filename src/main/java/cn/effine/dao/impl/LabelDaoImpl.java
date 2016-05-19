/**
 * @author  effine
 * @email   iballader#gmail.com
 * @date    May 19, 2016  10:59:31 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.dao.impl;

import org.springframework.stereotype.Repository;

import cn.effine.dao.DaoSupport;
import cn.effine.dao.LabelDao;

@Repository
public class LabelDaoImpl extends DaoSupport implements LabelDao {

	public boolean addLabel(int inspirationId, int userId, String content, String height,
			String width) {
		String sql = "insert into label(user_id, inspiration_id, content, height, width) values(?, ?, ?, ?, ?)";
		int row = getJdbcTemplate().update(sql, userId, inspirationId, content, height, width);
		return row > 0;
	}

	public boolean updateLabel(int id, int userId, String content, String height, String width) {
		String sql = "update label set content=?, height=?, width=? where id=? and user_id=?";
		int row = getJdbcTemplate().update(sql, content, height, width, id, userId);
		return row > 0;
	}

	public boolean deleteLabel(int id) {
		String sql = "delete from label where id=?";
		int row = getJdbcTemplate().update(sql, id);
		return row > 0;
	}

}

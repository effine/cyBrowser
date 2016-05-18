/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    2016年5月4日  下午11:14:38
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.effine.dao.DaoSupport;
import cn.effine.dao.UserDao;

@Repository
public class UserDaoImpl extends DaoSupport implements UserDao {

	public Map<String, Object> login(String username, String password) {
		String sql = "select * from user where nick_name=? and password=?";
		return getJdbcTemplate().queryForMap(sql, username, password);
	}
}
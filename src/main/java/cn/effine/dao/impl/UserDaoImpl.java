/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    2016年5月4日  下午11:14:38
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.dao.impl;

import org.springframework.stereotype.Repository;

import cn.effine.dao.DaoSupport;
import cn.effine.dao.UserDao;

@Repository
public class UserDaoImpl extends DaoSupport implements UserDao {

	public boolean login(String username, String password) {
		return false;
	}
}
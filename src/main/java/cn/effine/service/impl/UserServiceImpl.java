/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    2016年5月3日  下午11:04:14
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.effine.dao.UserDao;
import cn.effine.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public boolean login(String username, String password) {
		return userDao.login(username, password);
	}

}

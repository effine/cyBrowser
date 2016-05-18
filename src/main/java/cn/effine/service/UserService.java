/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    2016年5月3日  下午10:59:15
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.service;

import java.util.Map;

public interface UserService {

	/**
	 * 用户登录
	 *
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 用户是否登录
	 */
	Map<String, Object> login(String username, String password);
}

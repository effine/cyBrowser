/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    2016年5月4日  下午11:14:18
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.dao;


public interface UserDao {

	/**
	 * 用户登录
	 *
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 用户是否登录
	 */
	boolean login(String username, String password);
}

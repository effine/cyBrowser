/**
 * @author  effine
 * @email   iballader#gmail.com
 * @date    May 13, 2016  11:36:13 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.dao;

public interface CollectDao {
	/**
	 * 添加灵感收藏
	 *
	 * @param userId
	 *            用户ID
	 * @param inspirationId
	 *            灵感ID
	 * @return boolean
	 */
	boolean addCollect(int userId, int inspirationId);

	/**
	 * 取消灵感收藏
	 *
	 * @param userId
	 *            用户ID
	 * @param inspirationId
	 *            灵感ID
	 * @return boolean
	 */
	boolean cancelCollect(int userId, int inspirationId);
}

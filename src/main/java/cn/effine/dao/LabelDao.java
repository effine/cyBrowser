/**
 * @author  effine
 * @email   iballader#gmail.com
 * @date    May 19, 2016  10:59:19 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.dao;

public interface LabelDao {
	/**
	 * 添加标签
	 *
	 * @param inspirationId
	 *            灵感ID
	 * @param userId
	 *            用户ID
	 * @param content
	 *            标签内容
	 * @param height
	 *            标签纵向坐标
	 * @param width
	 *            标签横向坐标
	 * @return boolean
	 */
	boolean addLabel(int inspirationId, int userId, String content, String height, String width);

	/**
	 * 修改标签
	 *
	 * @param id
	 *            标签ID
	 * @param userId
	 *            用户ID
	 * @param content
	 *            标签内容
	 * @param height
	 *            标签纵向坐标
	 * @param width
	 *            标签横向坐标
	 * @return boolean
	 */
	boolean updateLabel(int id, int userId, String content, String height,
			String width);

	/**
	 * 删除标签
	 *
	 * @param id
	 *            标签ID
	 * @return boolean
	 */
	boolean deleteLabel(int id);
}

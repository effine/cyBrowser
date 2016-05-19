/**
 * @author  effine
 * @email   iballader#gmail.com
 * @date    May 19, 2016  10:59:08 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.effine.dao.LabelDao;
import cn.effine.service.LabelService;

@Service
public class LabelServiceImpl implements LabelService {

	@Autowired
	private LabelDao labelDao;

	public boolean addLabel(int inspirationId, int userId, String content, String height, String width) {
		return labelDao.addLabel(inspirationId, userId, content, height, width);
	}

	public boolean updateLabel(int id, int userId, String content, String height, String width) {
		return labelDao.updateLabel(id, userId, content, height, width);
	}

	public boolean deleteLabel(int id) {
		return labelDao.deleteLabel(id);
	}

}

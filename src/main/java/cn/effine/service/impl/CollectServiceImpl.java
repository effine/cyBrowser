/**
 * @author  effine
 * @email   iballader#gmail.com
 * @date    May 13, 2016  11:35:59 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.effine.dao.CollectDao;
import cn.effine.service.CollectService;

@Service
public class CollectServiceImpl implements CollectService {
	@Autowired 
	private CollectDao collectDao;

	public boolean addCollect(int userId, int inspirationId) {
		return collectDao.addCollect(userId, inspirationId);
	}

	public boolean cancelCollect(int userId, int inspirationId) {
		return collectDao.cancelCollect(userId, inspirationId);
	}

}

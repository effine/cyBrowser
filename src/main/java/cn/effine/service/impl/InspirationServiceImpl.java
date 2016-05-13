/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 13, 2016  10:42:14 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.effine.dao.InspirationDao;
import cn.effine.service.InspirationService;
import cn.effine.utils.Pagination;

@Service
public class InspirationServiceImpl implements InspirationService {
	@Autowired
	private InspirationDao inspirationDao;

	public Pagination getInspirationList(int currentPage, int pageSize) {
		return inspirationDao.getInspirationList(currentPage, pageSize);
	}

}

/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 11, 2016  10:27:38 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.effine.service.InspirationService;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("inspiration")
public class InspirationController {
	@Autowired
	private InspirationService inspirationService;
	
	// TODO 如果用户已登录，灵感列表过滤已收藏的灵感
	/**
	 * 获得灵感列表
	 *
	 * @param currentPage
	 *            当前页码
	 * @param pageSize
	 *            页长[每页记录数]
	 * @return 灵感列表
	 */
	@RequestMapping("list")
	public String getInspirationList(int currentPage, int pageSize) {
		return JSON.toJSONString(inspirationService.getInspirationList(currentPage, pageSize));
	}

}

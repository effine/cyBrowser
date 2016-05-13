/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 12, 2016  11:20:53 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.effine.service.CollectService;
import cn.effine.utils.CommonUtils;

@Controller
@RequestMapping("collect")
public class CollectController {
	@Autowired
	private CollectService collectService;

	@RequestMapping("add")
	public String addCollect(HttpServletRequest request, int inspirationId) {
		request.get
		boolean status = collectService.addCollect(1, inspirationId);
		return CommonUtils.constuctureResponse(status)
	}

	@RequestMapping("update")
	public String updateCollect() {
		return null;
	}
}

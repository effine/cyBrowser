/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 12, 2016  11:20:53 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.effine.model.User;
import cn.effine.service.CollectService;
import cn.effine.utils.CommonUtils;

@Controller
@RequestMapping("collect")
public class CollectController {
	@Autowired
	private CollectService collectService;

	/**
	 * 添加灵感收藏
	 *
	 * @param inspirationId
	 *            灵感ID
	 */
	@RequestMapping("add")
	@ResponseBody
	public String addCollect(HttpServletRequest request, int inspirationId) {
		User user = (User) request.getSession().getAttribute("user");
		if (null != user) {
			boolean status = collectService.addCollect(user.getId(), inspirationId);
			return CommonUtils.constuctureResponse(status);
		}
		return CommonUtils.constuctureResponse(-1, "未登录", null);
	}

	/**
	 * 取消灵感收藏
	 *
	 * @param inspirationId
	 *            灵感ID
	 */
	@RequestMapping("cancel")
	@ResponseBody
	public String cancelCollect(HttpServletRequest request, int inspirationId) {
		User user = (User) request.getSession().getAttribute("user");
		if (null != user) {
			boolean flag = collectService.cancelCollect(user.getId(), inspirationId);
			return CommonUtils.constuctureResponse(flag);
		}
		return CommonUtils.constuctureResponse(-1, "未登录", null);
	}
}

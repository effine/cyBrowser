/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 12, 2016  11:23:45 PM
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
import cn.effine.service.LabelService;
import cn.effine.utils.CommonUtils;

@Controller
@RequestMapping("label")
public class LabelController {
	@Autowired
	private LabelService labelService;
	
	/**
	 * 添加标签
	 *
	 * @param inspirationId
	 *            灵感ID
	 * @param content
	 *            标签内容
	 * @param height
	 *            标签纵向坐标
	 * @param width
	 *            标签横向坐标
	 * @return 标签ID
	 */
	@RequestMapping("add")
	@ResponseBody
	public String addLabel(HttpServletRequest request, int inspirationId, String content, String height, String width) {
		User user = (User)request.getSession().getAttribute("user");
		if(null != user){
			boolean flag = labelService.addLabel(inspirationId, user.getId(), content, height, width);
			if(flag)
				return CommonUtils.constuctureResponse(2, "添加成功", null);
			else
				return CommonUtils.constuctureResponse(1, "添加失败", null);
		}
		return CommonUtils.constuctureResponse(0, "未登录", null);
	}

	/**
	 * 修改标签
	 *
	 * @param id
	 *            标签ID
	 * @param content
	 *            标签内容
	 * @param height
	 *            标签纵向坐标
	 * @param width
	 *            标签横向坐标
	 */
	@RequestMapping("update")
	@ResponseBody
	public String updateLabel(HttpServletRequest request, int id, String content, String height, String width) {
		User user = (User)request.getSession().getAttribute("user");
		if(null != user){
			boolean flag = labelService.updateLabel(id, user.getId(), content, height, width);
			if(flag)
				return CommonUtils.constuctureResponse(2, "修改成功", null);
			else
				return CommonUtils.constuctureResponse(1, "修改失败", null);
		}
		return CommonUtils.constuctureResponse(0, "未登录", null);
	}

	/**
	 * 删除标签
	 *
	 * @param id
	 *            标签ID
	 */
	@RequestMapping("delete")
	@ResponseBody
	public String deleteLabel(HttpServletRequest request, int id) {
		User user = (User)request.getSession().getAttribute("user");
		if(null != user){
			boolean flag = labelService.deleteLabel(id);
			CommonUtils.constuctureResponse(flag);
		}
		return CommonUtils.constuctureResponse(0, "未登录", null);
	}
}

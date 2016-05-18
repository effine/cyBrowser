/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    2016年5月3日  下午10:59:15
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.effine.model.User;
import cn.effine.service.UserService;
import cn.effine.utils.CommonUtils;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 登录
	 *
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 */
	@RequestMapping("login")
	@ResponseBody
	public String login(HttpServletRequest request, String username, String password) {
		Map<String, Object> map = userService.login(username, password);
		if(null != map){
			User user = new User();
			user.setId(Integer.parseInt(map.get("id").toString()));
			user.setNickName(map.get("nick_name").toString());
			request.getSession().setAttribute("user", user);
			return CommonUtils.constuctureResponse(1, "登录成功", null);
		}
		return CommonUtils.constuctureResponse(0, "登录失败", null);
	}

	@RequestMapping("collect/list")
	public String getUserCollectList(String username, String password) {

		return null;
	}
}

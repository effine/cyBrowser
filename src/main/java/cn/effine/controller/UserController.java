/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    2016年5月3日  下午10:59:15
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.effine.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("login")
	public String login(String username, String password) {

		return null;
	}

	@RequestMapping("collect/list")
	public String getUserCollectList(String username, String password) {

		return null;
	}
}

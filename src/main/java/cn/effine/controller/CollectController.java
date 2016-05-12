/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 12, 2016  11:20:53 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("collect")
public class CollectController {

	@RequestMapping("add")
	public String addCollect() {
		return null;
	}

	@RequestMapping("update")
	public String updateCollect() {
		return null;
	}
}

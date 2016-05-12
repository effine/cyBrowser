/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 12, 2016  11:23:45 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("label")
public class LabelController {

	@RequestMapping("add")
	public String addLabel() {

		return null;
	}

	@RequestMapping("update")
	public String updateLabel() {

		return null;
	}
}

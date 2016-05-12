/**
 * @author  effine | iballader#gmail.com
 * @email   iballader#gmail.com
 * @date    May 11, 2016  10:27:38 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inspiration")
public class InspirationController {

	@RequestMapping("list")
	public String getInspirationList() {

		return null;
	}

}

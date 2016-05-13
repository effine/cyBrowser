/**
 * @author  effine
 * @email   iballader#gmail.com
 * @date    May 13, 2016  11:53:08 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.utils;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * 共性类
 */
public class CommonUtils {

	/**
	 * 构建方法返回值json字符串；
	 * 针对添加、更新、删除方法只返回操作状态
	 *
	 * @param status
	 *            状态[status<=0失败|status>0成功]
	 * @return json字符串
	 */
	public static String constuctureResponse(boolean status){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", status);
		String msg = "成功";
		if(!status){
			msg = "失败";
		}
		map.put("msg", msg);
		return JSON.toJSONString(map);
	}
	
	/**
	 * 构建带返回数据的方法json返回值
	 *
	 * @param status
	 *            状态码
	 * @param msg
	 *            状态信息
	 * @param data
	 *            数据
	 * @return json字符串
	 */
	public static String constuctureResponse(int status, String msg, Object data){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", status);
		map.put("msg", msg);
		map.put("data", data);
		return JSON.toJSONString(map);
	}
}

/**
 * @author  effine
 * @email   iballader#gmail.com
 * @date    Jun 15, 2016  11:27:25 PM
 * @site    http://effine.cn
 * @since   1.0
 */

package cn.effine.base;

import org.junit.Test;

public class TryCatchTest {

	@Test
	public void testMethod() {
		int i = method1();
		System.out.println(i);
	}

	public int method1() {
		int a = 1;
		try {
			return ++a;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return ++a;
		}
	}
}

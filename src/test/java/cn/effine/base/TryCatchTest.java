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
	public void testTryCatch() {
		System.out.println(other());

	}

	@SuppressWarnings("finally")
	public int other() {
		int x = 1;

		try {
			return ++x;
		} catch (Exception e) {

		} finally {
			return ++x;
		}
	}
}

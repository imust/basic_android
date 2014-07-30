package in.imust.util;

import android.util.Log;

/**
 * LogUtil 暂时偷懒只写了debug
 * @date 2014-7-30
 * @author declan.z(declan.zhang@gmail.com)
 *
 */
public class L {
	
	public static boolean DEBUG = true;
	public static String DEFAULT_TAG = "DEFAULT";
	
	public void d() {
		d(DEFAULT_TAG, "gfw must die!");
	}
	
	public void d(String log) {
		d(DEFAULT_TAG, log);
	}
	
	public void d(String tag, String log) {
		if (isDebugLogEnable()) {
			Log.d(tag, log);
		}
	}
	
	public boolean isDebugLogEnable() {
		// 需要精确控制log等级的时候再补充, 暂时只全局控制
		return DEBUG;
	}
}

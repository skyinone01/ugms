package com.ugms.backend.utils;

public class UgmsConstant {
	public static final String API_PRO_MAX_DEF_DEV_NO = "API_PRO_MAX_DEF_DEV_NO";
	public static final String API_PRO_MAX_SOFT_NO = "API_PRO_MAX_SOFT_NO";
	public static final String API_PRO_MAX_USER_NO = "API_PRO_MAX_USER_NO";
	public static final String API_USER_MAX_PRO_NO = "API_USER_MAX_PRO_NO";

	public static final String UUID_REG ="^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";

	public static final String PRO_PRE ="NE";
	public static final String DEBUG_PRE ="SE";
//	public static final String URL ="^((http)://)+"
//			+ "(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?"
//			+ "(([0-9a-z]{1,3}\\.){3}[0-9]{1,3}"
//			+ "|"
//			+ "([0-9a-z_!~*'()-]+\\.)*"
//			+ "([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]\\."
//			+ "[a-z]{2,6})"
//			+ "(:[0-9]{1,4})?"
//			+ "((/?)|"
//			+ "(/[0-9a-zA-Z_!~*'().;?:@&=+$,%#-]+)+/?)$";
	public static final String URL = "((http)://)(([a-zA-Z0-9\\._-]+\\.[a-zA-Z]{2,6})|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,5})*(/[a-zA-Z0-9\\&%_\\./-~-]*)?";
	public static final String APP_ENTER ="app.html";
	public static final String APP_ZIP ="dopm.zip";
}

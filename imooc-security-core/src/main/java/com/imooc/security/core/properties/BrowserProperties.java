package com.imooc.security.core.properties;
import lombok.Data;
/**
 * @author zhailiang
 */
@Data
public class BrowserProperties {
	private String loginPage = "/imooc-signIn.html";
	private LoginType loginType = LoginType.JSON;
	private int rememberMeSeconds = 3600;
}
package com.myapck.shiroeasy;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class MyRealm extends AuthorizingRealm{
	@Override
	//当前自定义的realm的名字
	public String getName() {
		return "MyRealm";
	}
	
	//授权操作
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}
	//认证操作
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//当前的token参数就是UsernamePasswordToken对象
		//通过用户名到数据库查询信息，封装成一个AuthenticationInfo对象返回，方便认证期进行对比
		//获取token中的用户名
		String username = (String)token.getPrincipal();
		
		if(!"zhangsan".equals(username)) {
			return null;
		}
		String password = "666";
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, password,ByteSource.Util.bytes("zhangsan"), getName());
		return info;
	}

}

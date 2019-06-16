package com.myapck.shiroeasy;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class PermissionRealm extends AuthorizingRealm{
	@Override
	//当前自定义的realm的名字
	public String getName() {
		return "PermissionRealm";
	}
	
	//授权操作
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		//principals用户认证凭证信息
		//SimpleAuthenticationInfo这个值，认证方法返回的包装信息的第一个值：username
		//当前登录用户的信息：用户凭证
		String username = (String)principals.getPrimaryPrincipal();
		
		//模拟查询数据库，查询用户实现指定的角色，以及用户权限
		List<String> role = new ArrayList<>();//角色集合
		List<String> permission = new ArrayList<>();//权限集合
		
		role.add("role1");
		
		permission.add("user:delete");
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addRoles(role);;
		info.addStringPermissions(permission);
		return info;
		
		
		
		
		
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

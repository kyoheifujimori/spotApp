//package com.example.demo.security;
//
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//
////プロバイダーの設定（ここで主にユーザ認証を行う）
//public class UserAuthProvider implements AuthenticationProvider {
//
//	private String name = "testuser";
//	private String password = "testpass";
//
//	@Override
//	public Authentication authenticate(Authentication auth) throws AuthenticationException {
//		//		ログインページから送られてきたデータを取得する
//		String authname = auth.getName();
//		String authpass = auth.getCredentials().toString();
//
//		//		ここでdbの登録内容と間違いがないか判定する
//		//		正しければ認証トークンの認証を行う
//		if (authname.equals(name) && authpass.equals(password)) {
//			return new UsernamePasswordAuthenticationToken(authname, authpass, auth.getAuthorities());
//		} else {
//			//			間違っていればはじく
//			throw new BadCredentialsException("Wrong name or password.");
//		}
//	}
//
//	//	ここで認証間違いがないか再判定
//	@Override
//	public boolean supports(Class<?> authentication) {
//		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
//	}
//
//}

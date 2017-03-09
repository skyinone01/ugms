package com.ugms.backend.outerapi.annotation;


import com.ugms.backend.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;


/**
 * Created by Roy on 2017/3/8.
 */
@Component
public class UserIdResolver implements HandlerMethodArgumentResolver {
	@Autowired
	TokenUtils tokenUtils;

	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.getParameterAnnotation(UserIdInjected.class) != null
				&& parameter.getParameterType() == Long.class;
	}

	public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
	                              NativeWebRequest webRequest, WebDataBinderFactory webDataBinderFactory) {

		String token = webRequest.getParameter("token");
		return  tokenUtils.validate(token);
	}
}
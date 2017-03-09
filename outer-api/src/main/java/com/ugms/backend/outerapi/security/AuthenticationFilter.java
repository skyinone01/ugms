package com.ugms.backend.outerapi.security;

import com.ugms.backend.bean.exception.UserException;
import com.ugms.backend.service.entity.mysql.Member;
import com.ugms.backend.service.entity.mysql.Member.Status;
import com.ugms.backend.service.service.RoleService;
import com.ugms.backend.utils.TokenUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by roy on 2017/3/7.
 */

@Component
public class AuthenticationFilter extends OncePerRequestFilter {

    @Autowired
	TokenUtils tokenUtils;

    public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filter)
            throws AuthenticationException, IOException, ServletException {

	    String token = request.getParameter("token");
	    if (token != null ) {
		    try {
			    Long userId = tokenUtils.validate(token);
			    Member member = new Member();
			    if (member != null && member.getStatus() == Status.ACCEPTED) {
				    if (member.getRoleId() != null) {
					    SecurityContextHolder.getContext().setAuthentication(
							    new UsernamePasswordAuthenticationToken(member, null, AuthorityUtils
									    .createAuthorityList("ROLE_" + RoleService.Type.values()[member.getRoleId()])));
				    }
			    }
		    } catch (NumberFormatException | UserException e) {
		    }
	    }

        filter.doFilter(request, response);
    }
}

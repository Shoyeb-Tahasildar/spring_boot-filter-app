package com.example.demo.filter;
//Implementation layer to implement Filter

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import org.springframework.stereotype.Component;


// Servlet Filter Class
@Component
public class MyFilter implements Filter {

    // doFilter() Method - To apply Filter's Business logic.
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain)
            throws IOException, ServletException{

        System.out.println("This is a Servlet doFilter() Method !");

        // Get remote data
        System.out.println("Remote Host : "+ servletRequest.getRemoteHost());
        System.out.println("Remote Address : "+ servletRequest.getRemoteAddr());

        // Invoke filterChain to execute the next filter inorder.
        filterChain.doFilter(servletRequest,servletResponse);
    }
}

package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class CommonFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        /*
        HttpServletRequest request = (HttpServletRequest)req;
        String method = request.getMethod().toUpperCase();
        if(method.equals("POST")){
            request.setCharacterEncoding("UTF-8");
        }

         */
        //위와 같이 filter쪽에 공통적으로 수행할 기능을 작성하는 것은 지양

        filterChain.doFilter(new CommonRequestWrapper(req),new CommonResponseWrapper(resp));
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String key1 = filterConfig.getInitParameter("key1");
        System.out.printf("key1=%s%n",key1);
    }

    @Override
    public void destroy() {
        System.out.println("common filter destroy()!");
    }
}

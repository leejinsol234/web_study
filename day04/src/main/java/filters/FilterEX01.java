package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class FilterEX01 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterEx01 - 요청 전");
        filterChain.doFilter(servletRequest, servletResponse); //다음 필터가 있으면 다음 필터로 넘어가고 없으면 doGet(웹 컴포넌트)을 호출하고 filterChain이후에 작성된 코드 실행

        System.out.println("FilterEx01 - 응답 후");
    }
}

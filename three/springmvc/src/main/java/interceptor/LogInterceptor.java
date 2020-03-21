package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/22 14:02
 * Description:
 * version:1.0
 */
public class LogInterceptor implements HandlerInterceptor {

    /**
     * Hanler业务方法之前进行拦截
     * @param request
     * @param response
     * @param handler
     * @return 返回值是一个布尔类型，true-放行，false-不放行
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getRemoteAddr()+"访问了"+handler);

        response.sendRedirect(request.getContextPath()+"/showLogin");
        return false;
    }

    /**
     * Handler业务方法执行之后进行拦截
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("handler业务方法处理完成");
    }

    /**
     * 整个请求处理完毕，响应到达之前处理
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("响应即将到达战场");
    }
}

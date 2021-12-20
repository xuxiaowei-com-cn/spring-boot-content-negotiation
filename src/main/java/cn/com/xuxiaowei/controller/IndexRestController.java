package cn.com.xuxiaowei.controller;

import cn.com.xuxiaowei.bo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 主页
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@RestController
public class IndexRestController {

    /**
     * 主页
     *
     * @param request  请求
     * @param response 响应
     * @return 返回 数据
     */
    @RequestMapping("/index")
    public ResponseEntity<Map<String, Object>> index(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>(8);

        map.put("code", 0);
        map.put("msg", "请求成功");

        return ResponseEntity.ok(map);
    }

    /**
     * 用户
     *
     * @param request  请求
     * @param response 响应
     * @return 返回 数据
     */
    @RequestMapping("/user")
    public ResponseEntity<User> user(HttpServletRequest request, HttpServletResponse response) {

        User user = new User();
        user.setUsername("徐晓伟");
        user.setPassword("123");

        return ResponseEntity.ok(user);
    }

}

package cn.com.xuxiaowei.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Web Mvc 配置支持
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Configuration
public class WebMvcConfigurationSupportConfiguration extends WebMvcConfigurationSupport {

    /**
     * @see ResourceHandlerRegistry#addResourceHandler(String...)
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

        String osName = System.getProperty("os.name");

        String fileUploadResources = "/uploads/**";

        String win = "win";

        if (osName.toLowerCase().startsWith(win)) {
            registry.addResourceHandler(fileUploadResources).addResourceLocations("file:D:\\uploads\\");
        } else {
            registry.addResourceHandler(fileUploadResources).addResourceLocations("file:/uploads/");
        }

    }

}

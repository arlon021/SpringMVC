package br.eti.arlon.springmvc.config.init;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.eti.arlon.springmvc.config.WebConfig;

@Controller
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {  
    @Override  
    protected Class<?>[] getRootConfigClasses() {  
         return null;  
    }  
    @Override  
    protected Class<?>[] getServletConfigClasses() {  
    	return new Class<?>[] { WebConfig.class };  
    }  
    @Override  
    protected String[] getServletMappings() {  
         return new String[] { "/" };  
    }  
}   

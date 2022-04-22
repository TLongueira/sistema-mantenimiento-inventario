package com.tlongueira.springapp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.tlongueira.springapp.bussiness.SpringappBusinessConfig;
import com.tlongueira.springapp.web.SpringappWebConfig1;




public class SpringappWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { SpringappBusinessConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { SpringappWebConfig1.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
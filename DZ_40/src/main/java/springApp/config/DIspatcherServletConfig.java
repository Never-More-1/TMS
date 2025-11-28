package springApp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DIspatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    //возвращает массив классов для конфигурации корневого контекста(настройка приложения)
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //возвращает массив классов конфигурации для контекста DispatcherServlet(настройка диспатчера)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //возвращает массив строк которые будет мапить DispatcherServlet(пути, на которые отвечает диспатчер)
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

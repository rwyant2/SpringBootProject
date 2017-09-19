// I'm curious to see if the old greeting stuff is loaded into context from the get-go.

package hello;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class listAppCtx implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    
    public static ApplicationContext getApplicationContext() {
    	return applicationContext;
    }

}
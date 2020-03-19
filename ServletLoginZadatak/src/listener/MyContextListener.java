package listener;




import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


import domain.User;



/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
@WebListener
public class MyContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	List<User> users = new ArrayList<User>() {
    		
    		{
    			add(new User("milos", "123", "milos", "mijatovic"));
    			add(new User("admin", "admin", "admin", "adminovic"));
    			add(new User("test", "test", "test", "test"));
    		}
    	};
    	arg0.getServletContext().setAttribute("users", users);
    	arg0.getServletContext().setAttribute("loggedUsers", new ArrayList<User>());
    }
	
}

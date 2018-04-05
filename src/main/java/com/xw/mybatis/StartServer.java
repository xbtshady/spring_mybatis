package com.xw.mybatis;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

public class StartServer {

    public static void main(String[] args) {

        try{
            Server server =new Server(8088);
            ServletHolder sh = new ServletHolder(ServletContainer.class);

            sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
            sh.setInitParameter("jersey.config.server.provider.classnames",JerseyTest.class.getCanonicalName());

            ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
            context.addServlet(sh, "/*");
            server.setHandler(context);

            server.start();
            server.join();

        }catch (Exception e){

        }
    }
}
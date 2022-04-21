package com.javarush.task.task37.task3709.connectors;

import com.javarush.task.task37.task3709.security.SecurityChecker;
import com.javarush.task.task37.task3709.security.SecurityCheckerImpl;

public class SecurityProxyConnector implements Connector{
    SecurityChecker securityChecker = new SecurityCheckerImpl();
    SimpleConnector simpleConnector;

    @Override
    public void connect() {
        System.out.println("Security check");
        if (securityChecker.performSecurityCheck()) {
            simpleConnector.connect();
        } else {
            System.out.println("Failed");
        }
    }

    public SecurityProxyConnector(String resourceString) {
        this.simpleConnector = new SimpleConnector(resourceString);
    }
}

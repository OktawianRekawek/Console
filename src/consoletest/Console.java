/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoletest;

/**
 *
 * @author Oktawian
 */
public interface Console {
    
    void turnOn();
    void turnOff();
    void play(String program);
    boolean isDiskIn();
    boolean isInternetConnection();
    int whatIsHddSpace();
    int whatIsHddFreeSpace();
    boolean isPadConnected();
}

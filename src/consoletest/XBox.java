/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoletest;


public class XBox implements Console {
    
    boolean state;
    boolean discDrive;
    int hddSpace;
    int hddFreeSpace;
    boolean internetConnection;
    String currentProgram;
    
    @Override
    public void turnOn(){
        state = true;
    }
    
    @Override
    public void turnOff(){
        state = false;
    }
    
    @Override
    public void play(String program){
        currentProgram = program;
    }
    
    @Override
    public boolean isDiskIn(){
        return discDrive;
    }
    
    @Override
    public boolean isInternetConnection(){
        return internetConnection;
    }
    
    @Override
    public int whatIsHddSpace(){
        return hddSpace;
    }
    
    @Override
    public int whatIsHddFreeSpace(){
        return hddFreeSpace;
    }

    @Override
    public boolean isPadConnected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

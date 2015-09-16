/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter07.fps.common.message;

import com.jme3.network.serializing.Serializable;

/**
 *
 * @author reden
 */
@Serializable()
public class WelcomeMessage extends GameMessage{
    
    private int myPlayerId;

    public WelcomeMessage() {
        setReliable(true);
    }
    
    public int getMyPlayerId() {
        return myPlayerId;
    }

    public void setMyPlayerId(int myPlayerId) {
        this.myPlayerId = myPlayerId;
    }
}

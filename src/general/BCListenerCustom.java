/*	
 * Class 	BCListenerCustom
 * 
 * This software is developed for Choral devices with Java.
 * Copyright Choral srl. All Rights reserved. 
 */

package general;

import com.cinterion.io.*;

/**
 * Listener for the control of events on TCP and UDP sockets
 * 
 * @version	1.00 <BR> <i>Last update</i>: 13-09-2007
 * @author 	alessioza
 * 
 */
public class BCListenerCustom implements GlobCost, BearerControlListener {
		
	/* 
	 * local variables
	 */
	
	
	/* 
	 * methods
	 */
	public void stateChanged (int state) {
		//new LogError("BCListener: " + state);
		//System.out.println("BCListener: " + state);
		InfoStato.getInstance().setGPRSBearer(state);
		if(state == 3){
			InfoStato.getInstance().setGprsState(true);
		}
		else{
			if(state == 5)
				InfoStato.getInstance().setReboot();
			InfoStato.getInstance().setGprsState(false);
		}
	}
	
} //BCListenerCustom


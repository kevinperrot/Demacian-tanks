package thinktank.javabot.physics;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics2D;

	public class SmartCursor {
	
	public Dtank moving_object;
	private boolean active;
	
	public void setTank ( Dtank moving_object ){      
		this.moving_object=moving_object;
	}
	
	public Dtank getTank(){  
	    return moving_object;
	}
	
	public boolean isActive(){  
		return active;
	}
	
	public void activate(){  
		active=true;
	}
	
	public void desactivate(){  
		active=false;
	}

	
	public void paint (Graphics2D g){
		Graphics2D g2 =  g;
		Composite comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) 0.5);
		g2.setComposite(comp);
	}
}

	

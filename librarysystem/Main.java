package librarysystem;

import dataaccess.TestData;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;



public class Main {

	public static void main(String[] args) {
	      EventQueue.invokeLater(() -> 
	         {

				 new TestData().checkInitfiles();
				 // Login

				 LoginWindow.INSTANCE.setTitle("Login Library Application");
				 LoginWindow.INSTANCE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 LoginWindow.INSTANCE.init();
				 centerFrameOnDesktop(LoginWindow.INSTANCE);
				 LoginWindow.INSTANCE.setVisible(true);
	         });

	   }
	   
	   public static void centerFrameOnDesktop(Component f) {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			int height = toolkit.getScreenSize().height;
			int width = toolkit.getScreenSize().width;
			int frameHeight = f.getSize().height;
			int frameWidth = f.getSize().width;
			f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
		}
}

package lvl2advanced.p02debug.p02errors;

import lvl2advanced.p01gui.p01simple.LwjglWindow;

public class AppWithDebug {

	public static void main(String[] args) {
		new LwjglWindow(new Renderer(), true);
	}

}
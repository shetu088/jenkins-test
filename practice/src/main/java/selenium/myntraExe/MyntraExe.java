package selenium.myntraExe;

import selenium.myntra.MyntraSwitch;

public class MyntraExe {

	public static void main(String[] args) {
		MyntraSwitch ms = new MyntraSwitch();
		ms.init();
		ms.load();
		ms.title();
		ms.switching("");

	}

}

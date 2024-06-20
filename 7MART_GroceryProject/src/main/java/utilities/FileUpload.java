package utilities;

import org.openqa.selenium.WebElement;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class FileUpload {
	public void fileuploadSendKey(WebElement chooseCatFile, String path) {
		chooseCatFile.sendKeys(path);
	}

	public void fileUploadUsingRobot(WebElement chooseCatFile, String path) {
		try {
			chooseCatFile.click();
			String[] filePath = path.split("\\\\");
			for (String file : filePath) {
				Robot robot = new Robot();
				robot.delay(100);
				for (char c : file.toCharArray()) {
					switch (c) {
					case 't':
						robot.keyPress(KeyEvent.VK_T);
						robot.keyRelease(KeyEvent.VK_T);
						break;
					case 'y':
						robot.keyPress(KeyEvent.VK_Y);
						robot.keyRelease(KeyEvent.VK_Y);
						break;
					case 'p':
						robot.keyPress(KeyEvent.VK_P);
						robot.keyRelease(KeyEvent.VK_P);
						break;
					case 'a':
						robot.keyPress(KeyEvent.VK_A);
						robot.keyRelease(KeyEvent.VK_A);
						break;

					}
				}
				robot.delay(100);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.delay(100);
			}
		} catch (Exception e) {
			System.out.println("Error in file upload: " + e.getMessage());
		}
	}
}

package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utils {

    public static void takeScreenShot(WebDriver driver){

        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("./Screenshot.png");
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

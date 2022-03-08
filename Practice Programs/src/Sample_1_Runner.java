import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1_Runner {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Master_Data\\Java Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

	}

}

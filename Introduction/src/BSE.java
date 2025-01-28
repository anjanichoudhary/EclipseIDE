import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BSE {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bseindia.com/corporates/List_Scrips.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("select#ddlsegment.form-control option[text=\"Equity\"]")).click();
		driver.findElement(By.cssSelector("select#ddlstatus.form-control option[text=\"Active\"]")).click();
		driver.findElement(By.cssSelector("#btnSubmit")).click();
		driver.findElement(By.cssSelector("#lnkDownload")).click();
		System.out.println(driver.getTitle());

		// Convert csv file into xlsx file
		
		File sourceFile = new File("C:\\Users\\anjani\\Downloads\\Equity.csv");
		String dateTime = OffsetDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss")); // Add time stamp with update file Name
		File destFile = new File("C:\\Users\\anjani\\Downloads\\", "UpdateEquity" + dateTime + ".csv");

		if (sourceFile.renameTo(destFile)) {
			System.out.println("File renamed successfully");
		} else {
			System.out.println("Failed to rename file");
		}

	}

}

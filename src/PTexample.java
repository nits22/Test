import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PTexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hello");
		
		String str = "Helloo";
		
		System.out.println(str);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:8200");
		
		WebElement ele = driver.findElement(By.xpath("//div[@title='first']//following::a[text()='Expand'][1]"));
	
		ele.click();
		
		driver.findElement(By.xpath("//div[text()='Testing']//following::button[text()='Expand']")).click();
		
		
		
	}

	
}
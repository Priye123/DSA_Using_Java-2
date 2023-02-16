package core_oops;

import java.util.ArrayList;
import java.util.List;

//get()
//getCurrentUrl();
//getTitle()
//findElements()
//findElement()
//getPageSource()
//close()
//quit()

interface WebDriver{
	void get();
	String getCurrentUrl();
	String getTitle();
	List<String> findElements();
	String findElement();
	String getPageSource();
	void close();
	void quit();
}

class ChromeDriver implements WebDriver{

	@Override
	public void get() {
		System.out.println("Launching the browser and navigate to URL");
	}

	@Override
	public String getCurrentUrl() {
		return "www.google.com";
	}

	@Override
	public String getTitle() {
		return "Google";
	}

	@Override
	public List<String> findElements() {
		List<String> l=new ArrayList<>();
		l.add("driver.findElements(By.name('ram')");
		l.add("driver.findElements(By.id('14')");
		return l;
	}

	@Override
	public String findElement() {
		return "driver.findElements(By.name('ram')";
	}

	@Override
	public String getPageSource() {
		return "<html lang=\"en\" dir=\"ltr\" prefix=\"og: http://ogp.me/ns# content: http://purl.org/rss/1.0/modules/content/ dc: http://purl.org/dc/terms/ foaf: http://xmlns.com/foaf/0.1/ rdfs: http://www.w3.org/2000/01/rdf-schema# sioc: http://rdfs.org/sioc/ns# sioct: http://rdfs.org/sioc/types# skos: http://www.w3.org/2004/02/skos/core# xsd: http://www.w3.org/2001/XMLSchema# schema: http://schema.org/\">\r\n"
				+ "<head>\r\n"
				+ "  <link rel=\"profile\" href=\"http://www.w3.org/1999/xhtml/vocab\" />\r\n"
				+ "  <meta charset=\"utf-8\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n";
	}

	@Override
	public void close() {
		System.out.println("closing the browser");
	}

	@Override
	public void quit() {
		System.out.println("quit the broswer");
	}	
}

public class Day11Part3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); //upcasting/dynamic polymorphism
		driver.get();
		
		String URL=driver.getCurrentUrl();
		System.out.println("current URL is::"+URL);
		
		String title=driver.getTitle();
		System.out.println("Tiltle of URL is::"+title);
		
		List<String> l=driver.findElements();
		System.out.println("The webelemnts are::"+l);
		
		System.out.println(driver.findElement());
		
		System.out.println(driver.getPageSource());
		
		driver.close();
		
		driver.quit();
		
	}

}

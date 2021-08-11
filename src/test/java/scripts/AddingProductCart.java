package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pompages.AddToCartPage;
import pompages.SkillraryDemoLoginPage;
import pompages.SkillraryLoginPage;

public class AddingProductCart extends BaseClass {
	
	@Test
	public void tc1() throws FileNotFoundException, IOException{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApplication();
		
		utilities.switchTabs(driver);
		
		SkillraryDemoLoginPage d =new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver,d.getCourseTab());
		d.seleniumTrainingBtn();
		
		AddToCartPage a=new AddToCartPage(driver);
		utilities.doubleClick(driver,a.getAddBtn());
		a.addtocartButton();
		utilities.alertPopup(driver);
		
		Assert.assertEquals(driver.getTitle(),pdata.getData("addtocartTitle"));
	}
}

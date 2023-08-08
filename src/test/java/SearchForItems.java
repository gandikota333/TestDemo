import com.amazon.qa.SearchResultsPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchForItems extends  BaseTest {

  @Test
    public void verifyPopularShoppingIdeasText(){
    homePageObj.clicksearchInputBox();
    homePageObj.enterSearchItem("Toys");
    homePageObj.clicksearchBtn();
      Assert.assertEquals("Popular Shopping Ideas",searchResultsPageObj.getPopularShoppingIdea());
    }



  }




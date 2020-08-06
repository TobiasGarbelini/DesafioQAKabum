package core;

import static core.DriverFactory.getDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {
	public void esperaElementoclicavelId(String id) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}

	public void preencheInputPorId(String id, String valor) {
		getDriver().findElement(By.id(id)).sendKeys(valor);
	}

	public void clickid(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public void clickXpath(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	}

	public void verificaTitle(String valor) {
		assertThat(getDriver().getTitle(), is(valor));
	}

	public void verificaCSSSelector(String cssSelector, String valor) {
		assertThat(getDriver().findElement(By.cssSelector(cssSelector)).getText(), is(valor));
	}

}

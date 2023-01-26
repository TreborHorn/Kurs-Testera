package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ShopWebsite;



public class TestCase001 {
    @Given("Open shopwebsite")
    public void openShopwebsite() {
        ShopWebsite.OpenShopWebsite();
    }

    @When("Open first category")
    public void openFirstCategory(){
        ShopWebsite.openFirstCategory();
    }




    @And("Choose secend product")
    public void chooseSecendProduct(){

    }



    @And("Click Add to basket button")
    public void clickAddToBasketButton() {
    }

    @And("Click Check a basket")
    public void clickCheckABasket() {
    }

    @Then("I see my product in basket")
    public void iSeeMyProductInBasket() {
    }



}

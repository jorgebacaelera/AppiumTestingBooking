package com.nttdata.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class SearchDetailsScreen {

    public static final Target SEARCH_DESTINO = Target.the("Search Detail Input")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Enter your destination\"]"))
            .locatedForIOS(AppiumBy.id("xxxx"));

    public static final Target SEARCH_BUTTON_DESTINO= Target.the("Search Detail Input Text")
            .locatedForAndroid(AppiumBy.id("//android.view.View[@content-desc=\"Accommodation search box\"]"))
            .locatedForIOS(AppiumBy.id("xxxx"));



}

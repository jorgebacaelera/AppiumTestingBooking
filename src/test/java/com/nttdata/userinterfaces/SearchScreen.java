package com.nttdata.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class SearchScreen {
    public static Target RESULT_TEXT = Target.the("Result text")
            .locatedForAndroid(AppiumBy.id("2131431007"))
            .locatedForIOS(AppiumBy.id("2131431007"));
}

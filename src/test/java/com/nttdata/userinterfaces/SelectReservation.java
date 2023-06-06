package com.nttdata.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static com.nttdata.stepsdefinitions.AirbnbSearchStepsDefs.*;

public class SelectReservation {

    public static final Target SELECTDATE = Target.the("Search Date Input")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Staying from "+datestart+"until "+datefinal+"\"]"))
            .locatedForIOS(AppiumBy.id("xxxx"));

    public static final Target SELECTROOM = Target.the("Search Room for Family")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.Button[@content-desc=\""+rooms+"room,"+adults+" adults, "+children+ "children\"]"))
            .locatedForIOS(AppiumBy.id("xxxx"));

    public static final Target SELECTOPTION = Target.the("Search Second Option")
            .locatedForAndroid(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]\n"))
            .locatedForIOS(AppiumBy.id("xxxx"));

    public static final Target SELECTBUTTONRESERVATION = Target.the("Search Button Reservation")
            .locatedForAndroid(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup"))
            .locatedForIOS(AppiumBy.id("xxxx"));

    public static final Target SELECTBUTTONROOM = Target.the("Search Button Room Reservation")
            .locatedForAndroid(AppiumBy.id("rooms_item_select_layout"))
            .locatedForIOS(AppiumBy.id("xxxx"));

    public static final Target SELECTRESERVE = Target.the("Search Buton Reserve")
            .locatedForAndroid(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button"))
            .locatedForIOS(AppiumBy.id("xxxx"));


}

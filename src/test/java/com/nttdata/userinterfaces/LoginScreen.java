package com.nttdata.userinterfaces;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.targets.Target;
import io.appium.java_client.android.nativekey.AndroidKey;


public class LoginScreen {
    public static final Target BTN_CLOSE = Target.the("Botón cerrar")
            .locatedForAndroid(AppiumBy.id("facet_with_bottom_sheet_header_top_bar"))
            .locatedForIOS(AppiumBy.xpath("xxx"));



    }




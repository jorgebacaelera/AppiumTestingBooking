## CAPABILITY DE APPIUM 

A continuación se detalla la configuración de APPIUM para poder realizar el test y mapear elementos con Appium Inspector:

    {"platformName": "android","appium:platformVersion": "11","appium:deviceName": "sdk_gphone64_x86_64","appium:automationName": "UiAutomator2","appium:appPackage": "com.booking","appium:appActivity": "com.booking.deeplink.decoder.TaxisDeeplinkActivityDecoder","appium:noReset": true,"appium:ignoreHiddenApiPolicyError": true,"appium:udid": "emulator-5554","appium:autoGrantPermissions": true} 

## APK UTILIZADO

Actualmente el APK de prueba se encuentra en la siguiente ruta del proyecto :

    \screenplay-mobile-training\src\test\resources\app


## FEATURE - ESCENARIOS DE PRUEBA

En el archivo booking.feature se detalla los escenario de prueba Happy Path y Unhappy


## Usar Java desde la versión 8 en adelante

Abrir una ventana de comando de window y ejecutar:

    java -version 

## Usar Maven

Abrir una ventana de comando de window y ejecutar:

    mvn --version     


## Visualizar los reportes

Ambos comandos proporcionados anteriormente producirán un reporte de prueba de Serenity en el directorio `target/site/serenity`.


package com.nttdata.stepsdefinitions;

import com.nttdata.tasks.Search;
import com.nttdata.userinterfaces.LoginScreen;
import com.nttdata.userinterfaces.SelectReservation;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.PressesKey;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.appium.java_client.android.nativekey.KeyEvent;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AirbnbSearchStepsDefs {


    private PressesKey pressesKey;
    public static String datestart="";
    public static String datefinal="";
    public static String rooms="";
    public static String adults="";
    public static String children="";




    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        System.out.print("OK ");
    }

   @Given("^que el (.*) busca el destino$")
    public void queElUsuarioSeEncuentraEnElLoginDeAirbnb(String actor) throws InterruptedException {


        theActorCalled(actor).attemptsTo(
        Click.on(LoginScreen.BTN_CLOSE)


        );
    }

    @When("ingresa el destino de la ciudad de (.*)")
    public void busca(String ciudad) {
        theActorInTheSpotlight().attemptsTo(
                Search.withPlace(ciudad)
        );
    }

    @And("selecciona las fechas de estadía seleccionar desde el (.*) al (.*)")
    public void muestraElTexto(String fechainicio, String fechafin) {
        datestart=fechainicio;
        datefinal=fechafin;
        Click.on(SelectReservation.SELECTDATE);
        Serenity.takeScreenshot();

    }
    @And("selecciona (.*) habitación, (.*) adultos y (.*) niños")
    public void seleccionFiltros(String habitacion, String adultos, String niños){
        rooms=habitacion;
        adults=adultos;
        children=niños;
        Click.on(SelectReservation.SELECTROOM);
        Serenity.takeScreenshot();

    }

    @And("selecciona la segunda opción del listado de resultados")
    public void selectSegundaOpcion(){
        Click.on(SelectReservation.SELECTOPTION);
        Serenity.takeScreenshot();
    }

    @And("selecciona el botón de reserva")
    public void selectBotonReserva(){
        Click.on(SelectReservation.SELECTBUTTONRESERVATION);
        Click.on(SelectReservation.SELECTBUTTONROOM);
        Click.on(SelectReservation.SELECTRESERVE);

        Serenity.takeScreenshot();
    }

    @And("ingresa los datos personales del usuario")
    public void insertDatosPersonales(){

        Serenity.takeScreenshot();
    }

    @And("ingresa datos del pago con tarjeta de credito")
    public void insertDatosCard(){
        Serenity.takeScreenshot();
    }

    @Then("confirma la reserva")
    public void confirmReserva(){
        Serenity.takeScreenshot();
    }



}

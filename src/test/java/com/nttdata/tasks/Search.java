package com.nttdata.tasks;

import com.nttdata.userinterfaces.SearchDetailsScreen;
import com.nttdata.userinterfaces.SearchScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task {
    private final String place;

    public Search(String place) {
        this.place = place;
    }

    public static Performable withPlace(String place){
        return instrumented(Search.class, place);
    }

    @Step("busca en AirbBnb")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(SearchDetailsScreen.SEARCH_DESTINO),
                Enter.theValue(place).into(SearchDetailsScreen.SEARCH_DESTINO),
                Click.on(SearchDetailsScreen.SEARCH_BUTTON_DESTINO)

        );
    }
}

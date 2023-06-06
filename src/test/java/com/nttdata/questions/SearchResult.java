package com.nttdata.questions;

import com.nttdata.userinterfaces.SearchScreen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SearchResult {

    public static Question<String> resultText(){
        return actor -> Text.of(SearchScreen.RESULT_TEXT).answeredBy(actor);
    }
}

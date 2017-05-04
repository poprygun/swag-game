package io.pivotal.microsamples.api;


import io.pivotal.microsamples.model.Phrase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class PhraseApiImpl implements PhraseApi{

    @Override
    public ResponseEntity<List<Phrase>> allPhrases() {

        List<String> guesses = Arrays.asList("guide", "surgeon", "promised", "computation", "carriage", "dizzy");
        return new ResponseEntity<>(fromPhrases(guesses), HttpStatus.OK);
    }

    private List<Phrase> fromPhrases(List<String> phrases) {
        List<Phrase> guesses = new ArrayList<>();
        Random random = new Random();
        for (String phrase : phrases) {
            Phrase guess = new Phrase();
            guess.setResponsePhrase(phrase);
            guess.setGuessedPhrase(phrase);
            guess.setId(random.nextLong());
            guess.setGuessDate(new Date());
            guesses.add(guess);
        }

        return guesses;
    }
}

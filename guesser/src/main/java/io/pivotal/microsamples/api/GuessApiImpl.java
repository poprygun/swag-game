package io.pivotal.microsamples.api;

import io.pivotal.microsamples.guesser.api.GuessApi;
import io.pivotal.microsamples.guesser.model.Guess;
import io.pivotal.microsamples.guesser.model.Health;
import io.pivotal.microsamples.model.Phrase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GuessApiImpl implements GuessApi {

 	@Autowired
	private PhraseApiClient phraseApiClient;

    @Override
    public ResponseEntity<List<Guess>> allGuesses() {
        ResponseEntity<List<Phrase>> responseFromRandomizer = phraseApiClient.allPhrases();

        List<Guess> guesses = new ArrayList<>();
        for (Phrase phrase : responseFromRandomizer.getBody()) {
            addPhraseToGuesses(guesses, phrase);
        }

        return new ResponseEntity<>(guesses, HttpStatus.OK);
    }

    private void addPhraseToGuesses(List<Guess> guesses, Phrase phrase) {
        Guess guess = new Guess();
        guess.setGuessDate(phrase.getGuessDate());
        guess.setGuessedPhrase(phrase.getGuessedPhrase());
        guess.setGuessed(phrase.getGuessed());
        guess.setId(phrase.getId());
        guesses.add(guess);
    }

    @Override
    public ResponseEntity<Health> health() {
        Health health = new Health();
        health.setHealth("Guesser is alive!");
        return new ResponseEntity<>(health, HttpStatus.OK);
    }
}

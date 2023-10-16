package com.rq.randomQuotes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rq.randomQuotes.Model.Quotes;
import com.rq.randomQuotes.Service.QuoteService;

@RestController
@CrossOrigin(origins = "*")
public class QuoteController {
	
	@Autowired 
	QuoteService quoteService;
	
	@GetMapping("/api/getQuote")
	public ResponseEntity<Quotes> getQuote() {
		Quotes q =quoteService.getRandomOne();
		return new ResponseEntity<>(q,HttpStatus.OK);
	}
}

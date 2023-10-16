package com.rq.randomQuotes.Service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rq.randomQuotes.Model.Quotes;
import com.rq.randomQuotes.Repository.QuoteRepository;

@Service
public class QuoteService {
	
	@Autowired
	QuoteRepository quoteRepository;
	
	private final static Random RANDOMIZER = new Random();
	
	public Quotes getQuoteById(Integer id) {
		Optional<Quotes> quote = quoteRepository.findById(id);
		return quote.isPresent()?quote.get():null;
	}
	
	public Quotes getRandomOne() {
		System.out.println("---- OUTPUT "+quoteRepository.count());
		return getQuoteById(nextLong(1, quoteRepository.count() + 1));
	}

	private Integer nextLong(long lowerRange, long upperRange) {
		return (int) ((RANDOMIZER.nextDouble() * (upperRange - lowerRange)) + lowerRange);
	}

}

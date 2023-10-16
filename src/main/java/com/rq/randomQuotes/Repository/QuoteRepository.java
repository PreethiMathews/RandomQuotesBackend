package com.rq.randomQuotes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rq.randomQuotes.Model.Quotes;


public interface QuoteRepository extends JpaRepository<Quotes,Integer> {

}

package com.testyantra.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.testyantra.springcore.di.Author;
import com.testyantra.springcore.di.Book;

@Configuration
public class ConfigurrationClass1 {

		
        @Bean(name="author")
		public Author getAuthor() {
		Author author = new Author();
		author.setName("santhu");
		author.setPenName("santoor");
		return author;
        }
		@Bean(name="book")
		public Book getBook() {
			Book book = new Book();
			book.setAuthor(getAuthor());
			book.setName("love story");
			book.setPrice(100);
			return book;
			
		}
	}


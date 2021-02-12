package com.yukil.refactoring.videorental;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CustomerTest {

    @Test
    @DisplayName("테스트")
    public void customerTest() throws Exception{
        //given
        Movie trash = new Movie("원더우먼", Movie.NEW_RELEASE);
        Movie god = new Movie("파이트클럽", Movie.REGULAR);

        Rental trashRental = new Rental(trash, 10);
        Rental godRental = new Rental(god, 5);

        Customer customer = new Customer("yukil");
        customer.addRental(trashRental);
        customer.addRental(godRental);

        //when
        String statement = customer.statement();
        String htmlStatement = customer.htmlStatement();

        //then
        System.out.println(statement);
        System.out.println(htmlStatement);
    }

}
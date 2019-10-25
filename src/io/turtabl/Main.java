package io.turtabl;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    private String Borrower;
    private String Book;


    //todo: work on the main method
    public static void main(String[] args) {

        List<Borrower> borrower = Arrays.asList(
                new Borrower("Aku", 123, BorrowerType.Gold),
                new Borrower("Sam Ackon", 111, BorrowerType.Premium),
                new Borrower("Maame Tiwaa", 233, BorrowerType.Child),
                new Borrower("Serwaa Akoto", 121, BorrowerType.Gold),
                new Borrower("Doreen Sheka", 212, BorrowerType.Regular),
                new Borrower("Francis Billa", 132, BorrowerType.Gold),
                new Borrower("Samuel Mathias", 763, BorrowerType.Premium),
                new Borrower("Patricia Kodie", 565, BorrowerType.Gold),
                new Borrower("Wonder Marvel", 129, BorrowerType.Child)
        );

        List<Borrower> goldBorrowers = new ArrayList<>();
        for(Borrower g: borrower){
            if (g.getBorrowerType() == BorrowerType.Gold) {
                System.out.println(g.getName());
            }


        }


        List<Book> bookList = Arrays.asList(
                new Book(Category.Fiction, "Skoobie Doo", BookState.Borrowed),
                new Book(Category.Romance, "Into the wild lands", BookState.Available),
                new Book(Category.Adventure, "Snake Girl", BookState.Lost),
                new Book(Category.Fiction, "Taalia", BookState.Borrowed)


        );
         System.out.println("Hello, turntabl!");

    }
}




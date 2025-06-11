package ru.netology.rest.javaqa.javaqamvn.main;

import ru.netology.rest.javaqa.javaqamvn.service.restService;


    public class Main {

       public static void main(String[] args) {
          restService service = new restService ();
          int counter = service.calculate(100_000, 60_000, 150_000);
           System.out.println(counter);
    }
}
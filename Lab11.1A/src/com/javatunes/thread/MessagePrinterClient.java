/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

  public static void main(String[] args) {
    MessagePrinter printer1 = new MessagePrinter("apples are yummy");
    printer1.run();

    MessagePrinter printer2 = new MessagePrinter("pears, too", 150);
    printer2.run();

    MessagePrinter printer3 = new MessagePrinter("Is their a default???", 100);
    printer3.run();

  }
}
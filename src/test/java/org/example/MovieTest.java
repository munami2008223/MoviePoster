package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test
    public void testEmptyList() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAllMinimumQuantity() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllEnterPossibleValue() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLessThanLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMoreThanTheLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Вперёд"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");


        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastSelectionLimit() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastSelectionBigLimit() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastSelectionMaximumLimit() {
        MovieManager manager = new MovieManager(6);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

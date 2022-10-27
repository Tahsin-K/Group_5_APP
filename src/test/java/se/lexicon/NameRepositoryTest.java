package se.lexicon;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class NameRepositoryTest {
    @Before
    public void start(){
        String[] namesArray = {"Arnold Welsh", "Michael Peters", "Erik Svensson", "Erik Henriksson", "John Welsh"};
        NameRepository.setNames(namesArray);
    }
    @Test
    public void test_getSize(){
        int expectedNumber = 5;
        int actualNumber = NameRepository.getSize();
        Assert.assertEquals(expectedNumber,actualNumber);
    }
    @Test
    public void test_clear(){
        NameRepository.clear();
    }
    @Test
    public void test_findAll(){
        String [] expected = {"Arnold Welsh", "Michael Peters", "Erik Svensson", "Erik Henriksson", "John Welsh"};
        String [] actual = NameRepository.findAll();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_find(){
        String expected = "Michael Peters";
        String actual = NameRepository.find("Michael Peters");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_findFullName(){
        String expected = "NULL";
        String actual = NameRepository.find("Erik Mayland");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_add(){
        boolean expected = true;
        boolean actual = NameRepository.add("Tracy Shaw");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_addName(){
        boolean expected = false;
        boolean actual = NameRepository.add("arnold welsh");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_findByFirstName(){
        String [] expectedNames = {"Erik Svensson","Erik Henriksson"};
        String [] actualNames = NameRepository.findByFirstName("erik");
        Assert.assertEquals(expectedNames,actualNames);
    }
    @Test
    public void test_findByLastName(){
        String [] expectedNames = {"Arnold Welsh", "John Welsh"};
        String [] actualNames = NameRepository.findByLastName("welsh");
        Assert.assertEquals(expectedNames,actualNames);
    }


}
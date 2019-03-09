package com.ChadBoswell;

import org.junit.*;

import static org.junit.Assert.*;

public class VehicleTest {

    private Vehicle brand;

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Before
    public void setUp() throws Exception {

        brand = new Brand();

    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void model1() {

        String brand = model.brand("bmw m3");
        Assert.assertEquals("Object Equality", "bmw m3", model);

    }

    @Test
    public void model2() {

        String brand = model.brand("Volkswagen mk1");
        Assert.assertSame("Object Identity", "Volkswagen mk1", model);

    }


    @Test
    public void model3() {

        String brand = model.brand("Nissan GTR");
        Assert.assertSame("Failed test", "Nissan spark", model);
    }


    @Test(timeout = 1)
    public void model4() {

        String brand = model.brand("bmw m3");
    }


    @Test(expected = Exception.class)
    public void model5() {

        double value = model.price(500000);
        Assert.assertEquals("Exception Test", 750000, value);
    }


    @Ignore("ignore")
    @Test(expected = Exception.class)
    public void model6() {

        double value = model.price("alot");

        Assert.assertEquals("Exception Test", 750000, value);
    }
}
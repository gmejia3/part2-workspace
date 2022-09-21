package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private static final double SALARY = 60000D;
  private static final double TOLERANCE = 0.001;
  private static final double TAX = SALARY * TaxPayer.SALARIED_TAX_RATE;


  private SalariedEmployee emp;

  @Before
  public void setUp() {
    emp = new SalariedEmployee("Patrick Star", new Date(120, 2, 1), SALARY);
  }


  @Test
  public void testPay() {
    assertEquals(SALARY, emp.getSalary(), TOLERANCE);
  }

  @Test
  public void testPayTaxes() {
    assertEquals(TAX, emp.payTaxes(), TOLERANCE);
  }
}
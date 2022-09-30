package com.javatunes.catalog.com.javatunes.catalog;

import static org.junit.Assert.assertEquals;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicItem;
import org.junit.Test;

public class InMemoryCatalogTest {

  @Test
  public void findByID() {
    MusicItem actual = new InMemoryCatalog().findById(14L);
    assertEquals("So", found.getTitle());
  }
}

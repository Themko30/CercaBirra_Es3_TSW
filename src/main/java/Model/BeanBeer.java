package Model;

import java.util.ArrayList;
import java.util.List;

public class BeanBeer {

  public List<String> getBrends(String color) {
    List<String> brands = new ArrayList<>();
    switch (color) {
      case "light":
        brands.add("The Genie's Pop Art Pilsner");
        brands.add("The Lyrical Rhinestone");
        break;
      case "amber":
        brands.add("Liquid Nightcap");
        brands.add("Devious Brew");
        break;
      case "brown":
        brands.add("The Homemaker's Wiener");
        brands.add("Yielding Mountain Amber");
        break;
      case "dark":
        brands.add("Newt's Kneecap Wheatwine");
        brands.add("Polar Bear's Crybaby");
        break;
    }
    return (brands);
  }
}

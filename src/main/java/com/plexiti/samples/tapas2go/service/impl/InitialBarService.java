package com.plexiti.samples.tapas2go.service.impl;

import com.plexiti.samples.tapas2go.model.Tapa;
import com.plexiti.samples.tapas2go.service.BarService;
import java.util.HashMap;
import java.util.Map;

public class InitialBarService implements BarService {

  Map<String, Tapa> availableTapas = new HashMap<String, Tapa>();
  String menu;

  public InitialBarService() {
    Tapa t1 = new Tapa("aceitunas", "Olives, sometimes with a filling of anchovies or red bell pepper", "http://upload.wikimedia.org/wikipedia/commons/thumb/2/28/Aceitunas.jpg/800px-Aceitunas.jpg");
    Tapa t2 = new Tapa("chopitos", "Battered and fried tiny squid, also known as puntillitas", "http://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Chopitos_%28lim%C3%B3n%29_-_89.jpg/800px-Chopitos_%28lim%C3%B3n%29_-_89.jpg");
    Tapa t3 = new Tapa("calamares", "Also known as rabas, these are rings of battered squid", "http://upload.wikimedia.org/wikipedia/commons/0/09/Calamares_tapas.jpg");
    Tapa t4 = new Tapa("tortilla", "A Spanish omelette containing fried chunks of potatoes and sometimes onion", "http://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Pila_de_Tortillas_de_Patatas.jpg/800px-Pila_de_Tortillas_de_Patatas.jpg");
    availableTapas.put(t1.getName(), t1);
    availableTapas.put(t2.getName(), t2);
    availableTapas.put(t3.getName(), t3);
    availableTapas.put(t4.getName(), t4);

    menu = "Today we have: " + availableTapas.keySet().toString();
  }

  @Override
  public String todaysMenu() {
    return menu;
  }

  @Override
  public Tapa prepareTapa(String tapaName) {
    return availableTapas.get(tapaName);
  }
}

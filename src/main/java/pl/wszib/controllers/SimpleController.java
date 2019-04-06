package pl.wszib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.wszib.domain.Samochod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SimpleController {

    @GetMapping("car")
    public String car(Model model){
        List<Samochod> list = generateList();
        model.addAttribute("list", list);
        return "carTemplate";
    }

    @GetMapping("car/single/{index}")
    public String sinlge (Model model, @PathVariable("index") int index){
        List<Samochod> list = generateList();
        Samochod samochod = list.get(index);
        return "singleTemplate";
    }
    private List<Samochod> generateList() {
        List<Samochod> list = new ArrayList<>();

        Samochod samochod1 = new Samochod();
        samochod1.setMarka("Audi");
        samochod1.setModel("A4");
        samochod1.setRocznik(2000);
        samochod1.setCena(15600);
        samochod1.setPrzebieg(100000);
        list.add(samochod1);

        Samochod samochod2 = new Samochod();
        samochod2.setMarka("Audi");
        samochod2.setModel("A6");
        samochod2.setRocznik(2013);
        samochod2.setCena(35000);
        samochod2.setPrzebieg(260000);
        list.add(samochod2);

        Samochod samochod3 = new Samochod();
        samochod3.setMarka("Toyota");
        samochod3.setModel("Avensis");
        samochod3.setRocznik(2018);
        samochod3.setCena(150000);
        samochod3.setPrzebieg(10000);
        list.add(samochod3);

        Samochod samochod4 = new Samochod();
        samochod4.setMarka("VW");
        samochod4.setModel("Golf IV");
        samochod4.setRocznik(2015);
        samochod4.setCena(45000);
        samochod4.setPrzebieg(50000);
        list.add(samochod4);

        Samochod samochod5 = new Samochod();
        samochod5.setMarka("VW");
        samochod5.setModel("Golf V");
        samochod5.setRocznik(2013);
        samochod5.setCena(60000);
        samochod5.setPrzebieg(10000);
        list.add(samochod5);

        Samochod samochod6 = new Samochod();
        samochod6.setMarka("VW");
        samochod6.setModel("Polo");
        samochod6.setRocznik(2014);
        samochod6.setCena(35000);
        samochod6.setPrzebieg(100000);
        list.add(samochod6);

        Samochod samochod7 = new Samochod();
        samochod7.setMarka("Suzuki");
        samochod7.setModel("Swift");
        samochod7.setRocznik(2000);
        samochod7.setCena(15000);
        samochod7.setPrzebieg(200000);
        list.add(samochod7);

        Samochod samochod8 = new Samochod();
        samochod8.setMarka("Seat");
        samochod8.setModel("Toledo");
        samochod8.setRocznik(2000);
        samochod8.setCena(8000);
        samochod8.setPrzebieg(260000);
        list.add(samochod8);

        Samochod samochod9 = new Samochod();
        samochod9.setMarka("Seat");
        samochod9.setModel("Altea");
        samochod9.setRocznik(2017);
        samochod9.setCena(15000);
        samochod9.setPrzebieg(100000);
        list.add(samochod9);

        Samochod samochod10 = new Samochod();
        samochod10.setMarka("Audi");
        samochod10.setModel("A4");
        samochod10.setRocznik(1999);
        samochod10.setCena(6000);
        samochod10.setPrzebieg(350000);
        list.add(samochod10);

        return list;
    }
}

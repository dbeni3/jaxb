package legoset;

import album.Album;
import album.Track;
import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet legoSet=new LegoSet();
        legoSet.setNumber("75211");
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(516);
        ArrayList<String> tags = new ArrayList<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoSet.setTags(tags);

        ArrayList<Minifig> minifig=new ArrayList<>();
        minifig.add(new Minifig(2,"Imperial Mudtrooper"));
        minifig.add(new Minifig(1,"Imperial Pilot"));
        minifig.add(new Minifig(1,"Mimban Stormtrooper"));
        legoSet.setMinifigs(minifig);
        legoSet.setWeight(new Weight("kg",0.89));
        legoSet.setURL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        JAXBHelper.toXML(legoSet, System.out);

        JAXBHelper.toXML(legoSet, new FileOutputStream("legoset.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));
    }
}

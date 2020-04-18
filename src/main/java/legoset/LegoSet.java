package legoset;

import album.Track;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.List;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class LegoSet {
    private String name;
    @XmlAttribute
    private String number;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;
    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private List<String> tags;
    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;
    private Weight weight;
    private String URL;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getSubtheme() {
        return subtheme;
    }

    public void setSubtheme(String subtheme) {
        this.subtheme = subtheme;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Minifig> getMinifigs() {
        return minifigs;
    }

    public void setMinifigs(List<Minifig> minifigs) {
        this.minifigs = minifigs;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

}

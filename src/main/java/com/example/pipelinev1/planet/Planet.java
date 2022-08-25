package com.example.pipelinev1.planet;

import com.example.pipelinev1.planettype.PlanetType;
import com.example.pipelinev1.reservation.Reservation;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "planet_table")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "planet_id")
    private Integer planetId;

    @Column(name = "planet_name")
    private String planetName;

    @Column(name = "planet_mass")
    private Long planetMass;

    @Column(name = "planet_diameter")
    private Long planetDiameter;

    @Column(name = "planet_density")
    private Long planetDensity;

    @Column(name = "planet_gravity")
    private Long planetGravity;

    @Column(name = "planet_dayLength")
    private Long planetDayLength;

    @Column(name = "planet_distanceFromSun")
    private Long planetDistanceFromSun;

    @Column(name = "planet_meanTemperature")
    private Long planetMeanTemperature;

    @Column(name = "planet_numberOfMoons")
    private int planetNumberOfMoons;

    @Column(name = "planet_notes")
    private String planetNotes;

    @ManyToMany
    @JoinColumn(name = "planet_type_list_con")
    private List<PlanetType> planetType;


    public Planet() {

    }

    public Planet(String planetName, Long planetMass, Long planetDiameter,
                  Long planetDensity, Long planetGravity, Long planetDayLength,
                  Long planetDistanceFromSun, Long planetMeanTemperature,
                  int planetNumberOfMoons, String planetNotes) {
        super();
        this.planetName = planetName;
        this.planetMass = planetMass;
        this.planetDiameter = planetDiameter;
        this.planetDensity = planetDensity;
        this.planetGravity = planetGravity;
        this.planetDayLength = planetDayLength;
        this.planetDistanceFromSun = planetDistanceFromSun;
        this.planetMeanTemperature = planetMeanTemperature;
        this.planetNumberOfMoons = planetNumberOfMoons;
        this.planetNotes = planetNotes;
    }

    public Integer getPlanetId() {
        return planetId;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public Long getPlanetMass() {
        return planetMass;
    }

    public void setPlanetMass(Long planetMass) {
        this.planetMass = planetMass;
    }

    public Long getPlanetDiameter() {
        return planetDiameter;
    }

    public void setPlanetDiameter(Long planetDiameter) {
        this.planetDiameter = planetDiameter;
    }

    public Long getPlanetDensity() {
        return planetDensity;
    }

    public void setPlanetDensity(Long planetDensity) {
        this.planetDensity = planetDensity;
    }

    public Long getPlanetGravity() {
        return planetGravity;
    }

    public void setPlanetGravity(Long planetGravity) {
        this.planetGravity = planetGravity;
    }

    public Long getPlanetDayLength() {
        return planetDayLength;
    }

    public void setPlanetDayLength(Long planetDayLength) {
        this.planetDayLength = planetDayLength;
    }

    public Long getPlanetDistanceFromSun() {
        return planetDistanceFromSun;
    }

    public void setPlanetDistanceFromSun(Long planetDistanceFromSun) {
        this.planetDistanceFromSun = planetDistanceFromSun;
    }

    public Long getPlanetMeanTemperature() {
        return planetMeanTemperature;
    }

    public void setPlanetMeanTemperature(Long planetMeanTemperature) {
        this.planetMeanTemperature = planetMeanTemperature;
    }

    public int getPlanetNumberOfMoons() {
        return planetNumberOfMoons;
    }

    public void setPlanetNumberOfMoons(int planetNumberOfMoons) {
        this.planetNumberOfMoons = planetNumberOfMoons;
    }

    public String getPlanetNotes() {
        return planetNotes;
    }

    public void setPlanetNotes(String planetNotes) {
        this.planetNotes = planetNotes;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "planetId=" + planetId +
                ", planetName='" + planetName + '\'' +
                ", planetMass=" + planetMass +
                ", planetDiameter=" + planetDiameter +
                ", planetDensity=" + planetDensity +
                ", planetGravity=" + planetGravity +
                ", planetDayLength=" + planetDayLength +
                ", planetDistanceFromSun=" + planetDistanceFromSun +
                ", planetMeanTemperature=" + planetMeanTemperature +
                ", planetNumberOfMoons=" + planetNumberOfMoons +
                ", planetNotes='" + planetNotes + '\'' +
                '}';
    }
}

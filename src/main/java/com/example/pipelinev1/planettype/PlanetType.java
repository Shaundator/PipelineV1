package com.example.pipelinev1.planettype;

import com.example.pipelinev1.planet.Planet;
import com.example.pipelinev1.reservation.Reservation;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "planetType_table")
public class PlanetType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "planetType_id")
    private Integer planetTypeId;

    @Column(name = "planetType_name")
    private String planetTypeName;

    @OneToMany
    @JoinColumn(name = "planetType_planets_list_con")
    private List<Planet> planets;


    public PlanetType() {

    }

    public PlanetType(Integer planetTypeId, String planetTypeName) {
        super();
        this.planetTypeId = planetTypeId;
        this.planetTypeName = planetTypeName;
    }

    public Integer getPlanetTypeId() {
        return planetTypeId;
    }

    public String getPlanetTypeName() {
        return planetTypeName;
    }

    public void setPlanetTypeName(String planetTypeName) {
        this.planetTypeName = planetTypeName;
    }

    @Override
    public String toString() {
        return "PlanetType{" +
                "planetTypeId=" + planetTypeId +
                ", planetTypeName='" + planetTypeName + '\'' +
                '}';
    }


}

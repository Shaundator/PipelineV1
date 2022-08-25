package com.example.pipelinev1.spaceship;

import javax.persistence.*;

@Entity
@Table(name = "spaceship_table")
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "spaceship_id")
    private Integer spaceshipId;

    @Column(name = "spaceship_name")
    private String spaceshipName;

    @Column(name = "spaceship_speed")
    private Long spaceshipSpeed;

    @Column(name = "spaceship_weight")
    private Long spaceshipWeight;

    @Column(name = "spaceship_capacity")
    private Integer spaceshipCapacity;

    @Column(name = "spaceship_cargoCapacity")
    private Long spaceshipCargoCapacity;

    @Column(name = "spaceship_weaponized")
    private boolean spaceshipWeaponized;

    public Spaceship() {

    }

    public Spaceship(Integer spaceshipId, String spaceshipName,
                     Long spaceshipSpeed, Long spaceshipWeight,
                     Integer spaceshipCapacity, Long spaceshipCargoCapacity,
                     boolean spaceshipWeaponized) {
        super();
        this.spaceshipId = spaceshipId;
        this.spaceshipName = spaceshipName;
        this.spaceshipSpeed = spaceshipSpeed;
        this.spaceshipWeight = spaceshipWeight;
        this.spaceshipCapacity = spaceshipCapacity;
        this.spaceshipCargoCapacity = spaceshipCargoCapacity;
        this.spaceshipWeaponized = spaceshipWeaponized;
    }

    public Integer getSpaceshipId() {
        return spaceshipId;
    }

    public void setSpaceshipId(Integer spaceshipId) {
        this.spaceshipId = spaceshipId;
    }

    public String getSpaceshipName() {
        return spaceshipName;
    }

    public void setSpaceshipName(String spaceshipName) {
        this.spaceshipName = spaceshipName;
    }

    public Long getSpaceshipSpeed() {
        return spaceshipSpeed;
    }

    public void setSpaceshipSpeed(Long spaceshipSpeed) {
        this.spaceshipSpeed = spaceshipSpeed;
    }

    public Long getSpaceshipWeight() {
        return spaceshipWeight;
    }

    public void setSpaceshipWeight(Long spaceshipWeight) {
        this.spaceshipWeight = spaceshipWeight;
    }

    public Integer getSpaceshipCapacity() {
        return spaceshipCapacity;
    }

    public void setSpaceshipCapacity(Integer spaceshipCapacity) {
        this.spaceshipCapacity = spaceshipCapacity;
    }

    public Long getSpaceshipCargoCapacity() {
        return spaceshipCargoCapacity;
    }

    public void setSpaceshipCargoCapacity(Long spaceshipCargoCapacity) {
        this.spaceshipCargoCapacity = spaceshipCargoCapacity;
    }

    public boolean isSpaceshipWeaponized() {
        return spaceshipWeaponized;
    }

    public void setSpaceshipWeaponized(boolean spaceshipWeaponized) {
        this.spaceshipWeaponized = spaceshipWeaponized;
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "spaceshipId=" + spaceshipId +
                ", spaceshipName='" + spaceshipName + '\'' +
                ", spaceshipSpeed=" + spaceshipSpeed +
                ", spaceshipWeight=" + spaceshipWeight +
                ", spaceshipCapacity=" + spaceshipCapacity +
                ", spaceshipCargoCapacity=" + spaceshipCargoCapacity +
                ", spaceshipWeaponized=" + spaceshipWeaponized +
                '}';
    }
}

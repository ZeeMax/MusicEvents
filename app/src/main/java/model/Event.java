package model;

import java.io.Serializable;

/**
 * Created by nairuz on 0006, July, 6, 2015.
 */
public class Event implements Serializable {

    private static  final long  id = 1L;
    private String title;
    private String artist;
    private String headLiner;
    private String venueName;
    private String country;
    private String city;
    private String street;
    private String postalCode;
    private String url;
    private String website ;
    private String venueImage;
    private String bandImage;
    private String startDate;
    private String description;
    private String musicgGenre;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getHeadLiner() {
        return headLiner;
    }

    public void setHeadLiner(String headLiner) {
        this.headLiner = headLiner;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getVenueImage() {
        return venueImage;
    }

    public void setVenueImage(String venueImage) {
        this.venueImage = venueImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBandImage() {
        return bandImage;
    }

    public void setBandImage(String bandImage) {
        this.bandImage = bandImage;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMusicgGenre() {
        return musicgGenre;
    }

    public void setMusicgGenre(String musicgGenre) {
        this.musicgGenre = musicgGenre;
    }
}

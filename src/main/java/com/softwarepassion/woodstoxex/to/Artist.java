package com.softwarepassion.woodstoxex.to;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: kris
 * Date: 15/09/2012
 * Time: 14:48
 */
public class Artist implements Serializable {

	//couchdb specific
	@JsonProperty("_id")
	private String _id;
	@JsonProperty("_rev")
	private String _rev;

	private String id;
	private String name;
	private String url;
	private String mbgid;
	private String image;
	private String country;
	private String city;
	private String latitude;
	private String longitude;
	private String state;
	private List<Album> albums = new ArrayList<Album>();

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMbgid() {
		return mbgid;
	}

	public void setMbgid(String mbgid) {
		this.mbgid = mbgid;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String get_rev() {
		return _rev;
	}

	public void set_rev(String _rev) {
		this._rev = _rev;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Artist artist = (Artist) o;

		if (albums != null ? !albums.equals(artist.albums) : artist.albums != null) return false;
		if (id != null ? !id.equals(artist.id) : artist.id != null) return false;
		if (mbgid != null ? !mbgid.equals(artist.mbgid) : artist.mbgid != null) return false;
		if (name != null ? !name.equals(artist.name) : artist.name != null) return false;
		if (url != null ? !url.equals(artist.url) : artist.url != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (url != null ? url.hashCode() : 0);
		result = 31 * result + (mbgid != null ? mbgid.hashCode() : 0);
		result = 31 * result + (albums != null ? albums.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Artist{" +
				"id=" + id +
				", name='" + name + '\'' +
				", url='" + url + '\'' +
				", mbgid='" + mbgid + '\'' +
				", albums=" + albums +
				'}';
	}

	public void addAlbum(Album album) {
		getAlbums().add(album);
	}
}

package com.softwarepassion.woodstoxex.to;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: kris
 * Date: 15/09/2012
 * Time: 14:49
 */
public class Album {
	private String id;
	private String name;
	private String url;
	private String releasedate;
	private String filename;
	private String mbgid;
	private String license_artwork;
	private String id3genre;
	private List<Track> tracks = new ArrayList<Track>();


	public String getId3genre() {
		return id3genre;
	}

	public void setId3genre(String id3genre) {
		this.id3genre = id3genre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMbgid() {
		return mbgid;
	}

	public void setMbgid(String mbgid) {
		this.mbgid = mbgid;
	}

	public String getLicense_artwork() {
		return license_artwork;
	}

	public void setLicense_artwork(String license_artwork) {
		this.license_artwork = license_artwork;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public void addTrack(Track track) {
		getTracks().add(track);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Album album = (Album) o;

		if (filename != null ? !filename.equals(album.filename) : album.filename != null) return false;
		if (id != null ? !id.equals(album.id) : album.id != null) return false;
		if (license_artwork != null ? !license_artwork.equals(album.license_artwork) : album.license_artwork != null)
			return false;
		if (mbgid != null ? !mbgid.equals(album.mbgid) : album.mbgid != null) return false;
		if (name != null ? !name.equals(album.name) : album.name != null) return false;
		if (releasedate != null ? !releasedate.equals(album.releasedate) : album.releasedate != null) return false;
		if (tracks != null ? !tracks.equals(album.tracks) : album.tracks != null) return false;
		if (url != null ? !url.equals(album.url) : album.url != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (url != null ? url.hashCode() : 0);
		result = 31 * result + (releasedate != null ? releasedate.hashCode() : 0);
		result = 31 * result + (filename != null ? filename.hashCode() : 0);
		result = 31 * result + (mbgid != null ? mbgid.hashCode() : 0);
		result = 31 * result + (license_artwork != null ? license_artwork.hashCode() : 0);
		result = 31 * result + (tracks != null ? tracks.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Album{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", url='" + url + '\'' +
				", releasedate='" + releasedate + '\'' +
				", filename='" + filename + '\'' +
				", mbgid='" + mbgid + '\'' +
				", license_artwork='" + license_artwork + '\'' +
				", tracks=" + tracks +
				'}';
	}
}

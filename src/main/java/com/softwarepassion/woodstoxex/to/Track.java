package com.softwarepassion.woodstoxex.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: kris
 * Date: 15/09/2012
 * Time: 14:56
 */
public class Track implements Serializable {

	private String id;
	private String name;
	private String duration;
	private String numalbum;
	private String filename;
	private List<Tag> tags = new ArrayList<Tag>();
	private String mbgid;
	private String license;
	private String id3genre;

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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getNumalbum() {
		return numalbum;
	}

	public void setNumalbum(String numalbum) {
		this.numalbum = numalbum;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getMbgid() {
		return mbgid;
	}

	public void setMbgid(String mbgid) {
		this.mbgid = mbgid;
	}

	public void addTag(Tag tag) {
		getTags().add(tag);
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Track track = (Track) o;

		if (duration != null ? !duration.equals(track.duration) : track.duration != null) return false;
		if (filename != null ? !filename.equals(track.filename) : track.filename != null) return false;
		if (id != null ? !id.equals(track.id) : track.id != null) return false;
		if (license != null ? !license.equals(track.license) : track.license != null) return false;
		if (mbgid != null ? !mbgid.equals(track.mbgid) : track.mbgid != null) return false;
		if (name != null ? !name.equals(track.name) : track.name != null) return false;
		if (numalbum != null ? !numalbum.equals(track.numalbum) : track.numalbum != null) return false;
		if (tags != null ? !tags.equals(track.tags) : track.tags != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (duration != null ? duration.hashCode() : 0);
		result = 31 * result + (numalbum != null ? numalbum.hashCode() : 0);
		result = 31 * result + (filename != null ? filename.hashCode() : 0);
		result = 31 * result + (tags != null ? tags.hashCode() : 0);
		result = 31 * result + (mbgid != null ? mbgid.hashCode() : 0);
		result = 31 * result + (license != null ? license.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Track{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", duration='" + duration + '\'' +
				", numalbum='" + numalbum + '\'' +
				", filename='" + filename + '\'' +
				", tags=" + tags +
				", mbgid='" + mbgid + '\'' +
				", license='" + license + '\'' +
				'}';
	}
}

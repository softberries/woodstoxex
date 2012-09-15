package com.softwarepassion.woodstoxex.to;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: kris
 * Date: 15/09/2012
 * Time: 16:05
 */
public class Tag implements Serializable {

	private String idstr;
	private String weight;

	public String getIdstr() {
		return idstr;
	}

	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Tag tag = (Tag) o;

		if (idstr != null ? !idstr.equals(tag.idstr) : tag.idstr != null) return false;
		if (weight != null ? !weight.equals(tag.weight) : tag.weight != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idstr != null ? idstr.hashCode() : 0;
		result = 31 * result + (weight != null ? weight.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Tag{" +
				"idstr='" + idstr + '\'' +
				", weight=" + weight +
				'}';
	}
}

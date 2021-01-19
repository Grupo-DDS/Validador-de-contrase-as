package com.API;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Entity(name = "Ciudad")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Ciudad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ciudad;
	private String id;
	private String name;
	@ManyToOne
	private Provincia state;
	@ManyToOne
	private Pais country;
	
//	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//	private List<Ciudad> neighborhoods;
	
	@OneToOne
	private Coordenada geo_information;

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", name=" + name + ", state=" + state + ", country=" + country
				+ ", geo_information=" + geo_information + "]";
	}
	
	public Provincia getState() {
		return state;
	}
	public void setState(Provincia state) {
		this.state = state;
	}
	public Pais getCountry() {
		return country;
	}
	public void setCountry(Pais country) {
		this.country = country;
	}
//	public List<Ciudad> getNeighborhoods() {
//		return neighborhoods;
//	}
//	public void setNeighborhoods(List<Ciudad> neighborhoods) {
//		this.neighborhoods = neighborhoods;
//	}
	public Coordenada getGeo_information() {
		return geo_information;
	}
	public void setGeo_information(Coordenada geo_information) {
		this.geo_information = geo_information;
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
	
}

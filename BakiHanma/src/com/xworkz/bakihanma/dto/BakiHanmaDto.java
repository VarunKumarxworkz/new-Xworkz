package com.xworkz.bakihanma.dto;

public class BakiHanmaDto {
	private int id;
	private String name;
	private int episodes;
	private String villan;
	public BakiHanmaDto(int id, String name, int episodes, String villan) {
		super();
		this.id = id;
		this.name = name;
		this.episodes = episodes;
		this.villan = villan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	public String getVillan() {
		return villan;
	}
	public void setVillan(String villan) {
		this.villan = villan;
	}
	@Override
	public String toString() {
		return "BakiHanmaDto [id=" + id + ", name=" + name + ", episodes=" + episodes + ", villan=" + villan + "]";
	}
	

	

}

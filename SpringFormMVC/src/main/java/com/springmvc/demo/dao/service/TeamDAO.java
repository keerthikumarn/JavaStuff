package com.springmvc.demo.dao.service;

import java.util.List;

import com.springmvc.demo.model.Team;

/**
 * DAO Service Layer
 * 
 * @author Keerthi
 * 
 */
public interface TeamDAO {
	/** To add a new team **/
	public void addTeam(Team team);

	/** To update a team **/
	public void updateTeam(Team team);

	/** To fetch a team **/
	public Team getTeam(int id);

	/** To delete a team **/
	public void deleteTeam(int id);

	/** To list out all teams **/
	public List<Team> getTeams();
}

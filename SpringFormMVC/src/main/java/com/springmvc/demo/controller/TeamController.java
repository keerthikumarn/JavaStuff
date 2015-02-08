package com.springmvc.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.demo.model.Team;
import com.springmvc.demo.service.TeamService;

@Controller
@RequestMapping(value = "/team")
public class TeamController {
	
	private static final Logger logger = LoggerFactory.getLogger(TeamController.class);
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addTeamPage() {
		ModelAndView modelView = new ModelAndView("addTeamForm");
		modelView.addObject("team", new Team());
		return modelView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addingTeam(@ModelAttribute Team team) {
		ModelAndView modelView = new ModelAndView("homePage");
		teamService.addTeam(team);
		String message = "New team successfully added !!";
		modelView.addObject("message", message);
		logger.info(message);
		return modelView;
	}

	@RequestMapping(value = "/list")
	public ModelAndView listTeams() {
		ModelAndView modelView = new ModelAndView("listOfTeams");
		List<Team> listOfTeams = teamService.getTeams();
		modelView.addObject("listOfTeams", listOfTeams);
		if(listOfTeams.size() > 0){
			logger.info("List of teams displayed successfully");
		}
		return modelView;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editTeamPage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("editTeamForm");
		Team team = teamService.getTeam(id);
		modelAndView.addObject("team", team);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editingTeam(@ModelAttribute Team team,
			@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("homePage");
		teamService.updateTeam(team);
		String message = "Team was successfully updated.";
		modelAndView.addObject("message", message);
		logger.info(message);
		return modelAndView;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
	public ModelAndView deleteTeam(@PathVariable Integer id) {
		ModelAndView modelView = new ModelAndView("homePage");
		teamService.deleteTeam(id);
		String message = "Team successfully deleted !!";
		modelView.addObject("message", message);
		logger.info(message);
		return modelView;
	}
}

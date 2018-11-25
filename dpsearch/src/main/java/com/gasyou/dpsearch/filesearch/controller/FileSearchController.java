package com.gasyou.dpsearch.filesearch.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.gasyou.dpsearch.filesearch.entity.User;
import com.gasyou.dpsearch.filesearch.service.FileSearchService;

@Path("fsearch")
@RequestScoped
public class FileSearchController {

	@Inject
	private FileSearchService service;

	@Inject
	private Models models;

	@GET
	@Controller
	public String hello(@QueryParam("name") String name) {
		models.put("q", name);
		System.out.println(service.createHelloMessage(name));
		User u = service.findById(1);
		System.out.println(u);
		return "hello.jsp";
	}
}
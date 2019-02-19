/**
 * 
 */
package com.gorilla.demosimpleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marcio
 * @date Feb 11, 2019
 */

@RestController
@RequestMapping(value = "/")
public class HelloController {
	
	
	@GetMapping
	public String findAlbums() {		
		return "Hello Marcio Esparza";
	}

}

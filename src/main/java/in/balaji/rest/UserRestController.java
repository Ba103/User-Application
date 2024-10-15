package in.balaji.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.balaji.entity.User;
import in.balaji.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService service;

	@PostMapping("/user")
	public ResponseEntity<User> createRole(@RequestBody User user) {
		User status = service.upsert(user);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getRoleById(@PathVariable Integer id) {
		User byId = service.getById(id);
		return new ResponseEntity<>(byId, HttpStatus.OK);
	}

}

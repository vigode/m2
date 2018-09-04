package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controller")
public class PersonDetailsController {
	
	private static final String VIEW_PERSON_LIST_ACTION = "viewPersonList";
	private static final String ADD_PERSON_ACTION = "addPerson";
	private static final String SAVE_PERSON_ACTION = "savePerson";

	@Autowired
	private PersonDetailsDAO daoRef;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String viewPersonDetails(ModelMap map, @RequestParam("action") String action) {
		if (action.equals(VIEW_PERSON_LIST_ACTION)) {
			List<Person> cars = daoRef.findAll();
			map.addAttribute("carList", cars);
			System.out.println("viewlist");
			return "carList";
		}

		else if (action.equals(ADD_PERSON_ACTION)) {
			Person person = new Person();
			map.addAttribute("person", person);
			System.out.println("addperson");
			return "personsForm";
		}
		return null;
	}
	@RequestMapping(method = RequestMethod.POST, params = {"id", "name", "age"})
	public String savePerson(ModelMap map, @RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("age") int age) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setId(id);

		System.out.println(id);
		if(id!=-1){
			System.out.println("in update");
			PersonDetailsDAO.update(person);	
		}
		
		else{
			System.out.println("in create");
			PersonDetailsDAO.create(person);
		}
		List<Person> persons = PersonDetailsDAO.findAll();
		map.addAttribute("personsList", persons);
		System.out.println(person);
		return "personsList";
	}
		
		
		/*map.addAttribute("persons",daoRef.findAll());
		return "personsList"; //returning a jsp file to view person details
*/	
	
	
}

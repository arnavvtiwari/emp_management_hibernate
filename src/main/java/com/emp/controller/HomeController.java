package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emp.dao.EmpDao;
import com.emp.entity.Emp; 

@Controller
public class HomeController {
	
	@Autowired
	private EmpDao empDao;
	
	@RequestMapping(path="/home") 
	public String home(Model m) {
		List<Emp> list = empDao.getAllEmp();
		m.addAttribute("list", list);
		System.out.print(list);
		return "homepage";
	}
	
	@RequestMapping(path="/addEmp")
	public String addEmp() {
		
		return "addEmp";
	}
	
	@RequestMapping(path="/viewEmp/{eid}")
	public String viewEmp(@PathVariable int eid, Model m) {
		Emp emp = empDao.getEmpbyId(eid);
		m.addAttribute("emp", emp);
		return "viewEmp";
	}
	
	@RequestMapping(path="/editEmp/{eid}")
	public String editEmp(@PathVariable int eid,  Model m) {
		Emp emp = empDao.getEmpbyId(eid);
        m.addAttribute("emp", emp);
		return "editEmp";
	}  
	
	@RequestMapping(path="/updateEmp", method=RequestMethod.POST)
	public String updateEmp(@ModelAttribute Emp emp) {
		empDao.updateEmp(emp);
		return "redirect:/home";
	}
	
	@RequestMapping(path="/deleteEmp/{eid}", method = RequestMethod.GET)
	public String deleteEmp(@PathVariable int eid) {
		empDao.deleteEmp(eid);
		return "redirect:/home";
	}
	
	@RequestMapping(path = "/createEmp", method = RequestMethod.POST)
    public String createEmp(@ModelAttribute Emp emp, Model model) {
        System.out.println("Creating employee: " + emp);

        int id = empDao.saveEmp(emp);
        System.out.println("Employee saved with ID: " + id);


        return "redirect:/home"; 
    }

}

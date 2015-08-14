package by.eftech.web_metall.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.eftech.web_metall.count.CalculatePrice;
import by.eftech.web_metall.entity.Metall;
import by.eftech.web_metall.service.IMetallService;

@Controller
public class MetallController {

	@Autowired
	private IMetallService metallServ;

	// index.jsp controller
	@RequestMapping(value = "/web_metall", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView indexCont() {
		ModelAndView mav = new ModelAndView();

		List<Metall> allMetall;
		List<Metall> titleMetall;
		try {
			allMetall = metallServ.getAllMetall();
			titleMetall = metallServ.getMetallByAlph();

			// Convert to MySQL
			// ExcelConv convertToMySQL = new ExcelConv();
			// enter your path
			// convertToMySQL.convert("");

			// for (int i = 0; i < titleMetall.size(); i++) {
			// if (i == 0) {
			// continue;
			// }
			// if (titleMetall.get(i).getType_eng() == titleMetall.get(i - 1)
			// .getType_eng()) {
			// titleMetall.remove(i);
			// }
			// System.out.println(titleMetall);
			// }

			mav.addObject("titleMetall", titleMetall);
			mav.addObject("metall", allMetall);
			mav.setViewName("Metall_Web");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mav;
	}

	// Add_Metall.jsp
	@RequestMapping(value = "/add", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView addPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Add_Metall");
		return mav;
	}

	// Add metall
	@RequestMapping(value = "/add_metall", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView addMetall(@ModelAttribute Metall metall,
			BindingResult result) {

		ModelAndView mav = new ModelAndView();
		try {
			metallServ.addMetall(metall);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		mav.setViewName("Add_Metall");
		return mav;
	}

	// View_Metall.jsp
	@RequestMapping(value = "/view_metall_{type_eng}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public ModelAndView viewMetallPage(@PathVariable String type_eng) {
		ModelAndView mav = new ModelAndView();

		List<Metall> metallByTitle;
		List<Metall> title;
		try {

			title = metallServ.getMetallByTitle(type_eng);
			metallByTitle = metallServ.getMetallByTitle(type_eng);
			mav.addObject("metallByTitle", metallByTitle);
			mav.addObject("title", title);
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.setViewName("View_Metall");
		return mav;
	}
	
	@ModelAttribute("metall")
	private Metall metall() {
		return new Metall();
	}

}

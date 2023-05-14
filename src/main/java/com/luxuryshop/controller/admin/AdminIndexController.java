package com.luxurydecor.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luxurydecor.SolveException.CustomException;
import com.luxurydecor.entities.User;
import com.luxurydecor.repositories.CategoryRepository;
import com.luxurydecor.repositories.CollectionRepository;
import com.luxurydecor.repositories.DetailOrderRepository;
import com.luxurydecor.repositories.ProductRepository;
import com.luxurydecor.repositories.UserRepository;
import com.luxurydecor.services.Chart;
import com.luxurydecor.services.MyUserDetail;

@Controller
public class AdminIndexController {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	DetailOrderRepository saleOrderRepo;

	@Autowired
	CollectionRepository collectionRepository;
	
	@Autowired
	Chart chart;

	@RequestMapping(value = { "/admin" }, method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request) {
		try {
			MyUserDetail userDetail = (MyUserDetail) SecurityContextHolder.getContext().getAuthentication()
					.getPrincipal();
			User user = userDetail.getUser();
			request.getSession().setAttribute("USER_ADMIN", user);
			request.getSession().setAttribute("USER", user.getUsername());
			model.addAttribute("qualityOfProduct", productRepository.count());
			model.addAttribute("qualityOfUser", userRepository.count());
			model.addAttribute("qualityOfCategory", categoryRepository.count());
			model.addAttribute("qualityOfSaleOrder", saleOrderRepo.count());
			model.addAttribute("qualityOfCollection", collectionRepository.count());
			return "back-end/index";
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException();
		}
	}
	
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping(value = "/caculate", method = RequestMethod.GET)
	public ResponseEntity cacul() {
		return ResponseEntity.ok(chart.count());
	}

}

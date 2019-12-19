package com.hous.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hous.pojo.Apply;
import com.hous.pojo.Checkout;
import com.hous.pojo.Hetong;
import com.hous.pojo.Houselist;
import com.hous.pojo.Zulist;
import com.hous.service.Houselist.HouselistService;
import com.hous.service.apply.ApplyService;
import com.hous.service.checkout.CheckoutService;
import com.hous.service.hetong.HetongService;
import com.hous.service.zulist.ZulistService;



@Controller
@RequestMapping("/hetong")
public class HetongController {
	@Autowired
	private HetongService hetongService;
	@Autowired
	private HouselistService houselistService;
	@Autowired
	private ApplyService applyService;
	@Autowired
	private ZulistService zulistService;
	@Autowired
	private CheckoutService checkoutService;
	
	//新增合同信息，修改房屋列表的状态，从申请列表中删除，增添到租赁列表当中
	@RequestMapping("/inserthetong")
	public String inserthetong(Model model,Hetong hetong){
		//新增合同信息
		hetongService.inserthetong(hetong);
		Hetong hetong1=hetongService.findhetong(hetong.getHouseId());
		//修改房屋列表状态
		Houselist houselist=houselistService.findhouseid(hetong1.getHouseId());
		houselist.setStatus("已租赁");
		houselistService.updatehousestatus(houselist);
		//添加到租赁列表当中
		Zulist zulist=new Zulist();
		Apply apply=applyService.findbyhouse_id(hetong.getHouseId());
		zulist.setHouseId(hetong.getHouseId());
		zulist.setUserlistId(apply.getUserlistId());
		zulist.setContractId(hetong1.getId());
		zulist.setPrice(apply.getPrice());
		zulist.setAddress(apply.getAddress());
		zulistService.insertzulist(zulist);
		//从申请列表中删除
		applyService.deletebyhouse_id(hetong1.getHouseId());
		model.addAttribute("error", "zusuccess");
		return "redirect:/zulist/findzulist";
		
	}
	@RequestMapping("/seehetong")
	public String seehetong(String houseId,Model model){
		Hetong hetong=hetongService.findhetong(houseId);
		model.addAttribute("hetong", hetong);
		//model.addAttribute("mainPage", "hetong.jsp");
		return "admin/hetong";
	}
	@RequestMapping("/updatehetong")
	public String updatehetong(String houseId,Model model){
		Hetong hetong=hetongService.findhetong(houseId);
		model.addAttribute("hetong", hetong);
		model.addAttribute("mainPage", "updatehetong.jsp");
		return "admin/main1";
	}
//	@RequestMapping("/changehetong")
//	public String changehetong(Hetong hetong){
//		hetongService.updatehetong(hetong);
//		
//		return "redirect:/zulist/findzulist.action";
//	}
	
	
		//终止合同操作：删除合同，插入已退租列表，删除在租列表，删除房屋列表	
	@RequestMapping("/deletehetong")
	public String deletehetong(String houseId,Model model){
		hetongService.deletehetong(houseId);
		Zulist zulist=zulistService.findzulist(houseId);
		Checkout checkout=new Checkout();
		checkout.setHouseId(houseId);
		checkout.setAddress(zulist.getAddress());
		checkout.setStatus("已退租");
		checkout.setUserlistId(zulist.getUserlistId());
		checkoutService.insertcheckout(checkout);
		houselistService.deletehousebyhouseid(houseId);
		zulistService.deletezulist(houseId);
		
		model.addAttribute("error", "checkoutsuccess");
		return "redirect:/zulist/findzulist";
	}
//	
//	@RequestMapping("/zukeseehetong")
//	public String zukeseehetong(String house_id,Model model){
//		Hetong hetong=hetongService.findhetong(house_id);
//		model.addAttribute("hetong", hetong);
//		//model.addAttribute("mainPage", "showhetong.jsp");
//		return "zuke/showhetong";
//	}
}

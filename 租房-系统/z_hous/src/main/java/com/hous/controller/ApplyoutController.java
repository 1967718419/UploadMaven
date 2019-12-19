package com.hous.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hous.pojo.Apply;
import com.hous.pojo.Applyout;
import com.hous.pojo.User;
import com.hous.pojo.Userlist;
import com.hous.pojo.Zulist;
import com.hous.service.apply.ApplyService;
import com.hous.service.applyout.ApplyoutService;
import com.hous.service.user.UserlistService;
import com.hous.service.zulist.ZulistService;

@Controller
@RequestMapping("/applyout")
public class ApplyoutController {
	@Autowired
	private ZulistService zulistService;
	@Autowired
	private ApplyoutService applyoutService;
	@Autowired
	private ApplyService applyService;
	@Autowired
	private UserlistService userlistService;
	//插入退租信息
	@RequestMapping("/insertapplyout")
	public String insertapplyout(String houseId,Model model){
		Zulist zulist=zulistService.findzulist(houseId);
		applyoutService.insertapplyout(zulist);
		model.addAttribute("error", "applysuccess");
		return "redirect:/zulist/myzulist";
	}
	//查看退租申请
	@RequestMapping("/findallapplyout")
	public String findallapplyout(Model model ,@RequestParam(required=false,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="6") Integer pageSize){
		PageHelper.startPage(page, pageSize);
		List<Apply> applyout=applyService.findallapplyout();
		for (Apply apply : applyout) {
			System.out.println(apply.toString());
		}
		PageInfo<Apply> p=new PageInfo<Apply>(applyout);
		model.addAttribute("applyout", applyout);
		model.addAttribute("p", p);
		model.addAttribute("mainPage", "applyout.jsp");
		return "admin/main1";
	}
	//管理员拒绝退租申请
	@RequestMapping("/refuseapplyout")
	public String refuseapplyout(Model model,Integer aoid){
		Applyout applyout=new Applyout();
		applyout.setAoid(aoid);
		applyout.setStatus("已拒绝");
		applyoutService.updateapplyout(applyout);
		model.addAttribute("mainPage", "applyout.jsp");
		return "redirect:findallapplyout";
	}
	//管理员同意退租申请
	@RequestMapping("/agreeapplyout")
	public String agreeapplyout(Model model,Integer aoid){
		applyoutService.agreeapplyout(aoid);
		model.addAttribute("error", "applyoutsucess");
		return "redirect:findallapplyout";
	}
	//删除申请退租列表
		@RequestMapping("/deleteapplyout")
		public String deleteapplyout(Model model,Integer aoid){
			applyoutService.deleteapplyout(aoid);
			model.addAttribute("error", "deletesucess");
			return "redirect:findallapplyout";
		}
		//租客查看自己的 退房申请
		@RequestMapping("/getmyapplyout")
		public String getmyapplyout(Model model,HttpSession httpSession,@RequestParam(required=false,defaultValue="1") Integer page,
	            @RequestParam(required=false,defaultValue="6") Integer pageSize){
			User user1= (User) httpSession.getAttribute("user");
			Userlist userlist=userlistService.findhasuserlist(user1.getId());
			PageHelper.startPage(page, pageSize);
			List<Userlist> list=userlistService.getmyapplyout(userlist.getId());
			PageInfo<Userlist> p=new PageInfo<Userlist>(list);
			model.addAttribute("userlist", list);
			model.addAttribute("p", p);
			model.addAttribute("mainPage", "myapplyout.jsp");
			return "zuke/main";
		}
}

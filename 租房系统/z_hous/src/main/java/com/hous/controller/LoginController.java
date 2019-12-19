package com.hous.controller;

import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hous.pojo.User;
import com.hous.service.user.LoginService;
import com.hous.util.RandomValidateCodeUtil;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String registerlist(){
		return "register";
	}
	
	@RequestMapping("/index")
	public String houselist() {
		return "admin/main1";
	}
	
	
	@RequestMapping("/toindex")
	public String toindex(Model model) {
		//System.out.println("我是跳转到zuke/main");
		return "zuke/main";
		}
	
	@RequestMapping("/userlist")
	public String userlist(Model model) {
		//System.out.println("我是跳转到zuke/main");
		return "userlist";
		}
	
	@RequestMapping("/logincheck")
	public String logincheck(User user,Model model,HttpSession httpSession){
		User users = loginService.checkLogin(user);
		if(users!=null){
			httpSession.setAttribute("user", users);
			
			if(users.getType().equals("zuke")){	
				return "zuke/main";
			}
			else{
				return "admin/main1";
			}
		}else{
			String error="error";
			model.addAttribute("error", error);
			return "login";
		}	
	}
	
	@RequestMapping("/registercheck")
	public String register(User user,Model model) throws Exception{
		User user1=loginService.register(user);
		if(user1==null){
			boolean registerStatu=loginService.insertUser(user);
			if(registerStatu){
				return "login";
			}
			String error="error";
			model.addAttribute("error", error);
				return "register";
		}else{
			String error="error";
			model.addAttribute("error", error);
		return "register";
		}
	}
	
	
//	@RequestMapping("/logincheck")
//    public String adminLoginByPasswword(User user, @Param("验证码") @RequestParam String code, HttpServletResponse response,HttpServletRequest request) {
//        HttpSession session=request.getSession();
//        if(session.getAttribute("imageCode")==null){
//            renderFail(response, "重新获取验证码");
//        }else {
//            if(session.getAttribute("imageCode").toString().equalsIgnoreCase(code)){
//                User users = loginService.checkLogin(user);
//                if (users == null) {
//                    renderFail(response, "登录失败");
//                    return "login";
//                    
//                } else {
//                    renderSuccess(response, "登录成功");
//                    return "admin/main1";
//                }
//            }else {
//                renderFail(response, "验证码错误");
//                return "login";
//            }
//        }
//		return code;
//
//
//    }
	
	//
	//
//		private void renderSuccess(HttpServletResponse response, String string) {
//			// TODO Auto-generated method stub
//			
//		}
	//
//		private void renderFail(HttpServletResponse response, String string) {
//			// TODO Auto-generated method stub
//			
//		}
    
    @RequestMapping("/getcode")
    public void getCode(HttpServletResponse response, HttpServletRequest request) throws Exception{
        HttpSession session=request.getSession();
        //利用图片工具生成图片
        //第一个参数是生成的验证码，第二个参数是生成的图片
        Object[] objs = RandomValidateCodeUtil.createImage();
        //将验证码存入Session
        session.setAttribute("imageCode",objs[0]);

        //将图片输出给浏览器
        BufferedImage image = (BufferedImage) objs[1];
        response.setContentType("image/png");
        OutputStream os = response.getOutputStream();
        ImageIO.write(image, "png", os);
        
    }
    
    


}

package cn.com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import cn.com.mvc.model.Fruits;

public class FruitsControllerTest implements Controller{

	private FruitsService fruitsService = new FruitsService();
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//模拟Service获取水果商品列表  
        List<Fruits> fruitsList = fruitsService.queryFruitsList();  
  
        //返回ModelAndView  
        ModelAndView modelAndView =  new ModelAndView();  
        //相当 于request的setAttribut，在jsp页面中通过fruitsList取数据  
        modelAndView.addObject("fruitsList", fruitsList);  
          
        //指定视图  
        modelAndView.setViewName("/WEB-INF/jsp/fruits/fruitsList.jsp");  

        return modelAndView;  
	}
	
}
class FruitsService{
	
	public List<Fruits> queryFruitsList()
	{
		List<Fruits> FruitsList =new ArrayList<Fruits>();
		Fruits apple =new Fruits();
		apple.setName("红富士苹果");
		apple.setPrice(2.3);
		apple.setProducing_area("山东");
		
		Fruits Banana =new Fruits();
		Banana.setName("香蕉");
		Banana.setPrice(1.5);
		Banana.setProducing_area("上海");
		FruitsList.add(apple);
		FruitsList.add(Banana);

		return FruitsList;
	}
	
	
	
}
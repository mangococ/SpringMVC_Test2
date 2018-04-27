package cn.com.mvc.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.mvc.model.Fruits;


@Controller
public class FruitsControllerTest3{

	private FruitsService fruitsService = new FruitsService();
	
	
    
    @RequestMapping(value="/queryFruitsList")
	public ModelAndView  queryFruitsList() throws Exception {
        List<Fruits> fruitsList = fruitsService.queryFruitsList();  
        ModelAndView modelAndView =  new ModelAndView();  
        modelAndView.addObject("fruitsList", fruitsList);  
        modelAndView.setViewName("/WEB-INF/jsp/fruits/fruitsList.jsp"); 
        return modelAndView;  
	}
    
//    @RequestMapping(value="/queryFruit",method={RequestMethod.GET})  
//    public String queryFruitById(Model model,@RequestParam(value="fruit_id") Integer fruitId)throws Exception{  
//              
//    	Fruits fruit=fruitsService.queryFruitById(fruitId);   
//              
//        
//        model.addAttribute("fruit", fruit);  
//              
//        return "/fruits/fruitsDetail";  
//    }  
    
//    @RequestMapping(value="/queryFruit/{id}",method={RequestMethod.GET})  
//    public @ResponseBody Fruits getFruitById(Model model,@PathVariable("id")Integer fruitId)
//    		throws Exception{  
//        //����service��ȡˮ����Ʒ�б� 
//    	Fruits fruit=fruitsService.queryFruitById(fruitId);   
//        return fruit;  
//    }  
//    
//    @RequestMapping(value="/addFruit",method={RequestMethod.POST})  
//    public String addFruit(Model model,Fruits fruit)
//    		throws Exception{   
//         //��������߼�  
//    	return "...";
//    } 
//    
//    @RequestMapping(value="/deleteFruit/{id}",method={RequestMethod.DELETE})  
//    public String deleteFruitById(Model model,@PathVariable("id")Integer fruitId)
//    		throws Exception{  
//        //����ɾ���߼�
//    	return "...";
//    } 
//    
//    @RequestMapping(value="/editFruit",method={RequestMethod.PUT})  
//    public String editFruitById(Model model,Fruits fruit)
//    		throws Exception{  
//        //�����޸��߼� 
//        return "...";  
//    } 
}
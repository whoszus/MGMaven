package whoszus.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import whoszus.model.firstModel.entity.ClassCather;
import whoszus.model.firstModel.service.IFirstService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by linyanying on 2015/10/28.
 */
@Controller
@RequestMapping("/cc")
public class MgTest {

    @Autowired
    private IFirstService firstService;

    @RequestMapping("test")
//    @ResponseBody
    public void gson(ClassCather cc,HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        String callbackFunName =request.getParameter("callback");
        String jsonData;
        String uuid = UUID.randomUUID().toString();
        cc.setUuid(uuid);
        System.out.println(cc);
        List<ClassCather> list = new ArrayList<>();
        list.add(cc);
        System.out.println("--------------"+list.get(0));
        Gson gson = new Gson();
        jsonData = gson.toJson(list);
        try {
            response.getWriter().write(callbackFunName + "("+jsonData+")");
        } catch (IOException e) {
            System.out.println("exception ");
        }
    }


    @ResponseBody
    @RequestMapping("add")
    public List<ClassCather> add(ClassCather classCather ){
        List<ClassCather> list =new ArrayList<>();
        String uuid = UUID.randomUUID().toString();
        classCather.setUuid(uuid);
        System.out.println("-----"+classCather);
        firstService.save(classCather);
        list.add(classCather);
        System.out.println(list);
        return list;
    }

}

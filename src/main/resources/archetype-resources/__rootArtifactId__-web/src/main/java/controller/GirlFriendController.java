#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import ${package}.entity.GirlFriend;
import ${package}.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@Controller
@RequestMapping("/")
public class GirlFriendController {
    @Autowired
    private GirlService girlService;

//    @RequestMapping("chooseGirl")
//    public String gfFac() {
//        return "welcome";
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(Model model) {
        System.out.println("-------hello world-----");
        return "welcome";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void serveGirl(GirlFriend girlFriend, HttpServletResponse response) throws Exception {
//        System.out.println(girlFriend.getName());
        girlService.serve(girlFriend);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.print("{${symbol_escape}"success${symbol_escape}": ${symbol_escape}"true${symbol_escape}"}");
        pw.flush();
        pw.close();
    }
}

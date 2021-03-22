package com.example.advicdsample;

import org.springframework.core.annotation.Order;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CustomControllerAdvice {
    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     *
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
    }

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     *
     * @param model
     */
    @ModelAttribute(name = "MATest")
    public void addAttributes(Model model) {
        model.addAttribute("author", "Magical Sam");
    }

    /**
     * 全局异常捕捉处理
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    @Order(value = 1)
    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 100);
        map.put("msg", ex.getMessage());
        return map;
    }
}

/*


Regardless of where your organization falls on that spectrum, data-handling policies
that reflect common values provide alignment benefits. And being more explicit about
the value-based motivations for those policies, including any moral notion of a right to
privacy, makes it easier to benefit from that alignment. So, whether the practice of providing an admittedly inconvenient method to opt out of the use of personal data for
targeted advertising should continue can be answered by understanding why an organization has a privacy policy in the first place. If a company places greater value on
providing increased individual control of the usage of personal data, then it’s ethically
incoherent to develop data-handling practices that make it difficult to opt out. If the
intent of any specific policy is merely to reduce customer complaints and comply with
the law, then reflecting actual values is immaterial. If the intent of the policy is to ensure
that people’s interests are respected, then simple opt-out procedures may be required to
become ethically coherent


 */
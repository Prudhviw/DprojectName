package com.dpackage.controller;


import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

        import com.dpackage.model.Emp;
        import com.dpackage.repo.EmpRepository;


@RestController
public class WebController {

    @Autowired
    EmpRepository repository;

    @RequestMapping("/save")
    public String process(){
        repository.save(new Emp("A", "1"));
        repository.save(new Emp("B", "2"));
        repository.save(new Emp("C", "3"));
        repository.save(new Emp("D", "4"));
        repository.save(new Emp("E", "5"));
        return "Done";
    }


    @RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";

        for(Emp emp : repository.findAll()){
            result += "<div>" + emp.toString() + "</div>";
        }

        return result + "</html>";
    }

    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = repository.findOne(id).toString();
        return result;
    }

    @RequestMapping("/findbyleave")
    public String fetchDataByLeave(@RequestParam("leave") String leave){
        String result = "<html>";

        for(Emp emp: repository.findByLeave(leave)){
            result += "<div>" + emp.toString() + "</div>";
        }

        return result + "</html>";
    }
}


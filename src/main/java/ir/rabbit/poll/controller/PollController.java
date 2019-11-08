package ir.rabbit.poll.controller;

import ir.rabbit.poll.model.Poll;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200/")
public class PollController {

    @PostMapping("/poll/save")
    @ResponseBody
    public void savePoll(@RequestBody Poll poll) {
        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("hello ");
    }

    @GetMapping("/poll/{id}")
    @ResponseBody
    public Poll getPollById(@PathVariable("id") long id) {
        return null;
    }

    @GetMapping("/poll")
    @ResponseBody
    public List<Poll> getAllPolls() {
        List allPolls = new ArrayList();
        Poll poll = new Poll();
        allPolls.add(poll);
        return allPolls;
    }

}


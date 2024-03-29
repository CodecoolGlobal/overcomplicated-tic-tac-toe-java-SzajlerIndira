package com.codecool.enterprise.overcomplicated.controller;

import com.codecool.enterprise.overcomplicated.model.Player;
import com.codecool.enterprise.overcomplicated.model.TictactoeGame;
import com.codecool.enterprise.overcomplicated.service.AvatarServiceCaller;
import com.codecool.enterprise.overcomplicated.service.ComicsServiceCaller;
import com.codecool.enterprise.overcomplicated.service.FunfactServiceCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;

@Controller
@SessionAttributes({"player", "game"})
@RequestMapping
public class GameController {
    @Autowired
    private AvatarServiceCaller avatarServiceCaller;

    @Autowired
    private FunfactServiceCaller funfactServiceCaller;

    @Autowired
    private ComicsServiceCaller comicsServiceCaller;

    @ModelAttribute("player")
    public Player getPlayer() {
        return new Player();
    }

    @ModelAttribute("game")
    public TictactoeGame getGame() {
        return new TictactoeGame();
    }

    @ModelAttribute("avatar_uri")
    public String getAvatarUri() {
        return avatarServiceCaller.getAvatarUri(RequestContextHolder.currentRequestAttributes().getSessionId());
    }


    @GetMapping(value = "/")
    public String welcomeView(@ModelAttribute Player player) {
        return "welcome";
    }

    @PostMapping(value="/changeplayerusername")
    public String changPlayerUserName(@ModelAttribute Player player) {
        return "redirect:/game";
    }

    @GetMapping(value = "/game")
    public String gameView(@ModelAttribute("player") Player player, Model model) {
       model.addAttribute("funfact", funfactServiceCaller.getFunfact());
        model.addAttribute("comic_uri", comicsServiceCaller.addComic().getImg());
        return "game";
    }

    @GetMapping(value = "/game-move")
    public String gameMove(@ModelAttribute("player") Player player, @ModelAttribute("move") int move) {
        System.out.println("Player moved " + move);
        return "redirect:/game";
    }
}

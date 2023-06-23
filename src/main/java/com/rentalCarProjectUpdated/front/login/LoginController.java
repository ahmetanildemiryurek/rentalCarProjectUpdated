package com.rentalCarProjectUpdated.front.login;

import com.rentalCarProjectUpdated.client.domain.Client;
import com.rentalCarProjectUpdated.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private ClientRepository clientRepository;

//    @GetMapping("/login")
//    public String loginForm() {
//        return "login";
//    }

    @PostMapping("/login")
    public String loginForm(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {


        // Kullanıcıyı e-posta adresine göre veritabanından bul
        Client client = clientRepository.findByUsername(username);

        if (client == null) {
            model.addAttribute("error", "Kullanıcı bulunamadı.");
            return "login";
        }

        // Şifreyi kontrol et
        if (!client.getPassword().equals(password)) {
            model.addAttribute("error", "Hatalı şifre.");
            return "login";
        }

        // Oturum açma işlemi başarılı, burada gerekli işlemler yapılır (ör. oturum bilgilerini saklama)

        return "redirect:/loggedInPage"; // Oturum açma başarılıysa yönlendirilecek sayfa
    }

}

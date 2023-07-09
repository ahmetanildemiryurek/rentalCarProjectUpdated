(function ($) {
    "use strict";
function setCookie(paramName,paramValue) {
    document.cookie =  paramName+'='+paramValue;
}

function getCookie(name) {
    var nameEQ = name + "=";
    var ca = document.cookie.split(';');
    for(var i=0;i < ca.length;i++) {
        var c = ca[i];
        while (c.charAt(0)==' ') c = c.substring(1,c.length);
        if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length,c.length);
    }
    return null;
}

if(getCookie('username')){
    const  navBar = document.getElementById("navbar-nav");
    const  patientLink = document.createElement("a");

    patientLink.classList.add('nav-item', 'nav-link' ,'patientLink');

    const  spanWelcome = document.createElement("span");
    spanWelcome.innerText = 'Hoşgeldin ';

    patientLink.appendChild(spanWelcome);

    const  spanPatient = document.createElement("span");
    spanPatient.innerText = getCookie('name') + ' '+getCookie('surname') ;
    spanPatient.style.color='#13C5DD';

    patientLink.appendChild(spanPatient);
    if(navBar){
        navBar.appendChild(patientLink);
    }
}

if(document.getElementById("login")){
    document.getElementById("login").addEventListener("click", login);
}

if(document.getElementById("login2")){
    document.getElementById("login2").addEventListener("click", login2);
}

function login() {
    var enteredUsername = document.getElementById("username").value;
    var enteredPassword = document.getElementById("password").value;
    eraseCookie();
    // Kullanıcı adı ve şifre kontrolü
    fetch('/register/getClientRegister')
        .then(response => response.json())
        .then(patients => {
            const foundPatient = patients.find(patient => patient.username === enteredUsername && patient.password === enteredPassword);
            if (foundPatient) {
                // Doğru ise loggedInPage.html sayfasına yönlendir
                setCookie('name',foundPatient.name);
                setCookie('surname',foundPatient.surname);
                setCookie('username',foundPatient.username);
                setCookie('userID',foundPatient.id);
                window.location.href = "loggedInPagePatient?username=" + enteredUsername;
            } else {
                setCookie(enteredUsername);
                // Yanlış ise aynı sayfada kal ve hata mesajını göster
                alert("Kullanıcı adı veya şifre hatalı! Tekrar Deneyiniz!");
            }
        })
        .catch(error => {
            console.error("Hata oluştu:", error);
            alert("Kullanıcı adı veya şifre hatalı. Lütfen tekrar deneyiniz!");
        });
    window.onload = function() {
        // URL'deki parametreleri al
        const params = new URLSearchParams(window.location.search);
        const username = params.get('username');

        // Kullanıcı adını sayfada görüntüle
        document.getElementById('usernameDisplay').textContent = username;
    };
}
function login2() {
    var enteredUsername = document.getElementById("username").value;
    var enteredPassword = document.getElementById("password").value;
    eraseCookie();
    // Kullanıcı adı ve şifre kontrolü
    fetch('/register2/getCompanyRegister'+enteredUsername+'/'+enteredPassword)
        .then(response => response.json())
        .then(doctor => {
            if (doctor) {
                // Doğru ise loggedInPage.html sayfasına yönlendir
                setCookie('name',doctor.name);
                setCookie('surName',doctor.surname);
                setCookie('doctorID',doctor.id);
                window.location.href = "loggedInPageDoctor";
            } else {
                // Yanlış ise aynı sayfada kal ve hata mesajını göster
                alert("Kullanıcı adı veya şifre hatalı! Tekrar Deneyiniz!");
            }
        })
        .catch(error => {
            console.error("Hata oluştu:", error);
            alert("Bir hata oluştu. Lütfen tekrar deneyiniz!");
        });
    window.onload = function() {
        // URL'deki parametreleri al
        const params = new URLSearchParams(window.location.search);
        const username = params.get('username');

        // Kullanıcı adını sayfada görüntüle
        document.getElementById('usernameDisplay').textContent = username;
    };
}

function eraseCookie() {
    document.cookie = 'name=; Path=/; Expires=Thu, 01 Jan 1970 00:00:01 GMT;';
    document.cookie = 'surname=; Path=/; Expires=Thu, 01 Jan 1970 00:00:01 GMT;';
    document.cookie = 'username=; Path=/; Expires=Thu, 01 Jan 1970 00:00:01 GMT;';
    document.cookie = 'userID=; Path=/; Expires=Thu, 01 Jan 1970 00:00:01 GMT;';
}
})(jQuery);
function setCookie(cname, cvalue, exdays) {
  const d = new Date();
  d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
  let expires = "expires="+d.toUTCString();
  document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function getCookie(cname) {
  let name = cname + "=";
  let ca = document.cookie.split(';');
  for(let i = 0; i < ca.length; i++) {
    let c = ca[i];
    while (c.charAt(0) == ' ') {
      c = c.substring(1);
    }
    if (c.indexOf(name) == 0) {
      return c.substring(name.length, c.length);
    }
  }
  return "";
}

function checkCookie() {
  let user = getCookie("usernameZtonaz");
  if (user != "") {
    alert("Welcome again " + user);
    
    document.getElementById("nicknameText").innerText = user;
    document.getElementById("nickname").innerText = user;
    document.getElementById("nickname").value =user;
    setCookie("usernameZtonaz", user, 30);
    
    
    
  } else {
    user = prompt("Please enter your name:", "");
    if (user != "" && user != null) {
      setCookie("usernameZtonaz", user, 365);
      document.getElementById("nickname").innerText = user;
      document.getElementById("nicknameText").innerText = user;
    }
    
    else{
    	checkCookie();
    }
  }
  
  
}

  function changeNicname(){
  	if(document.getElementById("nickname").style.display=="none"){
  		document.getElementById("nickname").style.display = "";
  		document.getElementById("nicknameText").style.display = "none";
  		document.getElementById("changeN").innerText = "Ok!";
  		document.getElementById("changeN").style.background = "#0b2d39";
  		 document.getElementById("nickname").focus();
  	}
  	
  	else if (document.getElementById("nicknameText").style.display == "none"){
  		document.getElementById("nickname").style.display = "none";
  		document.getElementById("nicknameText").style.display = "";
  		
  		us = document.getElementById("nickname").value;
  		setCookie("usernameZtonaz", us, 30);
  		
  		
  		document.getElementById("changeN").innerText = "Change your nickname!";
  		document.getElementById("changeN").style.background = "#AD4646";
  		document.getElementById("nicknameText").innerText = us
  		document.getElementById("nickname").value = us
  	}
  }
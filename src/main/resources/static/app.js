var stompClient = null



function connect(){

	var socket = new SockJS("/Endpoint1")
	stompClient = Stomp.over(socket)
	
	stompClient.connect({}, function (){
	
		stompClient.subscribe("/topic/nicknameandmessage", function (chat){
		
			showChat(JSON.parse(chat.body).content)
		
		})
	
	})

}

function showChat (theChat){

	$("#result").prepend(theChat + "&#13;&#10")

}

$(function(){

	$("#send").click (function(){
	
		stompClient.send("/app/receive", {}, JSON.stringify ({"nickname": lastFive+$("#nicknameText").text(), "message":$("#message").val()}))
		document.getElementById("message").value =""
		document.getElementById("message").focus();
	})

})





document.addEventListener("DOMContentLoaded", ()=>{

	connect()
	
	checkCookie()
	
	
	
	document.getElementById("message").focus();
	$("#message").on('keyup', function (e) {
	    if 	(e.key === 'Enter' || e.keyCode === 13) {
	       stompClient.send("/app/receive", {}, JSON.stringify ({"nickname": $("#nicknameText").text(), "message":$("#message").val()}))
			document.getElementById("message").value =""
	    }
	});
	
	//change nickname if focused with enter
	$("#nickname").on('keyup', function (e) {
	    if 	(e.key === 'Enter' || e.keyCode === 13) {
	      	document.getElementById("nickname").style.display = "none";
  		document.getElementById("nicknameText").style.display = "";
  		
  		us = document.getElementById("nickname").value;
  		setCookie("usernameZtonaz", us, 30);
  		
  		
  		document.getElementById("changeN").innerText = "Change your nickname!";
  		document.getElementById("changeN").style.background = "#AD4646";
  		document.getElementById("nicknameText").innerText = us
  		document.getElementById("nickname").value = us
	    }
	});

})
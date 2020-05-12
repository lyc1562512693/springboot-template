var ajaxqqq = new XMLHttpRequest();
ajaxqqq.open("get", "SmUser/getUserById.action?id=5");
ajaxqqq.send();
ajaxqqq.onreadystatechange = function() {
	if (ajaxqqq.status = 200 && ajaxqqq.readyState == 4) {
		console.log(ajaxqqq.responseText);
	}
}

var $ = {};
$.ajaxtest = function(option){
	var ajax = new XMLHttpRequest();
	ajax.open(option.method, option.url);
	ajax.setRequestHeader("content-type", option.contentType);
	ajax.send(option.data);
	ajax.onreadystatechange = function() {
		if (ajax.status = 200 && ajax.readyState == 4) {
			if (option.success && typeof (option.success) == "function") {
				option.success(ajax.responseText);
			}
		}
	}
}


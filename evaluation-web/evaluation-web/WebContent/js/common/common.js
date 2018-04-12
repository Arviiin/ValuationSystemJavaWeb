function getRootPath() {
	var curWwwPath = window.document.location.href;
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	var localhostPaht = curWwwPath.substring(0, pos);
	var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
	return (localhostPaht + projectName);
}

function getParamByUrl(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = location.search.substr(1).match(reg);
	if (r != null) {
		return unescape(r[2]);
	} else {
		return null;
	}
}

function checkLogin(fn) {
	$.ajax({
		url: getRootPath() + "/evaluation/checkLogin",
		type: "GET",
		dataType: "json",
		contentType: "application/json",
		success: function(data) {
			if (!data) {
				location.href = "login.html";
			} else {
				if (fn instanceof Function) {
					fn();
				}
			}
		}
	});
}
